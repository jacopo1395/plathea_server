package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Body1;
import io.swagger.model.Body2;
import io.swagger.model.Identity;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-09-26T08:59:27.842Z")
public abstract class IdentityApiService {
    public abstract Response addIdentity(Body2 body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteIdentity(Integer identityID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getIdentityInfo(Integer identityID,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateIdentity(Integer identityID,Body1 body,SecurityContext securityContext) throws NotFoundException;
}
