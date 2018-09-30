package io.swagger.api.factories;

import io.swagger.api.RoomsApiService;
import io.swagger.api.impl.RoomsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class RoomsApiServiceFactory {
    private final static RoomsApiService service = new RoomsApiServiceImpl();

    public static RoomsApiService getRoomsApi() {
        return service;
    }
}
