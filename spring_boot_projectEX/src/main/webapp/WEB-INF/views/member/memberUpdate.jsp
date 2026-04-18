<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보 수정</title>
		<c:import url="/WEB-INF/views/layout/head.jsp" />	
	</head>
	<body>
		<div id="wrap">
	        <c:import url="/WEB-INF/views/layout/top.jsp" />
			<section>
			    <h2>회원 정보 수정</h2>
			    <form action="<c:url value='/member/memberUpdate'/>" method="post">
			        <table border="1">
			            <tr>
			            	<th>성명</th>
			           		<td><input type="text" name="memName" value="${memDto.memName}"></td>
		           		</tr>
		           		<tr>
		           			<th>ID</th>
		           			<td><input type="text" name="memId" value="${memDto.memId}" readonly></td>
		           		</tr>
			            <tr>
			            	<th>휴대폰 번호</th>
			            	<td><input type="text" name="memHp1" value="${hp1}" size="3"> - 
								<input type="text" name="memHp2" value="${hp2}" size="4"> - 
								<input type="text" name="memHp3" value="${hp3}" size="4"></td>
	                    </tr>
	                    <tr>
			            	<th>이메일</th>
			            	<td><input type="email" name="memEmail" value="${memDto.memEmail}"></td>
		            	</tr>
	                    <tr>
			            	<th>주소</th>
			            	<td colspan="3">
			            		<input type="text" name="memZipcode" value="${memDto.memZipcode}" size="5" readonly>
			            		<input type="button" id="searchZipBtn" name="searchZipBtn" value="우편번호 찾기"><br>
			            		<input type="text" name="memAddress1" value="${memDto.memAddress1}" placeholder="주소 입력"  size="40" readonly>
			            		<input type="text" name="memAddress2" value="${memDto.memAddress2}" placeholder="상세 주소 입력">
		            		</td>
		            	</tr>
			            <tr>
			                <td colspan="2" align="center">
			                    <input type="submit" value="수정 완료">
			                    <input type="reset" value="취소">
			                </td>
			            </tr>
			        </table>
			    </form>
			</section>
	        <c:import url="/WEB-INF/views/layout/bottom.jsp" />
        </div>
	</body>
</html>