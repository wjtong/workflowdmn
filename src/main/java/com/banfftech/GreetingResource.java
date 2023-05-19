package com.banfftech;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public CustRequestManage hello() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String filePath = Paths.get("config", "custRequestManage.json").toString();
        CustRequestManage custRequestManage = objectMapper.readValue(new File(filePath), CustRequestManage.class);
//        return "Hello from RESTEasy Reactive";
        return custRequestManage;
    }
}
