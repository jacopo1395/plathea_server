package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.EntitiesApiService;
import io.swagger.api.factories.EntitiesApiServiceFactory;

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

@Path("/entities")


@io.swagger.annotations.Api(description = "the entities API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class EntitiesApi  {
   private final EntitiesApiService delegate;

   public EntitiesApi(@Context ServletConfig servletContext) {
      EntitiesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("EntitiesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (EntitiesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = EntitiesApiServiceFactory.getEntitiesApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns all the objects", notes = "Return an array of objects", response = Entity.class, responseContainer = "List", tags={ "entitiy", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Entity.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Something went wrong", response = Void.class) })
    public Response getAllPositions(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllPositions(securityContext);
    }
}
