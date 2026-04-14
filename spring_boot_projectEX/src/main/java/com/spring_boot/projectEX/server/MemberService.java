package com.spring_boot.projectEX.server;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring_boot.projectEX.dto.MemberDTO;
import com.spring_boot.projectEX.model.IMemberDAO;

@Service
@Primary // Bean 결정이 모호한 경우 우선 선택
public class MemberService implements IMemberService {

	@Autowired
	IMemberDAO dao;
	
	@Autowired
	PasswordEncoder pwdEncoder;
	

	/*
	// 비밀번호 암호화 하지 않은 경우
	@Override
	public String loginCheck(HashMap<String, Object> map) {
		// dao에서 전달되는 memId 여부에 따라 result 결정
		String memId = dao.loginCheck(map);
		// String result = "fail";
		// if(memId!=null) { result ="success"; }
		return memId;
	}
	
	 비밀번호 암호화 처리 한 경우 : map에서 id와 pwd 추출
	 dao에게 id 만 전달해서 id의 레코드가 있는지 확인 후 pwd 전달받음
	 
	 */
	@Override
	public String loginCheck(HashMap<String, Object> map) {
		String encodedPwd = dao.loginCheck((String)map.get("id"));
		String result="fail";
		String memPwd = (String)map.get("pwd");
		if(encodedPwd != null && pwdEncoder.matches(memPwd, encodedPwd)) {
			result="success";
		}
		return result;
	}

	@Override
	public void insertMember(MemberDTO dto) {
		// 비밀번호 필드값만 추출해서 암호화
		String encodedPwd = pwdEncoder.encode(dto.getMemPwd());
		dto.setMemPwd(encodedPwd);
		
		dao.insertMember(dto); // 암호화된 비밀번호가 저장됨
	}

	@Override
	public String idCheck(String id) {
		return dao.idCheck(id);
	}

}
