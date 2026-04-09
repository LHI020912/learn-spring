package com.spring_mvc.mybatis.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring_mvc.mybatis.service.BookService;
import com.spring_mvc.mybatis.vo.BookVO;

@RestController
public class BookRestController {

	@Autowired
	BookService service;	

	@RequestMapping("/book/bookSearch3")
	public ArrayList<BookVO> BookSearch3(@RequestParam HashMap<String, Object> param, Model model) { 
		ArrayList<BookVO> bookList = service.bookSearch(param);
		return bookList; 
	}	
}
