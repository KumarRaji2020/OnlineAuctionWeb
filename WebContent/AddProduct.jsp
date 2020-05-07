<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>

<s:form action="AddProductAction.action">
<s:textfield name="product_name" label="Product Name"></s:textfield>  
<s:textfield name="product_model" label="Product Model"></s:textfield>  
<s:submit value="Add"></s:submit>  
</s:form>

</body>
</html>