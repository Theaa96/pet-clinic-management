package com.pet.clinic.management.model.medicalservice;

import com.pet.clinic.management.model.animal.Animal;
import com.pet.clinic.management.model.animal.Cat;
import com.pet.clinic.management.model.animal.Dog;
import com.pet.clinic.management.model.users.Owner;
import com.pet.clinic.management.model.users.Veterinarian;
import jakarta.persistence.*;

import java.time.LocalDateTime;


public class Appointment {


    protected Long appointmentId;
    protected LocalDateTime appointmentTime;
    protected AppointmentStatus status;
    protected Animal animal;
    protected Owner owner;
    protected Veterinarian veterinarian;
    private AppointmentType appointmentType;
    private int durationInMinutes;

    public Appointment() {
        // Required by Hibernate
    }

    public Appointment(Long appointmentId,
                       LocalDateTime appointmentTime,
                       Animal animal,
                       Owner owner,
                       Veterinarian veterinarian,
                       AppointmentType appointmentType) {
        this.appointmentId = appointmentId;
        this.appointmentTime = appointmentTime;
        this.animal = animal;
        this.owner = owner;
        this.veterinarian = veterinarian;
        this.appointmentType = appointmentType;
        this.status = AppointmentStatus.SCHEDULED;
    }

    public void complete() {
        this.status = AppointmentStatus.COMPLETED;
    }

    public void cancel() {
        this.status = AppointmentStatus.CANCELED;
    }

    public void performCheckupOnDog() {
        if (animal instanceof Dog dog) {
            if (dog.getDogBreed().isAggressive() && dog.isRabiesVaccineExpired()) {
                throw new MedicalUrgencyException("Rabies vaccine expired. Mandatory by law.");
            }
        }
    }

    public void evaluateBiologicalRisk() {
        if (animal instanceof Cat cat) {
            if (cat.isCoronavirusPositive() || cat.isFelvFivPositive()) {
                throw new MedicalUrgencyException("Special disinfection protocol required after surgery.");
            }
        }
    }

    public void checkVetExperience() {
        if (!veterinarian.isExperiencedEnoughForSurgery()) {
            throw new VetExperienceException("Vet not experienced enough for surgery.");
        }
    }

    public float calculatePrice(){
        float price = 0.0f;
        if (appointmentType == AppointmentType.SURGERY){
            price = 250.0f;
        } else {
            price = 100.0f;
        }
        if (durationInMinutes > 120 && appointmentType == AppointmentType.SURGERY){
            price = price + price / 2;
        }
        return price;
    }



}
