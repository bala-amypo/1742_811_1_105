package com.example.demo.controller;

import com.example.demo.model.VisitLog;
import com.example.demo.service.VisitLogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/visitlogs")
public class VisitLogController {

    private final VisitLogService visitLogService;

    public VisitLogController(VisitLogService visitLogService) {
        this.visitLogService = visitLogService;
    }

    @PostMapping("/checkin")
    public VisitLog checkIn(
            @RequestParam Long visitorId,
            @RequestParam Long hostId,
            @RequestParam String purpose
    ) {
        return visitLogService.checkInVisitor(visitorId, hostId, purpose);
    }

    @PostMapping("/checkout/{id}")
    public VisitLog checkOut(@PathVariable Long id) {
        return visitLogService.checkOutVisitor(id);
    }

    @GetMapping("/{id}")
    public VisitLog getById(@PathVariable Long id) {
        return visitLogService.getVisitLog(id);
    }

    @GetMapping("/active")
    public List<VisitLog> getActive() {
        return visitLogService.getActiveVisits();
    }
}
