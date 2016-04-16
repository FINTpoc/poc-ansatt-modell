package no.fk;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import no.skate.*;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlRootElement(name = "Ansatt")
@XmlType
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Ansatt extends Person {
    private String avdeling;

    public Ansatt(Personnavn navn, Kjonn kjonn, Landkode statsborgerskap, Date fodselsdato, Sivilstand sivilstand) {
        super(navn, kjonn, statsborgerskap, fodselsdato, sivilstand);
    }
}
