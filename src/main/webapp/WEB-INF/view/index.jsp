
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html>
<body>
<h1>@ModelAttribut on the method ....</h1>
<hr>

<h3>WebSite Name : </h3> ${webInfo.websieName} <br><br>

<h3> WebSite Category : </h3> ${webInfo.websiteCategory} <br><br>

<a href="/com.selenium/test">Test</a><br><br>

<a href="/com.selenium/test2">Test 2</a>

</body>
</html>
