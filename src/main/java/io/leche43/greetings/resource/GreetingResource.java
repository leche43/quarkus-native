package io.leche43.greetings.resource;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.leche43.greetings.service.GreetingService;

@Path("/hello")
public class GreetingResource {

    @Inject
    GreetingService greetingService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/greeting/{name}")
    public String greeting(@PathParam("name") String name) {
        return greetingService.greeting(name);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String hello() {
        return "hello";
    }
}