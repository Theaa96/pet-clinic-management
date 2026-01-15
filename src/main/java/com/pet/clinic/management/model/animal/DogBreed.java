package com.pet.clinic.management.model.animal;

public enum DogBreed {
    AMERICAN_PIT_BULL,
    CANE_CORSO,
    GERMAN_SHEPHERD,
    AKITA_INU,
    AMSTAFF,
    OTHER;

    public boolean isAggressive() {
        return this != OTHER;
    }
}
