<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index</title>
</head>
<body>
	<h1>index page 입니다.</h1><br>
	<!-- index.jsp와 context가 같은 경우 -->
	<a href="<c:url value='/newView/'/>">second/newView 페이지</a><br>
	<a href="/second/newView">second/newView 페이지</a><br>
	<!-- index.jsp와 context가 다른 경우 -->
	<a href="/project/newView">project/newView 페이지</a><br>
	
	<!-- index.jsp와 context가 같은 경우 -->
	<img src="<c:url value='/resources/image/apple.png'/>"/><br>
	<img src="/second/resources/image/apple.png" /><br>
	<p>현재 시간: ${serverTime} </p>
</body>
</html>