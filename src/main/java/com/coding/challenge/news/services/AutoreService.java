package com.coding.challenge.news.services;

import com.coding.challenge.news.models.dtos.AutoreDTO;
import com.coding.challenge.news.models.entities.Autore;
import com.coding.challenge.news.models.forms.AutoreForm;
import com.coding.challenge.news.repositories.AutoreRepository;
import com.coding.challenge.news.util.ObjectMapperUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoreService {

    @Autowired
    AutoreRepository autoreRepository;

    public List<AutoreDTO> getAllAutori() {
        return ObjectMapperUtils.mapAll(autoreRepository.findAll(), AutoreDTO.class);
    }

    public AutoreDTO getAutore(long id) {
        return ObjectMapperUtils.map(autoreRepository.findById(id).orElse(new Autore()),AutoreDTO.class);
    }

    public void deleteAutore(long id) {
        autoreRepository.deleteById(id);
    }

    public AutoreDTO addAutore(AutoreForm autoreForm){
        return ObjectMapperUtils.map(
                autoreRepository.save(ObjectMapperUtils.map(autoreForm, Autore.class)),
                AutoreDTO.class);
    }




}
