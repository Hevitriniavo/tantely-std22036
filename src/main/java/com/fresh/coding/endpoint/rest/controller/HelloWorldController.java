package com.fresh.coding.endpoint.rest.controller;

import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class HelloWorldController {

  @GetMapping("/hello")
  public Map<String, String> sayHello() {
    return Map.of("message", "Hello, World!");
  }
}
