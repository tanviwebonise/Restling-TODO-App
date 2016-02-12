package com.webonise.routers

import groovy.transform.CompileStatic
import restling.restlet.RestlingRouter

@CompileStatic
class MetaRouter extends RestlingRouter {

    @Override
    void init() throws Exception {

        attachSubRouter("/meta", SubRouter)

    }
}
