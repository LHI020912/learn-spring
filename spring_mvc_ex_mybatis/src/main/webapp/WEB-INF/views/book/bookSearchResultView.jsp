<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>도서 검색 결과 출력</title>		 
	</head>
	<body>
		<h3>상품 검색 결과</h3>		
		<table border="1" width="600">
			<tr><th>도서번호</th>
			<th>제목</th>
			<th>작가</th>
			<th>도서가격</th>
			<th>출고일</th>
			<th>재고</th>
			<th>출판사</th>
			</tr>
			
			<c:choose>			
			<c:when test="${empty bookList}">
				<tr align="center"><td colspan="7">찾는 상품이 없습니다</td></tr>			
			</c:when>
			<c:otherwise>
				<c:forEach items="${bookList}" var="book">
				<tr>
					<td><a href="<c:url value='/book/detailViewBook/${book.bookNo}'/>">${book.bookNo}</a></td>
					<td>${book.bookName}</td>
					<td>${book.bookAuthor}</td>
					<td>${book.bookPrice}</td>
					<td><fmt:formatDate value="${book.bookDate}" pattern="yyyy-MM-dd"/></td>
					<td>${book.bookStock}</td>
					<td>${book.pubNo}</td>
				</tr>
				</c:forEach>
			</c:otherwise>
			</c:choose>			
		</table>
	</body>
</html>