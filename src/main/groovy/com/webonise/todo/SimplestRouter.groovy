package com.webonise.todo

import com.google.inject.Inject
import groovy.transform.CompileStatic
import org.restlet.Context
import restling.restlet.RestlingRouter

@CompileStatic
class SimplestRouter extends RestlingRouter {

    @Override
    void init() throws Exception {

        attachSubRouter("/meta",FoosRouter)
    }
}
