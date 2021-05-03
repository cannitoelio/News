package com.coding.challenge.news.models.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Notizia {
    @Id
    private Long idNotizia;
    private String titolo;
    private String articolo;
    private String immagine;
    @ManyToOne
    private Autore autore;
}
