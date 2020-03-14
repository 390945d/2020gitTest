package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SendController {
    @RequestMapping("/get")
    public String get(){
        System.out.println("hihihi");
        return "jiji";
    }
    @RequestMapping("/jiji")
    public String hihi(){
        return "";
    }
}
