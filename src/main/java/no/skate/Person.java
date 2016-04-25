package no.skate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(name = "Person")
@XmlAccessorType(XmlAccessType.FIELD)
public class Person extends Aktor {
    private String fulltNavn;
    private Personnavn navn;
    @XmlElement(nillable = true)
    private Kjonn kjonn;
    @XmlElement(nillable = true)
    private Landkode statsborgerskap;
    @XmlElement(nillable = true)
    private Date fodselsdato;
    private String fodested;
    @XmlElement(nillable = true)
    private Date dodsdato;
    private String dodssted;
    @XmlElement(nillable = true)
    private Landkode dodsland;
    @XmlElement(nillable = true)
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

    public String getFulltNavn() {
        return fulltNavn;
    }

    public void setFulltNavn(String fulltNavn) {
        this.fulltNavn = fulltNavn;
    }

    public Personnavn getNavn() {
        return navn;
    }

    public void setNavn(Personnavn navn) {
        this.navn = navn;
    }

    public Kjonn getKjonn() {
        return kjonn;
    }

    public void setKjonn(Kjonn kjonn) {
        this.kjonn = kjonn;
    }

    public Landkode getStatsborgerskap() {
        return statsborgerskap;
    }

    public void setStatsborgerskap(Landkode statsborgerskap) {
        this.statsborgerskap = statsborgerskap;
    }

    public Date getFodselsdato() {
        return fodselsdato;
    }

    public void setFodselsdato(Date fodselsdato) {
        this.fodselsdato = fodselsdato;
    }

    public String getFodested() {
        return fodested;
    }

    public void setFodested(String fodested) {
        this.fodested = fodested;
    }

    public Date getDodsdato() {
        return dodsdato;
    }

    public void setDodsdato(Date dodsdato) {
        this.dodsdato = dodsdato;
    }

    public String getDodssted() {
        return dodssted;
    }

    public void setDodssted(String dodssted) {
        this.dodssted = dodssted;
    }

    public Landkode getDodsland() {
        return dodsland;
    }

    public void setDodsland(Landkode dodsland) {
        this.dodsland = dodsland;
    }

    public Sivilstand getSivilstand() {
        return sivilstand;
    }

    public void setSivilstand(Sivilstand sivilstand) {
        this.sivilstand = sivilstand;
    }

    public Personnavn getOpprinneligNavn() {
        return opprinneligNavn;
    }

    public void setOpprinneligNavn(Personnavn opprinneligNavn) {
        this.opprinneligNavn = opprinneligNavn;
    }
}
