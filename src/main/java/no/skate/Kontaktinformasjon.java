package no.skate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Kontaktinformasjon")
@XmlAccessorType(XmlAccessType.FIELD)
public class Kontaktinformasjon {
    @XmlElement(required = true)
    private String epostadresse;

    @XmlElement(required = true)
    private String telefonnummer;

    @XmlElement(required = true)
    private String mobiltelefonnummer;

    public Kontaktinformasjon() {
    }

    public Kontaktinformasjon(String epostadresse, String telefonnummer, String mobiltelefonnummer) {
        this.epostadresse = epostadresse;
        this.telefonnummer = telefonnummer;
        this.mobiltelefonnummer = mobiltelefonnummer;
    }

    public String getEpostadresse() {
        return epostadresse;
    }

    public void setEpostadresse(String epostadresse) {
        this.epostadresse = epostadresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getMobiltelefonnummer() {
        return mobiltelefonnummer;
    }

    public void setMobiltelefonnummer(String mobiltelefonnummer) {
        this.mobiltelefonnummer = mobiltelefonnummer;
    }
}
