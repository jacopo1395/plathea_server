package io.swagger.api.impl;

import io.library.MainSystem;
import io.swagger.api.*;
import io.swagger.model.*;

import io.swagger.model.Body;
import io.swagger.model.Person;
import io.swagger.model.Room;
import io.swagger.model.RoomName;
import io.swagger.model.RoomSettings;
import io.swagger.model.Streams;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T07:30:26.762Z")
public class RoomApiServiceImpl extends RoomApiService {
    @Override
    public Response addRoom(RoomName roomName, SecurityContext securityContext) throws NotFoundException {
        MainSystem.ReturnRoomMessage ret = MainSystem.addRoom(roomName.getRoomName());
        if (ret.getCode()==MainSystem.StatusCode.INVALID) 
            return Response.status(Response.Status.BAD_REQUEST).entity(ret.getMessage()).build();
        if (ret.getCode()==MainSystem.StatusCode.NOT_FOUND) 
            return Response.status(Response.Status.NOT_FOUND).entity(ret.getMessage()).build();
        return Response.ok().entity(ret.getMessage()).build();
    }
    @Override
    public Response deleteRoom(Integer roomID, SecurityContext securityContext) throws NotFoundException {
        MainSystem.ReturnRoomMessage ret = MainSystem.deleteRoom(roomID);
        if (ret.getCode()==MainSystem.StatusCode.INVALID) 
            return Response.status(Response.Status.BAD_REQUEST).entity(ret.getMessage()).build();
        if (ret.getCode()==MainSystem.StatusCode.NOT_FOUND) 
            return Response.status(Response.Status.NOT_FOUND).entity(ret.getMessage()).build();
        return Response.ok().entity(ret.getMessage()).build();

    }
    @Override
    public Response getPeopleInRoom(Integer roomID, SecurityContext securityContext) throws NotFoundException {
        MainSystem.ReturnPeopleMessage ret = MainSystem.getPeopleInRoom(roomID);
        if (ret.getCode()==MainSystem.StatusCode.INVALID) 
            return Response.status(Response.Status.BAD_REQUEST).entity(ret.getMessage()).build();
        if (ret.getCode()==MainSystem.StatusCode.NOT_FOUND) 
            return Response.status(Response.Status.NOT_FOUND).entity(ret.getMessage()).build();
        return Response.ok().entity(ret.getPayload()).build();
    }
    @Override
    public Response getRoomInfo(Integer roomID, SecurityContext securityContext) throws NotFoundException {
        MainSystem.ReturnRoomMessage ret = MainSystem.getRoomInfo(roomID);
        if (ret.getCode()==MainSystem.StatusCode.INVALID) 
            return Response.status(Response.Status.BAD_REQUEST).entity(ret.getMessage()).build();
        if (ret.getCode()==MainSystem.StatusCode.NOT_FOUND) 
            return Response.status(Response.Status.NOT_FOUND).entity(ret.getMessage()).build();
        return Response.ok().entity(ret.getPayload()).build();
    }
    @Override
    public Response getRoomSettings(Integer roomID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getStreams(Integer roomID, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateRoom(Integer roomID, Body body, SecurityContext securityContext) throws NotFoundException {
        MainSystem.ReturnRoomMessage ret = MainSystem.updateRoom(roomID, body.getRoomName());
        if (ret.getCode()==MainSystem.StatusCode.INVALID) 
            return Response.status(Response.Status.BAD_REQUEST).entity(ret.getMessage()).build();
        if (ret.getCode()==MainSystem.StatusCode.NOT_FOUND) 
            return Response.status(Response.Status.NOT_FOUND).entity(ret.getMessage()).build();
        return Response.ok().entity(ret.getMessage()).build();
    }
}
