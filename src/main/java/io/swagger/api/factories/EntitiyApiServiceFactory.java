package io.swagger.api.factories;

import io.swagger.api.EntitiyApiService;
import io.swagger.api.impl.EntitiyApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class EntitiyApiServiceFactory {
    private final static EntitiyApiService service = new EntitiyApiServiceImpl();

    public static EntitiyApiService getEntitiyApi() {
        return service;
    }
}
