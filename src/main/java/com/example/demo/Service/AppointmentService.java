package com.example.demo.Service;

import com.example.demo.Entity.Appointment;
import java.util.List;

public interface AppointmentService {

    Appointment createAppointment(Long visitorId, Long hostId, Appointment appointment);
    Appointment getAppointment(Long id);
    List<Appointment> getAppointmentsForHost(Long hostId);
    List<Appointment> getAppointmentsForVisitor(Long visitorId);
}
