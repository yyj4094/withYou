<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	function reviewDelete(num){
		document.reviewComment.action="./reviewCommentDeleteCtrl?num="+num;
		document.reviewComment.submit();
	}
</script>
<style type="text/css">
#comment {background-color:0; height:100px;}
</style>
</head>
<body>
<form>
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
</form>
<form action="reviewCommentInsertCtrl?num=${dto.r_num}" method="post">
	<table>
		<tr>
			<td>작성자</td>
			<td>${id }<input type="hidden" name=rc_name value="${id }"> </td>	
		</tr>
		
		<tr>
			<td>내용</td>
			<td colspan="4"><textarea name=rc_contents rows="1" cols="45"></textarea></td>
		</tr>
		
		<tr>
			<td align="center" colspan="4"><input type="submit" value="Save" >
			<input type="reset" value="Reset"></td>
		</tr>
	</table>
</form>

<form name="reviewComment" method="post">
	<table border="1" >
		<c:forEach var="i"  begin="1" end="${list.size() }"> //list.size
			<tr>
				<td>작성자</td>
				<td>${list[i-1].rc_name}</td>
				<td>${list.size() }</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>${list[i-1].rc_contents }</td>
				<td><a href="reviewCommentDeleteCtrl?num=${list[i-1].rc_num }&r_num=${dto.r_num}">
					삭제</a></td>
			</tr>
		</c:forEach>
	</table>
</form>
</body>
</html>






<%-- <form name="reviewComment" action = "ReviewDetailCtrl" method="post">
	<table border="1" >
		<c:forEach var="Cdto" items="${list }">
			<tr>
				<td>작성자</td>
				<td>${dto.rc_name}</td>
			</tr>
			<tr>
				<td>내용</td>
				<td>${dto.rc_contents }</td>
				<td><a href="reviewCommentDeleteCtrl?num=${dto.rc_num }">
					삭제</a></td>
			</tr>
			<tr>
			<td align="center" colspan="4"><input type="submit" value="Save" ></td>
			</tr>
		</c:forEach>
	</table>
	
	
	
</form> --%>
</body>
</html>