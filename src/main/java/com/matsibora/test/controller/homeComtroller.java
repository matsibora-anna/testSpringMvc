package com.matsibora.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeComtroller {

    @GetMapping("/")
    public String getHome () {
        return "index";
    }
}
