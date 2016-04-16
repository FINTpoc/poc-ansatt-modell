package no.skate;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "KontaktInformasjon")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class KontaktInformasjon {
    private String epostadresse;
    private String telefonnummer;
    private String mobiltelefonnummer;
}
