package no.fk;

import no.skate.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "Ansatt")
@XmlType(name = "Ansatt")
public class Ansatt extends Person {
    @XmlElement(required = true)
    private String avdeling;

    public Ansatt() {
    }

    public Ansatt(Personnavn navn, Kjonn kjonn, Landkode statsborgerskap, Date fodselsdato, Sivilstand sivilstand) {
        super(navn, kjonn, statsborgerskap, fodselsdato, sivilstand);
    }

    public String getAvdeling() {
        return avdeling;
    }

    public void setAvdeling(String avdeling) {
        this.avdeling = avdeling;
    }
}
