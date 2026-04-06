package com.sping_mvc.jdbc2.Repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.sping_mvc.jdbc2.VO.ProductVO;

@Repository
public class ProductRepo {
	@Autowired
	@Qualifier("productVO")
	private ProductVO vo;
	
	private DataSource dataFactory;
	
	@Autowired
	public ProductRepo(DataSource dataSource){
		try {
			this.dataFactory = dataSource;
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// Product 테이블 데이터를 view페이지에 출력
	public ArrayList<ProductVO> productList(){
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<ProductVO> prdList = new ArrayList<ProductVO>();
		
		try {
			con = dataFactory.getConnection();
			String sql = "select * from product";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String prdNo = rs.getString("prdNo");
				String prdName = rs.getString("prdName");
				String prdCompany = rs.getString("prdCompany");
				int prdPrice = rs.getInt("prdPrice");
				
				ProductVO vo = new ProductVO();
				vo.setPrdNo(prdNo);
				vo.setPrdName(prdName);
				vo.setPrdCompany(prdCompany);
				vo.setPrdPrice(prdPrice);
				
				prdList.add(vo);
			}
		}catch(Exception e) {
			
		}
		return prdList;
	}
}
