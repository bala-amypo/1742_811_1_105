package com.example.demo.Service.Impl;

import com.example.demo.Service.AlertNotificationService;
import com.example.demo.Repository.*;
import com.example.demo.Entity.*;
import com.example.demo.Exception.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlertNotificationServiceImpl implements AlertNotificationService {

    private final AlertNotificationRepository alertNotificationRepository;
    private final VisitLogRepository visitLogRepository;

    public AlertNotificationServiceImpl(AlertNotificationRepository alertNotificationRepository,
                                        VisitLogRepository visitLogRepository) {
        this.alertNotificationRepository = alertNotificationRepository;
        this.visitLogRepository = visitLogRepository;
    }

    public AlertNotification sendAlert(Long visitLogId) {

        if (alertNotificationRepository.findByVisitLogId(visitLogId).isPresent()) {
            throw new BadRequestException("Alert already sent");
        }

        VisitLog visitLog = visitLogRepository.findById(visitLogId)
                .orElseThrow(() -> new ResourceNotFoundException("Visitor not found"));

        AlertNotification alert = new AlertNotification();
        alert.setVisitLog(visitLog);
        alert.setSentTo(visitLog.getHost().getEmail());
        alert.setAlertMessage("Visitor checked in");

        visitLog.setAlertSent(true);

        return alertNotificationRepository.save(alert);
    }

    public AlertNotification getAlert(Long id) {
        return alertNotificationRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Visitor not found"));
    }

    public List<AlertNotification> getAllAlerts() {
        return alertNotificationRepository.findAll();
    }
}
