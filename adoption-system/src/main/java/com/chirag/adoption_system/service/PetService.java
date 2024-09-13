package com.chirag.adoption_system.service;
import com.chirag.adoption_system.model.Pet;

import java.util.List;
public interface PetService {
        List<Pet> getAllPets();
        Pet getPetById(Long id);
        Pet savePet(Pet pet);
        Pet updatePet(Long id, Pet pet);
        void deletePet(Long id);
    }
