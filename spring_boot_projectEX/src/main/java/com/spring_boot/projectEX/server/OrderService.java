package com.spring_boot.projectEX.server;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring_boot.projectEX.dto.MemberDTO;
import com.spring_boot.projectEX.dto.OrderInfoDTO;
import com.spring_boot.projectEX.model.IOrderDAO;

@Service
@Primary
public class OrderService implements IOrderService {

	@Autowired
	IOrderDAO dao;

	@Override
	public MemberDTO getMemberInfo(String memId) {
		return dao.getMemberInfo(memId);
	}

	@Override
	public void insertOrderInfo(OrderInfoDTO ordDto) {
		// 1. 주문정보 order_info 테이블에 저장
		dao.insertOrderInfo(ordDto);
		System.out.println("orderInfo");
		// 2. 주문상품 정보 저장
		// orderNo : dto에서 추출 (prdNo, ordQty) -> cart 테이블에서 추출(memId 필요)
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("ordNo",ordDto.getOrdNo());
		map.put("memId",ordDto.getMemId());
		dao.insertOrderProduct(map);
		// 3. 주문완료 후 장바구니 비우기: memId 전달
		dao.deleteCartAfterOrder(ordDto.getMemId());
		System.out.println("delete");
	}

	@Override
	public ArrayList<OrderInfoDTO> orderList(String memId) {
		return dao.orderList(memId);
	}
	
}
