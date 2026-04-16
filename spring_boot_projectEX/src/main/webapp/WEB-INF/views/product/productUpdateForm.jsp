<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>상품 수정</title>
	<c:import url="/WEB-INF/views/layout/head.jsp" />
</head>
<body>
	<div id="wrap">
        <!--  top -->         
        <c:import url="/WEB-INF/views/layout/top.jsp" />
        	<section>
		    	<h2>상품 수정</h2>
			    <form action="<c:url value='/product/updateProduct'/>" method="post">
			        <table border="1">
			            <tr><th>상품 번호</th><td><input type="text" name="prdNo" value="${prd.prdNo}" readonly></td></tr>
			            <tr><th>상품명</th><td><input type="text" name="prdName" value="${prd.prdName}"></td></tr>
			            <tr><th>가격</th><td><input type="number" name="prdPrice" value="${prd.prdPrice}"></td></tr>
			            <tr><th>제조사</th><td><input type="text" name="prdCompany" value="${prd.prdCompany}"></td></tr>
			            <tr><th>재고</th><td><input type="number" name="prdStock" value="${prd.prdStock}"></td></tr>
			            <tr><th>상품 설명</th><td><textarea name="prdDescript" rows="5" cols="50">${prd.prdDescript}</textarea></td></tr>
			            <tr><th>상품 이미지명</th><td><input type="text" name="prdImg" value="${prd.prdImg}"></td></tr>
            			<tr><th>카테고리 ID</th><td><input type="text" name="ctgId" value="${prd.ctgId}"></td></tr>
			            <tr>
			                <td colspan="2" align="center">
			                    <input type="submit" value="수정 완료">
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