package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DevController {
    @RequestMapping("/get")
    public String adddev(){
        return "3636";
    }

    @RequestMapping("/send")
    public String send(){
        return "uuuu";
    }
}
