package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DevController {
    @RequestMapping("/jiji")
    public String hihi(){
        return "";
    }
    @RequestMapping("/add")
    public String add(){
        return "";
    }
    @RequestMapping("/add3")
    public String add3(){
        return "";
    }
}
