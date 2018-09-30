package io.swagger.api.factories;

import io.swagger.api.RoomApiService;
import io.swagger.api.impl.RoomApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class RoomApiServiceFactory {
    private final static RoomApiService service = new RoomApiServiceImpl();

    public static RoomApiService getRoomApi() {
        return service;
    }
}
