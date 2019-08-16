<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
	.error{
	color:red;
	}
</style>
<title>Insert title here</title>
</head>
<body>
		<h1>Customer Form</h1>
		<form:form action="processForm" modelAttribute="customer">
		  Name:<form:input path="name"/>
		  <form:errors path="name" cssClass="error"></form:errors>
		  <br /><br />
		  Country :
		  <form:select path="country">
		  	<form:options items="${customer.countrylist }"/>
		  </form:select>
		  <br/><br/>
		  <fieldset>
		  <legend>Select favcusine</legend>
		  <form:radiobuttons path="favcusine" items="${customer.favcusinelist }"/>
		
		  </fieldset>
		  <br/><br/>
		  <fieldset>
		  	<legend>Select books to buy</legend>
		  	<form:checkbox path="book" value="Brief History Of Time"/>Brief History Of Time<br>
		  	<form:checkbox path="book" value="Grand Design"/>Grand Design<br>
		  	<form:checkbox path="book" value="David Copperfiend"/>David Copperfiend<br>
		  </fieldset>
		  <form:label path="">
		  		number of discount coupons:
		  		<form:input path="discountcoupon"/><br><br>
		  		 <form:errors path="discountcoupon" cssClass="error"></form:errors>
		  </form:label>
		  <button type="submit">BUTTON</button>
		</form:form>
</body>
</html>