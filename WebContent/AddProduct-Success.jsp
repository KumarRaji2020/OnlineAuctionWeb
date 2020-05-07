<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product Success</title>
</head>
<body>
<h4><a href="welcome.jsp">Home</a></h4><br>
<h4>Product added successfully!</h4>
 
 <s:property value="product_name" />|<s:property value="product_model" />|

</body>
</html>