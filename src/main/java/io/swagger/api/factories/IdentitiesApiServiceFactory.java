package io.swagger.api.factories;

import io.swagger.api.IdentitiesApiService;
import io.swagger.api.impl.IdentitiesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class IdentitiesApiServiceFactory {
    private final static IdentitiesApiService service = new IdentitiesApiServiceImpl();

    public static IdentitiesApiService getIdentitiesApi() {
        return service;
    }
}
