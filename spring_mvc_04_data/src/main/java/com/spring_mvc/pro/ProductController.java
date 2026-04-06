package com.spring_mvc.pro;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_mvc.DTO.Product;

@Controller
public class ProductController {
	
	@RequestMapping("/product/productForm")
	public String productFormView() {
		return "product/productForm";
	}
	
	@RequestMapping("/product/productForm2")
	public String productFormView2() {
		return "product/productForm2";
	}
	
	@RequestMapping("/product/productForm3")
	public String productFormView3() {
		return "product/productForm3";
	}
	
	@RequestMapping("/product/productForm4")
	public String productFormView4() {
		return "product/productForm4";
	}
	
	///
	
	@RequestMapping("/product/newProduct")
	public String insertProduct(HttpServletRequest request, Model model) {
		String prdNo = request.getParameter("prdNo");
		String prdName = request.getParameter("prdName");
		String prdPrice = request.getParameter("prdPrice");
		String prdCompany = request.getParameter("prdCompany");
		String prdDate = request.getParameter("prdDate");
		String prdStock = request.getParameter("prdStock");
		
		model.addAttribute("prdNo",prdNo);
		model.addAttribute("prdName",prdName);
		model.addAttribute("prdPrice",prdPrice);
		model.addAttribute("prdCompany",prdCompany);
		model.addAttribute("prdDate",prdDate);
		model.addAttribute("prdStock",prdStock);
		
		return "product/productResult";
	}
	
	@RequestMapping("/product/newProduct2")
	public String insertProduct2 (String prdNo, String prdName, int prdPrice,
								  String prdCompany, Date prdDate, int prdStock,
								  Model model) {
		
		model.addAttribute("prdNo",prdNo);
		model.addAttribute("prdName",prdName);
		model.addAttribute("prdPrice",prdPrice);
		model.addAttribute("prdCompany",prdCompany);
		model.addAttribute("prdDate",prdDate);
		model.addAttribute("prdStock",prdStock);
		
		return "product/productResult";
	}
	
	@RequestMapping("/product/newProduct3")
	public String insertProduct3 (Product product, Model model) {
		System.out.println(product.getPrdNo());
		System.out.println(product.getPrdName());
		System.out.println(product.getPrdPrice());
		System.out.println(product.getPrdCompany());
		System.out.println(product.getPrdDate());
		System.out.println(product.getPrdStock());

		model.addAttribute("prdNo",product.getPrdNo());
		model.addAttribute("prdName",product.getPrdName());
		model.addAttribute("prdPrice",product.getPrdPrice());
		model.addAttribute("prdCompany",product.getPrdCompany());
		model.addAttribute("prdDate",product.getPrdDate());
		model.addAttribute("prdStock",product.getPrdStock());
		
		return "product/productResult";
	}
	
	@RequestMapping("/product/newProduct4")
	public String insertProduct4 (@ModelAttribute("productInfo")Product product) {
		return "product/productResult2";
	}
	
	// 냉장고
	@RequestMapping("/product/productDetailView/{prdName}/{prdCompany}/prdStock}")
	public String productDetailView1 (@PathVariable String prdName,
									  @PathVariable String prdCompany,
									  @PathVariable String prdStock) {
		System.out.println(prdName);
		System.out.println(prdCompany);
		System.out.println(prdStock);
		return "index";
	}
	
	// 상품 검색
	@RequestMapping("/productSearchForm")
	public String productSerachFrom() {
		return "product/productSerarchForm";
	}
	
	// HashMap으로 받기
	@RequestMapping("/product/productSearch")
	public String productSearch(@RequestParam HashMap<String, Object> param, Model model) {
		System.out.println(param.get("type"));
		System.out.println(param.get("keyword"));
		// model에 해당하는 dao로 전달해서 dbms와 쿼리실행 후 결과값을 전달받는 로직이 필요
		Product prd1 = new Product();
		prd1.setPrdNo("001");
		prd1.setPrdName("냉장고");
		prd1.setPrdCompany("엘지");
		
		ArrayList<Product> prdList = new ArrayList<Product>();
		prdList.add(prd1);
		
		model.addAttribute("prdList",prdList);
		
		return "prodcut/productSearchResult";
	}
}
