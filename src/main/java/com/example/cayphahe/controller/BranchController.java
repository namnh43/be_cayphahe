package com.example.cayphahe.controller;

import com.example.cayphahe.model.Branch;
import com.example.cayphahe.model.dto.BranchDTO;
import com.example.cayphahe.model.dto.PeopleDTO;
import com.example.cayphahe.service.IBranchService;
import com.example.cayphahe.service.IPeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/branch")
@RequiredArgsConstructor
public class BranchController {
    private final IBranchService branchService;
    @GetMapping
    public ResponseEntity<List<Branch>> getAllBranch() {
        return new ResponseEntity<>(branchService.getAllBranch(), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Branch> findById(@PathVariable Long id) {
        Optional<Branch> branchOptional = branchService.findById(id);
        if (branchOptional.isPresent()) {
            return new ResponseEntity<>(branchOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
