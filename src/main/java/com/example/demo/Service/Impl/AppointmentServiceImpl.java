package com.example.demo.Service.Impl;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Model.*;
import com.example.demo.Repository.*;
import com.example.demo.Service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final VisitorRepository visitorRepository;
    private final HostRepository hostRepository;

    public AppointmentServiceImpl(AppointmentRepository appointmentRepository,
                                  VisitorRepository visitorRepository,
                                  HostRepository hostRepository) {
        this.appointmentRepository = appointmentRepository;
        this.visitorRepository = visitorRepository;
        this.hostRepository = hostRepository;
    }

    public Appointment create(Long visitorId, Long hostId, Appointment appointment) {
        appointment.setVisitor(visitorRepository.findById(visitorId).orElseThrow());
        appointment.setHost(hostRepository.findById(hostId).orElseThrow());
        return appointmentRepository.save(appointment);
    }

    public Appointment getById(Long id) {
        return appointmentRepository.findById(id).orElseThrow();
    }

    public List<Appointment> getAll() {
        return appointmentRepository.findAll();
    }

    public void delete(Long id) {
        appointmentRepository.deleteById(id);
    }
}
