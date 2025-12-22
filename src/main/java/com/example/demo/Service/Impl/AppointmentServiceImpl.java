package com.example.demo.Service.Impl;

import org.springframework.stereotype.Service;
import java.util.List;

import com.example.demo.Entity.Appointment;
import com.example.demo.Repository.AppointmentRepository;
import com.example.demo.Service.AppointmentService;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository repo;

    public AppointmentServiceImpl(AppointmentRepository repo) {
        this.repo = repo;
    }

    public Appointment create(Appointment appointment) {
        return repo.save(appointment);
    }

    public Appointment getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public List<Appointment> getAll() {
        return repo.findAll();
    }

    public Appointment update(Long id, Appointment appointment) {
        Appointment a = getById(id);
        a.setVisitor(appointment.getVisitor());
        a.setHost(appointment.getHost());
        a.setAppointmentDate(appointment.getAppointmentDate());
        a.setPurpose(appointment.getPurpose());
        a.setStatus(appointment.getStatus());
        return repo.save(a);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
