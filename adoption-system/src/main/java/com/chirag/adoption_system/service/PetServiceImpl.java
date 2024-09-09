package com.chirag.adoption_system.service;

import com.chirag.adoption_system.model.Pet;
import com.chirag.adoption_system.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chirag.adoption_system.exception.ResourceNotFoundException;

import java.util.List;
@Service
public class PetServiceImpl implements PetService {
    @Autowired
    private PetRepository petRepository;

    @Override
    public List<Pet> getAllPets() {
        return petRepository.findAll();
    }

    @Override
    public Pet getPetById(Long id) {
        return petRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Pet not found"));
    }

    @Override
    public Pet savePet(Pet pet) {
        return petRepository.save(pet);
    }
    @Override
    public Pet updatePet(Long id, Pet petDetails) {
        // Step 1: Retrieve the pet from the repository by its id
        Pet existingPet = petRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Pet not found with id: " + id));

        // Step 2: Update the fields (assuming the Pet entity has fields like name, type, age, etc.)
        existingPet.setName(petDetails.getName());
        existingPet.setType(petDetails.getType());
        existingPet.setAge(petDetails.getAge());
        existingPet.setBreed(petDetails.getBreed());
        existingPet.setDescription(petDetails.getDescription());

        // Step 3: Save the updated pet to the repository
        return petRepository.save(existingPet);
    }
    @Override
    public void deletePet(Long id) {
        petRepository.deleteById(id);
    }


}

