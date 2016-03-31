<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
#container {background-color: white; margin:0 auto; padding: 0px;}
#board {background-color: #f5f5f5; width:660px; height:auto;}
#commentboard {background-color: #dcdad9; width:660px; height:auto;}
</style>
<script>
	function guestbookDelete(num){
		document.guestbookComment.action="./GuestbookDeleteCtrl?num="+num;
		document.guestbookComment.submit();
	}
</script>
</head>
<body>
<div id="container">
	<div id="board">
		<form action="GuestbookInsertCtrl" method="post">
			<table border="1" >
				<tr>
					<td>작성자</td>
					<td>${id }<input type="hidden" name="g_name" value="${id }"> </td>
					
<!-- 					<td>비밀번호</td>
					<td><input type="password" name=g_pw></td>	
 -->				</tr>
				
				<tr>
					<td>내용</td>
					<td colspan="4"><textarea name=g_contents rows="3" cols="45"></textarea></td>
				</tr>
				
				<tr>
					<td align="center" colspan="4"><input type="submit" value="Save" >
					<input type="reset" value="Reset"></td>
				</tr>
			</table>
		</form>
	</div>

	<div id="commentboard">
		<form name="guestbookComment" method="post">
			<table border="1" >
				<c:forEach var="dto" items="${list }">
					<tr>
						<td>작성자</td>
						<td>${dto.g_name}</td>
					</tr>
					<tr>
						<td>내용</td>
						<td>${dto.g_contents }</td>
						<td><a href="GuestbookDeleteCtrl?num=${dto.g_num }">
							삭제</a></td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</div>
</div>
</body>
</html>