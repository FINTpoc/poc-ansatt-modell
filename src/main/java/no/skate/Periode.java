package no.skate;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(name = "Periode")
@XmlAccessorType(XmlAccessType.FIELD)
public class Periode {
    @XmlElement(nillable = true, required = true)
    private Date start;

    @XmlElement(nillable = true, required = true)
    private Date slutt;

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getSlutt() {
        return slutt;
    }

    public void setSlutt(Date slutt) {
        this.slutt = slutt;
    }
}
