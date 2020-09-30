<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring 4 MVC -HelloWorld</title>
</head>
<body>
	<h1>使用spring mvc上传文件</h1>
    <form action="upload" method="post" enctype="multipart/form-data">
    	choose file to upload<input type="file" name="myFile"/>
    	<input type="submit"/>
    </form>
</body>
</html>