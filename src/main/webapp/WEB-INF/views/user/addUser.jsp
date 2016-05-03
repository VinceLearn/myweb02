<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
<script type="text/javascript">
	function addUser() {
		var form = document.forms[0];
		form.action = "/myweb02/user/addUser";
		form.method = "post";
		form.submit();
	}
</script>
</head>
<body>
	<h1>添加用户</h1>
	<form action="" name="userForm">
		用户名：<input type="text" name="username"><br> 
		密码：<input type="text" name="password"><br> 
		姓名：<input type="text" name="name"><br> 
		性别：<input type="radio" name="sex" value="0" checked="checked">男
		<input type="radio" name="sex" value="1">女<br>
		邮箱：<input type="text" name="email"><br>
		<input type="button" value="添加" onclick="addUser()">
	</form>
</body>
</html>
