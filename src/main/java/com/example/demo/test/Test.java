package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/test")
public class Test {

    @RequestMapping("testApi")
    public String getMethod() {
        return "string";
    }
}
