package com.chirag.adoption_system.repository;


import com.chirag.adoption_system.model.Shelter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface ShelterRepository extends JpaRepository<Shelter,Long> {
    List<Shelter> findByUserId(String userid);
    List<Shelter> findByPetId(String petid);

}
