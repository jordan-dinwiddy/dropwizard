package com.dinwiddy.dropwizard.demo.views;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.yammer.dropwizard.views.View;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class RootResource {

	@GET
	public View getIndexPage() {
		
		return new View("/views/index.ftl") { };

	}
}
