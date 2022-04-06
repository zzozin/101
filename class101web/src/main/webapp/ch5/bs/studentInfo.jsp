<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 정보</title>
</head>
   <body>
  
    <h2>학생 검색 결과</h2>
    <hr>
    <ul>
	    <li>학번: ${student.id}</li>
	    <li>이름: ${student.name}</li>
	    <li>학과: ${student.dept}</li>
    </ul>                   
    </body>
</html>