package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DevController {
    @RequestMapping("/getdev11111")
    public String adddev(){
        return "3636";
    }

    @RequestMapping("/send2222222")
    public String send(){
        return "uuuu";
    }
}
