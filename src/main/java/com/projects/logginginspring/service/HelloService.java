package com.projects.logginginspring.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloService {

    public String sayHello(){

        log.trace("TRACE: HelloService LOG");
        log.info("INFO: HelloService LOG");
        log.error("ERROR: HelloService LOG");
        log.debug("DEBUG: HelloService LOG");

        return "Hello v3 - CI/CD verified at " + BuildInfo.BUILD_TIME;
    }
}
