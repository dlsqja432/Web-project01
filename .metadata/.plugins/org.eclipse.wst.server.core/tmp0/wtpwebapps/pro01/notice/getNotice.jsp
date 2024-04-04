<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path0" value="<%=request.getContextPath() %>" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${title }</title>
<%@ include file="/head.jsp" %>
<style>
.container {width:1400px; }
.page { clear:both; height:100vh; }
.page_title { font-size:36px; padding-top:2em; text-align:center; }
#page1 { background-color:#ececec }
th.item1 { width:5% }
th.item2 { width:60% }
th.item3 { width:20% }
</style>
</head>
<body>
<div id="header">
	<%@ include file="/header.jsp" %>
</div>
<div id="contents" class="container-fluid">
	<section class="page" id="page1">
		<div style="width:1400px; margin:0 auto">
			<h3 class="page_title">공지사항 상세보기</h3>
			<div>
				<table class="table">
					 <thead class="thead-dark">
					 	<tr>
					 		<th class="item1">번호</th>
					 		<th class="item2">제목</th>
					 		<th class="item3">작성일</th>
					 		<th class="item4">조회수</th>
					 	</tr>
					 </thead>
					 <tbody>
					 	<tr>
					 		<td>${noti.no }</td>
					 		<td>${noti.title }</td>
					 		<td>${noti.resdate }</td>
					 		<td>${noti.visited }</td>
					 	</tr>
					 	<tr>
					 		<th><label for="content">내용</label></th>
					 		<td colspan="3">${noti.content }</td>
					 	</tr>
					 </tbody>
				</table>
				<hr>
				<div class="btn-group">
 					<a href="${path0 }/notice/noti_ins.jsp" class="btn btn-secondary">글 등록</a>
 					<a href="${path0 }/EditNotice.do?no=${noti.no }" class="btn btn-secondary">글 수정</a>
 					<a href="${path0 }/DelNotice.do?no=${noti.no }" class="btn btn-secondary">글 삭제</a>
				</div>
			</div>
		</div>
	</section>
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>