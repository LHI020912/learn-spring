package com.spring_boot.projectEX.model;

import java.util.HashMap;

import com.spring_boot.projectEX.dto.MemberDTO;

public interface IMemberDAO {
	// public String loginCheck(HashMap<String, Object> map); // 암호화 이전 코드
	public String loginCheck(String id);
	public String idCheck(String id);
	public void insertMember(MemberDTO dto);
}
