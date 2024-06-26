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
#page1 { background-color:#ececec; height:calc(100vh - 158px); }
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
			<nav aria-label="breadcrumb" style="text-align:right">
			  <ol class="breadcrumb">
			    <li class="breadcrumb-item"><a href="#">Home</a></li>
			    <li class="breadcrumb-item"><a href="#">지역소개</a></li>
			    <li class="breadcrumb-item active" aria-current="page">지역 특징 및 시설안내</li>
			  </ol>
			</nav>
			<hr>
			<div id="tab1">
			<ul class="nav nav-tabs">
			  <li class="nav-item">
			    <a class="nav-link" href="${path0 }/intro/origin.jsp">지명유래</a>
			  </li>
			  <li class="nav-item">
			    <a class="nav-link active" href="${path0 }/intro/facility.jsp">지역 특징 및 시설안내</a>
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
			<h3 class="page_title">지역 특징 및 시설안내</h3>
			<div class="jumbotron">
				<p>
					인천광역시 부평구에 있는 동이다. 인천에서 유동인구가 가장 많은 곳이고, 부평역이 인천 1호선, 7호선,
					1호선과 연결되어 있어 인천 교통의 요지이다.<br>
					문화의 거리가 활성화되어 있고, 세계에서 가장 큰 지하상가인 부평역 지하상가가 있어 인천 문화의 중심지이다.
				</p>
				<p>	
					부평 문화의 거리는 인천 1호선이 지나는 부평대로서부터 시장로터리까지 250여 미터 길이의 거리를 말한다.<br>
					인천 최고의 길거리 공연장이 있는 문화의거리는 매 주말마다 청소년부터 중장년층까지 다양한 계층들이 참여하며 공연문화를 키워나가고 있다.<br>
					주변엔 수십년 전통의 손뜨개질 골목과 수입식료품, 인천 최대의 커텐 도매골목, 그리고 국내외 유명 의류브랜드들이 있어 다양하게 쇼핑이 가능하다.<br>
					핫하고 예쁜 카페와 식당이 밀집해있는 평리단길, 주말 프리마켓 등 여러가지 테마 행사가 있어 남녀노소 모두 즐길 수 있는 대형 상권이다.
				</p>
				<p>	
					작년 겨울부터 젊은 청년들이 독특한 아이디어와 감각으로 부평문화의거리의 부평시장역 방향 골목이 달라지기 시작했다. <br>
					서울의 '경리단길'에 빗대 '평리단길'이라고 불리게 되면서 지금의 평리단길이 유명해졌다.<br>
					연인이 데이트하기 좋은 예쁜 카페와 아늑하게 식사를 즐길 수 있는 자그마한 식당들 톡톡 튀는 개성을 갖춘 패션 편집샵들이 골목 곳곳을 채우며 평리단길을 이루고 있다.
				</p>
				<p>
					부평지하상가(모두몰)는 인천 부평에 위치한 대한민국 최대 지하도시이다. <br>
					점포 1,408개에 이르는 말 그대로 현대의 만물상이며, 일일 12만명의 유동인구가 찾는
					패션 잡화, 신발, 핸드폰, 화장품, 액세서리, 귀금속 등 그야말로 ‘없는 것 빼고 다 있는’ 인천의 대표적 명소이다.
				</p>
			</div>
			<div class="">
			</div>
		</div>	
	</section>
</div>
<div id="footer">
	<%@ include file="/footer.jsp" %>
</div>
</body>
</html>