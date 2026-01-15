package com.pet.clinic.management.model.animal;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAT")
public class Cat extends Animal {
    private boolean coronavirusPositive;
    private boolean felvfivPositive;

    public Cat(String name, Long id, Integer age, String gender, Boolean neutered, boolean coronavirusPositive, boolean felvfivPositive) {
        super(name, id, age, gender, neutered, AnimalType.CAT);
        this.coronavirusPositive = coronavirusPositive;
        this.felvfivPositive = felvfivPositive;
    }

    public Cat() {
    }

    public boolean isCoronavirusPositive() {
        return coronavirusPositive;
    }

    public boolean isFelvfivPositive() {
        return felvfivPositive;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "coronavirusPositive=" + coronavirusPositive +
                ", felvfivPositive=" + felvfivPositive +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", neutered=" + neutered +
                ", animalType=" + animalType +
                '}';
    }
}
