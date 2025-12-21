package com.example.demo.Service;

import com.example.demo.Entity.AlertNotification;
import java.util.List;

public interface AlertNotificationService {

    AlertNotification sendAlert(Long visitLogId);
    AlertNotification getAlert(Long id);
    List<AlertNotification> getAllAlerts();
}
