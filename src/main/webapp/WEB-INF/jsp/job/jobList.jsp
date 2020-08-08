<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>진행중공고</title>
<script src="https://code.jquery.com/jquery.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">
body {
	background: #F9F9F9;
}
.sub_recruit {
	font-family: KakaoRegular,맑은 고딕,Malgun Gothic,Apple SD Gothic Neo,돋움,dotum,sans-serif;
}
.tab_job {
	padding: 0;
	margin-top: 70px;
	margin-bottom: 0;
	height: 70px;
	background-color: #444;
}
ul {
	list-style: none;
}
.tab_job li {
	display: inline-block;
	text-align: center;
	width: 25%;
	float: left;
}
.txt_tab {
	color: #FFF;
	font-size: 18px;
}
.emph_num {
    display: inline-block;
    height: 70px;
    line-height: 70px;
    font-size: 16px;
    color: #FFDC00;
}
.wrap_submenu {
    padding: 9px 10px;
    background-color: #444;
}
.dropdown {
    margin-right: 10px;
    display: inline-block;
}
.dropdown-toggle {
	color: #FFF;
}
.searchTag {
    margin: 0;
    padding: 18px 40px 18px;
    border-bottom: 1px solid #E1E1E1;
    background-color: #fff;
}
</style>
</head>
<body>
<header></header>
<section>
	<div class="container">
		<div class="row sub_recruit">
			<%-- 직무 선택 메뉴 --%>
			<ul class="tab_job">
				<li>
					<a href="#" class="link_job">
						<span class="txt_tab">테크</span>
						<span class ="emph_num">(개수)</span>
					</a>
				</li>
				<li>
					<a href="#" class="link_job">
						<span class="txt_tab">서비스비즈</span>
						<span class ="emph_num">(개수)</span>
					</a>
				</li>
				<li>
					<a href="#" class="link_job">
						<span class="txt_tab">디자인/브랜드</span>
						<span class ="emph_num">(개수)</span>
					</a>
				</li>
				<li>
					<a href="#" class="link_job">
						<span class="txt_tab">스태프</span>
						<span class ="emph_num">(개수)</span>
					</a>
				</li>
			</ul>
			<%-- 직무 선택 메뉴 끝 --%>
			<%-- 서브 메뉴 --%>
			<div class="wrap_submenu">
				<ul style="text-align: right;">
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">전체<span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
					   		<li><a href="#">전체</a></li>
					     	<li><a href="#">카카오</a></li>
					   		<li><a href="gallery.tak?menuName=gallery">관계사</a></li>
					     	<li><a href="#">관계사별 모아보기</a></li>
				  		</ul>
					</li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">전체 직원유형<span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
					   		<li><a href="#">전체 직원유형</a></li>
					     	<li><a href="#">정규직</a></li>
					   		<li><a href="#">계약직</a></li>
					     	<li><a href="#">인턴</a></li>
					     	<li><a href="#">어시스턴트</a></li>
				  		</ul>
					</li>
					<li class="dropdown">
						<input type="text" class="form-control" placeholder="검색어를 입력하세요." />
					</li>
					<li class="dropdown" style="vertical-align: top">
						<button type="button" class="btn btn-default">
							<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						</button>
					</li>
				</ul>
			</div>
			<%-- 서브 메뉴 끝 --%>
			<%-- 영입 직군 태그 --%>
			<div class="searchTag" style="height: 100px;">
			
			</div>
			<%-- 영입 직군 태그 끝--%>
		</div>
	</div>
</section>
<footer></footer>
</body>
</html>