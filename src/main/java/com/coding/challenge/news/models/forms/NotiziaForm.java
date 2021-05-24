package com.coding.challenge.news.models.forms;

import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class NotiziaForm {
    public static final int MAX_TITLE_LENGTH = 100;
    public static final int MIN_TITLE_LENGTH = 10;
    private long idNotizia;
    @NotBlank
    @Size(min = MIN_TITLE_LENGTH,max=MAX_TITLE_LENGTH)
    private String titolo;
    @NotBlank
    @Size(min=10,max=5000)
    private String articolo;
    private String immagine;

}
