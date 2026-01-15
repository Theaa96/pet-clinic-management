package com.pet.clinic.management.repository;

import com.pet.clinic.management.model.animal.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
