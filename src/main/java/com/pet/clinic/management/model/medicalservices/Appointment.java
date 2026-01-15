package com.pet.clinic.management.model.medicalservices;

import com.pet.clinic.management.model.users.Owner;
import com.pet.clinic.management.model.users.Veterinarian;
import com.pet.clinic.management.model.animal.Animal;
import jakarta.persistence.*;

import java.time.LocalDateTime;
@MappedSuperclass
public abstract class Appointment {
    @Id
    protected Long id;
    protected LocalDateTime dateTime;
    @Enumerated(EnumType.STRING)
    protected AppointmentStatus status;
    @ManyToOne
    @JoinColumn(name = "ANIMAL_ID")
    protected Animal animal;
    @ManyToOne
    @JoinColumn(name = "OWNER_ID")
    protected Owner owner;
    @ManyToOne
    @JoinColumn(name = "VETERINARIAN_ID")
    protected Veterinarian veterinarian;

    protected Appointment(LocalDateTime dateTime,
                          Animal animal,
                          Owner owner,
                          Veterinarian veterinarian) {

        this.dateTime = dateTime;
        this.animal = animal;
        this.owner = owner;
        this.veterinarian = veterinarian;
        this.status = AppointmentStatus.SCHEDULED;
    }

    public void complete() {
        this.status = AppointmentStatus.COMPLETED;
    }

    public void cancel() {
        this.status = AppointmentStatus.CANCELED;
    }

    public Appointment(){} //for hibernate

    public abstract int getDurationMinutes();
    public abstract double getPrice();
}
