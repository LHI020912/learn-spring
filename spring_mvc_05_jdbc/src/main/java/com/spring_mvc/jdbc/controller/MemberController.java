package com.spring_mvc.jdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring_mvc.jdbc.model.MemberDAO;

@Controller
public class MemberController {
	// 필드 위에 @Autowired 써 놓으면 생성자 호출될 때 자동 주입
	@Autowired
	MemberDAO memDao;

	@RequestMapping("/")
	public String viewIndex() {
		return "index";
	}
	
	// 모든 회원 조회 요청
	@RequestMapping("/member/memberSelect")
	public String memberSelect(Model model) {
		// 회원 검색 로직 처리 요청
		// model 객체 구성
		return "member/memberSelectRes";
	}
}
