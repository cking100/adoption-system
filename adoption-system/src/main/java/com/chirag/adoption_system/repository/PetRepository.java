package com.chirag.adoption_system.repository;

import com.chirag.adoption_system.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PetRepository extends JpaRepository<Pet,Long> {
    List<Pet> findBYAdoption();
}
