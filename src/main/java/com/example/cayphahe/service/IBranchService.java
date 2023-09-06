package com.example.cayphahe.service;

import com.example.cayphahe.model.Branch;

import java.util.List;
import java.util.Optional;

public interface IBranchService extends IGeneralService<Branch>{
    List<Branch> getAllBranch();
}
