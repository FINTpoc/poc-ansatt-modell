package no.skate

import com.fasterxml.jackson.databind.ObjectMapper
import groovy.json.JsonSlurper
import spock.lang.Specification

import java.text.SimpleDateFormat

class DateTimeSpec extends Specification {

    def "Create dateTime value"() {
        given:
        ObjectMapper objectMapper = new ObjectMapper()
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"))
        Periode periode = new Periode(start: new Date(), slutt: new Date())

        when:
        def json = objectMapper.writeValueAsString(periode)
        def jsonObject = new JsonSlurper().parseText(json)

        then:
        json.length() > 0
        !jsonObject.start.isNumber()
    }
}
