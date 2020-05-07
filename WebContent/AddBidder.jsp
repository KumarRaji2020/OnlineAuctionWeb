<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bidder Details</title>
</head>
<body>
<h4>Hello Bidder, Please enter the below details...</h4>
<s:form action="AddBidderAction.action">  
<s:textfield name="product_name" label="Product Name"></s:textfield>
<s:textfield name="auction_prize" label="Auction Prize"></s:textfield>
<s:textfield name="name" label="Name"></s:textfield>  
<s:textfield name="email" label="Email"></s:textfield>
<s:textfield name="phone" label="Phone"></s:textfield>
<s:textfield name="address" label="Address"></s:textfield>  
  
<s:submit value="Add"></s:submit>  
  
</s:form> 

</body>
</html>