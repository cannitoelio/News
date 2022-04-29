package com.coding.challenge.news.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "notizie")
public class Notizia {
    @Id
    private Long idNotizia;
    private String titolo;
    private String articolo;
    private String immagine;
    @ManyToOne
    private Autore autore;
}
