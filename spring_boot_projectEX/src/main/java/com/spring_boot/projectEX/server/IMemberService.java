package com.spring_boot.projectEX.server;

import java.util.HashMap;

import com.spring_boot.projectEX.dto.MemberDTO;

public interface IMemberService {
	public String loginCheck(HashMap<String, Object> map);
	public String idCheck(String id);
	public void insertMember(MemberDTO dto);
}
