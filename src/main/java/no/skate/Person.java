package no.skate;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends Aktor {
    private String fulltNavn;
    private Personnavn navn;
    private Kjonn kjonn;
    private Landkode statsborgerskap;
    private Date fodselsdato;
    private String fodested;
    private Date dodsdato;
    private String dodssted;
    private Landkode dodsland;
    private Sivilstand sivilstand;
    private Personnavn opprinneligNavn;

    public Person() {
    }

    public Person(Personnavn navn, Kjonn kjonn, Landkode statsborgerskap, Date fodselsdato, Sivilstand sivilstand) {
        this.navn = navn;
        this.kjonn = kjonn;
        this.statsborgerskap = statsborgerskap;
        this.fodselsdato = fodselsdato;
        this.sivilstand = sivilstand;
    }
}
