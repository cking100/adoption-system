package com.chirag.adoption_system.service;
import com.chirag.adoption_system.model.AdoptionRequest;
import java.util.List;
public interface AdoptionRequestService {

    AdoptionRequest createAdoptionRequest(AdoptionRequest adoptionRequest);
    List<AdoptionRequest> getAllAdoptionRequests();
    AdoptionRequest getAdoptionRequestById(Long id);
    AdoptionRequest updateAdoptionRequest(Long id, AdoptionRequest adoptionRequest);
}

