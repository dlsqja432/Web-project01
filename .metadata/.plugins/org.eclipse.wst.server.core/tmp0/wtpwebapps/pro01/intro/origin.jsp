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
.page { clear:both; min-height:100vh; margin:0; padding:0; }
#page1 { background-color:#ececec; min-height:calc(100vh - 158px); }
#page2 { background-color:#ffffff; }
#page3 { background-color:#ececec; }
#page4 { background-color:#ffffff; }
.page_title { font-size:36px; padding-top:2em; text-align:center; }
th.item1 { width:8%; }
th.item2 { width:60%; }
th.item3 { width:20%; }
</style>
</head>
<body>
<div id="header">
	<%@ include file="/header.jsp" %>
</div>
<div id="contents">
	<section class="page" id="page1">
		<div style="width:1400px;margin:15px auto">
			<nav aria-label="breadcrumb d-flex justify-content-between">
			  <ol class="breadcrumb">
			    <li class="breadcrumb-item"><a href="#">Home</a></li>
			    <li class="breadcrumb-item"><a href="#">지역소개</a></li>
			    <li class="breadcrumb-item active" aria-current="page">지명유래</li>
			  </ol>
			</nav>
			<hr>
			<div id="tab1">
			<ul class="nav nav-tabs">
			  <li class="nav-item">
			    <a class="nav-link active" href="${path0 }/intro/origin.jsp">지명유래</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/facility.jsp">지역 특징 및 시설안내</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/history.jsp">연혁</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/map.jsp">오시는 길</a>
			  </li>
			</ul>
			</div>
			<hr>
			<h3 class="page_title">지명 유래</h3>
			<div class="jumbotron">
				<p>
					<strong style="font-size: 24px;">부평동</strong>은 부평군 부내면 소속의 '대정리'였는데 1940년에 제2차 부역 확장으로 인천부에 편입되어
					'소화정'으로 되었다가 해방 후 부평동으로 개칭되었다.<br><br>
					일정 때는 일본군 병기 제조를 하는 곳이었고, 한국전쟁 때는 미군이 주둔하여 이 지대를 에스캄이라
					호칭했으며 주변을 신촌이라 부르게 되었다.<br><br>
					부평동은 부평 지구에서 도시 계획을 가장 먼저 실시한 지역으로 시장, 상가가 집결된 상업의 요지로서
					와 또 구청이 소재한 동으로 그 중심 역할을 하고 있다. 부평의 '장고개'는 주변의 고개 중에서
					가장 얕은 고개로 장끝말에 20여호가 살았는데, 왜정 말기 부평조병창 확장 공사로 철거되고 해방
					후에는 미군이 주둔하고 또 한국군이 들어서서 일반인의 통행이 금지되어 개발이 뒤쳐지고 있다.<br><br>
					부평역 일대를 부평군 시절 '동소정면'이었다는 데서 유래되어 '동소정이'가 어음변화로 둥수재이가
					되었다. 동소정이라는 이름이 붙은 것은 지금의 한일은행 부근에 직경 5m가 넘는 물량이 많은 큰 우물
					이 있어 부근의 사람들이 모두 이 큰 우물 물을 먹고 산다 해서 '같은 우물을 먹는 곳' 즉 '동소정면'
					이라 했다. 이 지역은 부평구의 유일한 상업지역의 중심지이다.
				</p>
			</div>
			<br>
		</div>	
	</section>
	<section class="page" id="page1">
		<div style="width:1400px;margin:15px auto">
			<h3 class="page_title">행정구역 및 인구 현황</h3>
			<div class="">
				<br>
				<table class="table">
					<thead>
						<tr>
							<th>행정동</th><th>인구</th><th>세대수</th>
							<th>면적</th><th>인구밀도</th><th>법정동</th>
							<th>통수</th><th>반수</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>부평1동</td><td>36.572명</td><td>12,691세대</td>
							<td>1.07㎢</td><td>34,200명/km2</td><td>부평동</td>
							<td>34</td><td>242</td>
						</tr>
						<tr>
							<td>부평2동</td><td>14.911명</td><td>9,276세대</td>
							<td>2.28㎢</td><td>6,540명/km2</td><td>부평동</td>
							<td>27</td><td>172</td>
						</tr>
						<tr>
							<td>부평3동</td><td>12.686명</td><td>6,949세대</td>
							<td>1.00㎢</td><td>12,700명/km2</td><td>부평동</td>
							<td>22</td><td>133</td>
						</tr>
						<tr>
							<td>부평4동</td><td>36.572명</td><td>11,434세대</td>
							<td>1.07㎢</td><td>34,200명/km2</td><td>부평동</td>
							<td>33</td><td>230</td>
						</tr>
						<tr>
							<td>부평5동</td><td>31.764명</td><td>10,743세대</td>
							<td>0.89㎢</td><td>36,000명/km2</td><td>부평동</td>
							<td>31</td><td>208</td>
						</tr>
						<tr>
							<td>부평6동</td><td>14.951명</td><td>6,226세대</td>
							<td>0.80㎢</td><td>19,000명/km2</td><td>부평동</td>
							<td>21</td><td>135</td>
						</tr>
					</tbody>
				</table>
				<br><hr><br>
			</div>
			<figure class="map_data">
				<img src="${path0 }/images/bupyeongMap.png" class="rounded mx-auto d-block" alt="부평동 지도">
			</figure>
		</div>
	</section>
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>