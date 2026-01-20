package com.pet.clinic.management.model.animal;

import com.pet.clinic.management.model.users.Owner;



public class Cat extends Animal {

    private boolean coronavirusPositive;
    private boolean felvFivPositive;

    public Cat(Long id,
               String name,
               int age,
               String gender,
               boolean neutered,
               Owner owner,
               boolean coronavirusPositive,
               boolean felvFivPositive) {
        super(id, name, age, gender, neutered, owner, AnimalType.CAT);
        this.coronavirusPositive = coronavirusPositive;
        this.felvFivPositive = felvFivPositive;
    }

    public boolean isCoronavirusPositive() {
        return coronavirusPositive;
    }

    public boolean isFelvFivPositive() {
        return felvFivPositive;
    }
}
