package com.example.demo.Service.Impl;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entity.VisitLog;
import com.example.demo.Repository.VisitLogRepository;
import com.example.demo.Service.VisitLogService;

@Service
public class VisitLogServiceImpl implements VisitLogService {

    private final VisitLogRepository repo;

    public VisitLogServiceImpl(VisitLogRepository repo) {
        this.repo = repo;
    }

    public VisitLog create(VisitLog visitLog) {
        return repo.save(visitLog);
    }

    public VisitLog getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<VisitLog> getAll() {
        return repo.findAll();
    }

    public VisitLog update(Long id, VisitLog visitLog) {
        VisitLog v = getById(id);
        v.setCheckInTime(visitLog.getCheckInTime());
        v.setCheckOutTime(visitLog.getCheckOutTime());
        return repo.save(v);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
