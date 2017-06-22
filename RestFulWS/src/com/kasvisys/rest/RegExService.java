package com.kasvisys.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.QueryParam;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.core.Context;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.core.HttpHeaders;
import java.util.*;
import javax.ws.rs.core.UriInfo;

///employee/123
///employee/name/kasvisys
///employee/bangalore/accounts
///employee/query?branch=hydrabad&dept=finance
///employee/querydefault

// /employee/query?id=1016&id=1017&id=1415
///employee/headersinfo
//employee/headersinfowithcontext

@Path("/employee")
public class RegExService {
 
    @GET
    @Path("{empId: [0-9]+}")
    public Response getEmployeeById(@PathParam("empId") String empId){
         
        return Response.status(200).entity("Got employee with id : " + empId).build();
    }
     
    @GET
    @Path("/name/{empName: [a-zA-Z\\s]+}")
    public Response getEmployeeByName(@PathParam("empName") String name){
         
        return Response.status(200).entity("Got employee with name : " + name).build();
    }
    
    @GET
    @Path("{branch}/{department}")
    public Response getEmployeeList(@PathParam("branch") String branchName,
                                    @PathParam("department") String deptName){
         
        String resp = "Total number of employees in the "+deptName+" department from "
                        +branchName+" is 100";
        return Response.status(200).entity(resp).build();
    }
    
    @GET
    @Path("/query")
    public Response getEmployeeQuery(@QueryParam("dept") String department,
                                    @QueryParam("branch") String branch){
        String resp = "Query parameters are received. 'dept' value is: "
                        +department+" and branch value is: "+branch;
         
        return Response.status(200).entity(resp).build();
    }
    
    
    @GET
    @Path("/querydefault")
    public Response getEmployeeQueryDefault(
                    @DefaultValue("accounts") @QueryParam("dept") String department,
                    @DefaultValue("bangalore") @QueryParam("branch") String branch){
        String resp = "Query parameters are received. 'dept' value is: "
                        +department+" and branch value is: "+branch;
         
        return Response.status(200).entity(resp).build();
    }
    
   // /employee/query1?id=1016&id=1017&id=1415
    
  
    @GET
    @Path("/query1")
    public Response getEmployeeQuery(@Context UriInfo uriInfo){
         
        /** read complete employee id list from request query parameter**/
        List<String> empIdList = uriInfo.getQueryParameters().get("id");
        System.out.println("Received List: "+empIdList);
        /** read first employee id from request query parameter **/
        String firstEmpId = uriInfo.getQueryParameters().getFirst("id");
        System.out.println("First emp record from the request: "+firstEmpId);
         
        return Response.status(200).entity("processed request").build();
    }
    
    //headers info
    @GET
    @Path("/headersinfo") 
    public Response queryHeaderInfo(@HeaderParam("Cache-Control") String ccControl,
            @HeaderParam("User-Agent") String uaStr){

		String resp = "Received http headers are Cache-Control: "+ccControl+
		"<br>User-Agent: "+uaStr;
		return Response.status(200).entity(resp).build();
    } 
    
    @GET
    @Path("headersinfowithcontext")
    public Response queryHeaderInfo(@Context HttpHeaders httpHeaders){
         
        /** how to get specific header info? **/
        String cacheControl = httpHeaders.getRequestHeader("Cache-Control").get(0);
        System.out.println("Cache-Control: "+cacheControl);
        /** get list of all header parameters from request **/
        Set<String> headerKeys = httpHeaders.getRequestHeaders().keySet();
        for(String header:headerKeys){
            System.out.println(header+":"+httpHeaders.getRequestHeader(header).get(0));
        }
        return Response.status(200).entity("successfully queried header info").build();
    }
    
    
    
    
}