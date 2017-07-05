package com.airstyl.gateway.ui;


import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ui")
public class UIGateway {

    @GET
    public String greet() {
        return "Hello";
    }
}
