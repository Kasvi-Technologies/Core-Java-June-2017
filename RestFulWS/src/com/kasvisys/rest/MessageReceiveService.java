package com.kasvisys.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

////http://localhost:8080/RestFulWS/rest/message
////http://localhost:8080/RestFulWS/rest/message/birthday
import javax.ws.rs.core.Response;
 
@Path("/message1")
public class MessageReceiveService {
 
    @GET
    public Response pingMe(){
     
        String defaultResp = "Hi... How are you?";
        return Response.status(200).entity(defaultResp).build();
    }
     
    @GET
    @Path("/birthday")
    public Response printBdayMessage(){
         
        String bDayMessage = "Happy Birthday";
        return Response.status(200).entity(bDayMessage).build();
    }
}