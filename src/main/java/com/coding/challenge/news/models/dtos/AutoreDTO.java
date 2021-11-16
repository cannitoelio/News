package com.coding.challenge.news.models.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AutoreDTO {

    private long id;
    private String nome;
    private String cognome;


}
