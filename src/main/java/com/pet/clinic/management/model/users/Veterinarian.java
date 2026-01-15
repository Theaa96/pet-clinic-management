package com.pet.clinic.management.model.users;

import jakarta.persistence.*;

@Entity
@Table(name = "VETERINARIAN")
public class Veterinarian {
    @Id
    private Long veterinarianId;
    private String firstName;
    private String lastName;
    private int yearsOfExperience;
    @Enumerated(EnumType.STRING)
    private VetSpecialization specialization;

    public Veterinarian(Long veterinarianId, String firstName, String lastName, int yearsOfExperience, VetSpecialization specialization) {
        this.veterinarianId = veterinarianId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfExperience = yearsOfExperience;
        this.specialization = specialization;
    }
    public Veterinarian(){}
    public boolean isExperiencedEnoughForSurgery() {
        return yearsOfExperience >= 3;
    }
}
