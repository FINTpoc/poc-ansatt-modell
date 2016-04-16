package no.skate;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(name = "Person")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
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

    public Person(Personnavn navn, Kjonn kjonn, Landkode statsborgerskap, Date fodselsdato, Sivilstand sivilstand) {
        this.navn = navn;
        this.kjonn = kjonn;
        this.statsborgerskap = statsborgerskap;
        this.fodselsdato = fodselsdato;
        this.sivilstand = sivilstand;
    }
}
