package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.StreamApiService;
import io.swagger.api.factories.StreamApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.io.File;

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

@Path("/stream")


@io.swagger.annotations.Api(description = "the stream API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class StreamApi  {
   private final StreamApiService delegate;

   public StreamApi(@Context ServletConfig servletContext) {
      StreamApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("StreamApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (StreamApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = StreamApiServiceFactory.getStreamApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{streamID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a stream of a room", notes = "", response = File.class, tags={ "stream", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = File.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Room not found", response = Void.class) })
    public Response getRoomStream(@ApiParam(value = "ID of a stream",required=true) @PathParam("streamID") Integer streamID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getRoomStream(streamID,securityContext);
    }
}
