<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IndexPage</title>
<style type="text/css">
#container {background-color: #0f0f0f; width: 960px; margin:0 auto; padding:10px;}
#header {background-color: #908866; height:100px;}
#content {background-color: #f5f5f5; float:left; width:660px; height:400px;}
#sideinfo {background-color: #dcdad9; float:right; width:300px; height:400px;}
#footer {background-color: #555555; clear:both; height:100px}
</style>
</head>

<c:catch>
	<c:choose>
		<c:when test="${param.page==null || param.page=='' }">
		<c:set var="pageFile" value="/pages/header.jsp"></c:set></c:when>
		<c:when test="${param.page.equals('welcome') }">
		<c:set var="pageFile" value="/pages/header.jsp"></c:set></c:when>
		<c:when test="${param.page.equals('loginfail') }">
		<c:set var="pageFile" value="/pages/header.jsp"></c:set></c:when>
	</c:choose>
</c:catch>
<c:catch>
	<c:choose>
		<c:when test="${param.page1==null || param.page1=='' }">
		<c:set var="pageFile1" value="/pages/content.jsp"></c:set></c:when>
	<%-- 	<c:when test="${param.page1.equals('join') }">
		<c:set var="pageFile1" value="join.jsp"></c:set></c:when>
		<c:when test="${param.page1.equals('adminboard') }">
		<c:set var="pageFile1" value="admin/adminboard.jsp"></c:set></c:when>
		<c:when test="${param.page1.equals('adminInsert') }">
		<c:set var="pageFile1" value="admin/adminInsert.jsp"></c:set></c:when>
		<c:when test="${param.page1.equals('adminDetail') }">
		<c:set var="pageFile1" value="admin/adminDetail.jsp"></c:set></c:when>
		<c:when test="${param.page1.equals('adminEdit') }">
		<c:set var="pageFile1" value="admin/adminEdit.jsp"></c:set></c:when> --%>
	</c:choose>
</c:catch>
<body>
	<div id="container">
		<div id="header"><jsp:include page="${pageFile }"/></div>
		<div id="content"><jsp:include page="${pageFile1 }"/></div>
		<div id="sideinfo"><jsp:include page="/pages/sideinfo.jsp"/></div>
		<div id="footer"><jsp:include page="/pages/footer.jsp"/></div>
	</div>
</body>
</html>