package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.AlertNotification;

import java.util.Optional;

public interface AlertNotificationRepository extends JpaRepository<AlertNotification, Long> {

    Optional<AlertNotification> findByVisitLogId(Long id);
}
