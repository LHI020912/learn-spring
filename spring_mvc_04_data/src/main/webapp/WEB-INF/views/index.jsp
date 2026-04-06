<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<!-- 클라이언트 호출 -->
	index page 입니다.<br>
	<p>redirect</p>
	redirect param 전달방식<br>
	<a href="/pro/redirect">redirect</a><br>
	<a href="/pro/redirect">쿼리스트링 방식</a><br>
	<a href="/pro/redirect">model객체 이용</a><br>
	<a href="/pro/redirect">RedirectAttributes 객체</a><br>
	
	<br><p>PRODUCT</p><br>
	<a href="/pro/product/productForm">상품등록1(getParameter())</a><br>
	<a href="/pro/product/productForm2">상품등록2(@RequestParam생략)</a><br>
	<a href="/pro/product/productForm3">상품등록3(command)-콘솔로그 전달된 값</a><br>
	<a href="/pro/product/productForm4">상품등록4(@ModelAtrribute)</a><br>
	<a href="/pro/product/productSerachForm">상품검색</a><br>
	
	<br><p>STUDENT</p><br>
	<a href="/pro/student/studentForm">studentForm(getParameter())</a><br>
	<a href="/pro/student/studentForm2">studentForm2(@RequesParam)</a><br>
	<a href="/pro/student/studentForm2-1">studentForm2-1(@RequestParam 생략)</a><br>
	<a href="/pro/student/studentForm3">studentForm3(command)</a><br>
	<a href="/pro/student/studentForm4">studentForm4(@ModelAttribute)</a><br>
	<a href="/data2/student/studentSearchForm">studentSearchForm(HashMap)</a><br>
	
	<br><p>SHOW INFO</p><br>
	<a href="/data/showInfo">showInfoModel</a><br>
	<a href="/data/showInfo2">showInfoModelAndView</a><br>
	<a href="/data/showInfo3">showInfoModel / ModelAndView</a><br>
	
	<br><p>BOOK</p><br>
	<a href="/data/bookInfoView1">bookInfoModel</a><br>
	<a href="/data/bookInfoView2">bookInfoModelAndView</a><br>
	<a href="/data/bookInfoView3">bookInfoModelAndView3</a><br>
	<a href="/data/bookInfoView4">bookInfoModelAndView4</a><br>
</body>
</html>