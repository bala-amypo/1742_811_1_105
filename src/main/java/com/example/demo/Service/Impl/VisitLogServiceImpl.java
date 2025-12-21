package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.VisitLog;

public interface VisitLogService {
    VisitLog create(VisitLog visitLog);
    VisitLog getById(Long id);
    List<VisitLog> getAll();
    VisitLog update(Long id, VisitLog visitLog);
    void delete(Long id);
}
