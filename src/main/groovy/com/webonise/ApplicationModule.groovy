package com.webonise

import com.webonise.routers.MetaRouter
import groovy.transform.CompileStatic
import restling.guice.modules.RestlingApplicationModule

@CompileStatic
class ApplicationModule extends RestlingApplicationModule{

    Class<MetaRouter> routerClass = MetaRouter

    @Override
    void configureCustomBindings() {

    }

}
