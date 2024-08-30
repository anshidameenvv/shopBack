package com.anshid.store.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.anshid.store.model.product;
import com.anshid.store.repository.ProductsRepository;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins="http://localhost:4200/")
public class ProducterController {
	
	@Autowired
	ProductsRepository repo;
	//get all
	@GetMapping("/all")
	public List<product> getAllProducts(){
	 List<product> products=repo.findAll();
		return products;
	}
	
	@GetMapping("/{id}")
	public product getById(@PathVariable int id) {
	product products=repo.findById(id).get();
		return products;
	}
	
	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	@CrossOrigin("http://localhost:4200/")
	public void createProduct(@RequestBody product products) {
		 repo.save(products);
 	}
	 @PutMapping("/update/{id}")
	    public void updateProduct(@PathVariable int id, @RequestBody product newProduct) {
	        Optional<product> optionalProduct = repo.findById(id);
	        if (optionalProduct.isPresent()) {
	            product existingProduct = optionalProduct.get();
	            existingProduct.setName(newProduct.getName());
	            existingProduct.setBrand(newProduct.getBrand());
	            existingProduct.setCategory(newProduct.getCategory());
	            existingProduct.setPrice(newProduct.getPrice());
	            existingProduct.setDescription(newProduct.getDescription());
	            // Assuming createdAt is not updated in the update operation

	            repo.save(existingProduct);
	        } else {
	            throw new RuntimeException("Product not found with id: " + id);
	        }
	    }  
	@DeleteMapping("/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		product products=repo.findById(id).get();
		repo.delete(products);
		
	}
}
