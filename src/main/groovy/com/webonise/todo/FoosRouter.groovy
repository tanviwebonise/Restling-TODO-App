package com.webonise.todo

import groovy.transform.CompileStatic
import restling.restlet.RestlingRouter

@CompileStatic
class FoosRouter extends RestlingRouter {
    @Override
    void init() throws Exception {

        attach("/hello",FoosResource)
    }
}
