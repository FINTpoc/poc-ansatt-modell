package no.skate;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Personnavn")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class Personnavn {
    private String fornavn;
    private String mellomnavn;
    private String etternavn;

    public Personnavn(String fornavn, String etternavn) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
    }
}
