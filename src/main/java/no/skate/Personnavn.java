package no.skate;

import lombok.Data;

@Data
public class Personnavn {
    private String fornavn;
    private String mellomnavn;
    private String etternavn;

    public Personnavn() {
    }

    public Personnavn(String fornavn, String etternavn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }
}
