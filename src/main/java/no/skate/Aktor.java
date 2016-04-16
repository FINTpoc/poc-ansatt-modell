package no.skate;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Aktor")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Aktor {
    private Identifikator identifikator;
    private KontaktInformasjon kontaktInformasjon;
}
