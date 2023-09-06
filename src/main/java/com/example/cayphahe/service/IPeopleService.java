package com.example.cayphahe.service;

import com.example.cayphahe.model.People;
import com.example.cayphahe.model.dto.PeopleDTO;

import java.util.List;

public interface IPeopleService extends IGeneralService<People> {
    List<People> getAllPeople();
    List<PeopleDTO> getAllPeopleByBranchId(Long id);
    PeopleDTO getPeopleById(Long id);
    List<People> getPeopleByDadId(Long id);
    List<People> getPeopleByMom(Long id);
}
