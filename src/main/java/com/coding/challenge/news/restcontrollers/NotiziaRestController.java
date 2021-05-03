package com.coding.challenge.news.restcontrollers;

import com.coding.challenge.news.models.dtos.NotiziaDto;
import com.coding.challenge.news.services.NotiziaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/notizia")
public class NotiziaRestController {
    @Autowired
    NotiziaService notiziaService;
    @GetMapping("/all")
    public List<NotiziaDto> getAll(){
        return notiziaService.getAllNotizie();
    }

    @GetMapping("/{id}")
    public NotiziaDto getNotizia(@PathVariable long id) {
        return notiziaService.getNotizia(id);
    }
}
