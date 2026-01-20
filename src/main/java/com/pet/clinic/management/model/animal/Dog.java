package com.pet.clinic.management.model.animal;

import com.pet.clinic.management.model.users.Owner;


import java.time.LocalDate;

public class Dog extends Animal {

    private LocalDate lastRabiesVac;
    private final DogBreed dogBreed;

    public Dog(Long id,
               String name,
               int age,
               String gender,
               boolean neutered,
               Owner owner,
               LocalDate lastRabiesVac,
               DogBreed dogBreed) {
        super(id, name, age, gender, neutered, owner, AnimalType.DOG);
        this.lastRabiesVac = lastRabiesVac;
        this.dogBreed = dogBreed;
    }

    public boolean isRabiesVaccineExpired() {
        return lastRabiesVac == null || lastRabiesVac.isBefore(LocalDate.now().minusYears(1));
    }

    public DogBreed getDogBreed() {
        return dogBreed;
    }

    public void vaccinate(LocalDate vaccineDate) {
        this.lastRabiesVac = vaccineDate;
    }
}
