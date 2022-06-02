package br.com.ra.biblioteca_organizator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_genrers")
public class Genrers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String genrer;

    public Genrers() {
    }

    public Genrers(Long id, String genrer) {
        this.id = id;
        this.genrer = genrer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGenrer() {
        return genrer;
    }

    public void setGenrer(String genrer) {
        this.genrer = genrer;
    }

}
