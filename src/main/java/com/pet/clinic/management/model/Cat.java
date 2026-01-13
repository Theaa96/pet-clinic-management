package com.pet.clinic.management.model;

public class Cat extends Animal {
    private boolean coronavirusPositive;
    private boolean felvfivPositive;


    public Cat(String name, String id, Integer age, String gender, Boolean neutered, boolean coronavirusPositive, boolean felvfivPositive) {
        super(name, id, age, gender, neutered, AnimalType.CAT);
        this.coronavirusPositive = coronavirusPositive;
        this.felvfivPositive = felvfivPositive;
    }

    public boolean isCoronavirusPositive() {
        return coronavirusPositive;
    }

    public boolean isFelvfivPositive() {
        return felvfivPositive;
    }
}
