package br.com.ra.biblioteca_organizator.dto;

import br.com.ra.biblioteca_organizator.entities.Genrers;

public class GenrersDTO {

    private Long id;
    private String genrer;

    public GenrersDTO() {
    }

    public GenrersDTO(Genrers genrers) {
        id = genrers.getId();
        genrer = genrers.getgenrer();
    }

    public GenrersDTO(Long id, String genrer) {
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
