<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="com.bit.member.model.MemberDto"%>
<%
	String root = request.getContextPath();
%>

<%
	MemberDto memberDto = new MemberDto();

	memberDto.setId("qqqq");
	memberDto.setName("kim");
	memberDto.setEmail("oka684@naver.com");

	session.setAttribute("userInfo", memberDto);

	response.sendRedirect(request.getContextPath() + "/badmin/boardmenu.bit");
%>