package com.springboot.servlettest;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Component
@Path("/")
public class JerseyController {
    @GET
    @Produces("application/json")
    public String health() {
        return "Jersey: Up and Running!";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public String postForm(@NotNull @FormParam(value = "jersey") String jersey){
        return "Jersey " + jersey;
    }

}