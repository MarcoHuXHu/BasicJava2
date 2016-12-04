<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Movie CRUD</title>
</head>
<body>
<table>
<tr>
<th>#</th>
<th>id</th>
<th>name</th>
<th>hero name</th>
<th>rating</th>
<th>EDIT</th>
<th>DELETE</th>
</tr>
<c:forEach items="${mlist}" var="movie" varStatus="status">
<tr>
<td>${status.index}</td>
<td>${movie.id}</td>
<td>${movie.name}</td>
<td>${movie.heroName}</td>
<td>${movie.avgRating}</td>
<td></td>
<td></td>
</tr>
</c:forEach>

</table>
</body>
</html>