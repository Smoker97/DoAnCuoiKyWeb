<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
    <title>Làm bài thi</title>
     <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
    <meta name="author" content="pixelhint.com">
<meta name="description"
	content="Crafty is a stunning HTML5/CSS3 multi-purpose template, well-coded, commented code and easy to customize" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0" />
<link rel="stylesheet" type="text/css" href="css/reset.css">
<link rel="stylesheet" type="text/css" href="css/Login.css">
<link rel="stylesheet" type="text/css" href="css/main_responsive.css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/carouFredSel.js"></script>
<script type="text/javascript" src="js/main.js"></script>

</head>
<body>
	<div>
		<img src="img/2.jpg" alt="X" style="width: 100%; height: 300px;">
	</div>
	<header>

		<div class="wrapper">
			<img src="img/logo.png" alt="Crafty" class="logo"> <a href="#"
				class="menu_icon" id="menu_icon"></a>
			<nav id="nav_menu">
			<ul>
					<li><a href="TrangChuGuest_CT">TRANG CHỦ</a></li>
					<li><a href="login_CT">ĐĂNG NHẬP</a></li>
				</ul>	
			</nav>

			<ul class="social">
				<li><a class="fb" href="#"></a></li>
				<li><a class="twitter" href="#"></a></li>
				<li><a class="gplus" href="#"></a></li>
			</ul>
		</div>
	</header>
	<!--  End Header  -->

	<section class="billboard">
		<div class="wrapper">
				<div class="container">
					<div class="card card-container">
						<img id="profile-img" class="profile-img-card"
							src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
						<p id="profile-name" class="profile-name-card"></p>
						<p>${message}</p>
						<form class="form-signin" action="login" method="post">
							<span id="reauth-email" class="reauth-email"></span> <input
								type="text" id="username" name= "username"  class="form-control"
								placeholder="User name ..." style="height: 40px;" required autofocus> <input
								type="password" name="password" id="password" class="form-control"
								placeholder="Password" style="height: 40px;" required>
							<button class="btn btn-lg btn-primary btn-block btn-signin"
								type="submit">Sign in</button>
						</form>
						<!-- /form -->
					
					</div>
					<!-- /card-container -->
				</div>
				<!-- /container -->
			</div>
	</section>
	<!--  End Billboard  -->



	<footer>
		<img src="img/logo_footer.png" alt="Crafty">
		<p class="rights">
			Copyright © crafty - All rights reserved, Find more free templates at
			<a href="http://pixelhint.com">Pixelhint.com</a>
		</p>
	</footer>
	<!--  End Footer  -->

</body>
</html>