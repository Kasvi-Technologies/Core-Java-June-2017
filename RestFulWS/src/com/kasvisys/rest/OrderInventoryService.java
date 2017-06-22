package com.kasvisys.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import com.kasvisys.model.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Response;

@Path("/order-inventory")
public class OrderInventoryService {
 
    @GET
    @Path("/order/{orderId}")
    @Produces("application/xml")
    public Order getUserById(@PathParam("orderId") Integer orderId){
         
        Order ord = new Order();
        ord.setOrderNo(orderId);
        ord.setCustmer("Java2Novice");
        ord.setAddress("Bangalore");
        ord.setAmount("$2000");
        return ord;
    }
    
    @GET
    @Path("/order1/{orderId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Order getUserjsonById(@PathParam("orderId") Integer orderId){
         
        Order ord = new Order();
        ord.setOrderNo(orderId);
        ord.setCustmer("Java2Novice");
        ord.setAddress("Bangalore");
        ord.setAmount("$2000");
        return ord;
    }
   
    
    
}
