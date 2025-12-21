package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.AlertNotification;

public interface AlertNotificationRepository
        extends JpaRepository<AlertNotification, Long> {
}
