<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Join!!!</title>
<script type="text/javascript">
	function joinCheck(){
		join.submit();
	}
	function gobac22k(){
		alert("dd");
	}
</script>
</head>
<body>
	<form action="JoinCheckCtrl" method="post" name="join">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="j_id"></td>			
			</tr>	
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="j_pw"></td>			
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="j_name"></td>			
			</tr>
			<tr>
				<td>전화번호</td>
				<td>
					<input type="text" name="j_num1">-
					<input type="text" name="j_num2">-
					<input type="text" name="j_num3">
				</td>			
			</tr>
			<tr>
				<td>E-mail</td>
				<td><input type="text" name="j_mail"></td>			
			</tr>
			<tr>
				<td>주소</td>
				<td><input type="text" name="j_addr"></td>			
			</tr>
			
			<tr>
				<td><input type="button" value="확인" onCilck="joinCheck()">
				<a href="index.jsp?page1="><input type="button" value="취소"></a></td>
			</tr>			
		</table>
	</form>
</body>
</html>