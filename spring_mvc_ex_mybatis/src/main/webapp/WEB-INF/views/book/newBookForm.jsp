<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>도서 정보 등록</title>
	<script src="<c:url value='/resources/js/jquery-3.7.1.min.js'/>"></script>
	<script src="<c:url value='/resources/js/bookNoCheck_ajax_post.js'/>"></script>
	<!-- 
	<script src="<c:url value='/resources/js/bookNoCheck_ajax_get'/>"></script>
	<script src="<c:url value='/resources/js/bookNoCheck_axios_get'/>"></script>
	<script src="<c:url value='/resources/js/bookNoCheck_axios_post'/>"></script>
	<script src="<c:url value='/resources/js/bookNoCheck_get'/>"></script>
	<script src="<c:url value='/resources/js/bookNoCheck_post'/>"></script>
	 -->
</head>
<body>
		<h3>도서 정보 등록</h3>		
		<form method="post" action="<c:url value='/book/insertBook/'/>">
			<table>
				<tr><th>도서번호</th><td><input type="text" name="bookNo" id="bookNo">
									  <button type="button" id="bookNoCheckBtn">중복 확인</button>
				</td></tr>
				<tr><th>제목</th><td><input type="text" name="bookName"></td></tr>
				<tr><th>작가</th><td><input type="text" name="bookAuthor"></td></tr>
				<tr><th>도서가격</th><td><input type="text" name="bookPrice"></td></tr>
				<tr><th>출고일</th><td><input type="text" name="bookDate"></td></tr>
				<tr><th>재고</th><td><input type="text" name="bookStock"></td></tr>
				<tr><th>출판사</th><td><input type="text" name="pubNo"></td></tr>
				<tr><td colspan="2"><input type="submit" value="등록">
				<input type="reset" value="취소"></td></tr>
			</table>
		</form>
		
		<a href="<c:url value='/'/>">홈으로 이동</a>
</body>
</html>