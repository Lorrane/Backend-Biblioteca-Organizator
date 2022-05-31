package br.com.ra.biblioteca_organizator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import br.com.ra.biblioteca_organizator.entities.BooksGenrers;
import br.com.ra.biblioteca_organizator.repositories.BooksGenrersRepository;

@RestController
@RequestMapping(value = "/book_genrers")
public class BooksGenrersController {

    @Autowired
    BooksGenrersRepository repository;

    @GetMapping
    public List<BooksGenrers> findByBook(Integer book_id) {

        return repository.findByBook(book_id);

    }

}
