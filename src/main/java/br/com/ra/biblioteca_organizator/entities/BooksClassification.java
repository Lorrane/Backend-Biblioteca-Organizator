package br.com.ra.biblioteca_organizator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_books_classification")
public class BooksClassification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books book;
    @ManyToOne
    @JoinColumn(name = "classification_id")
    private Classification classification;
    private String types;

    public BooksClassification() {

    }

    public BooksClassification(Long id, Books book, Classification classification, String type) {
        this.id = id;
        this.book = book;
        this.classification = classification;
        this.types = type;
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
        return types;
    }

    public void setType(String type) {
        this.types = type;
    }
}
