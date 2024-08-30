package com.anshid.store.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cart")
public class Cart {
	
	@Id
	@GeneratedValue
	private int id; 
	
	private String name;
	private String category;
	private String subCategory;
	private String size;
	private int price;
	private String details;
	private String brand;
	private String colour;
	private String discount;
	private String imageUrl;
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Cart(int id, String name, String category, String subCategory, String size, int price, String details,
			String brand, String colour, String discount, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.subCategory = subCategory;
		this.size = size;
		this.price = price;
		this.details = details;
		this.brand = brand;
		this.colour = colour;
		this.discount = discount;
		this.imageUrl = imageUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", name=" + name + ", category=" + category + ", subCategory=" + subCategory
				+ ", size=" + size + ", price=" + price + ", details=" + details + ", brand=" + brand + ", colour="
				+ colour + ", discount=" + discount + ", imageUrl=" + imageUrl + "]";
	}
	
	

}
