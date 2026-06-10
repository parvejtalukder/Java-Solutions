package com.pht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld(Model model) {
        // return "HI";
        model.addText("Hello World");
    }

}
