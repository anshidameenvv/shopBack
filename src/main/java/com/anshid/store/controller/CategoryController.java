package com.anshid.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.anshid.store.model.Category;
import com.anshid.store.repository.CategoryRepository;

@RestController
@RequestMapping("/categories")
@CrossOrigin(origins="http://localhost:4200/")
public class CategoryController {
	
	@Autowired
	CategoryRepository repo;
	
	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	@CrossOrigin("http://localhost:4200/")
	public void createcategory(@RequestBody Category category  ) {
		 repo.save(category);
 	}
	
	@GetMapping("/getAll")
	public List<Category> getAll(){
		List<Category> category=repo.findAll();
		return category;
	}
}
