package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.IdentitiesApiService;
import io.swagger.api.factories.IdentitiesApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Identity;

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

@Path("/identities")


@io.swagger.annotations.Api(description = "the identities API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class IdentitiesApi  {
   private final IdentitiesApiService delegate;

   public IdentitiesApi(@Context ServletConfig servletContext) {
      IdentitiesApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("IdentitiesApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (IdentitiesApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = IdentitiesApiServiceFactory.getIdentitiesApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns all existing identities", notes = "Return an array of identities", response = Identity.class, responseContainer = "List", tags={ "identity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Identity.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Something went wrong", response = Void.class) })
    public Response getAllIdentities(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllIdentities(securityContext);
    }
}
