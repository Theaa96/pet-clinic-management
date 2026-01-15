package com.pet.clinic.management.service;

import com.pet.clinic.management.model.medicalservices.SurgeryAppointment;
import com.pet.clinic.management.repository.SurgeryAppointmentRepository;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
private final SurgeryAppointmentRepository surgeryAppointmentRepository;

    public AppointmentService(SurgeryAppointmentRepository surgeryAppointmentRepository) {
        this.surgeryAppointmentRepository = surgeryAppointmentRepository;
    }
}
