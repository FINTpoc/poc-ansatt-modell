package no.skate;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.util.Date;

@XmlType(name = "Periode")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Periode {
    private Date start;
    private Date slutt;
}
