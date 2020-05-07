package com.AddProduct;

import com.opensymphony.xwork2.ActionSupport;


public class AddProductAction extends ActionSupport{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		String product_name, product_model;
		

		
		public String execute() throws Exception {

			int var = AddProductDAO.register(this);
			if (var > 0) {
				return "success";
			} else {
				return "error";
			}
		}

		public String getProduct_name() {
			return product_name;
		}

		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}

		public String getProduct_model() {
			return product_model;
		}

		public void setProduct_model(String product_model) {
			this.product_model = product_model;
		}

	
}
