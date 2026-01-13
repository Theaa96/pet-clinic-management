package com.pet.clinic.management.model;

import java.time.LocalDate;

public class Dog extends Animal {
    private LocalDate lastRabiesVac;
    private DogBread dogBread;

    public Dog(String name, String id, Integer age, String gender, Boolean neutered, AnimalType animalType,
               LocalDate lastRabiesVac, DogBread dogBread) {
        super(name, id, age, gender, neutered, animalType);
        this.lastRabiesVac = lastRabiesVac;
        this.dogBread = dogBread;
    }

    public LocalDate getLastRabiesVac() {
        return lastRabiesVac;
    }

    public DogBread getDogBread() {
        return dogBread;
    }

}
