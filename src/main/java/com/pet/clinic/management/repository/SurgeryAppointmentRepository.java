package com.pet.clinic.management.repository;

import com.pet.clinic.management.model.medicalservices.SurgeryAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryAppointmentRepository extends JpaRepository<SurgeryAppointment, Long>{
}
