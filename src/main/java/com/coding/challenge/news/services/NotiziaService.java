package com.coding.challenge.news.services;

import com.coding.challenge.news.models.dtos.NotiziaDto;
import com.coding.challenge.news.models.entities.Notizia;
import com.coding.challenge.news.models.forms.NotiziaForm;
import com.coding.challenge.news.repositories.NotiziaRepository;
import com.coding.challenge.news.util.ObjectMapperUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service
public class NotiziaService {
    @Autowired
    NotiziaRepository notiziaRepository;

    public List<NotiziaDto> getAllNotizie(){
        return ObjectMapperUtils.mapAll(notiziaRepository.findAll(),NotiziaDto.class);
    }

    public NotiziaDto getNotizia(long id) {
        return ObjectMapperUtils.map(notiziaRepository.findById(id),NotiziaDto.class);
    }

    public void deleteNotizia(long id) {
        notiziaRepository.deleteById(id);
    }

    public void addNotizia(NotiziaForm notiziaForm) {
        notiziaRepository.save(ObjectMapperUtils.map(notiziaForm, Notizia.class));
    }
}
