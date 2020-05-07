package com.AddProduct;
		import java.sql.Connection;
		import java.sql.DriverManager;
		import java.sql.PreparedStatement;

import com.AddProduct.AddProductAction;


		public class AddProductDAO {
			public static Connection conn() throws Exception {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection("jdbc:mysql://localhost:3306/webapp", "root", "admin");
			}

			public static int register(AddProductAction ai) {
				int flag = 0;
				try {
					PreparedStatement ps = conn().prepareStatement("INSERT INTO products VALUES(?,?)");
					ps.setString(1, ai.getProduct_name());
					ps.setString(2, ai.getProduct_model());
					//ps.setString(3, ai.getAmount());
					//ps.setString(3, ai.getItem_display());
					flag = ps.executeUpdate();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return flag;
			}
		}
