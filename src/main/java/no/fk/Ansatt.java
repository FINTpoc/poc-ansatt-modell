package no.fk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import no.skate.*;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
public class Ansatt extends Person {
    private String avdeling;

    public Ansatt() {
    }

    public Ansatt(Personnavn navn, Kjonn kjonn, Landkode statsborgerskap, Date fodselsdato, Sivilstand sivilstand) {
        super(navn, kjonn, statsborgerskap, fodselsdato, sivilstand);
    }
}
