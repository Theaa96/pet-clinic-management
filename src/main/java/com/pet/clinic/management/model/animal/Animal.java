package com.pet.clinic.management.model.animal;

import com.pet.clinic.management.model.users.Owner;

public class Animal {
    private Long id;
    private String name;
    private int age;
    private String gender;
    private boolean neutered;
    private Owner owner;
    private AnimalType animalType;


    public Animal(Long id,
                  String name,
                  int age,
                  String gender,
                  boolean neutered,
                  Owner owner,
                  AnimalType animalType) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.neutered = neutered;
        this.owner = owner;
        this.animalType = animalType;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() { return age;}

    public String getGender() {
        return gender;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", neutered=" + neutered +
                ", owner=" + owner +
                ", animalType=" + animalType +
                '}';
    }
}
