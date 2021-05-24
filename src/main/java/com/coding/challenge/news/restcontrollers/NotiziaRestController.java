package com.coding.challenge.news.restcontrollers;

import com.coding.challenge.news.models.dtos.NotiziaDto;
import com.coding.challenge.news.models.forms.NotiziaForm;
import com.coding.challenge.news.services.NotiziaService;
import com.coding.challenge.news.util.Constants;
import com.coding.challenge.news.util.Paths;
import org.assertj.core.util.Preconditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Paths.URL_NOTIZIA)
@Validated
public class NotiziaRestController {

    @Autowired
    NotiziaService notiziaService;

    @GetMapping(Paths.URL_GET_ALL)
    public List<NotiziaDto> getAll() {
        return notiziaService.getAllNotizie();
    }

    @GetMapping("/{id}")
    public NotiziaDto getNotizia(@PathVariable long id) {
        return notiziaService.getNotizia(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = Paths.URL_CREATE_NEW)
    public NotiziaDto createNotizia(@Valid @RequestBody NotiziaForm form) {
        return notiziaService.addNotizia(form);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public NotiziaDto updateNotizia(@PathVariable long id, @RequestBody NotiziaForm form) {
        return notiziaService.addNotizia(form);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNotizia(@PathVariable long id) {
        notiziaService.deleteNotizia(id);
    }
}

