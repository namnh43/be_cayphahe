package com.example.cayphahe.repository;

import com.example.cayphahe.model.ReferencePeople;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IReferenceRepository extends JpaRepository<ReferencePeople,Long> {
}
