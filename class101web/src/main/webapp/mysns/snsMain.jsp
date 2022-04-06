<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    
<!DOCTYPE html>
<html>
<head>
<%@ include file="inc_header.html" %>
<meta charset="UTF-8">
<title>MySNS</title>
</head>
<body>
<div class="container shadow w-75 mx-auto mt-5 p-5">
	<h3 class="text-info"><i class="fas fa-cat"></i>MySNS :: Home </h3>
	<hr>
	<h5 class="text-secondary"> ▼새로운 소식!</h5>
	<form action="#" method="post">
		<div class="input-group">
			<button type="button" class="btn btn-outline-success">${param.username}</button>
			<input type="text" name="msg" class="form-control">
			<button type="submit" class="btn btn-warning" >Tweet</button>
		</div>
	</form>
	<hr>
	<div class="m-3">
		<a href="#"><span class="badge rounded-pill bg-success">새로고침</span></a>
		<a href="snsLogin.jsp"><span class="badge rounded-pill bg-secondary">로그아웃</span></a>
	</div>
	
	<div>
		<ul class="list-group">
			<li class="list-group-item list-group-item-action">첫번째 :: 가나다라마바사</li>
			<li class="list-group-item list-group-item-action">두번째 :: ABCDEFGHI</li>
			<li class="list-group-item list-group-item-action">세번째 :: 123456789</li>
			<li class="list-group-item list-group-item-action">네번째 :: 🐱‍🐉✔😃💖😍❤😂😊💋😘🤷‍♂️😜🐱♠</li>
			<li class="list-group-item list-group-item-action">다섯째 :: 빤롷햼뇽험ㄴ엮허ㅠ</li>
		</ul>
	</div>
</div>
</body>
</html>