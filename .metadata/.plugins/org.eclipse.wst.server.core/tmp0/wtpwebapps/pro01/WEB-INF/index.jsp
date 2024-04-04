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
#page2 { background-color:#fbffc4 }
#page3 { background-color:#f9d6ff }
#page4 { background-color:#d6f5ff }
</style>
</head>
<body>
<div id="header">
	<%@ include file="/header.jsp" %>
</div>
<div id="contents" class="container-fluid">
	<h2>콘텐츠 영역</h2>
	<section class="page" id="page1">
		<div style="width:1400px; margin:0 auto">
			<h3 class="page_title">제작자 : ${author }</h3>
		</div>
	</section>
	<section class="page" id="page2">
		<div style="width:1400px; margin:0 auto;">
			<h3 class="page_title">임시 서버 애플리케이션 디텍토리 : ${realPath }</h3>
			<h3>main프로젝트 디렉토리 : ${path0 }</h3>
			<h3>head 프로젝트 디렉토리 : ${ipath }</h3>
			<h3>header 프로젝트 디렉토리 : ${hpath }</h3>
			<hr>
		</div>
	</section>
	<section class="page" id="page3">
		<div style="width:1400px; margin:0 auto;">
			<h3 class="page_title">임시 제목</h3>
			<h3>main프로젝트 디렉토리 : ${path0 }</h3>
			<h3>head 프로젝트 디렉토리 : ${ipath }</h3>
			<h3>header 프로젝트 디렉토리 : ${hpath }</h3>
			<hr>
		</div>
	</section>
	<section class="page" id="page4">
		<div style="width:1400px; margin:0 auto;">
			<h3 class="page_title">임시 제목</h3>
			<h3>main프로젝트 디렉토리 : ${path0 }</h3>
			<h3>head 프로젝트 디렉토리 : ${ipath }</h3>
			<h3>header 프로젝트 디렉토리 : ${hpath }</h3>
			<hr>
		</div>
	</section>
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>