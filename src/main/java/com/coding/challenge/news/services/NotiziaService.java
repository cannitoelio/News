package com.coding.challenge.news.services;

import com.coding.challenge.news.models.dtos.NotiziaDTO;
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

    public List<NotiziaDTO> getAllNotizie(){
        return ObjectMapperUtils.mapAll(notiziaRepository.findAll(), NotiziaDTO.class);
    }

    public NotiziaDTO getNotizia(long id) {
        return ObjectMapperUtils.map(notiziaRepository.findById(id).orElse(new Notizia()), NotiziaDTO.class);
    }

    public void deleteNotizia(long id) {
        notiziaRepository.deleteById(id);
    }

    public NotiziaDTO addNotizia(NotiziaForm notiziaForm) {
        return ObjectMapperUtils.map(
                notiziaRepository.save(ObjectMapperUtils.map(notiziaForm, Notizia.class)),
                NotiziaDTO.class);
    }


}
