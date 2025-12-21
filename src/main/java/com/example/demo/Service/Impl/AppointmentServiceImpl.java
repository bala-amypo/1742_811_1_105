package com.example.demo.Service;

import java.util.List;
import com.example.demo.Entity.Appointment;

public interface AppointmentService {
    Appointment create(Appointment appointment);
    Appointment getById(Long id);
    List<Appointment> getAll();
    Appointment update(Long id, Appointment appointment);
    void delete(Long id);
}
