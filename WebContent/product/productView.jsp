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
		<table border="1" align="center">
				<tr>
				<%int count=0; %>
				<%for(int i=0;i<10;i++){ %> 
					<td>
						<table border ="1">
						<tr>
							<td>photo</td>
						</tr>
						</table>
					</td>
					<%count++; %>
					<%if(count % 3==0){ %>
					</tr><tr>
					<%} %>	
					<%} %>
					</tr>
		</table>
		
</body>
</html>