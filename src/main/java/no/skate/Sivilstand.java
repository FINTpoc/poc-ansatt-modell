package no.skate;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum Sivilstand {
    UGIFT,
    GIFT,
    ENKE_ELLER_ENKEMANN,
    SKILT,
    SEPARERT,
    REGISTRERT_PARTNER,
    SEPARERT_PARTNER,
    SKILT_PARTNER,
    GJENLEVENDE_PARTNER,
    UOPPGITT
}
