<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 상세 조회</title>
</head>
<body>
		<h3>도서 상세 조회</h3>		
	     <table border="1" width="300">
			<tr><th>도서번호</th><td>${book.bookNo}</td>
			<tr><th>제목</th><td>${book.bookName}</td>
			<tr><th>작가</th><td>${book.bookAuthor}</td>
			<tr><th>도서가격</th><td>${book.bookPrice}</td>
			<tr><th>출고일</th><td><fmt:formatDate value="${book.bookDate}" pattern="yyyy-MM-dd"/></td>
			<tr><th>재고</th><td>${book.bookStock}</td>
			<tr><th>출판사</th><td>${book.pubNo}</td>
		</table><br><br>
    
		<a href="<c:url value='/'/>">[홈으로 이동]</a><br>
		<a href="<c:url value='/book/updateBookForm/${book.bookNo}'/>">[도서 정보 수정]</a><br> 
		<a href="javascript:deleteCheck();">[도서 정보 삭제]</a>
		<script>
			function deleteCheck(){
				let answer = confirm("삭제 하시겠습니까?");
				if(answer){ location.href="<c:url value='/book/deleteBook/${book.bookNo}'/>" }
			}
		</script>
</body>
</html>