package com.webonise.routers

import com.webonise.resources.GreetingResource
import groovy.transform.CompileStatic
import restling.restlet.RestlingRouter

@CompileStatic
class GreetingRouter extends RestlingRouter {
    @Override
    void init() throws Exception {

        attach("/hello", GreetingResource)
    }
}
