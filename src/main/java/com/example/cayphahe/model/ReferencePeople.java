package com.example.cayphahe.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "refs")
public class ReferencePeople {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
}
