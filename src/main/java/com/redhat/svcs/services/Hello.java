package com.redhat.svcs.services;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.redhat.svcs.beans.HelloBean;
@Stateless
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class Hello {
  
  @Inject
  private HelloBean bean;

  @Path("/hello")
  @GET
  public Response helloWorld(){
    return Response.ok(bean.sayHello("wold"), MediaType.APPLICATION_JSON).build();
  }
}
