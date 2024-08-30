package com.anshid.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshid.store.model.product;

public interface ProductsRepository extends JpaRepository<product, Integer> {

}
