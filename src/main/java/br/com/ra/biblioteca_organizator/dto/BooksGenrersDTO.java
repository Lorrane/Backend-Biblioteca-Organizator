package br.com.ra.biblioteca_organizator.dto;

import br.com.ra.biblioteca_organizator.entities.BooksGenrers;

public class BooksGenrersDTO {

    private Integer book_id;
    private Long genrer_id;

    public BooksGenrersDTO() {

    }

    public BooksGenrersDTO(Integer book_id, Long genrer_id) {
        this.book_id = book_id;
        this.genrer_id = genrer_id;
    }

    public BooksGenrersDTO(BooksGenrers bg) {
        this.book_id = bg.getBookId();
        this.genrer_id = bg.getGenrerId();
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
