package com.spring_boot.projectEX.server;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring_boot.projectEX.dto.CartDTO;
import com.spring_boot.projectEX.model.ICartDAO;

@Service
@Primary
public class CartService implements ICartService {
	
	@Autowired
	ICartDAO dao;

	@Override // 새로운 상품 장바구니에 추가
	public void insertCart(CartDTO dto) {
		dao.insertCart(dto);
	}

	@Override // 동일 회원의 동일상품 존재 여부 확인
	public int checkPrdInCart(String prdNo, String memId) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("prdNo",prdNo);
		map.put("memId",memId);
		return dao.checkPrdInCart(map);
	}

	@Override // 동일 상품이 존재하면 수량 변경
	public void updateQtyInCart(CartDTO dto) {
		dao.updateQtyInCart(dto);
	}

	@Override // 장바구니 목록
	public ArrayList<CartDTO> cartList(String memId) {
		return dao.cartList(memId);
	}

	@Override // 장바구니 상품 삭제
	public void deleteCart(String cartNo) {
		dao.deleteCart(cartNo);
	}

	@Override
	public void updateCart(int[] cartNo, int[] cartQty) {
		for(int i=0; i<cartNo.length; i++) {
			HashMap<String,Integer> map = new HashMap();
			map.put("cartNo",cartNo[i]);
			map.put("cartQty",cartQty[i]);
			dao.updateCart(map);
		}
	}
	

}
