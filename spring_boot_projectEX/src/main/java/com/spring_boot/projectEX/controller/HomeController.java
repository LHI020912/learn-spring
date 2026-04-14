package com.spring_boot.projectEX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	// main 페이지 요청 처리
	// @RequestMapping
	@GetMapping("/")
	public String Home() {
		return "index";
	}
}
