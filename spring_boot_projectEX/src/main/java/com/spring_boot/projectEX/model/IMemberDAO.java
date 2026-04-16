package com.spring_boot.projectEX.model;

import com.spring_boot.projectEX.dto.MemberDTO;

public interface IMemberDAO {
	// public String loginCheck(HashMap<String, Object> map); // 암호화 이전 코드
	public String loginCheck(String id);
	public String idCheck(String id);
	public void insertMember(MemberDTO dto);
	
	////////회원 관리
    public MemberDTO getMemberInfo(String memId); // 회원 정보 조회
    public void updateMember(MemberDTO dto);     // 회원 정보 수정
    public void deleteMember(String memId);     // 회원 탈퇴
}
