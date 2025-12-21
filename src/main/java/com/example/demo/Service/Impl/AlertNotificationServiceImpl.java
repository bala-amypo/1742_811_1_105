package com.example.demo.Service.Impl;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entity.AlertNotification;
import com.example.demo.Repository.AlertNotificationRepository;
import com.example.demo.Service.AlertNotificationService;

@Service
public class AlertNotificationServiceImpl implements AlertNotificationService {

    private final AlertNotificationRepository repo;

    public AlertNotificationServiceImpl(AlertNotificationRepository repo) {
        this.repo = repo;
    }

    public AlertNotification create(AlertNotification alert) {
        return repo.save(alert);
    }

    public AlertNotification getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<AlertNotification> getAll() {
        return repo.findAll();
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
