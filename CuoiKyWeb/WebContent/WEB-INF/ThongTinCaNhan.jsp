<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <title>Thông tin cá nhân</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./CSSMau/components.css">
    <link rel="stylesheet" href="./font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="./css/ThongTinCaNhan.css">
    <link rel="stylesheet" type="text/css" href="css/reset.css">
	<link rel="stylesheet" type="text/css" href="css/main_responsive.css">
    <script type="text/javascript" src="JS/jquery.js"></script>
    <script type="text/javascript" src="JS/carouFredSel.js"></script>
    <script type="text/javascript" src="JS/main.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/JS/bootstrap.min.js"></script>
    <script src="./JS/AdminQuanLy.js"></script>
    <script src="./JS/ThongTinCaNhan.js"></script>
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
                    <img class="card-bkimg" alt="">
                    <!-- http://lorempixel.com/850/280/people/9/ -->
                </div>
                <div class="useravatar">
                    <img alt="Ảnh" id="img">
                </div>
                <div class="card-info"> <span class="card-title" id="Ten"></span>

                </div>
            </div>
            <input type="file" id="ChooseFile">
            <!--/profile picture-->
            <!-- menuitem-->
            <ul class="nav nav-list accordion">
                <li class="nav-header">
                    <div class="link" style="color: #FFB266;"><i class="fa fa-user-circle-o" style="color: #FFB266;"></i>Thông Tin Cá Nhân</div>
                    <ul class="submenu">
                    </ul>
                </li>

              

                <li class="nav-header">
                    <div class="link"><i class="fa fa-table" aria-hidden="true"></i><a href="${pageContext.request.contextPath}/ToXemDiem">Xem Điểm</a></div>
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
                <div class="ThongTinCaNhan">
                    <div class="col-md-12">
                            <div class="portlet light">
                                <div class="portlet-title tabbable-line">
                                    <div class="caption caption-md">
                                        <i class="icon-globe theme-font hide"></i>
                                        <span class="caption-subject font-blue-madison bold uppercase">Thông Tin Cá Nhân</span>
                                    </div>
                                    <ul class="nav nav-tabs">
                                        <li class="active">
                                            <a href="#tab_1_1" data-toggle="tab" aria-expanded="true">Thông tin</a>
                                        </li>
                                        <li class="">
                                            <a href="#tab_1_2" data-toggle="tab" aria-expanded="false">Đổi mật khẩu</a>
                                        </li>
                                    </ul>
                                </div>
                                <div class="portlet-body">
                                    <div class="tab-content">
                                        <!-- PERSONAL INFO TAB -->
                                        <div class="tab-pane active" id="tab_1_1">
                                            <form role="form" action="#">
                                                <div class="form-group">
                                                    <label class="control-label">Tên học viên</label>
                                                    <input type="text" id="tenHocVien" placeholder="Hiển thị tên học viên" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label">Số điện thoại</label>
                                                    <input type="text" id="soDienThoai" placeholder="Hiển thị số điện thoại" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label">Số chứng minh nhân dân</label>
                                                    <input type="text" id="soCMND" placeholder="Hiển thị số chứng minh nhân dân" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label">Ngày sinh</label>
                                                    <input type="date" id="ngaySinh" placeholder="Hiển thị ngày sinh" class="form-control">
                                                </div>
                                                <div class="margiv-top-10">
                                                    <a href="" class="btn green-haze" id="btn-Luu">
                                                    Lưu </a>
                                                    <a href="" class="btn default" id="btn-HuyLuu">
                                                    Hủy </a>
                                                </div>
                                            </form>
                                        </div>
                                        <!-- END PERSONAL INFO TAB -->
                                        <!-- CHANGE PASSWORD TAB -->
                                        <div class="tab-pane" id="tab_1_2">
                                            <form action="">
                                                <div class="form-group">
                                                    <label class="control-label">Mật khẩu hiện tại</label>
                                                    <input type="password" id="matKhauHienTai" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label">Mật khẩu mới</label>
                                                    <input type="password" id="matKhauMoi" class="form-control">
                                                </div>
                                                <div class="form-group">
                                                    <label class="control-label">Nhập lại mật khẩu mới</label>
                                                    <input type="password" id="matKhauMoi1" class="form-control">
                                                </div>
                                                <div class="margin-top-10">
                                                    <a href="" class="btn green-haze" id="btn-DoiMatKhau">
                                                    Đổi mật khẩu </a>
                                                    <a href="" class="btn default" id="btn-HuyDoiMatKhau">
                                                    Hủy </a>
                                                </div>
                                            </form>
                                        </div>
                                        <!-- END CHANGE PASSWORD TAB -->
                                    </div>
                                </div>
                            </div>
                        </div>
                </div>
            </section>
        </div>

    </div>
</body>

</html>