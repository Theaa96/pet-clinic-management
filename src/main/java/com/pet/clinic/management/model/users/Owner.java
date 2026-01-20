package com.pet.clinic.management.model.users;

import com.pet.clinic.management.model.animal.Animal;

import java.util.HashSet;
import java.util.Set;
public class Owner {
    private Long ownerId;
    private String address;
    private String firstName;
    private String lastName;
    private boolean active;
    private Set<Animal> ownedPets = new HashSet<>();

    public Owner(Long ownerId, String address, String firstName, String lastName, boolean active, Set<Animal> ownedPets) {
        this.ownerId = ownerId;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
        this.ownedPets = ownedPets;
    }

    public boolean hasActivePets() {
        active = !ownedPets.isEmpty();
        return active;
    }

    public void addAnimal(Animal pet) {
        ownedPets.add(pet);
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isActive() {
        return active;
    }

    public Set<Animal> getOwnedPets() {
        return ownedPets;
    }
}
