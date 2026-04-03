<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
 <head>
    <meta charset="UTF-8">
    <title>Product Form</title>
  </head>
    <body>
      <h3>상품 정보</h3>
		상품번호: ${prdNo}<br>
		상품명: ${prdName}<br>
		가격: ${prdPrice}<br>
		제조회사: ${prdCompany}<br>
		제조일: ${prdDate}<br>
		재고: ${prdStock}<br>
    </body>
</html>

