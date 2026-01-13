package com.pet.clinic.management.model;

public enum DogBread {
    AMERICAN_PIT_BULL,
    CANE_CORSO,
    GERMAN_SHEPHERD,
    AKITA_YNU,
    AMSTAFF,
    OTHER;

    public boolean isAggressive() {
        return this != OTHER;
    }
}
