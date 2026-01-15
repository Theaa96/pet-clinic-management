package com.pet.clinic.management.repository;

import com.pet.clinic.management.model.users.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
