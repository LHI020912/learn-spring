package com.spring_mvc.mybatis.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_mvc.mybatis.service.BookService;
import com.spring_mvc.mybatis.vo.BookVO;

@Controller
public class BookController {
	
	@Autowired
	BookService service;
	
	@RequestMapping("/")
	public String viewIndex() {
		return "view";
	}
	
	// 도서 전체 조회
	@RequestMapping("/book/listAllBook")
	public String listAllBook (Model model) {
		ArrayList<BookVO> bookList = service.listAllBook();
		model.addAttribute("bookList",bookList);
		return "book/bookListView";
	}
	
	// 도서 상품 등록 폼 요청
	@RequestMapping("/book/newBookForm")
	public String viewBookForm() {
		return "book/newBookForm";
	}
	
	// 도서 등록 요청
	@RequestMapping("/book/insertBook")
	public String insertBook (BookVO book) {
		service.insertBook(book);
		return "redirect:/book/listAllBook";
	}
	
	// 도서 상세 정보 조회
	@RequestMapping("/book/detailViewBook/{bookNo}")
	public String detailViewBook (@PathVariable String bookNo, Model model) {
		BookVO book = service.detailViewBook(bookNo);
		model.addAttribute("book",book);
		return "book/bookDetailView";
	}
	
	// 도서 정보 수정 폼 요청
	@RequestMapping("/book/updateBookForm/{bookNo}")
	public String viewUpdateForm (@PathVariable String bookNo, Model model) {
		BookVO book = service.detailViewBook(bookNo);
		model.addAttribute("book",book);
		return "book/updateBookForm";
	}
	
	// 도서 수정 요청
	@RequestMapping("/book/updateBook")
	public String updateBook (BookVO book) {
		service.updateBook(book);
		return "redirect:/book/listAllBook";
	}
	
	// 도서 정보 삭제
	@RequestMapping("/book/deleteBook/{bookNo}")
	public String deleteBook (@PathVariable String bookNo) {
		service.deleteBook(bookNo);
		return "redirect:/book/listAllBook";
	}
	
	/////////////////////////////////////////////////////////////////////////////

	
	// 비동기 요청 ajax_get
	@ResponseBody
	@RequestMapping("/book/bookNoCheck_ajax_get/{bookNo}")
	public String bookNoCheck_ajax_get (@PathVariable("bookNo") String bookNo) {
		String res = service.bookNoCheck(bookNo);
		return res;
	}
	
	// 비동기 요청 ajax_post
	@ResponseBody
	@RequestMapping("/book/bookNoCheck_ajax_post")
	public String bookNoCheck_ajax_post(@RequestParam("bookNo") String bookNo) {
		String res = service.bookNoCheck(bookNo);
		return res;
	}
	
	// axios_get
	@ResponseBody
	@RequestMapping("/book/bookNoCheck_axios_get/{bookNo}")
	public String bookNoCheck_axios_get (@RequestBody String bookNo) {
		String res = service.bookNoCheck(bookNo);
		return res;
	}

	// axios_post
	@ResponseBody
	@RequestMapping("/book/bookNoCheck_axios_post/{bookNo}")
	public String bookNoCheck_axios_post (@RequestBody HashMap<String, String> map) {
		System.out.println(map.get("bookNo"));
		String bookNo = map.get("bookNo");
		String res = service.bookNoCheck(bookNo);
		return res;
	}
	
	// get
	@ResponseBody
	@RequestMapping("/book/bookNoCheck_get/{bookNo}")
	public String bookNoCheck_get (@PathVariable("bookNo") String bookNo) {
		String res = service.bookNoCheck(bookNo);
		return res;
	}
	
	// post
	@ResponseBody
	@RequestMapping("/book/bookNoCheck_post/{bookNo}")
	public String bookNoCheck_post (@RequestBody String bookNo) {
		String res = service.bookNoCheck(bookNo);
		return res;
	}
	
	///////////// 상품 검색 & 방법 /////////////////////////////////////////////////////

	@RequestMapping("/book/bookSearchForm1")
	public String viewSearchForm1() {
		return "book/bookSearchForm1";
	}
	
	@RequestMapping("/book/bookSearchForm2")
	public String viewSearchForm2() {
		return "book/bookSearchForm2";
	}

	@RequestMapping("/book/bookSearchForm3")
	public String viewSearchForm3() {
		return "book/bookSearchForm3";
	}
	
	// 1.responsebody
	@ResponseBody
	@RequestMapping("/book/bookSearch1")
	public ArrayList<BookVO> bookSearch1(@RequestParam HashMap<String, Object> param, Model model) {
		ArrayList<BookVO> bookList = service.bookSearch(param);
		model.addAttribute("bookList",bookList);
		return bookList;
	}
	
	// 2. view
	@RequestMapping("/book/bookSearch2")
	public String bookSearch2(@RequestParam HashMap<String, Object> param, Model model) {
		ArrayList<BookVO> bookList = service.bookSearch(param);
		model.addAttribute("bookList",bookList);
		return "book/bookSearchResultView";
	}

}
