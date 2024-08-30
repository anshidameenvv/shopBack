package com.anshid.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshid.store.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
