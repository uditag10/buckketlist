<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %> 
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to buckketlist</title>
<script src="/js/jquery-1.11.1.js"></script>
<script src="/js/login.js"></script>
<script type="text/javascript" src="${rootURL}resources/js/jquery-1.11.1.js"></script>
<script type="text/javascript" src="${rootURL}resources/js/login.js"></script>
</head>
<body background="${rootURL}resources/img/to-the-top-background.jpg">
<div id="welcomePageId">
<h1>welcome page</h1>
<center>
<div id="errorDiv"></div>
 username : <input type="text" name="un" id="username"/><br>		
		
 password : <input type="password" name="pw" id="pass"/><br>
			
			<input type="button" value="login" id="loginSubmit"><br>
Want join us<br>

 username : <input type="text" name="un" id="registerUsername"/><br>

 full name : <input type="text" name="un" id="fullname"/><br>	
 
 phone no : <input type="text" name="un" id="phone"/><br>	
		
 password : <input type="password" name="pw" id="registerPass"/><br>
			
			<input type="button" value="register me" id="registerSubmit">
</center>
</div>

<div id="userPageId">
<h1><div id="welcomeMsgId"></div></h1>

<br>
<br>
<br>

you still have to add your buckets
</div>


<input type="hidden" id="userIdHidden"/>
</body>
</html>