package com.spring_mvc.data;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NewController {

	@RequestMapping("/")
	public String index() {
		return "index"; // view 페이지명을 결정하는 문자열 => /webapp/
	}
	
	// web 요청 처리하는 메소드는 web과 관련 객체를 파라미터통해 주입받을 수 있음
	// model 객체: 메소드 처리 결과를 view로 전달할 때 많이 사용
	@RequestMapping("/showInfo")
	public String showInfo(Model model) {
		model.addAttribute("name","홍길동");
		model.addAttribute("age",30);
		return "showInfo";
	}
	
	// ModelAndView 객체에 view로 전달한 attribute 포함
	// View 페이지도 객체를 통해 전달
	@RequestMapping("/showInfo2")
	public ModelAndView showInfoMV(ModelAndView mv) {
		mv.addObject("name","양정원");
		mv.addObject("address","서울");
		mv.setViewName("showInfoMV");
		return mv;
	}
	
	// model객체와 modelandview 객체를 동시에 사용했을 경우 : ModelAndView가 우선
	// model객체는 스프링에의해 view로 자동 전달/ modelandview는 개발자에 의해 직접 리턴해야함
	@RequestMapping("/showInfo3")
	public ModelAndView showInfo3(Model model, ModelAndView mv) {
		mv.addObject("name","박종성");
		mv.addObject("address","미시주");
		mv.setViewName("showInfo3");
		
		model.addAttribute("name","심재윤");
		model.addAttribute("age","25");
		return mv;
	}
}
