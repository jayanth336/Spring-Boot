package com.sampleApplication.Sample2.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.Product;

@RestController
@RequestMapping("/get")
public class Sample2Controller {
	
	@Autowired
	Sample2Service service; 
	
	@GetMapping("/string")
	public String getString() {
		return "Spring boot project";
	}
	
	@GetMapping("/list")
	public List<String> getList() {
		List<String> list = Arrays.asList("prod1", "prod2", "prod3");
		return list;
	}
	
	@GetMapping("/productList")
	public List<Product> getProd() {
		List<Product> productList = Arrays.asList(
				new Product(1, "prodA", 100),
				new Product(2, "prodB", 200),
				new Product(3, "prodC", 70));
		return productList;
	}
	
	@GetMapping("/productList2")
	public List<Product> getProd2() {
		return service.getNextProducts();
	}
	
	@GetMapping("/productByNo/{prodNo}")
	public List<Product> getProductByNo(@PathVariable int prodNo) {
		return service.getByNo(prodNo);
	}

}
