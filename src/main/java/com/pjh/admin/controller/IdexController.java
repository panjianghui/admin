package com.pjh.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdexController {
    @RequestMapping("/getIndex")
    public String getIndex(){
        return "hello boy!!";
    }
}
