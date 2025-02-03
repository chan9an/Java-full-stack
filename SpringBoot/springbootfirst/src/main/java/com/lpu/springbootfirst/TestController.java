package com.lpu.springbootfirst;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
     @RequestMapping("/loveforthejs")//the request will be shown but the output will not be shown we need to hit the controller
     @ResponseBody//to display we have to add this , otherwise the port will be working but no output
     public String showCombined() {
        int sum = 2 + 4;
        String message = "I like Javascript";

        System.out.println("code is working till here");
        return "Sum is: " + sum + "  " + message;  // Combine both responses in one
    }

}
