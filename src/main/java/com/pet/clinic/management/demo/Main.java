package com.pet.clinic.management.demo;

import com.pet.clinic.management.model.animal.Animal;
import com.pet.clinic.management.model.animal.Cat;
import com.pet.clinic.management.model.animal.Dog;
import com.pet.clinic.management.model.animal.DogBreed;
import com.pet.clinic.management.model.medicalservice.Appointment;
import com.pet.clinic.management.model.medicalservice.AppointmentType;
import com.pet.clinic.management.model.medicalservice.MedicalUrgencyException;
import com.pet.clinic.management.model.medicalservice.VetExperienceException;
import com.pet.clinic.management.model.users.Owner;
import com.pet.clinic.management.model.users.VetSpecialization;
import com.pet.clinic.management.model.users.Veterinarian;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Owner owner1 = new Owner(1L, "Arcu 21", "Popescu", "Ion", false, new HashSet<>());
        Owner owner2 = new Owner(2L, "Arcu 21", "Popescu", "Ion", false, new HashSet<>());
        Owner owner3 = new Owner(3L, "Arcu 21", "Popescu", "Ion", false, new HashSet<>());

        Animal cat1 = new Cat(1L, "Milo", 12, "Masculin", true, owner1, true, false);
        Animal dog1 = new Dog(2L, "Rex", 4, "Masculin", true, owner2, null, DogBreed.AMSTAFF );
        Animal dog2 = new Dog(3L, "Milo", 12, "Masculin", true, owner3, LocalDate.now(), DogBreed.AMSTAFF );
        owner1.addAnimal(cat1);
        owner2.addAnimal(dog1);
        owner3.addAnimal(dog2);

        Veterinarian veterinarian1 = new Veterinarian(1L, "Elena", "Popescu", 10, VetSpecialization.GENERAL);
        Veterinarian veterinarian2 = new Veterinarian(2L, "Ion", "Popescu", 10, VetSpecialization.GENERAL);
        Appointment appointment1 = new Appointment(1L, LocalDateTime.now(), cat1, owner1, veterinarian1, AppointmentType.GENERAL);
        Appointment appointment2 = new Appointment(2L, LocalDateTime.now().plusHours(2), dog1, owner2, veterinarian2, AppointmentType.GENERAL);
        Appointment appointment3 = new Appointment(3L, LocalDateTime.now().plusHours(3), dog2, owner3, veterinarian2, AppointmentType.SURGERY);

        try {
            appointment1.evaluateBiologicalRisk();
        } catch (MedicalUrgencyException e) {
            System.out.println(e.getMessage());;
        }

        appointment1.complete();
        System.out.println(appointment1.calculatePrice());

        try {
            appointment2.performCheckupOnDog();
        } catch (MedicalUrgencyException e) {
            System.out.println(e.getMessage());
        }

        try {
            appointment3.performCheckupOnDog();
            appointment3.checkVetExperience();
        } catch (VetExperienceException e) {
            System.out.println(e.getMessage());
        }


    }

}
