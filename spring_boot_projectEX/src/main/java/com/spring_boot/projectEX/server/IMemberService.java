package com.spring_boot.projectEX.server;

import java.util.HashMap;

import com.spring_boot.projectEX.dto.MemberDTO;

public interface IMemberService {
	public String loginCheck(HashMap<String, Object> map);
	public String idCheck(String id);
	public void insertMember(MemberDTO dto);
	
	////////회원 관리
    public MemberDTO getMemberInfo(String memId); // 회원 정보 조회
    public void updateMember(MemberDTO dto);     // 회원 정보 수정
    public void deleteMember(String memId);     // 회원 탈퇴
}
