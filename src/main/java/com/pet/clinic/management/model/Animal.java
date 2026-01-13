package com.pet.clinic.management.model;

public class Animal {
    protected String id;
    protected String name;
    protected Integer age;
    protected String gender;
    protected Boolean neutered;
    protected AnimalType animalType;

    public Animal(String name, String id, Integer age, String gender, Boolean neutered, AnimalType animalType) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.neutered = neutered;
        this.animalType = animalType;
    }

    public String getId() {
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
