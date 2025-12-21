package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.demo.Model.VisitLog;

public interface VisitLogRepository extends JpaRepository<VisitLog, Long> {

    List<VisitLog> findByCheckOutTimeIsNull();
}
    