
import spock.lang.Specification

class TODOAppTest extends Specification{
    def "sayHello returns Hey people"() {
        setup:
        TODOApp pingApp = new TODOApp()
        when:
        def result = pingApp.sayHello()
        then:
        result == "Hey, people"
    }
}
