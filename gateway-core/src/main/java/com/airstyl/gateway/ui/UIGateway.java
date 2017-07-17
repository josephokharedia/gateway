package com.airstyl.gateway.ui;


import com.airstyl.be360.api.IFramework;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("ui")
public class UIGateway {

    @Inject
    private IFramework framework;

    @GET
    @Path("{id}")
    public Response getView(@PathParam("id") String id) {

        String result = framework.getView(id);
        return Response.status(200).entity(result).build();
    }
}
