<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
</head>
<body>

<!-- <table><tr><td><a href="home.jsp">Home</a> |   <a href="viewrecords_customer.action">View Products</a></td></tr></table> -->
<h4><a href="welcome.jsp">Home</a></h4><br>
<h2>Product List</h2>
<!-- <mark>Note: Please note down the item name & model to enter into the next page</mark> -->

<s:form action="ProductListSellerView.action">  
<s:iterator  value="list"> 

<fieldset>  
<s:property value="product_name" />|<s:property value="product_model" />| <a href="BidderList.action">Bidder's Details</a>| <a href="Winner.action">Close Bid</a>|
</fieldset> 
</s:iterator> 
</s:form>
</body>
</html>


<%-- <s:property value="product_name" />|<s:property value="#session.item_name"/> |<s:property value="product_model" />|<!--<s:property value="item_display" /> -->| <a href="BiddingUserDetails.jsp">Bid</a> --%>