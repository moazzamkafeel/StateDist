<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>	
</head>
<body>
<f:form modelAttribute="v">
<table bgcolor="grey" border="10">
<tr><td>StateName</td><td>DistrictName</td></tr>
<c:forEach items="${v}" var="t">
<tr>
<td><c:out value="${t.stName}"></c:out></td>
<td><c:out value="${t.distName}"></c:out></td>
</tr>
</c:forEach>
</table>
</f:form>
</body>
</html>