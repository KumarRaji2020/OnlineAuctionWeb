package com.Bidder;

import com.AddProduct.AddProductDAO;

public class AddBidderAction {
	
	public String product_name, auction_prize, name, email, phone, address;

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getAuction_prize() {
		return auction_prize;
	}

	public void setAuction_prize(String auction_prize) {
		this.auction_prize = auction_prize;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String execute() {
		int var1 = AddBidderDAO.register(this);
		if (var1 > 0) {
			return "success";
		} else {
			return "error";
		}
	}
	
}
