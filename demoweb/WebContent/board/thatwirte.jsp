<%@page import="com.demoweb.model.dao.BoardDao"%>
<%@page import="com.demoweb.model.dto.BoardComment"%>
<%@page import="com.demoweb.model.dto.Board"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    if (request.getMethod().toLowerCase().equals("post")) {
    	request.setCharacterEncoding("UTF-8");
    }  
    BoardComment co = new BoardComment();
 	co.setCommentNo(Integer.parseInt(request.getParameter("commentNo")));
 	co.setBoardNo(Integer.parseInt(request.getParameter("boardNo")));
 	co.setContent(request.getParameter("content"));
 	co.setWriter(request.getParameter("writer"));
 	
 	BoardDao dao = new BoardDao();
 	dao.insertComment(co);
    
    %>
 
    