package com.example.demo.Controller;

import com.example.demo.Entity.Appointment;
import com.example.demo.Service.AppointmentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/{visitorId}/{hostId}")
    public Appointment createAppointment(
            @PathVariable Long visitorId,
            @PathVariable Long hostId,
            @RequestBody Appointment appointment) {
        return appointmentService.createAppointment(visitorId, hostId, appointment);
    }

    @GetMapping("/{id}")
    public Appointment getAppointment(@PathVariable Long id) {
        return appointmentService.getAppointment(id);
    }

    @GetMapping("/host/{hostId}")
    public List<Appointment> getAppointmentsForHost(@PathVariable Long hostId) {
        return appointmentService.getAppointmentsForHost(hostId);
    }

    @GetMapping("/visitor/{visitorId}")
    public List<Appointment> getAppointmentsForVisitor(@PathVariable Long visitorId) {
        return appointmentService.getAppointmentsForVisitor(visitorId);
    }
}
