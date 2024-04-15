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
.container { width:1400px; }
.page { clear:both; height:100vh; }
#page1 { background-color:#ececec; min-height:calc(100vh - 158px); }
#page2 { background-color:#ffffff; }
#page3 { background-color:#ececec; }
#page4 { background-color:#ffffff; }
.page_title { font-size:36px; padding-top:2em; text-align:center; }
th.item1 { width:8%; }
th.item2 { width:60%; }
th.item3 { width:20%; }
.loadmap { clear:both; }
.loadmap ul { list-style:none; padding:0; margin:0; clear:both; width:100%;
height:200px; }
.loadmap ul li { float:left; width:20%; padding:0px; margin:0px; }
.loadmap ul li .circle { clear:both; width:80px; height:80px; line-height:80px;
font-weight:700; background-color:#ff2965;
border-radius:45px; text-align:center; color:#fff; }
.loadmap ul li .his { padding:10px; }
</style>
</head>
<body>
<div id="header">
	<%@ include file="/header.jsp" %>
</div>
<div id="contents">
	<section class="page" id="page1">
		<div style="width:1400px;margin:15px auto">
			<nav aria-label="breadcrumb" style="text-align:right">
			  <ol class="breadcrumb">
			    <li class="breadcrumb-item"><a href="#">Home</a></li>
			    <li class="breadcrumb-item"><a href="#">지역소개</a></li>
			    <li class="breadcrumb-item active" aria-current="page">연혁</li>
			  </ol>
			</nav>
			<hr>
			<div id="tab1">
			<ul class="nav nav-tabs">
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/origin.jsp">지명유래</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/facility.jsp">지역 특징 및 시설안내</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link active" href="${path0 }/intro/history.jsp">연혁</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/map.jsp">오시는 길</a>
			  </li>
			</ul>
			</div>
			<hr>
			<h3 class="page_title">연혁</h3>
			<div class="jumbotron" style="padding:1rem;">
				<p>
					<span>경기도 부천군 부내면 대정리</span> <i class="fas fa-arrow-circle-right fa-fw"></i> 
					<span>경기도 인천부 부평동</span> <i class="fas fa-arrow-circle-right fa-fw"></i>
					<span>경기도 인천시 부평동</span> <i class="fas fa-arrow-circle-right fa-fw"></i>
					<span>경기도 인천시 북구 부평1동</span>  <i class="fas fa-arrow-circle-right fa-fw"></i>
					<span>인천직할시 북구 부평1동</span> <i class="fas fa-arrow-circle-right fa-fw"></i>
					<span>인천광역시 북구 부평1동</span> <i class="fas fa-arrow-circle-right fa-fw"></i>
					<span>인천광역시 부평구 부평1동</span> 
				</p>
			</div>
			<div class="loadmap">
				<ul>
					<li>
						<div class="his">본래 부평도호부 동소정면 대정리(大井里) 지역으로, 1914년에 부천군 부내면에 편입되었다.</div>
						<div class="circle">1914</div>
					</li>
					<li>
						<div class="his">인천부에 편입되어 소화정(昭和町)이라고 하였다. 1946년에 부평동으로 개칭하였다.</div>
						<div class="circle">1946</div>
					</li>
					<li>
						<div class="his">법률 제8호에 의거 인천시로 되고 부평·서곳지청을 출장소로 환원</div>
						<div class="circle">1948</div>
					</li>
					<li>
						<div class="his">법률 제1919호에 의거 부평·서곳출장소를 통합 →"북구"로 명명</div>
						<div class="circle">1968</div>
					</li>
					<li>
						<div class="his">법률 제3424호에 의거 인천직할시로 승격</div>
						<div class="circle">1981</div>
					</li>
				</ul>
			</div>
			<div class="loadmap">
				<ul>
					<li>
						<div class="his">법률 제4802호에 의거 인천광역시로 승격</div>
						<div class="circle">1995</div>
					</li>
					<li>
						<div class="his">북구에서 명칭이 바뀐 부평구에 편입되었다.</div>
						<div class="circle">1996</div>
					</li>
				</ul>
			</div>
		</div>	
	</section>
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>