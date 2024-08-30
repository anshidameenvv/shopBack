package com.anshid.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import com.anshid.store.model.Customer;
import com.anshid.store.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins="http://localhost:4200/")
public class CustomerController {
	
	@Autowired
	CustomerRepository custRepo;
	
	@GetMapping("/all")
	public List<Customer> getAllCust(){
	 List<Customer> customer=custRepo.findAll();
		return customer;
	}
	
	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void createCustomer(@RequestBody Customer customer) {
		 custRepo.save(customer);  
	}
	
	 @PostMapping("/login")
	    public ResponseEntity<String> login(@RequestParam("username") String username, @RequestParam("password") String password) {
	        Customer customer = custRepo.findByUsername(username);
	        if (customer != null && customer.getPassword().equals(password)) {
	            return ResponseEntity.ok("Login successful");
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
	        }
	    }
	 
	 
	 
}
