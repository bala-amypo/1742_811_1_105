package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.Entity.AlertNotification;
import com.example.demo.Service.AlertNotificationService;

@RestController
@RequestMapping("/api/alerts")
public class AlertNotificationController {

    private final AlertNotificationService service;

    public AlertNotificationController(AlertNotificationService service) {
        this.service = service;
    }

    @PostMapping
    public AlertNotification create(@RequestBody AlertNotification alert) {
        return service.create(alert);
    }

    @GetMapping
    public List<AlertNotification> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AlertNotification get(@PathVariable Long id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
