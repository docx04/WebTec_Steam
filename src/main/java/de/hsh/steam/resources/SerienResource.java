package de.hsh.steam.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/test1")
public class SerienResource {
    @GET
    @Path("/test2")
    public Response get(){
        return Response.ok().entity("kevin").build();
    }
}
