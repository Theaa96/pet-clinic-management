package com.pet.clinic.management.model.users;

import com.pet.clinic.management.model.animal.Animal;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "OWNER")
public class Owner {
    @Id
    private Long ownerId;
    private String address;
    private String firstName;
    private String lastName;
    private boolean isActive;
    @OneToMany
    @JoinColumn(name = "ANIMAL_ID")
    private Set<Animal> ownedPets = new HashSet<>();

    public boolean hasActivePets() {
        isActive = !ownedPets.isEmpty();
        return isActive;
    }

    public Owner(Long ownerId, String address, String firstName, String lastName, boolean isActive, Set<Animal> ownedPets) {
        this.ownerId = ownerId;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isActive = isActive;
        this.ownedPets = ownedPets;
    }

    public Owner() {
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
        return isActive;
    }

    public Set<Animal> getOwnedPets() {
        return ownedPets;
    }
}
