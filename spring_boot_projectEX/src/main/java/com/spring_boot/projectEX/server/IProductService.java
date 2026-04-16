package com.spring_boot.projectEX.server;

import java.util.ArrayList;

import com.spring_boot.projectEX.dto.ProductDTO;

public interface IProductService {
	public ArrayList<ProductDTO> listCtgProduct(String ctgId);
	public ProductDTO detailViewProduct(String prdNo);

    public void insertProduct(ProductDTO dto); // 등록
    public void updateProduct(ProductDTO dto); // 수정
    public void deleteProduct(String prdNo);   // 삭제
}