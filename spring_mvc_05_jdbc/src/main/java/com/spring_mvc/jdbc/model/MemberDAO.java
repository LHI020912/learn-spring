package com.spring_mvc.jdbc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.spring_mvc.jdbc.dto.MemberDTO;

// DBMS와 연동해서 비즈니스 로직 처리하는 클래스 : 외부자원 활용(스프링 컨테이너 관리)

@Repository
public class MemberDAO {
	// 필드 위에 @Autowired 써 놓으면 생성자 호출될 때 자동 주입
	// MemberDAO memDao;
	// 회원 검색 로직 처리를 model에게 요청해서 처리 결과 반환
	// ArrayList<MemberDTO> memList = memDao.memberSelect();
	@Autowired
	@Qualifier("memberDTO")
	private MemberDTO dto;
	
	private DataSource dataFactory;
	
	@Autowired
	public MemberDAO(DataSource dataSource) {
		try {
			this.dataFactory = dataSource;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	// 회원 정보 조회 메소드
	public ArrayList<MemberDTO> memberSelect(){
		Connection con =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MemberDTO> memList = new ArrayList<MemberDTO>();
		
		try {
			con = dataFactory.getConnection(); // dbcp에서 con 객체 할당
			String sql ="select * from member2";
			pstmt = con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			
			while(rs.next()) {
				String memId = rs.getString("memId"); // 순서 번호 1, 2, 3... 사용해도 되고, 열 이름 사용해도 됨
				String memPwd = rs.getString("memPwd");
				String memName = rs.getString("memName");
				String memEmail = rs.getString("memEmail");
				Date memJoinDate = rs.getDate("memJoinDate");
				
				// 동적 객체가 생성되어야 하는 경우에는 DI를 통한 자동주입은 효율적이지 못 함.
				MemberDTO dto = new MemberDTO();
				dto.setMemId(memId);
				dto.setMemName(memName);
				dto.setMemPwd(memPwd);
				dto.setMemEmail(memEmail);
				dto.setMemJoinDate(memJoinDate);
				
				memList.add(dto);
			}
		}catch(Exception e) {
			
		}
		return memList;
	}
}
