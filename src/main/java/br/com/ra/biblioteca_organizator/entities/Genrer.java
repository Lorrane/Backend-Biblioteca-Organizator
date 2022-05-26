package br.com.ra.biblioteca_organizator.entities;

public class Genrer {
    private Long id;
    private String genrer;

    public Genrer() {
    }

    public Genrer(Long id, String genrer) {
        this.id = id;
        this.genrer = genrer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getgenrer() {
        return genrer;
    }

    public void setgenrer(String genrer) {
        this.genrer = genrer;
    }

}
