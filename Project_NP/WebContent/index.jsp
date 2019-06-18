<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<jsp:include page="include.jsp" />
<style type="text/css">
    <%@include file="myStyle.css" %>
</style>

<title>Insert title here</title>
</head>
<body>

	<% 
	if (request.getAttribute("searchResult")!=null){
		out.print("Данные не найдены. Повторите вновь");		
	} 
	%>

	<form name="sendMobile" method="get" action="MobileController">
	  <p><b>Введите номер мобильного телефона</b>, начиная с нуля. Например: 0941234567 <br>
	   <input type="text" size="40", name="mobile">
	  </p>
	  <p><input type="submit" value="Ok">
 	</form>
 	
 	
	
</body>
</html>