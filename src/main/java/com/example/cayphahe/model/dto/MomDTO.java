package com.example.cayphahe.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class MomDTO extends ParentDTO{
    public MomDTO(Long id, String name) {
        super(id, name);
    }
}
