package com.example.cayphahe.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class DadDTO extends ParentDTO{

    public DadDTO(Long id, String name) {
        super(id, name);
    }
}
