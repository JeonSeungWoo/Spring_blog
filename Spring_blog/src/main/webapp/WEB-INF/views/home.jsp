<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>Hello </h1>
<a href="/member/loginForm">로그인 페이지</a>

<input type="text" id="test">
<button type="button" id="btn">btn</button>

<P>  The time on the server is ${serverTime}. </P>

</body>
</html>
