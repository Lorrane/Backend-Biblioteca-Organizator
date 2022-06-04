package br.com.ra.biblioteca_organizator.dto;

import java.util.Date;

import br.com.ra.biblioteca_organizator.entities.Books;

public class BooksDTO {

    private long isbn;
    private String title;
    private String subtitle;
    private String author;
    private String publishing;
    private Date yearPubli;

    public BooksDTO() {
    }

    public BooksDTO(long isbn, String title, String subtitle, String author, String publishing, Date year) {
        this.isbn = isbn;
        this.subtitle = subtitle;
        this.title = title;
        this.author = author;
        this.publishing = publishing;
        this.yearPubli = year;
    }

    public BooksDTO(Books book) {
        isbn = book.getIsbn();
        title = book.getTitle();
        subtitle = book.getSubtitle();
        author = book.getAuthor();
        publishing = book.getPublishing();
        yearPubli = book.getYearPubli();
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
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

    public Date getYearPubli() {
        return yearPubli;
    }

    public void setYearPubli(Date year) {
        this.yearPubli = year;
    }

}
