package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.IdentityApiService;
import io.swagger.api.factories.IdentityApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Body1;
import io.swagger.model.Body2;
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

@Path("/identity")


@io.swagger.annotations.Api(description = "the identity API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class IdentityApi  {
   private final IdentityApiService delegate;

   public IdentityApi(@Context ServletConfig servletContext) {
      IdentityApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("IdentityApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (IdentityApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = IdentityApiServiceFactory.getIdentityApi();
      }

      this.delegate = delegate;
   }

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Add a new identity", notes = "", response = Void.class, tags={ "identity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response addIdentity(@ApiParam(value = "The name and the surname of the Identity to create." ,required=true) Body2 body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.addIdentity(body,securityContext);
    }
    @DELETE
    @Path("/{identityID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an identity", notes = "", response = Void.class, tags={ "identity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Identity not found", response = Void.class) })
    public Response deleteIdentity(@ApiParam(value = "Identity id to delete",required=true) @PathParam("identityID") Integer identityID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteIdentity(identityID,securityContext);
    }
    @GET
    @Path("/{identityID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns all the information available about a identity", notes = "Return a single identity given a identityID", response = Identity.class, tags={ "identity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Identity.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Identity not found", response = Void.class) })
    public Response getIdentityInfo(@ApiParam(value = "ID of an identity",required=true) @PathParam("identityID") Integer identityID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getIdentityInfo(identityID,securityContext);
    }
    @PUT
    @Path("/{identityID}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Update an existing identity", notes = "", response = Void.class, tags={ "identity", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Identity not found", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 405, message = "Validation exception", response = Void.class) })
    public Response updateIdentity(@ApiParam(value = "Identity ID to update",required=true) @PathParam("identityID") Integer identityID
,@ApiParam(value = "Identity that needs to be modified" ,required=true) Body1 body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.updateIdentity(identityID,body,securityContext);
    }
}
