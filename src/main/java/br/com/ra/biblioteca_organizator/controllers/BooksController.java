package br.com.ra.biblioteca_organizator.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public List<BooksDTO> findAll() {
        return services.findAll();
    }

    @GetMapping(value = "/{isbn}")
    public BooksDTO findByIsbn(@PathVariable Integer isbn) {
        return services.findByIsbn(isbn);
    }

    @GetMapping(value = "/{title}")
    public List<BooksDTO> findByTitle(@PathVariable String title) {
        return services.findByTitle(title);
    }

    @GetMapping(value = "/{subtitle}")
    public List<BooksDTO> findBySubtitle(@PathVariable String subtitle) {
        return services.findBySubtitle(subtitle);
    }

    @GetMapping(value = "/{author}")
    public List<BooksDTO> findByAuthor(@PathVariable String author) {
        return services.findByAuthor(author);
    }

    @GetMapping(value = "/{publishing}")
    public List<BooksDTO> findByPublishing(@PathVariable String publishing) {
        return services.findByPublishing(publishing);
    }

    @PutMapping
    public BooksDTO saveBooks(@RequestBody BooksDTO books) {
        BooksDTO dto = services.saveBook(books);
        return dto;

    }

}
