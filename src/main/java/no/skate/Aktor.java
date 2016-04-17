package no.skate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Aktor {
    private Identifikator identifikator;
    private KontaktInformasjon kontaktInformasjon;

    public Identifikator getIdentifikator() {
        return identifikator;
    }

    public void setIdentifikator(Identifikator identifikator) {
        this.identifikator = identifikator;
    }

    public KontaktInformasjon getKontaktInformasjon() {
        return kontaktInformasjon;
    }

    public void setKontaktInformasjon(KontaktInformasjon kontaktInformasjon) {
        this.kontaktInformasjon = kontaktInformasjon;
    }
}
