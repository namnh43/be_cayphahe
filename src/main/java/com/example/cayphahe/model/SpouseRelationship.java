package com.example.cayphahe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "spouses")
public class SpouseRelationship {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "people_id")
    private People people;

    @ManyToOne
    @JoinColumn(name = "spouse_id")
    private People spouse;

}
