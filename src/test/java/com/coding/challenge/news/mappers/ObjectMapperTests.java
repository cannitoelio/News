package com.coding.challenge.news.mappers;

import com.coding.challenge.news.models.dtos.AutoreDTO;
import com.coding.challenge.news.models.entities.Autore;
import com.coding.challenge.news.models.forms.AutoreForm;
import com.coding.challenge.news.util.ObjectMapperUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.filter;

@SpringBootTest
class ObjectMapperTests {

    @Test
    void testMappingTwoObjectsHasSameValue() throws Exception {
        AutoreDTO autoreDTO = AutoreDTO.builder()
                .cognome("Cannito")
                .nome("Elio")
                .build();
        Autore autore = ObjectMapperUtils.map(autoreDTO, Autore.class);
        assertThat(autore.getCognome()).isEqualTo(autoreDTO.getCognome());
        assertThat(autore.getNome()).isEqualTo(autoreDTO.getNome());

    }


    @Test
    void testMapAllObjectMapperOfObject() {
        AutoreDTO autoreDTO = AutoreDTO.builder()
                .cognome("Cannito")
                .nome("Elio")
                .build();
        AutoreDTO autore2DTO = AutoreDTO.builder()
                .cognome("Cannito2")
                .nome("Elio2")
                .build();
        List<AutoreDTO> listAutoreDTO = Arrays.asList(autoreDTO,autore2DTO);
        List<Autore> autori = ObjectMapperUtils.mapAll(listAutoreDTO,Autore.class);
        Autore autore1 = new Autore();
        autore1.setNome("Elio");
        autore1.setCognome("Cannito");
        Autore autore2 = new Autore();
        autore2.setNome("Elio2");
        autore2.setCognome("Cannito2");

        assertThat(autori).isEqualTo(Arrays.asList(autore1,autore2));

    }
}
