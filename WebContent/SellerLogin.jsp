<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<h4><a href="welcome.jsp">Home</a></h4><br>
<h2> Hello Seller, Please Login </h2>
<body>
<s:form action="LoginAction">
<s:textfield name="username" label="UserID"></s:textfield>  
<s:password name="password" label="Password"></s:password>  
<s:submit value="login"></s:submit>  
</s:form>  
</body>
</html>