package com.Bidder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.AddProduct.AddProductAction;

public class AddBidderDAO {
	public static Connection conn() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp", "root", "admin");
	}

	public static int register(AddBidderAction ai) {
		int flag = 0;
		try {
			PreparedStatement ps = conn().prepareStatement("INSERT INTO bidder VALUES(?,?,?,?,?,?)");
			ps.setString(1, ai.getProduct_name());
			ps.setString(2, ai.getAuction_prize());
			ps.setString(3, ai.getName());
			ps.setString(4, ai.getEmail());
			ps.setString(5, ai.getPhone());
			ps.setString(6, ai.getAddress());
			//ps.setString(3, ai.getAmount());
			//ps.setString(3, ai.getItem_display());
			flag = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}


}
