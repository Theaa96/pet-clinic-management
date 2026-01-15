package com.pet.clinic.management.model.medicalservices;

import com.pet.clinic.management.model.users.Owner;
import com.pet.clinic.management.model.users.Veterinarian;
import com.pet.clinic.management.model.animal.Animal;
import com.pet.clinic.management.model.animal.Cat;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
@Entity
@Table(name = "SURGERY_APPOINTMENT")
public class SurgeryAppointment extends Appointment {

    public SurgeryAppointment(LocalDateTime dateTime,
                              Animal animal,
                              Owner owner,
                              Veterinarian veterinarian) {
        super(dateTime, animal, owner, veterinarian);
        evaluateBiologicalRisk();
        checkVetExperience();
    }
    private void evaluateBiologicalRisk() {
        if (animal instanceof Cat cat) {
            if (cat.isCoronavirusPositive() || cat.isFelvfivPositive()) {
                throw new MedicalUrgencyException("Special disinfection protocol required after surgery.");
            }
        }
    }
    private void checkVetExperience() {
        if (!veterinarian.isExperiencedEnoughForSurgery()) {
            throw new VetExperienceException("Vet not experienced enough for surgery.");
        }
    }
    public SurgeryAppointment() {
    }
    @Override
    public int getDurationMinutes() {
        return 240;
    }

    @Override
    public double getPrice() {
        return 800;
    }
}
