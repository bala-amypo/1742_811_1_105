package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.VisitLog;

public interface VisitLogRepository extends JpaRepository<VisitLog, Long> {
}
