package com.laurent.docker.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class HelloResource {

    @GetMapping
    public String TestingDocker () {
        return "This is a Test of running a SpringBoot Application in Docker.";
    }
}
