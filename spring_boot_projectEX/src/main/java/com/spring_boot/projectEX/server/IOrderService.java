package com.spring_boot.projectEX.server;

import java.util.ArrayList;

import com.spring_boot.projectEX.dto.MemberDTO;
import com.spring_boot.projectEX.dto.OrderInfoDTO;

public interface IOrderService {
	public MemberDTO getMemberInfo(String memId);
	public void insertOrderInfo(OrderInfoDTO ordDto);
	public ArrayList<OrderInfoDTO> orderList(String memId);
}
