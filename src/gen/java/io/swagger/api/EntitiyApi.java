package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.EntitiyApiService;
import io.swagger.api.factories.EntitiyApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Entity;

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

@Path("/entitiy")


@io.swagger.annotations.Api(description = "the entitiy API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class EntitiyApi  {
   private final EntitiyApiService delegate;

   public EntitiyApi(@Context ServletConfig servletContext) {
      EntitiyApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EntitiyApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EntitiyApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = EntitiyApiServiceFactory.getEntitiyApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{entitiyID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns all information of an object", notes = "Return an object given an objectID", response = Entity.class, tags={ "entitiy", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Entity.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Object not found", response = Void.class) })
    public Response getPositionFromEntityID(@ApiParam(value = "ID of an object",required=true) @PathParam("entitiyID") Integer entitiyID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPositionFromEntityID(entitiyID,securityContext);
    }
}
