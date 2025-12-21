package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.AlertNotification;

public interface AlertNotificationService {
    AlertNotification create(AlertNotification alert);
    AlertNotification getById(Long id);
    List<AlertNotification> getAll();
    void delete(Long id);
}
