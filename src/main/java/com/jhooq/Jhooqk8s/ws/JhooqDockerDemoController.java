package com.jhooq.Jhooqk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JhooqDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - NIkhil-k8s i Have updated the message and this is latest Commit for 28-09-2021 at 2:30 PM";
    }
}
