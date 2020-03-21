<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>

<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	<title>singUp</title>
 <style>
   
 	#container {
      width: 300px;
      margin: auto;
    }
    .input-div {
      width: 310px;
      height: 40px;
      padding: 10px;
    }
    .box {
      height: 40px;
      float: left;
      border: 1px solid #bbbbbb;
      display: flex;
      justify-content: center;
      align-items: center;
    }
    .input-field {
      width: 40px;
      border-right: none;
    }
    
    input {
      border: none;
      width: 260px;
      height: 38px;
      font-size: 16px;
      padding-left: 5px;
    }
    .btn1{
    padding: 10px;
    width: 306PX;
    border-radius: 10px;
    margin-bottom: 5px;
    color: white;
    background: black;
    }
  </style>
</head>

<body>
 <div id="container">
    <form id="form" method="post" action="/">
    
	    <div class="input-div">
	      <div class="input-field box"><span style="color: #bbbbbb"><i class="fa fa-camera fa-spin"></i> </span> </div>
	      <div class="box">
	       <input type="text" name="key" class="key" id="key" placeholder="아이디">
	      </div>
	      
	    </div>
	    <button type="button" id="checkId">Id체크</button><span id="idCk"></span>
	    <div class="input-div">
	        <div class="input-field box"> <span></span> </div>
	        <div class="box" style=" width: 223px; border-right: none;"> <input type="password" name="pw" id="pw" placeholder="패스워스"></div>
	        <div class="box" style="width: 40px;"> </div>
	    </div>
	    
	    
	    
	    <div class="input-div">
	      <div class="input-field box"> <span></span></div>
	      <div class="box"> <input type="text" name="eamail" id="eamail" placeholder="이메일"></div>
	    </div>
	    
	   
	   <div class="buttonDiv">
			     <button type="button" class="btn1" id="signUpBtn">가입</button>
	   </div>
	</form>

  </div>
  
  <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
  <script type="text/javascript">

  $(document).ready(function() {
  	//form 정보 가져오기.
  	var form = $("#form");
  	//id check 초기 설정.
  	var checkedId = false;
  	
  	 $("#checkId").on("click",function(){
  		    var key = $("#key").val();
  		    alert(key);
  			$.ajax({
  				type : "POST",
  				url : "/member/checkKey",
  				data : {"key" :  key},
  				success : function(data){
  					if($.trim(data) == 0){
  						$("#idCk").html('<b style ="font-size:18xp; color:blue">사용가능</b>');
  						checkedId = true;
  					}else{
  						$("#idCk").html('<b style ="font-size:18xp; color:red">사용불가</b>');
  						checkedId = false;
  					}
  				}
  			});
  			 return false;
  		 });
  	
  	
  	//회원가입 
  	 $("#signUpBtn").on("click",function(){
  		var key = $("#key").val();
  	  	var nickname = $("#nickname").val();
  	  	var pw = $("#pw").val();
  	  	var name = $("#name").val();
  	  	var email =$("#email").val();
  	  	var phoneNumber = $("#phoneNumber").val();
  	  	var birthday = $("#birthday").val();
  	  	var gender = $("#gender").val();
  		    if (key == "" || key == null ) {
  			   alert("아이디를 넣어주세요.");
  			   $("#key").focus();
  			}else if(nickname == "" || nickname == null ){
  				alert("별명를 넣어주세요.");
  			}else if(pw == "" || pw == null ){
  				alert("비밀번호를 넣어주세요.");
  			}else if(name == "" || name == null ){
  				alert("이름를 넣어주세요.");
  			}else if(email == "" || email == null ){
  				alert("이메일를 넣어주세요.");
  			}else if(phoneNumber == "" || phoneNumber == null ){
  				alert("휴대폰를 넣어주세요.");
  			}else if(birthday == "" || birthday == null ){
  				alert("새일를 넣어주세요.");
  			}else if(gender == "" || gender == null ){
  				alert("성별를 넣어주세요.");
  			}else if(checkedId == false){
  				alert("아이디를 체크를 확인해 주세요!!!!");
  			}else{
  				form.attr("method","POST").attr("action","/member/mainSignUp").submit();
  			}
  	 });
  	
  });
  
  </script>
  </body>
  </html>
 