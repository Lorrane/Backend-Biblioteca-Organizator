package br.com.ra.biblioteca_organizator.dto;

import br.com.ra.biblioteca_organizator.entities.Books;
import br.com.ra.biblioteca_organizator.entities.BooksGenrers;
import br.com.ra.biblioteca_organizator.entities.Genrers;

public class BooksGenrersDTO {

    private Long id;
    private Books books;
    private Genrers genrers;

    public BooksGenrersDTO() {

    }

    public BooksGenrersDTO(Books books, Genrers genrers) {
        this.books = books;
        this.genrers = genrers;
    }

    public BooksGenrersDTO(BooksGenrers bg) {
        this.id = bg.getId();
        this.books = bg.getBooks();
        this.genrers = bg.getGenrers();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public Genrers getGenrers() {
        return genrers;
    }

    public void setGenrers(Genrers genrers) {
        this.genrers = genrers;
    }
}
