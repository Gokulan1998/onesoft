package com.onesoft.collection3;

public class Mobile {
	private String brand;
	private int price;
	private boolean isAndroid;
	public Mobile(String brand, int price, boolean isAndroid) {
		super();
		this.brand = brand;
		this.price = price;
		this.isAndroid = isAndroid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getIsAndroid() {
		return isAndroid;
	}
	public void setIsAndroid(boolean isAndroid) {
		this.isAndroid = isAndroid;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", price=" + price + ", isAndroid=" + isAndroid + "]";
	}
	

}
