package com.spring_boot.projectEX.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring_boot.projectEX.dto.ProductDTO;
import com.spring_boot.projectEX.server.IProductService;

@Controller
public class ProductController {
	
	@Autowired
	IProductService prdService;
	
	@GetMapping("/product/productListCtg/{ctgId}")
	public String productCtglsit(@PathVariable String ctgId, Model model) {
		ArrayList<ProductDTO> prdList = prdService.listCtgProduct(ctgId);
		model.addAttribute("prdList",prdList);
		return "product/productCtgListView";
	}
	
	@GetMapping("/product/detailViewProduct/{prdNo}")
	public String detailViewProduct(@PathVariable String prdNo, Model model) {
		ProductDTO prd = prdService.detailViewProduct(prdNo);
		model.addAttribute("prd",prd);
		return "product/productDetailView";
	}
	
	///////////////
	
	// 등록 폼
	@GetMapping("/product/insertProductForm")
	public String insertProductForm() {
	    return "product/productInsertForm";
	}

	// 등록 처리
	@PostMapping("/product/insertProduct")
	public String insertProduct(ProductDTO dto) {
	    prdService.insertProduct(dto);
	    return "redirect:/product/productListCtg/" + dto.getCtgId();
	}

	// 수정 폼
	@GetMapping("/product/updateProductForm/{prdNo}")
	public String updateProductForm(@PathVariable String prdNo, Model model) {
	    ProductDTO prd = prdService.detailViewProduct(prdNo);
	    model.addAttribute("prd", prd);
	    return "product/productUpdateForm";
	}

	// 수정 처리
	@PostMapping("/product/updateProduct")
	public String updateProduct(ProductDTO dto) {
	    prdService.updateProduct(dto);
	    return "redirect:/product/detailViewProduct/" + dto.getPrdNo();
	}

	// 삭제
	@ResponseBody
	@PostMapping("/product/deleteProduct")
	public String deleteProduct(@RequestParam("prdNo") String prdNo) {
	    prdService.deleteProduct(prdNo);
	    return "success";
	}
}
