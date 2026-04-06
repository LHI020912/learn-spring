package com.sping_mvc.jdbc2.VO;

import java.util.Date;

public class ProductVO {
	public String prdNo;
	public String prdName;
	public String prdCompany;
	public int prdPrice;
	
	public ProductVO() {}
	
	public ProductVO(String prdNo, String prdName, String prdCompany, int prdPrice) {
		super();
		this.prdNo = prdNo;
		this.prdName = prdName;
		this.prdCompany = prdCompany;
		this.prdPrice = prdPrice;
	}

	public String getPrdNo() {
		return prdNo;
	}

	public void setPrdNo(String prdNo) {
		this.prdNo = prdNo;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public String getPrdCompany() {
		return prdCompany;
	}

	public void setPrdCompany(String prdCompany) {
		this.prdCompany = prdCompany;
	}

	public int getPrdPrice() {
		return prdPrice;
	}

	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}
}
