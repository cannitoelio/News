package com.coding.challenge.news.models.entities;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
@Data
@Entity
public class Autore {
    @Id
    Long idAutore;
    String nome;
    String cognome;

}
