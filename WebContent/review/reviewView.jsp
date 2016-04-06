<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
A:link    { text-decoration:none;}
A:visited    { text-decoration:none;}
A:active    { text-decoration:none;}
A:hover    { text-decoration:none;}
</style>

<script type="text/javascript">
	function reviewDetail(num){
		document.reviewform.action="./ReviewDetailCtrl?num="+num;
		document.reviewform.submit();
	}
</script>
</head>
<body>
<c:if test="${id.equals('admin') }">
<p align="right"><a href="index.jsp?page1=reviewInsert">글쓰기</a></p>
</c:if>
<form name="reviewform" method="post">
<table border="1" cellspacing="0" cellpadding="0" align="center" width="650">
<tr>
	<td>Number</td>
	<td>Title</td>
	<td>Name</td>
	<td>Date</td>
</tr>
<c:forEach var="dto" items="${list }">
<tr>
	<td>${dto.r_num}</td>
	<td><a href="javascript:reviewDetail(${dto.r_num });">${dto.r_title}</a></td>
	<td>${dto.r_name}</td>
	<td>${dto.r_date}</td>
</tr>
</c:forEach>

</table>
</form>
</body>
</html>