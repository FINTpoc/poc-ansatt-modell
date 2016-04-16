package no.skate;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(name = "Identifikator")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Identifikator {
    private String identifikatorVerdi;
    private String identifikatorType;
    private Date utstedtDato;
    private String utstedtAvAutoritet;
    private Periode periode;

    public Identifikator() {
    }

    public Identifikator(String identifikatorType, String identifikatorVerdi) {
        this.identifikatorType = identifikatorType;
        this.identifikatorVerdi = identifikatorVerdi;
    }
}
