<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib  prefix="f" uri="http://www.springframework.org/tags/form"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to Spring Boot</h2>
														
<f:form action="addstudent" method="post" modelAttribute="student">


Enter Roll :<f:input path="roll" /><f:errors path="roll"/><br><br>
Enter Name :<f:input path="name"/><f:errors path="name"/><br><br>
Enter Marks :<f:input path="marks" /><f:errors path="marks"/><br><br>


<input type="submit" value="Register">




</f:form>
<br><br>


</body>
</html>