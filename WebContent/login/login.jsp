<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login!!!</title>
<script type="text/javascript">
	function check(){
		if(log.j_id.value=="" || log.j_pwd.value==""){
			alert("Please type ID and PW");
			log.j_id.focus();
			return;
	}

</script>
</head>
<body>
<table>
	<tr>
		<td>
			<c:set var="id" value="${id }"/>
				<c:catch>
					<c:choose>
						<c:when test="${id==null }">		
							<form action="LoginCheckCtrl" method="post" name="log">
							아이디 : <input type="text" name="j_id"><br>
							비밀번호 : <input type="password" name="j_pw"><br>
							<input type="submit" value="확인">
							<input type="reset" value="취소">
							</form><br>
						</c:when>
					</c:choose>
				</c:catch>
		</td>
		<td>
			<a href="index.jsp?page1=join">회원가입</a>
<!-- 			<input type="button" value = "Join us" onClick="join()" >
 -->		</td>
	</tr>
</table>

</body>
</html>