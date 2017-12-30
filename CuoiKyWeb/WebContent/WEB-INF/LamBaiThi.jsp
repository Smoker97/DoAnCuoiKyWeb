<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
    <title>Làm bài thi</title>
     <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
    <link rel="stylesheet" href="./css/bootstrap.min.css">

    <link rel="stylesheet" href="./css/ThongTinCaNhan.css">
    <link rel="stylesheet" href="./CSSMau/LamBaiThi.css">
    <link rel="stylesheet" type="text/css" href="css/reset.css">
	<link rel="stylesheet" type="text/css" href="css/main_responsive.css">
    <script type="text/javascript" src="JS/jquery.js"></script>
    <script type="text/javascript" src="JS/carouFredSel.js"></script>
    <script type="text/javascript" src="JS/main.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="./JS/AdminQuanLy.js"></script>
    <script type="text/javascript" src="./JS/jquery.bootpag.js"></script>
    <script type="text/javascript" src="./JS/LamBaiThi.js"></script>

</head>

<body>
<div><img src="img/2.jpg" alt="X" style="width: 100%; height: 300px;"> </div>
	<header>
	
		<div class="wrapper">
			<img src="img/logo.png" alt="Crafty" class="logo">
			<a href="#" class="menu_icon" id="menu_icon"></a>
			<nav id="nav_menu">
			<ul>
					<li><a href="TrangChu_CT">TRANG CHỦ</a></li>
					<li><a href="${pageContext.request.contextPath}/ToLichThi">LỊCH THI</a></li>
					<li><a href="${pageContext.request.contextPath}/ToThongTinCaNhan">TÀI KHOẢN</a></li>
					<li><a href="TrangChuGuest_CT">ĐĂNG XUẤT</a></li>
				</ul>
			</nav>

			<ul class="social">
				<li><a class="fb" href="#"></a></li>
				<li><a class="twitter" href="#"></a></li>
				<li><a class="gplus" href="#"></a></li>
			</ul>
		</div>
	</header><!--  End Header  -->
    <div class="wrap">
        <nav class="nav-bar navbar-inverse" role="navigation">
        </nav>
        <aside id="side-menu" class="aside" role="navigation">
            <!--profile picture-->
            <div class="card hovercard">
                <div class="card-background">
                    <img class="card-bkimg" alt="" src="">
                    <!-- http://lorempixel.com/850/280/people/9/ -->
                </div>
                <div class="useravatar">
                    <img alt="" src="" id="img">
                </div>
                <div class="card-info"> <span class="card-title" id="Ten"></span>

                </div>
            </div>
            <!--/profile picture-->
            <!-- Đồng hồ -->
            <div class="DongHo" id="DongHo">
                <span id="hours"></span>
                <span>:</span>
                <span id="min"></span>
                <span>:</span>
                <span id="sec"></span>
            </div>
            <br>
            <div class="input-group-btn" style="text-align: center">
                    <button id="btn-nop-bai" class="btn btn-default" type="button" style="background-color: #3A9C95; color:white; width:150px; ">
                            Nộp bài <i class="glyphicon glyphicon-list-alt"></i>
                    </button>
                   </div>
        </aside>


        <!--Body content-->
        <div class="content">
            <div class="top-bar">
                <a href="#menu" class="side-menu-link burger"> 
                      <span class='burger_inside' id='bgrOne'></span>
                      <span class='burger_inside' id='bgrTwo'></span>
                      <span class='burger_inside' id='bgrThree'></span>
                    </a>
            </div>
            <section class="content-inner">
            	<div id="page-selection_top" style="text-align: center;"></div>
                <div id="content" style="height: 650px; width: 100%;"></div>
  				<div id="page-selection_bot" style="text-align: center;"></div>
  				<a href="${pageContext.request.contextPath}/ToXemDiem" class="btn green-haze" id="Xem" style="display: none;">Xem Kết Quả</a>
            </section>
        </div>

    </div>
</body>

</html>