package com.pet.clinic.management.model.animal;

import jakarta.persistence.*;

@MappedSuperclass
public class Animal {
    @Id
    protected Long id;
    protected String name;
    protected Integer age;
    protected String gender;
    protected Boolean neutered;

    @Enumerated(EnumType.STRING)
    protected AnimalType animalType;

    public Animal(String name, Long id, Integer age, String gender, Boolean neutered, AnimalType animalType) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.neutered = neutered;
        this.animalType = animalType;
    }

    public Animal() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Boolean getNeutered() {
        return neutered;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }
}
