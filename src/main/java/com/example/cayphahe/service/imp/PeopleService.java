package com.example.cayphahe.service.imp;

import com.example.cayphahe.model.People;
import com.example.cayphahe.model.dto.PeopleDTO;
import com.example.cayphahe.repository.IPeopleRepository;
import com.example.cayphahe.service.IPeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PeopleService implements IPeopleService {
    private final IPeopleRepository peopleRepository;
    @Override
    public Iterable<People> findAll() {
        return null;
    }

    @Override
    public Optional<People> findById(Long id) {
        Optional<People> people = peopleRepository.findById(id);
        return people;
    }

    @Override
    public People save(People people) {
        return peopleRepository.save(people);
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<People> getAllPeople() {
        return peopleRepository.findAll();
    }

    @Override
    public List<PeopleDTO> getAllPeopleByBranchId(Long id) {
        List<People> people = peopleRepository.getPeopleByBranchId(id);
        List<PeopleDTO> peopleDTOS = people.stream()
                .map((item) ->
                {
                    PeopleDTO peopleDTO = new PeopleDTO(item);
                    return peopleDTO;
                })
                .collect(Collectors.toList());
        return peopleDTOS;
    }

    @Override
    public PeopleDTO getPeopleById(Long id) {
        return null;
    }

    @Override
    public List<People> getPeopleByDadId(Long id) {
        return peopleRepository.getPeopleByDadId(id);
    }

    @Override
    public List<People> getPeopleByMom(Long id) {
        return peopleRepository.getPeopleByMomId(id);
    }

}