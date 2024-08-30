package com.anshid.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anshid.store.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
