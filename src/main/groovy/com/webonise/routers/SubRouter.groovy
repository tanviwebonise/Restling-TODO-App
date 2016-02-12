package com.webonise.routers

import com.webonise.resources.GreetingResource
import com.webonise.resources.UserResource
import groovy.transform.CompileStatic
import restling.restlet.RestlingRouter

@CompileStatic
class SubRouter extends RestlingRouter {
    @Override
    void init() throws Exception {

        attach("/hello", GreetingResource)
        attach("/users", UserResource)

    }
}
