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
		//데이터 출력

		function PrinData(data) {
			
			$('#container').find("table br").not(":first").remove();
			
			$.each(data, function(){
				//console.log(this);
				$('#container').find("table tr:last").after(
				"<tr>"
				+"<td>"+this.seq+"</td>"
				+"<td>"+this.comment+"</td>"
				+"<td><button deq='" + this.seq+'">삭제</button></td>"
				+"</tr>"				
				);
			});
				$('#comment').val();
		}
		
		
		//데이터 추가
		
		$('#addBtn').on("click", function() {
			if9$.trim($('#comment').val()) == "")
			alert("댓글을 입력하시오");
		$('#comment').focus();
		return false;
			
		}
		
	
	
	
	)
		
		
		
		
	});
	
	
	
	
	
	</script>
</head>
<body>






</body>
</html>