package com.coding.challenge.news.models.dtos;

import lombok.Data;

@Data
public class NotiziaDTO {

    private long idNotizia;
    private String titolo;
    private String articolo;
    private String immagine;
}
