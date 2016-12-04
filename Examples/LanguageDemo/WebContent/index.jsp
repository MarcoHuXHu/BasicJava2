<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib uri="http://java.sun.com/jstl/xml" prefix="x"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<fmt:setBundle basename="MessagesBundle" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HARD CODED</title>
</head>
<body>
<h1>HARD CODED TITLE</h1>
<ul>
	<li><fmt:message key="hello" /></li>
	<li><fmt:message key="bye" >
                <fmt:param value="Hari" />
            </fmt:message>
        </li>
	<li><fmt:message key="greet" /></li>
	<li><fmt:message key="thanks" /></li>
	<li><fmt:message key="message" /></li>
</ul>
</body>
</html>