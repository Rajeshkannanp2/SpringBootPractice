package com.rajesh.main;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    // expose "/" that return "Hello World"

    @GetMapping("/index")
    public String sayHello() {
        return "Hello World!";
    }
}
