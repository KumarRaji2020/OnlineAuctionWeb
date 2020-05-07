<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List Bidder View</title>
</head>
<body>

<!-- <table><tr><td><a href="home.jsp">Home</a> |   <a href="viewrecords_customer.action">View Products</a></td></tr></table> -->

<h3>Product List for Bidding</h3>
<!-- <mark>Note: Please note down the item name & model to enter into the next page</mark> -->
<h4>Hello Bidder, You can bid this product by clicking 'Bid' link</h4>
<s:form action="ProductList.action">  
<s:iterator  value="list"> 

<fieldset>  
<s:property value="product_name" />|<s:property value="product_model" />| <a href="AddBidder.jsp">Bid</a>
</fieldset> 
</s:iterator> 
</s:form>
</body>
</html>


<%-- <s:property value="product_name" />|<s:property value="#session.item_name"/> |<s:property value="product_model" />|<!--<s:property value="item_display" /> -->| <a href="BiddingUserDetails.jsp">Bid</a> --%>