package com.dinwiddy.dropwizard.demo.views;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.TEXT_HTML)
public class PersonResource {

    @GET
    public PersonView getPerson(@QueryParam("name") String name) {
    	
        return new PersonView(new Person(name));
    }
}