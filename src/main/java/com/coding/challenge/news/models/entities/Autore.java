package com.coding.challenge.news.models.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Autore {
    @Id
    Long idAutore;
    String nome;
    String cognome;
}
