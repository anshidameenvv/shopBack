package com.anshid.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.anshid.store.model.Order;
import com.anshid.store.repository.OrderRepository;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins="http://localhost:4200/")
public class OrderCustomer {
	
	@Autowired
	OrderRepository repo;
	
	@GetMapping("/get")
	public List<Order> getAllOrders(){
		List<Order> orders=repo.findAll();
		return orders;
	}
	
	@PostMapping("/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void addService(@RequestBody Order order) {
		repo.save(order);
	}
}
