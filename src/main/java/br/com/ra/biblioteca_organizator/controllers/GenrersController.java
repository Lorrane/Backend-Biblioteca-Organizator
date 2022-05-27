package br.com.ra.biblioteca_organizator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ra.biblioteca_organizator.dto.GenrersDTO;
import br.com.ra.biblioteca_organizator.entities.Genrers;
import br.com.ra.biblioteca_organizator.services.GenrersServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/genrer")
public class GenrersController {

    @Autowired
    GenrersServices services;

    @GetMapping
    public Page<GenrersDTO> findAll(Pageable pageable) {
        return services.findAll(pageable);
    }

    @GetMapping
    public GenrersDTO findById(Long id) {
        return services.findById(id);
    }

    @PostMapping
    public void saveGenrers(@RequestBody Genrers genrers) {
        services.saveGenrers(genrers);
    }

}
