<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student form</title>
</head>
<body>
<h2>Student form</h2>
	<form action="processStudentFormV3" method="post">
		<label for ="name">
			Firstname:
			<input type="text" id="name" name="name"/>
		</label>
		<br><br>
		<label for ="lastname">
			lastname:
			<input type="text" id="lastname" name="lastname"/>
		</label>
		<br><br>
		<label for="courseId">
		course id:
		<input type="text" id="courseId" name="courseId"/>
		</label>
		<button type="submit">SUBMIT</button>
	</form>
</body>
</html>