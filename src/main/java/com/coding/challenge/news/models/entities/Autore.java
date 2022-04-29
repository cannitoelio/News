package com.coding.challenge.news.models.entities;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "autori")
public class Autore {
    @Id
    private Long idAutore;
    private String nome;
    private String cognome;
    @OneToOne
    private User utente;

}
