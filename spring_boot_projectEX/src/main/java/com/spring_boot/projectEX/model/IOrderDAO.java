package com.spring_boot.projectEX.model;

import java.util.ArrayList;
import java.util.HashMap;

import com.spring_boot.projectEX.dto.MemberDTO;
import com.spring_boot.projectEX.dto.OrderInfoDTO;

public interface IOrderDAO {
	public MemberDTO getMemberInfo(String memId);
	public void insertOrderInfo(OrderInfoDTO dto);				// 주문 정보 저장
	public void insertOrderProduct(HashMap<String, Object>map);	// 주문 상품 정보 저장
	public void deleteCartAfterOrder(String memId);				// 주문 완료된 장바구니 초기화
	
	public ArrayList<OrderInfoDTO> orderList(String memId);
}
