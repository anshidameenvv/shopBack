package com.anshid.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.anshid.store.model.Cart;
import com.anshid.store.model.Customer;
import com.anshid.store.model.Order;
import com.anshid.store.model.Shop;
import com.anshid.store.model.product;
import com.anshid.store.repository.CartRepository;
import com.anshid.store.repository.CustomerRepository;
import com.anshid.store.repository.OrderRepository;
import com.anshid.store.repository.ShopRepository;

@RestController
@RequestMapping("/ecart")
@CrossOrigin(origins="http://localhost:4200/")
public class ShopController {
	
	@Autowired
	ShopRepository shopeREpo;
	
	@Autowired
	OrderRepository repo;
	
	@Autowired
	CartRepository cartRepo;
	
	@Autowired
	CustomerRepository customerRepo;   
	
	@GetMapping("/getAllcategory")
	private List<Shop> getAllCategory(){
		List<Shop> shop= shopeREpo.findAll();
		return shop;
	}
	
	@GetMapping("/getByCategory")
	private List<Shop>getByCategory(String category){
		List<Shop> shop=shopeREpo.findByCategory(category);
		return shop;	
	}
	
	@GetMapping("/getBySubCategory")
	private List<Shop>getBySubCategory(String subCategory){
		List<Shop> shop=shopeREpo.findBySubCategory(subCategory);
		return shop;	
	}
	
	@GetMapping("/getByBrand")
	private List<Shop>getByBrand(String brand){
		List<Shop> shop=shopeREpo.findBySubCategory(brand);
		return shop;	
	}
	
	@PostMapping("/createCategory")
	@ResponseStatus(code=HttpStatus.CREATED)
	@CrossOrigin("http://localhost:4200/")
	public void createCategory(@RequestBody Shop shop) {
		shopeREpo.save(shop);
	}

//	order page
	
	@GetMapping("/getOrder")
	public List<Order> getAllOrders(){
		List<Order> orders=repo.findAll();
		return orders;
	}
	
	@PostMapping("/order")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void addService(@RequestBody Order order) {
		repo.save(order);
	}
	
///cart page
	@GetMapping("/getAllCart")
	public List<Cart> getAllCart(){
		List<Cart> cart=cartRepo.findAll();
		return cart;
		
	}
	@PostMapping("/addCart")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void addCart(@RequestBody Cart cart) {
		cartRepo.save(cart);
	}
	@DeleteMapping("/delete/{id}")
	public void removeStudent(@PathVariable int id) {
		Cart cart=cartRepo.findById(id).get();
		cartRepo.delete(cart);	
	}
	
///Customer
	
	@PostMapping("/addCustomer")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void addCustomer(@RequestBody Customer customer) {
		customerRepo.save(customer);
	}
	@GetMapping("/getAllCustomer")
	public List<Customer> getAllCustomer(){
		List<Customer> customer=customerRepo.findAll();
		return customer;
		
	}
	 @PostMapping("/sign-in")
	    public ResponseEntity<String> signIn(@RequestParam String username, @RequestParam String password) {
	        Customer customer = customerRepo.findByUsernameAndPassword(username, password);
	        if (customer != null) {
	            return ResponseEntity.ok("Sign-in successful");
	        } else {
	            return ResponseEntity.status(401).body("Invalid credentials");
	        }
	 }
}
