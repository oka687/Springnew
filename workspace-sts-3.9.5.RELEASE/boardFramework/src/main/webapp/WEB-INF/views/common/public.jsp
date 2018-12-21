<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:set var ="root" value="${pageContext.request.contextPath}"/>
	<c:set var = "bcode" value="${param.bcode }"/>
	<c:set var = "pg" value="${param.pg }"/>
	<c:set var = "key" value="${param.key }"/>
	<c:set var = "word" value="${param.word }"/>
	
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="ko">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src=text/javascript" src="${root}/resources/js/board.js" }></script>

<head>
<title>게시판</title>
 
 <body>
 
 <form id="commonForm" method="get" action="">
 	<input type="hidden" id=" name="bcode" value="${param.bcode }" >
 	<input type="hidden" id=" name="pg" value= "${param.pg}">
 	<input type="hidden" id=" name="key" value= "${param.key }">
 	<input type="hidden" id=" name="word" value= "${param.word }">
 	<input type="hidden" id=" name="seq" value= "${param.seq }">
 	
 	
 </form>
 
 </body>