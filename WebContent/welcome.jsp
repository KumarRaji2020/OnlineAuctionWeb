<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Hello Welcome!</h1><br>


<%-- <a href="ProductList.jsp"> <s:property value="product_name" />|<s:property value="product_model" />|<!--<s:property value="item_display" /> --%>
<h3><a href="ProductList.action">Bidder</a></h3>
<h3><a href="SellerLogin.jsp">Seller</a></h3>

</body>
</html>