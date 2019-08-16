<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	NAME:${customer.name}<br/>
	COUNTRY:${customer.country }<br/>
	FAVCUSINE:${customer.favcusine}<br/>
	BOOK TO BUY:
	<br/>
	<ul>
		<c:forEach var="book" items="${customer.book }">
			<li> ${book }</li>
		</c:forEach>
	</ul>
</body>
</html>