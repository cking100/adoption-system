package com.chirag.adoption_system.service;

import com.chirag.adoption_system.model.Shelter;
import com.chirag.adoption_system.repository.ShelterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShelterServiceImpl implements ShelterService {

    @Autowired
    private ShelterRepository shelterRepository;

    @Override
    public Shelter createShelter(Shelter shelter) {
        return shelterRepository.save(shelter);
    }

    @Override
    public Shelter getShelterById(Long id) {
        Optional<Shelter> shelter = shelterRepository.findById(id);
        return shelter.orElse(null); // Return null or throw an exception if shelter is not found
    }

    @Override
    public List<ShelterService> getAllShelter() {
        return List.of();
    }

    @Override
    public List<Shelter> getAllShelters() {
        return shelterRepository.findAll();
    }

    @Override
    public Shelter updateShelter(Long id, Shelter shelterDetails) {
        Optional<Shelter> existingShelter = shelterRepository.findById(id);

        if (existingShelter.isPresent()) {
            Shelter shelter = existingShelter.get();
            shelter.setName(shelterDetails.getName());  // Update fields
            shelter.setLocation(shelterDetails.getLocation());
            shelter.setcapacity(shelterDetails.getCapacity());
            // Add other fields that need to be updated

            return shelterRepository.save(shelter);
        } else {
            return null;  // You could throw an exception here if the shelter is not found
        }
    }
}
