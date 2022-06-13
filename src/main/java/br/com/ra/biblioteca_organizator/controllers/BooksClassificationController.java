package br.com.ra.biblioteca_organizator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ra.biblioteca_organizator.dto.BooksClassificationDTO;
import br.com.ra.biblioteca_organizator.entities.Books;
import br.com.ra.biblioteca_organizator.entities.BooksClassification;
import br.com.ra.biblioteca_organizator.entities.Classification;
import br.com.ra.biblioteca_organizator.services.BooksClassificationServices;

@Controller
@RequestMapping(value = "/book_classification")
public class BooksClassificationController {

    @Autowired
    private BooksClassificationServices services;

    @GetMapping
    public List<BooksClassificationDTO> findAll() {
        return services.findAll();
    }

    @GetMapping(value = "/book/{id}")
    public List<BooksClassificationDTO> findByBooks(Books books) {
        return services.findByBooks(books);
    }

    @GetMapping(value = "/classification/{id}")
    public List<BooksClassificationDTO> findByClassification(Classification classification) {
        return services.findByClassification(classification);
    }

    @GetMapping(value = "/{type}")
    public List<BooksClassificationDTO> findByType(String type) {
        return services.findByType(type);
    }

    public void save(@RequestBody BooksClassification bc) {
        services.save(bc);
    }

}
