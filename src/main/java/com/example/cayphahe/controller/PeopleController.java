package com.example.cayphahe.controller;

import com.example.cayphahe.model.People;
import com.example.cayphahe.model.dto.PeopleDTO;
import com.example.cayphahe.service.IPeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/people")
@RequiredArgsConstructor
public class PeopleController {
    private final IPeopleService peopleService;
    @GetMapping
    public ResponseEntity<List<People>> getAllPeople() {
        return new ResponseEntity<>(peopleService.getAllPeople(), HttpStatus.OK);
    }
    @GetMapping("/branch/{id}")
    public ResponseEntity<List<PeopleDTO>> getAllPeopleByBranchId(@PathVariable Long id) {
        return new ResponseEntity<>(peopleService.getAllPeopleByBranchId(id), HttpStatus.OK);
    }
    @GetMapping("/dad/{id}")
    public ResponseEntity<List<People>> GetAllPeopleByDadId(@PathVariable Long id) {
        return new ResponseEntity<>(peopleService.getPeopleByDadId(id), HttpStatus.OK);
    }
    @GetMapping("/mom/{id}")
    public ResponseEntity<List<People>> GetAllPeopleByMomId(@PathVariable Long id) {
        return new ResponseEntity<>(peopleService.getPeopleByMom(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<People>createNewPeople(@RequestBody People people) {
        System.out.println(people);
        People createdPeople = peopleService.save(people);
        System.out.println(createdPeople);
        return new ResponseEntity<>(createdPeople, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<PeopleDTO> getPeopleById(@PathVariable Long id) {
        System.out.println("go here");
        Optional<People> people = peopleService.findById(id);
        if (people.isPresent()) {
            People peopleImp = people.get();
            PeopleDTO peopleDTO = new PeopleDTO(peopleImp);
            return new ResponseEntity<>(peopleDTO,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
