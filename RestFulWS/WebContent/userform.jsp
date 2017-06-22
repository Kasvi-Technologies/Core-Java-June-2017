<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Input User Details</h1>
    <form action="rest/user-form/register" method="post">
        <p>Name : <input type="text" name="name" /></p>
        <p>Address : <input type="text" name="address" /></p>
        <input type="submit" value="Enter Details" />
    </form>

</body>
</html>