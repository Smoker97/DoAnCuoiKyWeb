<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <title>Cập Nhập Thông Tin Người Dùng</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./CSSMau/components.css">
    <link rel="stylesheet" href="./font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="./css/ThongTinCaNhan.css">
    <link rel="stylesheet" href="./css/header-menu-footer.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link rel="stylesheet" href="./bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    
    
   
</head>

<body>
    <div class="wrap">
        <nav class="nav-bar navbar-inverse" role="navigation">
            <div id="top-menu" class="container-fluid active">
                <a class="navbar-brand" href="#"><span class="highlight">PLD </span> Trung Tâm Thi OnLine</a>
            </div>
        </nav>
        <aside id="side-menu" class="aside" role="navigation">
         
            <!-- menuitem-->
            <ul class="nav nav-list accordion">
                <li class="nav-header">
                    <div class="link" style="color: #FFB266;"><i class="fa fa-user-circle-o" style="color: #FFB266;"></i>Quản Lý</div>
                    <ul class="submenu">
                    </ul>
                </li>
                
                <li class="dropdown"><a class="dropdown-toggle"
                style=" cursor: pointer;
    			display: block;
    			padding: 15px 15px 15px 42px;
    			color: #9D9D9D;
    			font-size: 14px;
    			font-weight: 700;
    			border-bottom: 1px solid #303030;
   			 	position: relative;" data-toggle="dropdown" href="#">Quản Lý Người Dùng<span class="caret"></span></a>
        			<ul class="dropdown-menu" style="width: 275px;background: #e4e0dc;font-size: 15px;border-bottom: 1px solid #303030;" >
          				<li><a href="${pageContext.request.contextPath}/TrangThemUser">Thêm Người Dùng</a></li>
          				<li><a href="${pageContext.request.contextPath}/TrangXoaUser">Xóa Người Dùng</a></li>
         			 	<li><a href="${pageContext.request.contextPath}/TrangCapNhapThongTinUser">Cập Nhập Người Dùng</a></li>
        			</ul>
     			</li>
				<li class="dropdown"><a class="dropdown-toggle"  style=" cursor: pointer;
    			display: block;
    			padding: 15px 15px 15px 42px;
    			color: #9D9D9D;
    			font-size: 14px;
    			font-weight: 700;
    			border-bottom: 1px solid #303030;
   			 	position: relative;"  data-toggle="dropdown" href="#">Quản Lý Lớp Học<span class="caret"></span></a>
        			<ul class="dropdown-menu" style="width: 275px;background: #e4e0dc;font-size: 15px;border-bottom: 1px solid #303030;" >
          				<li><a href="${pageContext.request.contextPath}/TrangThemLopHoc">Thêm Lớp Học</a></li>
          				<li><a href="${pageContext.request.contextPath}/TrangXoaLopHoc">Xóa Lớp Học</a></li>
         			 	<li><a href="${pageContext.request.contextPath}/TrangCapNhapThongTinClass">Cập Nhập Lớp Học</a></li>
        			</ul>
     			</li>
                
                
                <li class="nav-header">
                        <div class="link"><i class="fa fa-arrow-left" aria-hidden="true"></i><a href="${pageContext.request.contextPath}/TrangCapNhapThongTinUser">Cập nhật thông tin Admin</a></div>
                        <ul class="submenu">
                        </ul>
                </li>
                <li class="nav-header">
                    <div class="link"><i class="fa fa-sign-out" aria-hidden="true"></i><a href="TrangChuGuest_CT">Đăng Xuất</a></div>
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
                         
                <form>
			        <div class="noi-dung">
				    	<!-- Nhập thông tin nhân viên -->
				    	<div class="nhap-thong-tin-nhan-vien">
				    	<br>
				    	
				    	<div class="row">
            <div class="col-xs-12 col-md-6">
                <form>
                    <div class="input-group search">
                        <input type="text" class="form-control" size="50" placeholder="Mã Người Dùng" id="UId-Search" name="UId-Search">
                        <div class="input-group-btn">
                            <button id="btn-tra-cuu-nguoi-dung" class="btn btn-default" type="button" style="background-color: #0d875c; color:white">
                                Tìm <i class="glyphicon glyphicon-search"></i>
                            </button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
        <br>   	
			        	<!-- Thông tin người dùng -->
			        	<div class="table-line">
				        	<fieldset>
				           	 	<p style="font-weight: bold; text-decoration: underline">Thông tin người dùng: </p>
				            	<div class="table-responsive">
				                	<table class="table">
				                  	 	<thead>
				                       	 <tr>
				                           <th>Mã Người Dùng</th>
				                           	<th>Tên Tài Khoản</th>
				                          	<th>Họ và Tên</th>
				                          	<th>Mật Khẩu</th>
				                          	<th>Ngày Sinh</th>
				                          	<th>Số CMND</th>
				                          	<th>SDT</th>
				                          	
				                      	  </tr>
				                  	  	</thead>
				                 	   <tbody id="table-thong-tin-nguoi-dung">
				                 	   </tbody>
				              	  </table>
				          	  </div>
				        	</fieldset>
				        </div>  
				        
				        <div class="sua-thong-tin-dich-vu">
            <label style="text-decoration:underline; color:#0d875c;">SỬA THÔNG TIN NGƯỜI DÙNG	:</label>
            <form class="form-horizontal">
                <div class="form-group">
                	<label class="control-label col-xs-12 col-sm-4 col-md-2">Mã người dùng:</label>
                    <div class="col-xs-12 col-sm-8 col-md-4">
                        <input type="text" id="UId" class="form-control" size="30" disabled="disabled">
                    </div>
                    <label class="control-label col-xs-12 col-sm-4 col-md-2">Tên tài khoản:</label>
                    <div class="col-xs-12 col-sm-8 col-md-4">
                        <input type="text" id="UName" class="form-control" size="30" disabled="disabled">
                    </div>
                </div>
                <div class="form-group">
                     <label class="control-label col-xs-12 col-sm-4 col-md-2">Họ và Tên:</label>
                    <div class="col-xs-12 col-sm-8 col-md-4">
                        <input type="text" id="FullName" class="form-control" size="30" placeholder="Nhập họ tên">
                    </div>
                    <label class="control-label col-xs-12 col-sm-4 col-md-2">Mật Khẩu:</label>
                    <div class="col-xs-12 col-sm-8 col-md-4">
                        <input type="text" id="Pass" class="form-control" size="30" placeholder="Nhập password">
                    </div> 
                </div>
                <div class="form-group">
                     <label class="control-label col-xs-12 col-sm-4 col-md-2">Ngày Sinh:</label>
                    <div class="col-xs-12 col-sm-8 col-md-4">
                        <input type="text" id="Birth" class="form-control" size="30" placeholder="Nhập ngày sinh">
                    </div>
                    <label class="control-label col-xs-12 col-sm-4 col-md-2">Số CMND:</label>
                    <div class="col-xs-12 col-sm-8 col-md-4">
                        <input type="text" id="CMND" class="form-control" size="30" placeholder="Nhập chứng minh nhân dân">
                    </div> 
                </div>
                <div class="form-group">
                <label class="control-label col-xs-12 col-sm-4 col-md-2">Số SDT:</label>
                    <div class="col-xs-12 col-sm-8 col-md-4">
                        <input type="text" id="Tel" class="form-control" size="30" placeholder="Nhập số điện thoại">
                    </div> 
                </div>
                
            </form>
            <h2 id="message" style="color: red;"></h2>
            <div class="input-group-btn" style="text-align: right">
              	<button id="btn-chinh-sua" class="btn btn-default" type="button" style="background-color: #0d875c; color:white; width:150px; ">
                   	Chỉnh sửa <i class="glyphicon glyphicon-pencil"></i>
                </button>
           	 </div>
        	</div>	   
				                                       
			        </div>
        		</form>
        	</div>
                </div>                      
            
            </section>
      </div>
       <script src="./JS/CapNhapThongTinUser.js"></script>

</body>

</html>