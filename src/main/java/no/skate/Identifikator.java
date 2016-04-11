package no.skate;

import lombok.Data;

import java.util.Date;

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
