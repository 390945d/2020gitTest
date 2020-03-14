package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DevController {
    @RequestMapping("/get")
    public String adddev(){
        return "222222";
    }

    @RequestMapping("/send")
    public String send(){
        return "hahaha";
    }
}
