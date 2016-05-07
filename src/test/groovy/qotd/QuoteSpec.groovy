package qotd

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Quote)
class QuoteSpec extends Specification {

    def setup() {
    }

    def "test for valid quote text"() {
       when: 'text is empty'
       def p = new Quote(text: '')

       then: 'validation should fail'
       !p.validate()

       when: 'text is null'
       def q = new Quote(text: null)

       then: 'validation should fail'
       !q.validate()

       when: 'text is legal'
       def r = new Quote(text: 'Ayeeeeeee')

       then: 'validation should succeed'
       r.validate()
    }

    def cleanup() {
    }
}
