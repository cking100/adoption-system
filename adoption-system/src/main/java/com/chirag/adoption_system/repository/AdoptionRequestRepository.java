package com.chirag.adoption_system.repository;
import com.chirag.adoption_system.model.AdoptionRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
public interface AdoptionRequestRepository extends JpaRepository<AdoptionRequest,Long> {
    List<AdoptionRequest> findByUserId(String userid);
    List<AdoptionRequest> findByPetId(String petid);

}
