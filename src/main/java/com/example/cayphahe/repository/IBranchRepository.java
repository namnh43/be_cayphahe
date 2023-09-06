package com.example.cayphahe.repository;

import com.example.cayphahe.model.Branch;
import com.example.cayphahe.model.dto.BranchDTO;
import com.example.cayphahe.model.dto.PeopleDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBranchRepository extends JpaRepository<Branch, Long> {
//    @Query("SELECT new com.example.cayphahe.model.dto.BranchDTO(b.id,b.name,b.description,b.ref.id,c.name) FROM Branch b JOIN b.ref c")
//    List<Branch> getAllBranch();
}
