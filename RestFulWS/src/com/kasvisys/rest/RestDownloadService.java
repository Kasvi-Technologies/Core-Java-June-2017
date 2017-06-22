package com.kasvisys.rest;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;
 
//download/service-record
@Path("/download")
public class RestDownloadService {
 
    @GET
    @Path("/service-record")
    @Produces("application/pdf")
    public Response getFile() {
  
        File file = new File("C:\\Servlet & JSP Filters.pdf");
  
        ResponseBuilder response = Response.ok((Object) file);
        response.header("Content-Disposition",
            "attachment; filename=\"employee_1415.pdf\"");
        return response.build();
    }
}
