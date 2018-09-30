package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.RoomsApiService;
import io.swagger.api.factories.RoomsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Room;

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

@Path("/rooms")


@io.swagger.annotations.Api(description = "the rooms API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class RoomsApi  {
   private final RoomsApiService delegate;

   public RoomsApi(@Context ServletConfig servletContext) {
      RoomsApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("RoomsApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (RoomsApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = RoomsApiServiceFactory.getRoomsApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns all existing rooms", notes = "Return an array of rooms", response = Room.class, responseContainer = "List", tags={ "room", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Room.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Something went wrong", response = Void.class) })
    public Response getAllRooms(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllRooms(securityContext);
    }
}
