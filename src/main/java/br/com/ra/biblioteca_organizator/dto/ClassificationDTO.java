package br.com.ra.biblioteca_organizator.dto;

import br.com.ra.biblioteca_organizator.entities.Classification;

public class ClassificationDTO {

    private Long id;
    private String name;

    public ClassificationDTO() {

    }

    public ClassificationDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ClassificationDTO(Classification classification) {
        this.id = classification.getId();
        this.name = classification.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
