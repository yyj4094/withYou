<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>header 입니다</title>
</head>
<body>
<c:set var="id" value="${id }"/>

<form>
	<table>
		<tr>
		<td><c:if test="${id != null }">${id }님 환영합니다.	
		<a href="login/logout.jsp?id=${id }">[로그아웃]</a></c:if>
			<c:if test ="${id == null }">
			<a href="index.jsp?page1=login">
			<input type="button" value="LOG IN"></a>
		
		</c:if>
			</td>
	 	</tr>
	</table>
</form>
</body>
</html>