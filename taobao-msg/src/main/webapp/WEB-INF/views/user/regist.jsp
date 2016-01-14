<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
	<form:form modelAttribute="user" method="post" action="/user/regist">     
		name:<form:input path="name"/><br />
		passwd:<form:password path="password"/><br />
		age:<form:input path="age"/>   <br />
		favorite:
		<form:checkbox path="fav" value="睡觉" />睡觉<br />
        <form:checkbox path="fav" value="运动" />运动<br />
        sex:
        <form:select path="sex">
        	<form:option value="男">男</form:option>
        	<form:option value="女">女</form:option>
        </form:select>
        <input type="submit" value="Submit" />
	</form:form>
</body>
</html>