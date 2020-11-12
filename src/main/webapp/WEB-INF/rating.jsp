<%@page import="net.bytebuddy.asm.Advice.Local"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>rating</title>
</head>
<body>

	<form:form action="rate" modelAttribute="rating">
						<form:select path="number">
						<form:option value = "0" label = "Select"/>
							<form:option value="1" label="1" />
							<form:option value="2" label="2" />
							<form:option value="3" label="3" />
							<form:option value="4" label="4" />
							<form:option value="5" label="5" />
						</form:select>
						<input type="submit" value="Submit" />
					</form:form>
  
</body>
</html>