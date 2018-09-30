package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PeopleApiService;
import io.swagger.api.factories.PeopleApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.Person;

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

@Path("/people")


@io.swagger.annotations.Api(description = "the people API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class PeopleApi  {
   private final PeopleApiService delegate;

   public PeopleApi(@Context ServletConfig servletContext) {
      PeopleApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PeopleApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PeopleApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = PeopleApiServiceFactory.getPeopleApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns all existing people", notes = "Return an array of people", response = Person.class, responseContainer = "List", tags={ "person", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Person.class, responseContainer = "List"),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Something went wrong", response = Void.class) })
    public Response getAllPeople(@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAllPeople(securityContext);
    }
}
