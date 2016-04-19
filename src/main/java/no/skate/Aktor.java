package no.skate;

import no.fk.Kontaktinformasjon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "Aktor")
@XmlAccessorType(XmlAccessType.FIELD)
public class Aktor {
    private List<Identifikator> identifikatorer = new ArrayList<>();
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
