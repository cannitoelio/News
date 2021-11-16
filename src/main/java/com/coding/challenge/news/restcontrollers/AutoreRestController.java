package com.coding.challenge.news.restcontrollers;

import com.coding.challenge.news.models.dtos.AutoreDTO;
import com.coding.challenge.news.models.forms.AutoreForm;
import com.coding.challenge.news.services.AutoreService;
import com.coding.challenge.news.util.Paths;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(Paths.URL_AUTORE)
@Validated
@CrossOrigin(origins = "http://localhost:4200")
public class AutoreRestController {

    @Autowired
    AutoreService autoreService;

    @GetMapping(Paths.URL_GET_ALL)
    @ApiOperation(value = "get all autori", notes = "get all autori")
    public List<AutoreDTO> getAll() { return autoreService.getAllAutori(); }

    @GetMapping("/{id}")
    public AutoreDTO getAutore(@PathVariable long id) {
        return autoreService.getAutore(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = Paths.URL_CREATE_NEW)
    public AutoreDTO createAutore(@Valid @RequestBody AutoreForm form) {
        return autoreService.addAutore(form);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public AutoreDTO updateNotizia(@PathVariable long id, @RequestBody AutoreForm form) {

        return autoreService.addAutore(form);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNotizia(@PathVariable long id) {
        autoreService.deleteAutore(id);
    }
}
