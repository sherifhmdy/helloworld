package com.sherif.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
  
  @GetMapping("/hi")
  public String sayHello(){
    return "Hello World!";
  }
}
