package com.pet.clinic.management.model.medicalservices;

import com.pet.clinic.management.model.users.Owner;
import com.pet.clinic.management.model.users.Veterinarian;
import com.pet.clinic.management.model.animal.Animal;
import com.pet.clinic.management.model.animal.Dog;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDateTime;
@Entity
@Table(name = "CHECKUP")
public class CheckupAppointment extends Appointment {
    public CheckupAppointment(LocalDateTime dateTime,
                              Animal animal,
                              Owner owner,
                              Veterinarian veterinarian) {
        super(dateTime, animal, owner, veterinarian);
    }
    public CheckupAppointment() {
    }

    @Override
    public int getDurationMinutes() {
        return 55;
    }

    @Override
    public double getPrice() {
        return 120;
    }

    public void performCheckupOnDog() {
        if (animal instanceof Dog dog) {
            if (dog.getDogBreed().isAggressive() && dog.isRabiesVaccineExpired()) {
                throw new MedicalUrgencyException("Rabies vaccine expired. Mandatory by law.");
            }
        }
    }
}
