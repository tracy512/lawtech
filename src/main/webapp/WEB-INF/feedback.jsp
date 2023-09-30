<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 
<title>Insert title here</title>


</head>
<body>
<h1>Submit Data to MySQL</h1>
    <form action="TaskServlet" method="POST">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>

        <label for="regarding">Regarding:</label>
        <input type="text" id="regarding" name="regarding"><br><br>

        <label for="code">Code:</label>
        <input type="text" id="code" name="code" required><br><br>

        <label for="rating">Rating:</label>
        <input type="number" id="rating" name="rating" min="1" max="5" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>