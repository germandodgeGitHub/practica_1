package ar.com.betasepp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ar.com.betasepp.entities.Product;
import ar.com.betasepp.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService iProductService;

	@GetMapping("/all")
	public List<Product> allProducts() throws Exception {
		try {
			List<Product> all=iProductService.listAll();
			return all;
		} catch (Exception exception) {
			return null;
		}
	}
}
