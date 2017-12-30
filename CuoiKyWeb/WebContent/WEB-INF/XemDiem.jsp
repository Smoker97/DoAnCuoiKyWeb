<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
    <title>Xem điểm</title>
    <<meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="./css/XemDiemhv.css">
 <link rel="stylesheet" type="text/css" href="css/reset.css">
	<link rel="stylesheet" type="text/css" href="css/main_responsive.css">
    <script type="text/javascript" src="JS/jquery.js"></script>
    <script type="text/javascript" src="JS/carouFredSel.js"></script>
    <script type="text/javascript" src="JS/main.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="./JS/AdminQuanLy.js"></script>
	<script src="./JS/XemDiem.js"></script>
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
                    <img class="card-bkimg" alt="" src="./img/phuc.jpg">
                    <!-- http://lorempixel.com/850/280/people/9/ -->
                </div>
                <div class="useravatar">
                    <img alt="Ảnh" id="img">
                </div>
                <div class="card-info"> <span class="card-title" id="Ten"></span>

                </div>
            </div>
            <!--/profile picture-->
            <!-- menuitem-->
            <ul class="nav nav-list accordion">
                <li class="nav-header">
                    <div class="link"><i class="fa fa-user-circle-o"></i><a href="${pageContext.request.contextPath}/ToThongTinCaNhan">Thông Tin Cá Nhân</a></div>
                    <ul class="submenu">
                    </ul>
                </li>

                <li class="nav-header">
                    <div class="link"><i class="fa fa-table" aria-hidden="true"></i><a href="${pageContext.request.contextPath}/ToLichThi">Lịch Thi</a></div>
                    <ul class="submenu">
                    </ul>
                </li>

                <li class="nav-header">
                    <div class="link" style="color: #FFB266;"><i class="fa fa-table" aria-hidden="true" style="color: #FFB266;"></i>Xem Điểm</div>
                    <ul class="submenu">
                    </ul>
                </li>
                <li class="nav-header">
                        <div class="link"><i class="fa fa-arrow-left" aria-hidden="true"></i><a href="DangNhapHocVien.html">Trở Về</a></div>
                        <ul class="submenu">
                        </ul>
                </li>
                <li class="nav-header">
                    <div class="link"><i class="fa fa-sign-out" aria-hidden="true"></i><a href="trangchu.html">Đăng Xuất</a></div>
                    <ul class="submenu">
                    </ul>
                </li>

            </ul>
            <!--/menuitem-->
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
                    <div class="col-sm-12">
                            <h2 style="text-align:center">BẢNG ĐIỂM</h2>
                            <div class="table-responsive">
                                <table class="table table-bordered table-hover table-striped">
                                    <thead>
                                        <tr class="success">
                                            <th>Đề thi</th>
                                            <th>Thời điểm làm bài</th>
                                            <th>Số câu đúng</th>
                                            <th>Điểm</th>
                                            <th>Kết quả</th>
                                        </tr>
                                    </thead>
                                    <tbody id="table-xem-diem">
                                        
                                    </tbody>
                                </table>
                            </div>
                        </div>
            </section>
        </div>

    </div>
</body>

</html>