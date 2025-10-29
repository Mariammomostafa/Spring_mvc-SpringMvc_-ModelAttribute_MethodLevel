
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!DOCTYPE html>
<html>
<body>
<h1>@ModelAttribut on the method ....</h1>
<hr>

<h3>WebSite Name :  <span style="color: red">${webInfo.websieName}</span>   </h3><br>

<h3> WebSite Category :  <span style="color: red">${webInfo.websiteCategory}</span>  </h3><br><br>

<a href="/com.selenium/test">Get Session Attribute in different controller</a><br><br>

<a href="/com.selenium/getSessionAttribute2">Get Session Attribute using @SessionAttribute</a><br><br>

<a href="/com.selenium/getSessionAttribute1">Get Session Attribute using Model</a><br><br>

<a href="/com.selenium/exception">Handle Exception</a>
</body>
</html>
