package com.spring_mvc.mybatis.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring_mvc.mybatis.view.IBookDAO;
import com.spring_mvc.mybatis.vo.BookVO;

@Service
public class BookService implements IBookService {
	@Autowired
	@Qualifier("IBookDAO")
	IBookDAO dao;

	@Override
	public ArrayList<BookVO> listAllBook() {
		return dao.listAllBook();
	}

	@Override
	public void insertBook(BookVO bookVo) {
		dao.insertBook(bookVo);
	}

	@Override
	public void updateBook(BookVO bookVo) {
		dao.updateBook(bookVo);
	}

	@Override
	public void deleteBook(String bookNo) {
		dao.deleteBook(bookNo);
	}

	@Override
	public BookVO detailViewBook(String bookNo) {
		return dao.detailViewBook(bookNo);
	}

	// 도서 번호 중복 확인
	@Override
	public String bookNoCheck(String bookNo) {
		String no = dao.bookNoCheck(bookNo);
		String result = "available";
		
		if(no != null) {result ="no_available"; }
		return result;
	}

	// 도서 검색
	@Override
	public ArrayList<BookVO> bookSearch(HashMap<String, Object> map) {
		return dao.bookSearch(map);
	}

}
