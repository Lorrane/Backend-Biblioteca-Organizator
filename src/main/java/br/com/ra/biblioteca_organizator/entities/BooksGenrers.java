package br.com.ra.biblioteca_organizator.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book_genrer")
public class BooksGenrers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Books books;

    @ManyToOne
    @JoinColumn(name = "genrer_id")
    private Genrers genrers;

    public BooksGenrers() {

    }

    public BooksGenrers(Books books, Genrers genrers) {
        this.books = books;
        this.genrers = genrers;
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

    public void setBookId(Books books) {
        this.books = books;
    }

    public Genrers getGenrers() {
        return genrers;
    }

    public void setGenrer(Genrers genrers) {
        this.genrers = genrers;
    }
}
