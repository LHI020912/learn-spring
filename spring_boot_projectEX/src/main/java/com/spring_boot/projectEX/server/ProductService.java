package com.spring_boot.projectEX.server;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.spring_boot.projectEX.dto.ProductDTO;
import com.spring_boot.projectEX.model.IProductDAO;

@Service
@Primary
public class ProductService implements IProductService {
	
	@Autowired
	IProductDAO dao;

	@Override
	public ArrayList<ProductDTO> listCtgProduct(String ctgId) {
		return dao.listCtgProduct(ctgId);
	}

	@Override
	public ProductDTO detailViewProduct(String prdNo) {
		return dao.detailViewProduct(prdNo);
	}

	@Override
	public void insertProduct(ProductDTO dto) {
		dao.insertProduct(dto);
	}

	@Override
	public void updateProduct(ProductDTO dto) {
		dao.updateProduct(dto);
	}

	@Override
	public void deleteProduct(String prdNo) {
		dao.deleteProduct(prdNo);
	}
}
