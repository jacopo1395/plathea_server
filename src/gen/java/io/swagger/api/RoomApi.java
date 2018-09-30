package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.RoomApiService;
import io.swagger.api.factories.RoomApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Body;
import io.swagger.model.Person;
import io.swagger.model.Room;
import io.swagger.model.RoomName;
import io.swagger.model.RoomSettings;
import io.swagger.model.Streams;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/room")


@io.swagger.annotations.Api(description = "the room API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class RoomApi  {
   private final RoomApiService delegate;

   public RoomApi(@Context ServletConfig servletContext) {
      RoomApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RoomApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RoomApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = RoomApiServiceFactory.getRoomApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a new room", notes = "", response = Void.class, tags={ "room", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response addRoom(@ApiParam(value = "The name of the room to create." ,required=true) RoomName roomName
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addRoom(roomName,securityContext);
    }
    @DELETE
    @Path("/{roomID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete a room", notes = "", response = Void.class, tags={ "room", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Room not found", response = Void.class) })
    public Response deleteRoom(@ApiParam(value = "Room id to delete",required=true) @PathParam("roomID") Integer roomID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteRoom(roomID,securityContext);
    }
    @GET
    @Path("/{roomID}/people")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get the people of a room", notes = "", response = Person.class, responseContainer = "List", tags={ "room", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Person.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Room not found", response = Void.class) })
    public Response getPeopleInRoom(@ApiParam(value = "ID of a room",required=true) @PathParam("roomID") Integer roomID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPeopleInRoom(roomID,securityContext);
    }
    @GET
    @Path("/{roomID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns all the information available about a room", notes = "Return a single room given a roomID", response = Room.class, tags={ "room", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Room.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Room not found", response = Void.class) })
    public Response getRoomInfo(@ApiParam(value = "ID of a room",required=true) @PathParam("roomID") Integer roomID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRoomInfo(roomID,securityContext);
    }
    @GET
    @Path("/{roomID}/settings")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get the settings of a room", notes = "", response = RoomSettings.class, tags={ "room", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = RoomSettings.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Room not found", response = Void.class) })
    public Response getRoomSettings(@ApiParam(value = "ID of a room",required=true) @PathParam("roomID") Integer roomID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRoomSettings(roomID,securityContext);
    }
    @GET
    @Path("/{roomID}/streams")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get the IDs of the streams of a room", notes = "", response = Streams.class, tags={ "room", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Streams.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Room not found", response = Void.class) })
    public Response getStreams(@ApiParam(value = "ID of a room",required=true) @PathParam("roomID") Integer roomID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getStreams(roomID,securityContext);
    }
    @PUT
    @Path("/{roomID}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing room", notes = "", response = Void.class, tags={ "room", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Room not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    public Response updateRoom(@ApiParam(value = "Room id to update",required=true) @PathParam("roomID") Integer roomID
,@ApiParam(value = "Room that needs to be modified" ,required=true) Body body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateRoom(roomID,body,securityContext);
    }
}
