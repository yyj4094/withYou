<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Join!!!</title>
<style>
a:link {
    text-decoration: none;
}

a:visited {
    text-decoration: none;
}

a:hover {
    text-decoration: none;
}

a:active {
    text-decoration: none;
}

</style>
</head>
<body>
	<br><br>
	<form action="JoinCheckCtrl" method="post" name="join">
		<table border="0" cellspacing="0" cellpadding="0" align="center" width="450" >
			
			<tr>
				<td colspan="2"> <p align="center">*가 있는 내용은 필수 입력 사항입니다.</p></td>
			</tr>
			<tr>
				<td>아이디 (*)</td>
				<td><input type="text" name="j_id"></td>			
			</tr>	
			<tr>
				<td>비밀번호 (*)</td>
				<td><input type="password" name="j_pw"></td>			
			</tr>
			<tr>
				<td>이름 (*)</td>
				<td><input type="text" name="j_name"></td>			
			</tr>
			<tr>
				<td>전화번호 (*)</td>
				<td>
					<input type="text" name="j_num1" size="1">-
					<input type="text" name="j_num2" size="2">-
					<input type="text" name="j_num3" size="2">
				</td>			
			</tr>
			<tr>
				<td>E-mail (*)</td>
				<td><input type="text" name="j_mail"></td>			
			</tr>
			<tr>
				<td>주소 (*)</td>
				<td><input type="text" name="j_addr" size="25"></td>			
			</tr>
			
			<tr>
				<td colspan="2" align="center">
				<input type ="submit" value = "가입" >
			<!-- 	<input type="button" value="가입" onCilck="joinCheck()"> -->
				<a href="index.jsp?page1=cancel"><input type="button" value="취소"></a></td>
			</tr>			
		</table>
	</form>
</body>
</html>