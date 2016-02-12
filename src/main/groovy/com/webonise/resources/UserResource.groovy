package com.webonise.resources

import groovy.transform.Canonical
import groovy.transform.CompileStatic
import org.restlet.resource.Get
import org.restlet.resource.ServerResource

class UserResource extends ServerResource {
    @Get
    User getUserDetails() {
        return new User("Tanvi", "Mumbai", 23)
    }

    @Canonical
    class User {
        String name;
        String address;
        int age;
    }


}
