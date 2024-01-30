package com.camelservicesample;

public class Products {

	private int orderId;

	private String product;

	private String type;

	private String description;

	private int price;
	
	private int rating;

	public Products() {

	}

	public Products(int orderId, String product, String type, String description, int price, int rating) {

		this.orderId = orderId;

		this.product = product;

		this.type = type;

		this.description = description;

		this.price = price;

		this.rating = rating;

	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Products [orderId=" + orderId + ", product=" + product + ", type=" + type + ", description="
				+ description + ", price=" + price + ", rating=" + rating + "]";
	}

}
