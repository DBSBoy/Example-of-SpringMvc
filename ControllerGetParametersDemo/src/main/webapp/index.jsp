<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
%>
<!doctype html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>用户列表</title>
	<meta name="Keywords" content="">
	<meta name="Description" content="">
</head>
<body>
	<h1>用户信息</h1>
	<form action="<%=path%>/login" method="post">
		<%=path %>
		<h2>用户名称：<input type="text" name="username" /></h2>
		<h2>用户密码：<input type="password" name="password" /></h2>
		<h2>用户年龄：<input type="text" name="age" /></h2>
		<h2><input type="submit" value="保存"/></h2>
	</form>
</body>
</html>
