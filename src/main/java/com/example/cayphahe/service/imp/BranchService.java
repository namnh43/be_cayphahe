package com.example.cayphahe.service.imp;

import com.example.cayphahe.model.Branch;
import com.example.cayphahe.repository.IBranchRepository;
import com.example.cayphahe.service.IBranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BranchService implements IBranchService {
    private final IBranchRepository branchRepository;
    @Override
    public Iterable<Branch> findAll() {
        return null;
    }

    @Override
    public Optional<Branch> findById(Long id) {
        return branchRepository.findById(id);
    }

    @Override
    public Branch save(Branch branch) {
        return null;
    }

    @Override
    public void remove(Long id) {

    }

    @Override
    public List<Branch> getAllBranch() {
        return branchRepository.findAll();
    }
}
