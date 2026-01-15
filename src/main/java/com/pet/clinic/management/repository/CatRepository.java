package com.pet.clinic.management.repository;

import com.pet.clinic.management.model.animal.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
