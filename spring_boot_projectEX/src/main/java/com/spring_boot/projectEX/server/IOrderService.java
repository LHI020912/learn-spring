package com.spring_boot.projectEX.server;

import com.spring_boot.projectEX.dto.MemberDTO;

public interface IOrderService {
	public MemberDTO getMemberInfo(String memId);
}
