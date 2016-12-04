<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="m" class="model.Movie" scope="request"/>
<h1>Data inside the java bean</h1>

<ol>
  <li> <jsp:getProperty property="name" name="m"/> </li>
  <li> <jsp:getProperty property="rating" name="m"/> </li>
  <li> <jsp:getProperty property="comments" name="m"/> </li>
</ol>
</body>
</html>