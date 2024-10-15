package com.chirag.adoption_system.service;
import com.chirag.adoption_system.model.AdoptionRequest;
import com.chirag.adoption_system.repository.AdoptionRequestRepository;
import com.chirag.adoption_system.service.AdoptionRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AdoptionRequestServiceImpl implements AdoptionRequestService {

    @Autowired
    private AdoptionRequestRepository adoptionRequestRepository;

    // Method to create a new adoption request
    @Override
    public AdoptionRequest createAdoptionRequest(AdoptionRequest adoptionRequest) {
        return adoptionRequestRepository.save(adoptionRequest);
    }

    // Method to retrieve all adoption requests
    @Override
    public List<AdoptionRequest> getAllAdoptionRequests() {
        return adoptionRequestRepository.findAll();
    }

    // Method to find a request by ID
    @Override
    public AdoptionRequest getAdoptionRequestById(Long id) {
        Optional<AdoptionRequest> adoptionRequest = adoptionRequestRepository.findById(id);
        if (adoptionRequest.isPresent()) {
            return adoptionRequest.get();
        } else {
            throw new RuntimeException("AdoptionRequest not found for ID: " + id);
        }
    }

    // Method to update an existing adoption request
    @Override
    public AdoptionRequest updateAdoptionRequest(Long id, AdoptionRequest adoptionRequest) {
        AdoptionRequest existingRequest = getAdoptionRequestById(id);
        existingRequest.setDetails(adoptionRequest.getDetails());
        return adoptionRequestRepository.save(existingRequest);
    }
}
