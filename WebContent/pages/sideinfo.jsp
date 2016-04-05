<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>sideinfo 입니다</title>
</head>
<body>
	<c:if test="${id != null }">
	<a href="ProductListCtrl"> Product </a><br>
	<a href="ReviewListCtrl"> Review </a><br>
	<a href="GuestbookListCtrl"> Guestbook </a><br>
	</c:if>
</body>
</html>