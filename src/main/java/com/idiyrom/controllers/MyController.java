package com.idiyrom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/")
    public String getAllInfoPage(){
        return "all_info";
    }

    @GetMapping("/hr")
    public String getHRInfoPage(){
        return "hr_info";
    }

    @GetMapping("/manager")
    public String getManagerInfoPage(){
        return "manager_info";
    }
}
