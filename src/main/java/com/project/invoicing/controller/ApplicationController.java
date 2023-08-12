package com.project.invoicing.controller;

import com.project.invoicing.model.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ApplicationController {

    @GetMapping("/test")
    public String test() {
        return "Hello World!!";
    }

    @GetMapping("/testJSON")
    public Test testJSON() {
        return Test.builder()
                .i(1)
                .name("Test")
                .build();
    }
}
