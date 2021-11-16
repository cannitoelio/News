package com.coding.challenge.news.restcontrollers;

import com.coding.challenge.news.models.dtos.NotiziaDTO;
import com.coding.challenge.news.models.forms.NotiziaForm;
import com.coding.challenge.news.services.NotiziaService;
import com.coding.challenge.news.util.Paths;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.jaxb.SpringDataJaxb;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(Paths.URL_NOTIZIA)
@Validated
@Log4j2
@CrossOrigin
public class NotiziaRestController {

    @Autowired
    NotiziaService notiziaService;

    @GetMapping(Paths.URL_GET_ALL)
    public List<NotiziaDTO> getAll() {
        return notiziaService.getAllNotizie();
    }

    @GetMapping("/{id}")
    public ResponseEntity<NotiziaDTO> getNotizia(@PathVariable long id) {
        return
                ResponseEntity.status(HttpStatus.OK)
                        .body(notiziaService.getNotizia(id));
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = Paths.URL_CREATE_NEW)
    @Operation(summary = "Crate a new news")
    @ApiResponse(responseCode = "201", description = "Order is created",
            content = {@Content(mediaType = APPLICATION_JSON_VALUE,
            schema = @Schema(implementation = NotiziaDTO.class))})
    public ResponseEntity<NotiziaDTO> createNotizia(@Valid @RequestBody NotiziaForm form) {
        final NotiziaDTO notiziaDTO = notiziaService.addNotizia(form);
        log.info("Daje",notiziaDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(notiziaDTO);
    }

    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public NotiziaDTO updateNotizia(@PathVariable long id, @RequestBody NotiziaForm form) {
        return notiziaService.addNotizia(form);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteNotizia(@PathVariable long id) {
        notiziaService.deleteNotizia(id);
    }
}

