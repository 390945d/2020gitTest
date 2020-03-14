package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DevController {
    @RequestMapping("/adddev")
    public String adddev(){
        return "";
    }

    @RequestMapping("/send")
    public String send(){
        return "";
    }
}
