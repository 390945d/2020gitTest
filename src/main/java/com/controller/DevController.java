package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DevController {
    @RequestMapping("/get333")
    public String adddev(){
        return "3636";
    }

    @RequestMapping("/send4444")
    public String send(){
        return "uuuu";
    }
}
