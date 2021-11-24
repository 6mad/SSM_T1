package com.huBin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dd")
public class MainController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("test");
        return "index";
    }
}
