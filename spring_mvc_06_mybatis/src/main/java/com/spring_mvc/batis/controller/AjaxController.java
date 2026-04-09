package com.spring_mvc.batis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

	@RequestMapping("loginForm")
	public String viewLogin() {
		return "ajax/login";
	}
	
	@ResponseBody
	@RequestMapping("/login")
	public String loginCheck(@RequestParam("id") String id,
							 @RequestParam("pw") String pw) {
		String result="";
		
		if(id.equals("abc") && pw.equals("1234")) { result="success"; }
		else { result = "fail"; }
		
		return result;
	}
}
