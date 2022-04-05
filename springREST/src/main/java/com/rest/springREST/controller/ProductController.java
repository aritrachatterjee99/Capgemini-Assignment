package com.rest.springREST.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.springREST.main.Product;
import com.rest.springREST.repo.ProductRepository;



@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepo;
	
	@PostMapping("/product")
	public ResponseEntity<?> addProduct(@RequestBody Product product) {
		return ResponseEntity.ok ( this.productRepo.save(product));
	}
	
	@PutMapping("/product")
	public ResponseEntity<?> updateProduct(@RequestBody Product product) {
		return ResponseEntity.ok(this.productRepo.save(product));
	}
	
	 @DeleteMapping("/product/{productId}") 
	  public void deleteProduct(@PathVariable int productId){
	          this.productRepo.deleteById(productId);
	  }
	
	@GetMapping("/product")
	public ResponseEntity<?> viewallProducts(){
		return ResponseEntity.ok(this.productRepo.findAll());
	}
	
	@GetMapping("/product/{productId}")
	public ResponseEntity<?> viewProduct(@PathVariable Integer productId) {
		return ResponseEntity.ok(this.productRepo.findById(productId));
	}
	
	

}
