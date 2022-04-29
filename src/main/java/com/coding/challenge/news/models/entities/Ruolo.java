package com.coding.challenge.news.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ruoli")
public class Ruolo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idRuolo", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;

}
