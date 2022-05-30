package br.com.ra.biblioteca_organizator.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book_genrers")
public class BooksGenrers {

    @JoinColumn(name = "book_id")
    @ManyToMany
    private Integer book_id;

    @ManyToOne
    @JoinColumn(name = "Genrer_id")
    private Long genrer_id;

    public BooksGenrers() {

    }

    public BooksGenrers(Integer book_id, Long genrer_id) {
        this.book_id = book_id;
        this.genrer_id = genrer_id;
    }

    public Integer getBookId() {
        return book_id;
    }

    public void setBookId(Integer book_id) {
        this.book_id = book_id;
    }

    public Long getGenrerId() {
        return genrer_id;
    }

    public void setGenrerId(Long genrer_id) {
        this.genrer_id = genrer_id;
    }
}
