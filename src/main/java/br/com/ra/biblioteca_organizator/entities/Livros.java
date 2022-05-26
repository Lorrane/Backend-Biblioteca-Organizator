package br.com.ra.biblioteca_organizator.entities;

import java.util.List;

import javax.xml.crypto.Data;

public class Livros {
    private int isbn;
    private String title;
    private String subtitle;
    private String author;
    private String publishing;
    private Data year;
    private List<Genrer> genrers;

    public Livros() {
    }

    public Livros(int isbn, String title, String subtitle, String author, String publishing, List<Genrer> genrers,
            Data year) {
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

    public Data getYear() {
        return year;
    }

    public void setYear(Data year) {
        this.year = year;
    }

    public List<Genrer> getGenrers() {
        return genrers;
    }

    public void setGenrers(List<Genrer> genrers) {
        this.genrers = genrers;
    }

}
