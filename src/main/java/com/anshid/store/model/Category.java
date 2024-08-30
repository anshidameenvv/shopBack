package com.anshid.store.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String category;
	private String SubCategory;
	private String size;
	private double price;
	private String discount;
	private String brand;
	private String details;
	private String imageUrl;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
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
		return SubCategory;
	}
	public void setSubCategory(String subCategory) {
		SubCategory = subCategory;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Category(int id, String name, String category, String subCategory, String size, double price,
			String discount, String brand, String details, String imageUrl) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		SubCategory = subCategory;
		this.size = size;
		this.price = price;
		this.discount = discount;
		this.brand = brand;
		this.details = details;
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", category=" + category + ", SubCategory=" + SubCategory
				+ ", size=" + size + ", price=" + price + ", discount=" + discount + ", brand=" + brand + ", details="
				+ details + ", imageUrl=" + imageUrl + "]";
	}
	
	


}
