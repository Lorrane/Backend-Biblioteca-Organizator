package br.com.ra.biblioteca_organizator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ra.biblioteca_organizator.dto.ClassificationDTO;
import br.com.ra.biblioteca_organizator.entities.Classification;
import br.com.ra.biblioteca_organizator.services.ClassificationServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(value = "/classification")
public class ClassificationController {

    @Autowired
    private ClassificationServices services;

    @GetMapping
    public List<ClassificationDTO> findAll() {
        return services.findAll();
    }

    @GetMapping(value = "/{id}")
    public ClassificationDTO findById(@PathVariable Long id) {
        return services.findById(id);
    }

    @GetMapping(value = "/name/{name}")
    public ClassificationDTO findByName(@PathVariable String name) {
        return services.findByName(name);
    }

    @PostMapping
    public void saveClassification(@RequestBody Classification classification) {
        services.save(classification);
    }

}
