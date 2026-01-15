package com.pet.clinic.management.model;

import com.pet.clinic.management.model.animal.Animal;
import com.pet.clinic.management.model.animal.Cat;
import com.pet.clinic.management.model.animal.Dog;
import com.pet.clinic.management.model.animal.DogBreed;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Milo", 124L, 12, "Masculine", true, false, false);
        Animal dog = new Dog("Rex", 234L, 8, "Masculine", false, LocalDate.of(2025, 4, 5),
                DogBreed.AMERICAN_PIT_BULL);
        System.out.println(cat);
        System.out.println(dog);

    }
}
