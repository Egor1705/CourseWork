<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<table>
	<c:forEach var="plane" items="${listP}" varStatus="status">
			<tr>
			    
			    <td>${plane.id_plane}</td>
				<td>${plane.plane_name}</td>
				<td>${plane.id_ticket_plane}</td>
				<td>${plane.id_class_plane}</td>
				
				
			</tr>
			</c:forEach>
			</table>
			
			<table>
	<c:forEach var="airport" items="${list}" varStatus="status">
			<tr>
			    
			    <td>${airport.id_airport}</td>
				<td>${airport.city_name}</td>
				<td>${airport.airport_name}</td>
				<td>${airport.id_plane_airport}</td>
				
				
			</tr>
			</c:forEach>
			</table>

</body>
</html>