package com.spring_boot.projectEX.model;

import com.spring_boot.projectEX.dto.MemberDTO;

public interface IOrderDAO {
	public MemberDTO getMemberInfo(String memId);
}
