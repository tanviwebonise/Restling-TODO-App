package com.webonise.todo

import groovy.transform.CompileStatic
import restling.guice.modules.RestlingApplicationModule

@CompileStatic
class ApplicationModule extends RestlingApplicationModule{

    Class<SimplestRouter> routerClass = SimplestRouter

    @Override
    void configureCustomBindings() {

    }

}
