<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
A:link    { text-decoration:none;}
A:visited    { text-decoration:none;}
A:active    { text-decoration:none;}
A:hover    { text-decoration:none;}

</style>

<script>
	function guestbookDelete(num){
		document.guestbookComment.action="./GuestbookDeleteCtrl?num="+num;
		document.guestbookComment.submit();
	}
</script>
</head>
<body>
<p> &nbsp;</p>
		<form action="GuestbookInsertCtrl" method="post">
			<table border="1" cellpadding="0" cellspacing="0" align="center" width="650" >
				<tr>
					<td width="100px">작성자</td>
					<td>${id }<input type="hidden" name="g_name" value="${id }"> </td>
				</tr>
				
				<tr>
					<td>내용</td>
					<td colspan="4"><textarea name=g_contents rows="3" cols="65" style="resize:none;"></textarea></td>
				</tr>
				
				<tr>
					<td align="center" colspan="2"><input type="submit" value="Save" >
					<input type="reset" value="Reset"></td>
				</tr>
			</table>
		</form>

	<form name="guestbookComment" method="post">
			<table border="1" cellpadding="0" cellspacing="0" align="center" width="650" >
				<c:forEach var="dto" items="${list }">
					<tr>
						<td width="80px">작성자</td>
						<td colspan="2">&nbsp;${dto.g_name}</td>
					</tr>
					<tr>
						<td width="80px">내용</td>
						<td>&nbsp;${dto.g_contents }</td>
						<c:if test="${id.equals('admin') }">
						<td width="50px"><a href="GuestbookDeleteCtrl?num=${dto.g_num }">
						<input type="button" value="삭제"></a></td>
						</c:if>
					</tr>
				</c:forEach>
			</table>
		</form>
</body>
</html>