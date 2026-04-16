<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>MyPage</title>
		<c:import url="/WEB-INF/views/layout/head.jsp" /> 
		<script src="<c:url value='/js/memDelete.js'/>"></script>
	</head>
	<body>
		<div id="wrap">
        	<!--  top -->
        	<c:import url="/WEB-INF/views/layout/top.jsp" />
			<section>
				<button><a href="<c:url value='/order/orderListView'/>">주문 목록 보기</a></button>
				<button><a href="<c:url value='/member/memberInfo'/>">회원 정보 확인</a></button>
				<button><a href="<c:url value='/member/memberUpdate'/>">회원 정보 수정</a></button>
				<button class="deleteBtn" data-no="${memDto.memNo}">삭제</button>
			</section> 
			<!--  bottom -->
        	<c:import url="/WEB-INF/views/layout/bottom.jsp" />
      </div>
	</body>
</html>