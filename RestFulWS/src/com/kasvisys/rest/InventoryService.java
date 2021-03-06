package com.kasvisys.rest;

//Example of matrix parameters

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

///inventory/switch;company=cisco;model=nexus-5596

@Path("/inventory")
public class InventoryService {
 
    @GET
    @Path("{deviceType}")
    public Response getInventoryDetails(@PathParam("deviceType") String deviceType,
            @MatrixParam("company") String company,
            @MatrixParam("model") String model){
         
        String resp = "Received request for device: "+deviceType+
                        ", comany: "+company+" and model: "+model;
        return Response.status(200).entity(resp).build();
    }
}