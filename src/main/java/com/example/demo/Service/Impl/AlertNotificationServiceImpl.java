package com.example.demo.Service.Impl;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Model.AlertNotification;
import com.example.demo.Repository.AlertNotificationRepository;
import com.example.demo.Service.AlertNotificationService;

@Service
public class AlertNotificationServiceImpl implements AlertNotificationService {

    private final AlertNotificationRepository alertRepository;

    public AlertNotificationServiceImpl(AlertNotificationRepository alertRepository) {
        this.alertRepository = alertRepository;
    }

    public AlertNotification create(AlertNotification alert) {
        return alertRepository.save(alert);
    }

    public AlertNotification getById(Long id) {
        return alertRepository.findById(id).orElseThrow();
    }

    public List<AlertNotification> getAll() {
        return alertRepository.findAll();
    }

    public void delete(Long id) {
        alertRepository.deleteById(id);
    }
}
