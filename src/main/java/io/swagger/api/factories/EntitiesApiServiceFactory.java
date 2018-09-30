package io.swagger.api.factories;

import io.swagger.api.EntitiesApiService;
import io.swagger.api.impl.EntitiesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class EntitiesApiServiceFactory {
    private final static EntitiesApiService service = new EntitiesApiServiceImpl();

    public static EntitiesApiService getEntitiesApi() {
        return service;
    }
}
