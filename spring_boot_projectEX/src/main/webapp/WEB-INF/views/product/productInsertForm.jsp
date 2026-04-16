<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>상품 등록</title>
	<c:import url="/WEB-INF/views/layout/head.jsp" />
</head>
<body>
	<div id="wrap">
       <!--  top -->         
        <c:import url="/WEB-INF/views/layout/top.jsp" />
        	<section>
			    <h2>상품 등록</h2>
			    <form action="<c:url value='/product/insertProduct'/>" method="post">
			        <table border="1">
			            <tr><th>상품 번호</th><td><input type="text" name="prdNo"></td></tr>
			            <tr><th>상품명</th><td><input type="text" name="prdName"></td></tr>
			            <tr><th>가격</th><td><input type="number" name="prdPrice"></td></tr>
			            <tr><th>제조사</th><td><input type="text" name="prdCompany"></td></tr>
			            <tr><th>재고</th><td><input type="number" name="prdStock"></td></tr>
			            <tr><th>상품 설명</th><td><textarea name="prdDescript" rows="5" cols="50"></textarea></td></tr>
			            <tr><th>상품 이미지명</th><td><input type="text" name="prdImg" value="${prd.prdImg}"></td></tr>
            			<tr>
			                <th>카테고리 ID</th>
			                <td>
			                    <select name="ctgId">
			                        <option value="1">노트북</option>
			                        <option value="2">모니터</option>
			                        <option value="3">키보드</option>
			                    </select>
			                </td>
			            </tr>
			            <tr>
			                <td colspan="2" align="center">
			                    <input type="submit" value="등록">
			                    <input type="button" value="취소" onclick="history.back()">
			                </td>
			            </tr>
			        </table>
			    </form>
			</section> 
       	<c:import url="/WEB-INF/views/layout/bottom.jsp" />
     </div>
</body>
</html>