<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <!-- Bootstrap core CSS-->
  <!-- <link href="/static/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet"> -->
  
 <!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<!-- jquery -->
<script type="text/javascript" src="http://code.jquery.com/jquery-3.3.1.js"></script> 

  <script type="text/javascript">
  $( document ).ready(function() {
	    //alert("test");
	});

  </script>
  
</head>
<body>
	<!--상단  -->
	<div style="width:100%; height:100px;">
		<div style="float:left; background-color:gray; width:200px; height:50px;"></div>
		<button type="button" class="btn btn-default navbar-btn" style="float:right; margin-right:10px;">home</button>
		<button type="button" class="btn btn-default navbar-btn" style="float:right; margin-right:10px;">sign in</button>
	</div>
	<!-- 메뉴바 -->
	<ul class="nav nav-tabs">
	
	  <li role="presentation" class="active"><a id="home" href="/fixtures/index">HOME</a></li>
	  <li role="presentation"><a id="itemManage" href="/fixtures/itemManage">비품관리</a></li>
	  <li role="presentation"><a id="hallManage" href="#">거래처</a></li>
	  <li role="presentation"><a id="outItem" href="#">츨고관리</a></li>
	  <li role="presentation"><a id="inItem" href="#">입고관리</a></li>
	  <li role="presentation"><a id="throwAway" href="#">폐기</a></li>
	  <li role="presentation"><a id="schedule" href="#">일정</a></li>
	  <li role="presentation"><a id="state" href="#">결산</a></li>
	</ul>
</body>
</html>