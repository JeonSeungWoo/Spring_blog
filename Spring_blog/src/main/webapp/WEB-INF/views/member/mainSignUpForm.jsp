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
  </style>
</head>

<body>
 <div id="container">
    <form id="form" method="post" action="/">
	    <div class="input-div">
	      <div class="input-field box">
	        <span></span>
	      </div>
	      <div class="box">
	       <input type="text" name="key" class="key" id="key" placeholder="아이디">
	      </div>
	    </div>
	    
	    <div class="input-div">
	        <div class="input-field box"> <span></span> </div>
	        <div class="box" style=" width: 223px; border-right: none;"> <input type="password" name="pw" id="pw" placeholder="패스워스"></div>
	        <div class="box" style="width: 40px;"> </div>
	    </div>
	    
	   
	</form>

  </div>
  
  </body>
  </html>
 