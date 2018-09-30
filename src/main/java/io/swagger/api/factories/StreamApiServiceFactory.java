package io.swagger.api.factories;

import io.swagger.api.StreamApiService;
import io.swagger.api.impl.StreamApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class StreamApiServiceFactory {
    private final static StreamApiService service = new StreamApiServiceImpl();

    public static StreamApiService getStreamApi() {
        return service;
    }
}
