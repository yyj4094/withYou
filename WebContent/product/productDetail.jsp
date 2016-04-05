<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>P_Detail!!!</title>
</head>
<body>
	<table border="1" align="center">
			<tr>
				<td colspan="4" width="400px" height="400px">사진자리!!</td>			
			</tr>
			
			<tr>
				<td>Title</td>
				<td>${dto.p_name }</td>
				<td>Price</td>
				<td>${dto.p_price }</td>
			</tr>
			
			<tr>
				<td rowspan="3">Contents</td>
				<td rowspan="3">${dto.p_contents }</td>
				<td>Quantity</td>
				<td>${dto.p_quantity }</td>
			</tr>
			
			<tr>
				<td>Color</td>
				<td>${dto.p_color }</td>
			</tr>
			
			<tr>
				<td colspan="2"><a href="ProductEditCtrl?num=${dto.p_num }"}>Edit</a>&nbsp;&nbsp;
				<a href="ProductDeleteCtrl?num=${dto.p_num }"> Delete</a></td>
			</tr>
			
		</table>


</body>
</html>