package com.coding.challenge.news.models.forms;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AutoreForm {
    private String nome;
    private String cognome;
}
