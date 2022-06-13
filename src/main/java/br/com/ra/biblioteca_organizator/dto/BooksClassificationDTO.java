package br.com.ra.biblioteca_organizator.dto;

import br.com.ra.biblioteca_organizator.entities.Books;
import br.com.ra.biblioteca_organizator.entities.BooksClassification;
import br.com.ra.biblioteca_organizator.entities.Classification;

public class BooksClassificationDTO {

    private Long id;
    private Books book;
    private Classification classification;
    private String type;

    public BooksClassificationDTO() {

    }

    public BooksClassificationDTO(BooksClassification bc) {
        id = bc.getId();
        book = bc.getBook();
        classification = bc.getClassification();
        type = getType();
    }

    public BooksClassificationDTO(Long id, Books book, Classification classification, String type) {
        this.id = id;
        this.book = book;
        this.classification = classification;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Books getBook() {
        return book;
    }

    public void setBook(Books book) {
        this.book = book;
    }

    public Classification getClassification() {
        return classification;
    }

    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
