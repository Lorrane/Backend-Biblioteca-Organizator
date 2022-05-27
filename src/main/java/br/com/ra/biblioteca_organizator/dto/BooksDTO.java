package br.com.ra.biblioteca_organizator.dto;

import java.util.Date;
import java.util.List;

import br.com.ra.biblioteca_organizator.entities.Books;
import br.com.ra.biblioteca_organizator.entities.Genrers;

public class BooksDTO {

    private int isbn;
    private String title;
    private String subtitle;
    private String author;
    private String publishing;
    private Date year;
    private List<Genrers> genrers;

    public BooksDTO() {
    }

    public BooksDTO(int isbn, String title, String subtitle, String author, String publishing, Date year,
            List<Genrers> genrers) {
        this.isbn = isbn;
        this.subtitle = subtitle;
        this.title = title;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.genrers = genrers;
    }

    public BooksDTO(Books book) {
        isbn = book.getIsbn();
        title = book.getTitle();
        subtitle = book.getSubtitle();
        author = book.getAuthor();
        publishing = book.getPublishing();
        year = book.getYear();
        genrers = book.getGenrers();
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public List<Genrers> getGenrers() {
        return genrers;
    }

    public void setGenrers(List<Genrers> genrers) {
        this.genrers = genrers;
    }

}
