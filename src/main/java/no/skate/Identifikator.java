package no.skate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(name = "Identifikator")
@XmlAccessorType(XmlAccessType.FIELD)
public class Identifikator {
    private String identifikatorverdi;
    private String identifikatortype;
    private Date utstedtDato;
    private String utstedtAvAutoritet;
    private Periode periode;

    public Identifikator() {
    }

    public Identifikator(String identifikatortype, String identifikatorverdi) {
        this.identifikatortype = identifikatortype;
        this.identifikatorverdi = identifikatorverdi;
    }

    public String getIdentifikatorverdi() {
        return identifikatorverdi;
    }

    public void setIdentifikatorverdi(String identifikatorverdi) {
        this.identifikatorverdi = identifikatorverdi;
    }

    public String getIdentifikatortype() {
        return identifikatortype;
    }

    public void setIdentifikatortype(String identifikatortype) {
        this.identifikatortype = identifikatortype;
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
