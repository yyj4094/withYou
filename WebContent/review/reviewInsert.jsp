<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
td,tr { padding:0px; margin:0px; }
</style>

</head>
<body>
<form name="listform" action="reviewInsertCtrl" method="post">
<table>

	<tr>
		<td align="center">
		<font size=2>제목</font>
		</td>
		<td style="height:10px;"><input type="text" name="r_title"></td>
	</tr>
	<tr>
		<td align="center">
		<font size=2>이름</font>
		</td>
		<td><input type="text" name="r_name"></td>
	</tr>
	<tr>
		<td align="center">
		<font size=2>내용</font>
		</td>
		<td width="346">
		<textarea name="r_contents" cols=50 rows=7></textarea>
		</td>
	</tr>
	<tr>
	<td>
	<p align="center"><input type="submit" value="등록">&nbsp;
	<input type="reset" value="다시쓰기"></p>
	</td>
	</tr>


</table>
</form>	

</body>
</html>