package br.com.ra.biblioteca_organizator.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.ra.biblioteca_organizator.dto.BooksDTO;

@Entity
@Table(name = "tbl_books")
public class Books implements Serializable {

    @Id
    private int isbn;
    private String title;
    private String subtitle;
    private String author;
    private String publishing;
    private Date yearPubli;

    @OneToMany(mappedBy = "books")
    private Set<BooksGenrers> genrers = new HashSet<>();

    public Books() {
    }

    public Books(BooksDTO dto) {
        this.isbn = dto.getIsbn();
        this.title = dto.getTitle();
        this.subtitle = dto.getSubtitle();
        this.author = dto.getAuthor();
        this.publishing = dto.getPublishing();
        this.yearPubli = dto.getYearPubli();
    }

    public Books(
            int isbn,
            String title,
            String subtitle,
            String author,
            String publishing,
            Date yearPubli) {
        this.isbn = isbn;
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.publishing = publishing;
        this.yearPubli = yearPubli;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Date getYearPubli() {
        return yearPubli;
    }

    public void setYearPubli(Date yearPubli) {
        this.yearPubli = yearPubli;
    }

    public Set<BooksGenrers> getGenrers() {
        return genrers;
    }

}
