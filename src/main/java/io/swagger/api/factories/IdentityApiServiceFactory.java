package io.swagger.api.factories;

import io.swagger.api.IdentityApiService;
import io.swagger.api.impl.IdentityApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class IdentityApiServiceFactory {
    private final static IdentityApiService service = new IdentityApiServiceImpl();

    public static IdentityApiService getIdentityApi() {
        return service;
    }
}
