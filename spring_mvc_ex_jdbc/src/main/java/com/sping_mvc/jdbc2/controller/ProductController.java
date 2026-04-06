package com.sping_mvc.jdbc2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sping_mvc.jdbc2.Repo.ProductRepo;
import com.sping_mvc.jdbc2.VO.ProductVO;

@Controller
public class ProductController {

	@Autowired
	ProductRepo prdRepd;
	
	@RequestMapping("/")
	public String viewIndex() {
		return "view";
	}
	
	@RequestMapping("/product/productSelect")
	public String productSelect(Model model) {
	    ArrayList<ProductVO> prdList = prdRepd.productList();
	    model.addAttribute("prdList", prdList);
	    return "product/productSelectRes";
	}
}
