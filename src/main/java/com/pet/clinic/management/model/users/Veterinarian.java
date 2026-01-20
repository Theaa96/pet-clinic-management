package com.pet.clinic.management.model.users;

public class Veterinarian {

    private Long veterinarianId;
    private String firstName;
    private String lastName;
    private int yearsOfExperience;
    private VetSpecialization specialization;

    public Veterinarian() {
        // Required by Hibernate
    }

    public Veterinarian(Long veterinarianId,
                        String firstName,
                        String lastName,
                        int yearsOfExperience,
                        VetSpecialization specialization) {
        this.veterinarianId = veterinarianId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearsOfExperience = yearsOfExperience;
        this.specialization = specialization;
    }

    public Long getVeterinarianId() {
        return veterinarianId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public VetSpecialization getSpecialization() {
        return specialization;
    }

    public boolean isExperiencedEnoughForSurgery() {
        return yearsOfExperience >= 3;
    }
}
