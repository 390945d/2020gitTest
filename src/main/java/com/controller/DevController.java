package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DevController {
    @RequestMapping("/getarrr")
    public String adddev(){
        return "1";
    }

    @RequestMapping("/send")
    public String send(){
        return "";
    }
}
