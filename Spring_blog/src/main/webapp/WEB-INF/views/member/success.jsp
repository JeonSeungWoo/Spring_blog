<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그인 성공.</h1>
<h3>환영합니다. ${login.name }</h3>
<button type="button" id="logout">로그 아웃</button>

<script type="text/javascript">
//i8이하에서는 사용 불가.
document.addEventListener("DOMContentLoaded", function(){
	
	//로그 아웃
	 document.getElementById('logout').onclick = function() { 
		location.href = "/member/logout";
	 }

	 
});



</script>

</body>

</html>