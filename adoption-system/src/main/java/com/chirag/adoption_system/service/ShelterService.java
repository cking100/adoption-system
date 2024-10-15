package com.chirag.adoption_system.service;

import com.chirag.adoption_system.model.Shelter;

import java.util.List;

public interface ShelterService {
    Shelter createShelter(Shelter shelter);
    Shelter getShelterById(Long id);

    List<ShelterService> getAllShelter();

    List<Shelter> getAllShelters();
    Shelter updateShelter(Long id, Shelter shelter);
}
