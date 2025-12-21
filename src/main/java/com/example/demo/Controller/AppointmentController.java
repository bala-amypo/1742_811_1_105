package com.example.demo.Controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.example.demo.Model.Appointment;
import com.example.demo.Service.AppointmentService;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/{visitorId}/{hostId}")
    public Appointment create(@PathVariable Long visitorId,
                              @PathVariable Long hostId,
                              @RequestBody Appointment appointment) {
        return appointmentService.create(visitorId, hostId, appointment);
    }

    @GetMapping
    public List<Appointment> getAll() {
        return appointmentService.getAll();
    }

    @GetMapping("/{id}")
    public Appointment getById(@PathVariable Long id) {
        return appointmentService.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        appointmentService.delete(id);
    }
}
