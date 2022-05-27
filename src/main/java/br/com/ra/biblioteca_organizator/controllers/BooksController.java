package br.com.ra.biblioteca_organizator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ra.biblioteca_organizator.dto.BooksDTO;
import br.com.ra.biblioteca_organizator.services.BooksServices;

@RestController
@RequestMapping(value = "/book")
public class BooksController {

    @Autowired
    private BooksServices services;

    @GetMapping
    public Page<BooksDTO> findAll(Pageable pageable) {
        return services.findAll(pageable);
    }

    @GetMapping(value = "/{isbn}")
    public BooksDTO findByIsbn(@PathVariable Integer isbn) {
        return services.findByIsbn(isbn);
    }

    @GetMapping(value = "/{title}")
    public BooksDTO findByTitle(@PathVariable String title) {
        return services.findByTitle(title);
    }

}
