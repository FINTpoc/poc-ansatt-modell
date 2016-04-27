package no.skate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "Aktor")
@XmlAccessorType(XmlAccessType.FIELD)
public class Aktor {
    @XmlElement(required = true)
    private List<Identifikator> identifikatorer = new ArrayList<>();

    @XmlElement(required = true)
    private Kontaktinformasjon kontaktinformasjon;


    public List<Identifikator> getIdentifikatorer() {
        return identifikatorer;
    }

    public void addIdentifikator(Identifikator identifikator) {
        identifikatorer.add(identifikator);
    }

    public void setIdentifikatorer(List<Identifikator> identifikatorer) {
        this.identifikatorer = identifikatorer;
    }

    public Kontaktinformasjon getKontaktinformasjon() {
        return kontaktinformasjon;
    }

    public void setKontaktinformasjon(Kontaktinformasjon kontaktinformasjon) {
        this.kontaktinformasjon = kontaktinformasjon;
    }
}
