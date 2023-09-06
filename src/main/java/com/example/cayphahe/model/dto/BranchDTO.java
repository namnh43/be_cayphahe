package com.example.cayphahe.model.dto;

import com.example.cayphahe.model.People;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchDTO {
    private Long id;
    private String name;
    private Long ref_id;
    private String ref_name;
    private String description;

    public BranchDTO(Long id, String name, String description, Long ref_id, String ref_name) {
        this.id = id;
        this.name = name;
        this.ref_id = ref_id;
        this.description = description;
        this.ref_name = ref_name;
    }
}
