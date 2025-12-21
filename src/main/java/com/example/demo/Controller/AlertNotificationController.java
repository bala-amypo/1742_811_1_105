package com.example.demo.Controller;

import com.example.demo.Entity.AlertNotification;
import com.example.demo.Service.AlertNotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alerts")
public class AlertNotificationController {

    private final AlertNotificationService alertNotificationService;

    public AlertNotificationController(AlertNotificationService alertNotificationService) {
        this.alertNotificationService = alertNotificationService;
    }

    @PostMapping("/send/{visitLogId}")
    public AlertNotification sendAlert(@PathVariable Long visitLogId) {
        return alertNotificationService.sendAlert(visitLogId);
    }

    @GetMapping("/{id}")
    public AlertNotification getAlert(@PathVariable Long id) {
        return alertNotificationService.getAlert(id);
    }

    @GetMapping
    public List<AlertNotification> getAllAlerts() {
        return alertNotificationService.getAllAlerts();
    }
}
