<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<html>
<body>

		


<table border="1">
	 	<th>Sr No</th>
	 	<th>How_long</th>
		<th>Price</th>
		<th>ticket_class_id</th>
		

		<c:forEach var="ticket" items="${list}" varStatus="status">
			<tr>
			    <td>${status.index + 1}</td>
				<td>${ticket.how_long}</td>
				<td>${ticket.price}</td>
				<td>${ticket.id_class_ticket}</td>				
			</tr>
		</c:forEach>
	</table>
	
	
	
	
</body>
</html>