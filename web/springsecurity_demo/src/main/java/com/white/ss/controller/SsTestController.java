package com.white.ss.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class SsTestController {

    @GetMapping("hello")
    public String add(){
        return "hello security";
    }


    @GetMapping("index")
    public String index(){
        return "hello index";
    }

    @GetMapping("update")
    @Secured({"ROLE_sale"})
    public String update(){
        return "hello update";
    }
}
