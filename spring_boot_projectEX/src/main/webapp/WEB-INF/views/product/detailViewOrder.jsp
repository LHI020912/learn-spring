<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>주문 조회</title>	
		<!-- head.jsp import -->
		<c:import url = "/WEB-INF/views/layout/head.jsp"></c:import>	 
	</head>
	<body>
		<div id="wrap">
			<!-- top.jsp import -->
			<c:import url = "/WEB-INF/views/layout/top.jsp"></c:import>
			<br>
			<h3>주문 조회</h3>	<br>
			<table border="1" width="70%">
			    <tr><th>주문 번호</th><td>${ordDto.ordNo}</td></tr>
			    <tr><th>수령인</th><td>${ordDto.ordReceiver}</td></tr>
			    <tr><th>연락처</th><td>${ordDto.ordHp}</td></tr>
			    <tr><th>배송지</th><td>(${ordDto.ordRcvZipcode}) ${ordDto.ordRcvAddress1} ${ordDto.ordRcvAddress2}</td></tr>
			</table>
			
			<h4>주문 상품 정보</h4>
			<table border="1">
			    <tr><th>상품명</th><th>가격</th><th>수량</th><th>금액</th></tr>
			    <c:forEach var="item" items="${ordPrdList}">
				    <tr>
				        <td>${item.prdNo}</td>
				        <td>${item.prdName}</td> <!-- OrderInfoDTO에 prdName 필드가 있어야 함 -->
				        <td><fmt:formatNumber value="${item.prdPrice}" /> 원</td>
				        <td>${item.ordQty} 개</td>
				        <td><fmt:formatNumber value="${item.prdPrice * item.ordQty}" /> 원</td>
				    </tr>
				</c:forEach>
			</table><br><br>
			<!--  index 페이지로 이동 링크 추가 -->
			<a href="<c:url value='/' />">홈으로 이동</a><br><br>
			<!-- footer.jsp import -->
			<c:import url = "/WEB-INF/views/layout/bottom.jsp"></c:import>
		</div>
	</body>
</html>