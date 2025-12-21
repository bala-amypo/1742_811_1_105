package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.Entity.VisitLog;
import com.example.demo.Service.VisitLogService;

@RestController
@RequestMapping("/api/visitlogs")
public class VisitLogController {

    private final VisitLogService service;

    public VisitLogController(VisitLogService service) {
        this.service = service;
    }

    @PostMapping
    public VisitLog create(@RequestBody VisitLog visitLog) {
        return service.create(visitLog);
    }

    @GetMapping
    public List<VisitLog> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public VisitLog get(@PathVariable Long id) {
        return service.getById(id);
    }

    @PutMapping("/{id}")
    public VisitLog update(@PathVariable Long id, @RequestBody VisitLog visitLog) {
        return service.update(id, visitLog);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
