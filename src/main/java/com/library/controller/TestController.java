package com.library.controller;

import com.library.service.ClassInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
    @Autowired
    private ClassInfoService classInfoService;
    @RequestMapping("/test")
    public String testIndex(){
        classInfoService.queryClassInfoAll();
        System.out.println("Test");
        return "/test";
    }
}
