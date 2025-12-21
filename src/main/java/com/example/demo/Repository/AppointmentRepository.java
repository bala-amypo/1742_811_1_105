package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.demo.Model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByHostId(Long hostId);

    List<Appointment> findByVisitorId(Long visitorId);
}
