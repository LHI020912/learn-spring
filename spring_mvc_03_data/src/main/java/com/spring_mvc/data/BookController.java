package com.spring_mvc.data;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {

	@RequestMapping("/bookInfoView1")
	public String showBookInfo1(Model model) {
		model.addAttribute("name","스프링 프레임워크");
		model.addAttribute("price",20000);
		return "book/bookInfoView";
	}
	
	@RequestMapping("/bookInfoView2")
	public ModelAndView showBookInfo2(ModelAndView mv) {
		mv.addObject("name","스프링 프레임워크2");
		mv.addObject("price",25000);
		mv.setViewName("book/bookInfoView");
		return mv;
	}
	
	// 다중맵핑
	@RequestMapping(value={"/bookInfoView3","/bookInfoView4"})
	public String ShowBookInfo34(HttpServletRequest request, Model model) {
		if(request.getServletPath().equals("/bookInfoView3")) {
			model.addAttribute("name","스프링 프레임워크3");
			model.addAttribute("price",30000);
		}else if(request.getServletPath().equals("/bookInfoView4")) {
			model.addAttribute("name","스프링 프레임워크4");
			model.addAttribute("price",40000);
		}
		
		return "book/bookInfoView";
	}
}
