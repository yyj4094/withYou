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
<form>
	<table>
		<tr>
			<td>이름</td>
			<td><input type="text" name=g_name></td>
			<td>비밀번호</td>
			<td><input type="password" name=g_pw></td>	
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="3"><textarea rows="3" cols="50" name=q_contents></textarea></td>
		</tr>
		
		<tr>
		<td><a href=GuestbookListCtrl><input type="button" value="Save" ></a>
		<input type="reset" value="Reset"></td>
		</tr>
	</table>
	
	
</form>
</body>
</html>