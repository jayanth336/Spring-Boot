package com.sampleApplication.Sample2.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.product.Product;

@Service
public class Sample2Service {
	public List<Product> getNextProducts() {
		List<Product> productList2 = Arrays.asList(
				new Product(4, "prodD", 200),
				new Product(5, "prodE", 430),
				new Product(6, "prodF", 320));
		return productList2;
	}

	public List<Product> getByNo(int no) {
		return getNextProducts().stream().filter(i->i.getProdNo()==no).collect(Collectors.toList());
	}

}
