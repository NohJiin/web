<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: beige;
}
</style>
</head>
<body>
북마크 검색이 완료되었습니다.
<hr color="red">
id : ${bag.id} <br>
name : ${bag.name} <br>
url : ${bag.url} <br>
<img src="resources/img/${bag.img}" width="250px" height="100px"> <br>
</body>
</html>