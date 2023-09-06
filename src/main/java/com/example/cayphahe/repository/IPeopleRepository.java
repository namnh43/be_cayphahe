package com.example.cayphahe.repository;

import com.example.cayphahe.model.People;
import com.example.cayphahe.model.dto.PeopleDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPeopleRepository extends JpaRepository<People, Long> {
//    @Query("SELECT new com.example.cayphahe.model.dto.PeopleDTO(p.id,p.name,p.dad.id,p.mom.id,p.branch.id) FROM People p")
//    List<PeopleDTO> getAllPeople();
//    @Query("SELECT new com.example.cayphahe.model.dto.PeopleDTO(p.id,p.name,p.dad.id,p.mom.id,p.branch.id) FROM People p WHERE p.branch.id = :id")
//    List<PeopleDTO> getAllPeopleByBranchId(Long id);
    List<People> getPeopleByBranchId(Long id);
    List<People> getPeopleByDadId(Long id);
    List<People> getPeopleByMomId(Long id);
}
