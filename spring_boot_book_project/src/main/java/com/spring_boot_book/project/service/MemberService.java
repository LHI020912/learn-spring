package com.spring_boot_book.project.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring_boot_book.project.model.IMemberDAO;
import com.spring_boot_book.project.vo.MemberVO;

@Service
@Primary
public class MemberService implements IMemberService{

	@Autowired
	IMemberDAO dao;
	
	@Autowired
	PasswordEncoder pwdEncoder;
	
	// 암호화된 비밀번호 로그인
	@Override
	public String loginCheck(HashMap<String, Object> map) {
		String encodedPwd = dao.loginCheck((String)map.get("id"));
		String result = "fail";
		String memPwd =(String)map.get("pwd");
		if(encodedPwd != null && pwdEncoder.matches(memPwd,encodedPwd)) {
			result = "success";
		}
		return result;
	}

	@Override
	public void insertMember(MemberVO vo) {
		String encodedPwd = pwdEncoder.encode(vo.getMemPwd());
		vo.setMemPwd(encodedPwd);
		dao.insertMember(vo);
	}

	@Override
	public String idCheck(String id) {
		return dao.idCheck(id);
	}
}
