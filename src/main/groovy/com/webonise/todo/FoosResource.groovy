package com.webonise.todo

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import org.restlet.resource.Get
import org.restlet.resource.ServerResource

@Slf4j
@CompileStatic
class FoosResource extends ServerResource {

    @Get
    String getGreeting() {

        return "Hello, World!"
    }
}
