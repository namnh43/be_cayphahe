package com.example.cayphahe.model;

import com.example.cayphahe.service.imp.EntityListener;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "people")
public class People {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Boolean sex;//0: male, 1: female
    private String name;

    private Date birthDay;
    private Date deadDay;
    private Boolean alive=true;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "dad_id")
    private People dad;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "mom_id")
    private People mom;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", sex=" + sex +
                ", name='" + name + '\'' +
                ", birthDay=" + birthDay +
                ", deadDay=" + deadDay +
                ", alive=" + alive +
                ", dad=" + dad +
                ", mom=" + mom +
                ", branch=" + branch +
                '}';
    }
}
