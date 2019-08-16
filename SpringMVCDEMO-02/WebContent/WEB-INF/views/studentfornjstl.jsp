<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix ="form" uri="http://www.springframework.org/tags/form"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="processStudentFormV3" modelAttribute="student" method="post">
	<form:label path="">
		fristname:<form:input path="Name"/>
		</form:label>
		<br><br>
		lastname:<form:input path="lastname"/>
		<br><br>
		<form:label path="">
		Course ID: 
			<form:input path="courseId"/>
			<form:errors path="courseId" cssClass="error"/>
		</form:label>
		<br /><br />
		<button type="submit">Submit</button>
	</form:form>


</body>
</html>