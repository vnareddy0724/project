<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Page</title>
</head>
<body>

<h2> Hi ${name} !! your policy details !!</h2>
<table>
<c:forEach var="data" items="${searchDataList}">
<tr>
<th> PolicyNumber : </th><td><c:out value="${data.policynum}"/> </td>
</tr>
<tr>
<th> BirthDate : </th><td><c:out value="${data.birthDate}"/> </td>
</tr>
<tr>
<th> FirstName : </th>
<td><c:out value="${data.firstName}"/> </td>
</tr>
<tr>
<th> LastName : </th>
<td><c:out value="${data.lastName}"/> </td>
</tr>
<tr>
<th> StartDate : </th>
<td><c:out value="${data.startDate}"/> </td>
</tr>
<tr>
<th> EndDate : </th>
<td><c:out value="${data.endDate}"/> </td>
</tr>
<tr>
<th> Addres1 : </th>
<td><c:out value="${data.address1}"/> </td>
</tr>
<tr>
<th> Address2 : </th>
<td><c:out value="${data.address2}"/> </td>
</tr>
<tr>
<th> City : </th>
<td><c:out value="${data.city}"/> </td>
</tr>
<tr>
<th> State : </th>
<td><c:out value="${data.state}"/> </td>
</tr>
<tr>
<th> ZipCode : </th>
<td><c:out value="${data.zipCode}"/> </td>
</tr>
<tr>
<th> Country : </th>
<td><c:out value="${data.country}"/> </td>
</tr>


<tr>
<th> Age of Policy: </th>
<td>Years :<c:out value="${years}"/> </td>
<td>Months :<c:out value="${months}"/> </td>
<td>Days :<c:out value="${days}"/> </td>
</tr>






</c:forEach>
</tr>
<tr>





</table>

<form action="/home">

<input type="submit" value="Home">

</form>

</body>
</html>