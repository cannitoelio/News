package com.coding.challenge.news.services;

import com.coding.challenge.news.models.dtos.NotiziaDto;
import com.coding.challenge.news.models.entities.Notizia;
import com.coding.challenge.news.models.forms.NotiziaForm;
import com.coding.challenge.news.repositories.NotiziaRepository;
import com.coding.challenge.news.util.ObjectMapperUtils;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class NotiziaService {
    @Autowired
    NotiziaRepository notiziaRepository;

    public List<NotiziaDto> getAllNotizie(){
        return ObjectMapperUtils.mapAll(notiziaRepository.findAll(),NotiziaDto.class);
    }

    public NotiziaDto getNotizia(long id) {
        return ObjectMapperUtils.map(notiziaRepository.findById(id).orElse(new Notizia()),NotiziaDto.class);
    }

    public void deleteNotizia(long id) {
        notiziaRepository.deleteById(id);
    }

    public NotiziaDto addNotizia(NotiziaForm notiziaForm) {
        Notizia entity = notiziaRepository.save(ObjectMapperUtils.map(notiziaForm, Notizia.class));
        return ObjectMapperUtils.map(entity,NotiziaDto.class);
    }
}
