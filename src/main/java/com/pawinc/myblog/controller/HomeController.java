package com.pawinc.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("/home")
    public String sayHello(){
//        List<Group> groups = List.of(new Group(1L, "PI-18-01"));
        return "Hello, World!";
    }
}
