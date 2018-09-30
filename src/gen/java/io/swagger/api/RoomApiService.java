package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Body;
import io.swagger.model.Person;
import io.swagger.model.Room;
import io.swagger.model.RoomName;
import io.swagger.model.RoomSettings;
import io.swagger.model.Streams;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public abstract class RoomApiService {
    public abstract Response addRoom(RoomName roomName,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteRoom(Integer roomID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getPeopleInRoom(Integer roomID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRoomInfo(Integer roomID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getRoomSettings(Integer roomID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getStreams(Integer roomID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateRoom(Integer roomID,Body body,SecurityContext securityContext) throws NotFoundException;
}
