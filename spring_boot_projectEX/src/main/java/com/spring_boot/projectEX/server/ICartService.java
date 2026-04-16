package com.spring_boot.projectEX.server;

import java.util.ArrayList;
import com.spring_boot.projectEX.dto.CartDTO;

public interface ICartService {
	public void insertCart(CartDTO dto); // 새로운 상품 장바구니에 추가
	public int checkPrdInCart(String prdNo, String memId); // 동일 회원의 동일상품 존재 여부 확인
	void updateQtyInCart(CartDTO dto); // 동일 상품이 존재하면 수량 변경
	ArrayList<CartDTO> cartList(String memId); // 장바구니 목록
	void deleteCart(String cartNo); // 장바구니 상품 삭제
	void updateCart(int[] cartNo, int[] cartQty); // cart수량 수정

}
