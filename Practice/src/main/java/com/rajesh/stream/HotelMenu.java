package com.rajesh.stream;

public class HotelMenu {
	private String dish;
	private String type;
	private int price;
	public HotelMenu() {
		super();
	}
	public HotelMenu(String dish, String type, int price) {
		super();
		this.dish = dish;
		this.type = type;
		this.price = price;
	}
	public String getDish() {
		return dish;
	}
	public void setDish(String dish) {
		this.dish = dish;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "HotelMenu [dish=" + dish + ", type=" + type + ", price=" + price + "]";
	}
	
	
	

}
