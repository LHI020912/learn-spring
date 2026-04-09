package com.spring_mvc.mybatis.service;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_mvc.mybatis.vo.BookVO;

public interface IBookService {
	ArrayList<BookVO> listAllBook();	// 전체 도서 조회
	void insertBook (BookVO bookVo);	// 도서 정보 등록
	void updateBook (BookVO bookVo);	// 도서 정보 수정
	void deleteBook (String bookNo);	// 도서 정보 삭제
	BookVO detailViewBook(String bookNo);//도서 상세 조회
	String bookNoCheck(String bookNo);	// 도서 번호 중복 확인
	ArrayList<BookVO>bookSearch(HashMap<String,Object>map); // 도서 검색
}
