package com.pet.clinic.management.model;

import java.time.LocalDate;

public class Rodent extends Animal {
  LocalDate lastDentalCheck;

    public Rodent(String name, String id, Integer age, String gender, Boolean neutered, AnimalType animalType, LocalDate lastDentalCheck) {
        super(name, id, age, gender, neutered, animalType);
        this.lastDentalCheck = lastDentalCheck;
    }
}
