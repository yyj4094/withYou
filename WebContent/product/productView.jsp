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
		<table bother="1" align="center">
		
<%-- 		<c:set var="dto" value=list1/>
		${dto.p_title }
 --%>			
			<!-- foreach -->
			<c:forEach var="dto" items="${list1 }" begin="1" end="3" step="1">
				<tr>
					<td>${dto.p_name }</td>	
 				</tr>
 				
 				<tr>
 					<td>${dto.p_contents }</td>
 				</tr>
			</c:forEach>
			<!-- foreach end -->
		</table>
	</form>
		
</body>
</html>