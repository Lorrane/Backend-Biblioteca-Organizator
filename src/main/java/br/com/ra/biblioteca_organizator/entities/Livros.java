package br.com.ra.biblioteca_organizator.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_books")
public class Livros implements Serializable {

    @Id
    private int isbn;
    private String title;
    private String subtitle;
    private String author;
    private String publishing;
    private Date year;
    @ManyToMany
    @JoinTable(name = "tbl_genrers_book", joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = {
            @JoinColumn(name = "genrers_id") })
    private List<Genrers> genrers;

    public Livros() {
    }

    public Livros(int isbn, String title, String subtitle, String author, String publishing, List<Genrers> genrers,
            Date year) {
        this.isbn = isbn;
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.publishing = publishing;
        this.genrers = genrers;
        this.year = year;
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
