<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>P_insert</title>
</head>
<body>
	<form action="ProductInsertCtrl" method="post">
		<table border="1" align="center">
			<tr>
				<td colspan="4" width="400px" height="400px">사진자리!!</td>			
			</tr>
			
			<tr>
				<td>Title</td>
				<td><input type="text" name="p_title"></td>
				<td>Price</td>
				<td><input type="text" name="p_price"></td>
			</tr>
			
			<tr>
				<td rowspan="3">Contents</td>
				<td rowspan="3"><textarea name="p_contents" rows="4" cols="20"></textarea></td>
				<td>Quantity</td>
				<td><input type="text" name="p_quantity"></td>
			</tr>
			
			<tr>
				<td>Color</td>
				<td><select name="p_color">
				    <option selected="selected">--select--</option>	
					<option value="red">red</option>
					<option value="orange">orange</option>					
					<option value="yellow">yellow</option>
					<option value="green">green</option>
					<option value="blue">blue</option>
					<option value="navy">navy</option>
					<option value="purple">purple</option>
				</select></td>
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Save"></a> 
				<input type="reset" value="Reset"></td>
			</tr>
			
		</table>
	</form>
</body>
</html>