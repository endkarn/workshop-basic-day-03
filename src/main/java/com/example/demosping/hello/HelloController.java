package com.example.demosping.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public HelloResponse Hello(@PathVariable String name) {
        HelloResponse response = new HelloResponse();
        String greetingMsg = HelloService.greeting(name);
        response.setMessage(greetingMsg);
        return response;
    }
}
