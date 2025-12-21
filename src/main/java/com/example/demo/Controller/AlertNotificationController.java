package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.Model.AlertNotification;
import com.example.demo.Service.AlertNotificationService;

@RestController
@RequestMapping("/api/alerts")
public class AlertNotificationController {

    private final AlertNotificationService alertService;

    public AlertNotificationController(AlertNotificationService alertService) {
        this.alertService = alertService;
    }

    @PostMapping
    public AlertNotification create(@RequestBody AlertNotification alert) {
        return alertService.create(alert);
    }

    @GetMapping
    public List<AlertNotification> getAll() {
        return alertService.getAll();
    }

    @GetMapping("/{id}")
    public AlertNotification getById(@PathVariable Long id) {
        return alertService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        alertService.delete(id);
    }
}
