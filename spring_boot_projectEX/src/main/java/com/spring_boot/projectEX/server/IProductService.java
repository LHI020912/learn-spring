package com.spring_boot.projectEX.server;

import java.util.ArrayList;

import com.spring_boot.projectEX.dto.ProductDTO;

public interface IProductService {
	public ArrayList<ProductDTO> listCtgProduct(String ctgId);
	public ProductDTO detailViewProduct(String prdNo);
	
}