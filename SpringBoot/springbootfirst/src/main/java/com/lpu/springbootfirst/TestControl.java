package com.lpu.springbootfirst;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestControl{
	@RequestMapping("/show")
	@ResponseBody
	public String showMsg() {
		return "I like JavaScript more";
	}
	
	@RequestMapping("/data")
	@ResponseBody
	public int getData() {  
		return 100;
	}
	@GetMapping(value = "/accept/{v}")
	@ResponseBody
	public int showParameter(@PathVariable("v")Integer v1) {
		return v1;
	}
	@RequestMapping("/user")
	@ResponseBody
	public String getUserName(@RequestParam(name="username")String user) {
		return user;
		
	}
}
