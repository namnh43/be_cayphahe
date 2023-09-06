package com.example.cayphahe.model.dto;

import com.example.cayphahe.model.People;
import lombok.Builder;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class PeopleDTO {
    private Long id;
    private Boolean sex;//0: male, 1: female
    private String name;

    private Date birthDay;
    private Date deadDay;
    private Boolean alive=true;
    private DadDTO dad;
    private MomDTO mom;
    private Long branchId;
    public PeopleDTO(People people) {
        this.id = people.getId();
        this.sex = people.getSex();
        this.name = people.getName();
        this.birthDay = people.getBirthDay();
        this.deadDay = people.getDeadDay();
        this.alive = people.getAlive();
        this.dad = people.getDad() != null ? new DadDTO(people.getDad().getId(),people.getDad().getName()) : null;
        this.mom = people.getMom() != null ? new MomDTO(people.getMom().getId(), people.getMom().getName()) : null;
        this.branchId = people.getBranch().getId();
    }
}
