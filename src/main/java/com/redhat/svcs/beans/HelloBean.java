package com.redhat.svcs.beans;

import javax.ejb.Stateless;

@Stateless
public class HelloBean {
  public String sayHello(String name) {
    return "Hello, " + name;
  }
}
