package com.spring_boot.projectEX.model;

import java.util.ArrayList;

import com.spring_boot.projectEX.dto.ProductDTO;

public interface IProductDAO {
	public ArrayList<ProductDTO> listCtgProduct(String ctgId);
	public ProductDTO detailViewProduct(String prdNo);

}