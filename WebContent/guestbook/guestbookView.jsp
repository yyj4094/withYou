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
<form action="GuestbookInsert Ctrl">
	<table>
		<tr>
			<td>작성자</td>
			<td><input type="text" name=g_name></td>
			<td>비밀번호</td>
			<td><input type="password" name=g_pw></td>	
		</tr>
		<tr>
			<td>내용</td>
			<td colspan="3"><textarea rows="3" cols="50" name=q_contents></textarea></td>
		</tr>
		
		<tr>
		<td><input type="button" value="Save" >
		<input type="reset" value="Reset"></td>
		</tr>
	</table>
	<br><br><br>
	
	<!--foreach 이용해서 db에 있는 모든 데이터 가져와서 보여줘야 함.  -->
	<table border="1">
		<tr>
			<td>작성자</td>
			<td>hello</td>
		</tr>
		<tr>
			<td>내용</td>
			<td>contents</td>
			<td><!-- <a href=guestbookDeleteCtrl?>  ? 뒤에 low넘버 보낼수 있게 수정.-->
				<!-- </a> -->삭제</td>
		</tr>
	</table>
</form>
</body>
</html>