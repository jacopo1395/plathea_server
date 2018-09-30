package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.PersonApiService;
import io.swagger.api.factories.PersonApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.IdentifiedPerson;
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

@Path("/person")


@io.swagger.annotations.Api(description = "the person API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public class PersonApi  {
   private final PersonApiService delegate;

   public PersonApi(@Context ServletConfig servletContext) {
      PersonApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("PersonApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (PersonApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = PersonApiServiceFactory.getPersonApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{personID}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns all information of a person", notes = "Return a person given a personID", response = Person.class, tags={ "person", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Person.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Person not found", response = Void.class) })
    public Response getPerson(@ApiParam(value = "ID of a person",required=true) @PathParam("personID") Integer personID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPerson(personID,securityContext);
    }
    @GET
    @Path("/{personID}/withIdentity")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Returns all information of a person", notes = "Return a person given a personID", response = IdentifiedPerson.class, tags={ "person", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = IdentifiedPerson.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Person not found", response = Void.class) })
    public Response getPersonWithIdentity(@ApiParam(value = "ID of a person",required=true) @PathParam("personID") Integer personID
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPersonWithIdentity(personID,securityContext);
    }
}
