package io.swagger.api.factories;

import io.swagger.api.PeopleApiService;
import io.swagger.api.impl.PeopleApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class PeopleApiServiceFactory {
    private final static PeopleApiService service = new PeopleApiServiceImpl();

    public static PeopleApiService getPeopleApi() {
        return service;
    }
}
