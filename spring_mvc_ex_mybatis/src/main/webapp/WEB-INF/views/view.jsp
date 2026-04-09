<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<html>
<head>
	<title>View페이지</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
		<a href="<c:url value='/book/listAllBook'/>">전체 도서 조회</a><br>
		<a href="<c:url value='/book/newBookForm'/>">등록</a><br>
		
		<a href="<c:url value='/book/bookSearchForm1'/>">도서 검색1</a><br>
		<a href="<c:url value='/book/bookSearchForm2'/>">도서 검색2</a><br>
		<a href="<c:url value='/book/bookSearchForm3'/>">도서 검색3</a><br>
</body>
</html>
