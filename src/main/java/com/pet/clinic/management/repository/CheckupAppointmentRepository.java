package com.pet.clinic.management.repository;

import com.pet.clinic.management.model.medicalservices.CheckupAppointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckupAppointmentRepository extends JpaRepository<CheckupAppointment, Long> {
}
