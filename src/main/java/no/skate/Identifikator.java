package no.skate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
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

    public String getIdentifikatorVerdi() {
        return identifikatorVerdi;
    }

    public void setIdentifikatorVerdi(String identifikatorVerdi) {
        this.identifikatorVerdi = identifikatorVerdi;
    }

    public String getIdentifikatorType() {
        return identifikatorType;
    }

    public void setIdentifikatorType(String identifikatorType) {
        this.identifikatorType = identifikatorType;
    }

    public Date getUtstedtDato() {
        return utstedtDato;
    }

    public void setUtstedtDato(Date utstedtDato) {
        this.utstedtDato = utstedtDato;
    }

    public String getUtstedtAvAutoritet() {
        return utstedtAvAutoritet;
    }

    public void setUtstedtAvAutoritet(String utstedtAvAutoritet) {
        this.utstedtAvAutoritet = utstedtAvAutoritet;
    }

    public Periode getPeriode() {
        return periode;
    }

    public void setPeriode(Periode periode) {
        this.periode = periode;
    }
}
