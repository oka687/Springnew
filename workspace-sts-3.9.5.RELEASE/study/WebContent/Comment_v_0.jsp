<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="org.zerock.ajax.CommentDAO"%>
<%@ page import="org.zerock.ajax.CommentVO"%>
<%@ page import="java.util.List"%>

<%
//글번호
	int bbsSeq = 1;
	CommentDAO dao = CommentDAO.getInstance();
	List<CommentVO> commentlist = dao.getCommentList(bbsSeq);

 %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CommentLIST</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
	$(function () {
		$('#addbtn').on("click",function(){
		if($.trim($('#comment').val()) == ""){
			alert("댓글을 입력하시오");
			$('#comment').focus();
			return false;

		}		
		
		var data = "bbsSeq=<%=bbsSeq%>";
		data += "&comment=" + $.trim($('#comment').val())
		var data2 = {
			bbsSeq : "<%=bbsSeq%>" ,
			comment : $.trim($('#comment').val())
			
		};
		
		$.ajax(
			{
				url : "CommentAdd_v_0.jsp" ,
				dataType : "HTML" ,
				async : true ,
				type : "POST" ,
				success : function(htmldata)
				{
					$('#container').html(htmldata);
					$('#comment').val("");
	
				}
				
			}		
			
		);

		});
	});

</script>
	
	</head>

	<body>

<table width = "700px" border "1">

<tr>
	<th width = "200px">번호</th>
	<td><%=bbsSeq%></td>
</tr>
<tr>
	<th width = "200px">제목</th>
	<td>제이쿼리 개갞기 해봐</td>
	</tr>
<tr>
	<th width = "200px">내용</th>
	<td>당황하지 않고 제이쿼리 보면 좆같아요...</td>
	</tr>

</table>
<br>
<!--덧글 입력-->
<div>

	<input type = "text" name="comment" id="comment" style="width:"600px;" placeholder="댓글입력">
	<button id="addBtn">덧글등록</button>
	<br>
	<div id="container">
		<table border = "1">
		<tr>
			<td>순번</td>
			<td>내용</td>
			<td>삭제</td>
		</tr>
		<%
			for(int k = 0; k < commentlist.size(); k++){
				CommentVO vo = commentlist.get(k);
				%>
					<tr>
					<td><%=vo.getSeq() %></td>
					<td><%= vo.getComment()%></td>
				</tr>
				
				<% 
				
				
			}
		%>

		</table>

	</div>
</div>

</body>
</html>