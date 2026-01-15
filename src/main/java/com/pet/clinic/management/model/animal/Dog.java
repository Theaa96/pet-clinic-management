package com.pet.clinic.management.model.animal;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "DOG")
public class Dog extends Animal {
    private LocalDate lastRabiesVac;
    private DogBreed dogBreed;

    public Dog(String name, Long id, Integer age, String gender, Boolean neutered,
               LocalDate lastRabiesVac, DogBreed dogBreed) {
        super(name, id, age, gender, neutered, AnimalType.DOG);
        this.lastRabiesVac = lastRabiesVac;
        this.dogBreed = dogBreed;
    }
    public Dog() {
    }

    public boolean isRabiesVaccineExpired() {
        return lastRabiesVac.isBefore(LocalDate.now().minusYears(1));
    }

    public DogBreed getDogBreed() {
        return dogBreed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "lastRabiesVac=" + lastRabiesVac +
                ", dogBread=" + dogBreed +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", neutered=" + neutered +
                ", animalType=" + animalType +
                '}';
    }
}
