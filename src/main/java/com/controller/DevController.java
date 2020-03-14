package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DevController {
    @RequestMapping("/1010")
    public String adddev(){
        return "1010";
    }

    @RequestMapping("/send")
    public String send(){
        return "hahaha";
    }
}
