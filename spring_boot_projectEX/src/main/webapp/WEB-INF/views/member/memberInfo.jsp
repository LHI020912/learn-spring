<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보</title>
		<c:import url="/WEB-INF/views/layout/head.jsp" />	
		<script type="text/javascript" src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
		<script src="<c:url value='/js/idCheck.js'/>"></script>
		<script type="text/javascript" src="<c:url value='/js/searchZip.js'/>"></script>
	</head>
	<body>
		<div id="wrap">
	        <c:import url="/WEB-INF/views/layout/top.jsp" />
			<section>
			    <h2>회원 정보 확인</h2>
			    <table border="1">
			        <tr>
			            <th>성명</th>
			            <td>${memDto.memName}</td>
			        </tr>
			        <tr>
			            <th>ID</th>
			            <td>${memDto.memId}</td>
			        </tr>
			        <tr>
			            <th>휴대폰 번호</th>
			            <td>${hp1} - ${hp2} - ${hp3}</td>
			        </tr>
			        <tr>
			            <th>이메일</th>
			            <td>${memDto.memEmail}</td>
			        </tr>
			        <tr>
			            <th>주소</th>
			            <td>
			                (${memDto.memZipcode})<br>
			                ${memDto.memAddress1} ${memDto.memAddress2}
			            </td>
			        </tr>
			        <tr>
			            <td colspan="2" align="center">
			                <button><a href='<c:url value='/member/memberUpdate'/>'">수정하기</a></button>
			                <button><a href='<c:url value='/member/myPage'/>'">뒤로가기</a></button>
			            </td>
			        </tr>
			    </table>
			</section>
	        <c:import url="/WEB-INF/views/layout/bottom.jsp" />
        </div>
	</body>
</html>