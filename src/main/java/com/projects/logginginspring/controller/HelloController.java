package com.projects.logginginspring.controller;

import com.projects.logginginspring.service.HelloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        var username = "John";
//        log.info("Received request for the /hello; {}", username);
//        log.info("Received {}, {}, {}", username, "Second", "Third");

        log.trace("TRACE: HelloController LOG");
        log.info("INFO: HelloController LOG");
        log.error("ERROR: HelloController LOG");
        log.debug("DEBUG: HelloController LOG");

        return helloService.sayHello();
    }

    //TRACE, DEBUG, INFO, WARN, ERROR, OFF
}
