package com.lpu.springbootfirst;

import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    public String showMsg(){
        return "I like Javascript";
    }

}
