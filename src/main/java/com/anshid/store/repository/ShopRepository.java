package com.anshid.store.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshid.store.model.Customer;
import com.anshid.store.model.Shop;

public interface ShopRepository extends JpaRepository<Shop, Integer> {
		
	List<Shop> findByCategory(String category);
	
	List<Shop> findBySubCategory(String subcategory);
	
	List<Shop> findByBrand(String brand);
}
