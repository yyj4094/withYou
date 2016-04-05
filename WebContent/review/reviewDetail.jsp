<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="0" align="center" width="500">
		<tr>
			<td>제목</td><td>${dto.r_title}</td>
		</tr>
		<tr>
			<td>작성자</td><td>${dto.r_name}</td>
		</tr>
		<tr>
			<td>내용</td><td>${dto.r_contents}</td>
		</tr>
		<tr>
			<td colspan="2">
			<a href="ReviewEditCtrl?num=${dto.r_num}">수정</a>&nbsp;&nbsp;
			<a href="ReviewDeleteCtrl?num=${dto.r_num}">삭제</a>
			</td>
		</tr>
	</table>
</body>
</html>