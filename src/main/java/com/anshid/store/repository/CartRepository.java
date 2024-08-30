package com.anshid.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshid.store.model.Cart;

public interface CartRepository  extends JpaRepository<Cart, Integer>{

}
