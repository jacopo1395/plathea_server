package io.swagger.api.impl;

import io.library.MainSystem;
import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Room;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class RoomsApiServiceImpl extends RoomsApiService {
    @Override
    public Response getAllRooms(SecurityContext securityContext) throws NotFoundException {
        MainSystem.ReturnRoomsMessage ret = MainSystem.getRooms();
        if (ret.getCode()==MainSystem.StatusCode.INVALID) 
            return Response.status(Response.Status.BAD_REQUEST).entity(ret.getMessage()).build();
        if (ret.getCode()==MainSystem.StatusCode.NOT_FOUND) 
            return Response.status(Response.Status.NOT_FOUND).entity(ret.getMessage()).build();
        return Response.ok().entity(ret.getPayload()).build();
    }
}
