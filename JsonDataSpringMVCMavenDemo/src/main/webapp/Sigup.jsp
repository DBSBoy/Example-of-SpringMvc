<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%
String path = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <script src="js/jquery-3.3.1.min.js"></script>
       
</head>
<body>
<div align="center" style="background-color: gray;">
	<h2 style="color: yellow">注册页面</h2><br>
	<form action="<%=path%>/up/logup" method="post" style="color:yellow;">
		
		<h2>用户名称：<input type="text" name="name" /></h2>
		<h2>用户密码：<input type="password" name="password" /></h2>
		<h2>用户年龄：<input type="text" name="age" /></h2>
		<h2>用户电话：<input type="text" name="phone" /></h2>
		
		<h2><input type="submit" value="保存"/></h2>
	</form>
</div>
</body>
</html>