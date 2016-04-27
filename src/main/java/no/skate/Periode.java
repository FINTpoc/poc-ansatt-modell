package no.skate;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(name = "Periode")
@XmlAccessorType(XmlAccessType.FIELD)
public class Periode {
    @XmlElement(nillable = true)
    private Date start;
    @XmlElement(nillable = true)
    private Date slutt;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    public Date getSlutt() {
        return slutt;
    }

    public void setSlutt(Date slutt) {
        this.slutt = slutt;
    }
}
