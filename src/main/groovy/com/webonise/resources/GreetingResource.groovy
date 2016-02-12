package com.webonise.resources

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.resource.Get
import org.restlet.resource.ServerResource

@Slf4j
@CompileStatic
class GreetingResource extends ServerResource {

    @Get
    String getGreeting() {

        return "Hello, User!"
    }
}
