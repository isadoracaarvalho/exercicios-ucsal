package org.example.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projeto")
public class ProjectController {

    @GetMapping
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
