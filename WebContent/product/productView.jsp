<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>P_View</title>
</head>
<body>

<a href="index.jsp?page1=productInsert">글쓰기</a>	
	<form>
		<table border="1" cellspacing="0" cellpadding="0" align="center" width="650">
				<% int cnt=0; %>
				<tr>
					<c:forEach var="dto" items="${list1}">
						<td>
							<table>
								<tr>
									<td>photo</td>
								</tr>
								<tr>
									<td><a href="ProductDetailCtrl?num=${dto.p_num }">${dto.p_name }</a><br>${dto.p_contents }</td>	
								</tr>
							</table>
						</td>
						<% cnt++; %>
						<% if(cnt%3==0){%></tr><tr><%} %>
					</c:forEach>
				</tr>	
			</table>
	</form>
</body>
</html>


			
