@Override
public Appointment createAppointment(Long visitorId, Long hostId, Appointment appointment) {

    Visitor visitor = visitorRepository.findById(visitorId)
            .orElseThrow(() -> new RuntimeException("Visitor not found"));

    Host host = hostRepository.findById(hostId)
            .orElseThrow(() -> new RuntimeException("Host not found"));

    if (appointment.getAppointmentDate().isBefore(LocalDate.now())) {
        throw new IllegalArgumentException("appointmentDate cannot be past");
    }

    if (appointment.getStatus() == null || appointment.getStatus().isBlank()) {
        appointment.setStatus("SCHEDULED");
    }

    appointment.setVisitor(visitor);
    appointment.setHost(host);

    return appointmentRepository.save(appointment);
}
