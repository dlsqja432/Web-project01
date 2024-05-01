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
</style>
</head>
<body>
<div id="header">
	<%@ include file="/header.jsp" %>
</div>
<div id="contents" class="container-fluid">
	<section class="page" id="page1">
		<div style="width:1400px; margin:0 auto;">
			<nav aria-label="breadcrumb d-flex justify-content-between">
			  <ol class="breadcrumb">
			    <li class="breadcrumb-item"><a href="#">Home</a></li>
			    <li class="breadcrumb-item"><a href="#">자료실</a></li>
			    <li class="breadcrumb-item active" aria-current="page">자료 상세보기</li>
			  </ol>
			</nav>
		</div>
		<hr>
		<div style="width:1400px; margin:0 auto">
			<h3 class="page_title">공지사항 상세보기</h3>
			<div>
				<table class="table">
					 <tbody>
					 	<tr>
					 		<th>글 번호</th>
					 		<td>${data.no }</td>
					 	</tr>
					 	<tr>
					 		<th>글 제목</th>
					 		<td>${data.title }</td>
					 	</tr>
					 	<tr>
					 		<th>글 내용</th>
					 		<td>${data.content }</td>
					 	</tr>
					 	<tr>
					 		<th>자료 내용</th>
					 		<td>${data.datafile }</td>
					 	</tr>
					 	<tr>
					 		<th>작성일시</th>
					 		<td>${data.resdate }</td>
					 	</tr>
					 	<tr>
					 		<th>조회수</th>
					 		<td>${data.visited }</td>
					 	</tr>
					 </tbody>
				</table>
				<hr>
				<div class="btn-group">
				<c:if test="${sid.equals('admin') }">
 					<a href="${path0 }/data/data_ins.jsp" class="btn btn-secondary">자료 등록</a>
 					<a href="${path0 }/EditData.do?no=${data.no }" class="btn btn-secondary">자료 수정</a>
 					<a href="${path0 }/DelData.do?no=${data.no }" class="btn btn-danger">자료 삭제</a>
 				</c:if>
 				<a href="${path0 }/DataList.do" class="btn btn-secondary">자료 목록</a>
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