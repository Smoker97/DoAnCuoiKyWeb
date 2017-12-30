<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <title>Thêm Lớp Học</title>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge,chrome=1">
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./CSSMau/components.css">
    <link rel="stylesheet" href="./font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="./css/ThongTinCaNhan.css">
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
			            <label style="text-decoration:underline; color:#0d875c;">NHẬP THÔNG TIN LỚP HỌC	:</label>
			           
			            <form class="form-horizontal">
			                <div class="form-group">
			                <label class="control-label col-xs-12 col-sm-4 col-md-2">Mã Lớp Học:</label>
			                    <div class="col-xs-12 col-sm-8 col-md-4">
			                        <input type="text" id="CId" class="form-control" size="30" placeholder="Nhập mã lớp học">
			                    </div>
			                     <label class="control-label col-xs-12 col-sm-4 col-md-2">Tên Lớp Học:</label>
			                    <div class="col-xs-12 col-sm-8 col-md-4">
			                        <input type="text" id="CName" class="form-control" size="30" placeholder="Nhập tên lớp học ">
			                    </div>			                      
			                </div>
			                
			            </form>
			            <div class="input-group-btn" style="text-align: right">
			              	<button id="btn-xac-nhan-thong-tin-lop-hoc" class="btn btn-default" type="button" style="background-color: #0d875c; color:white; width:150px;margin-right: 15px;">
			                   	Xác nhận <i class="glyphicon glyphicon-ok"></i>
			                </button>
			           	 </div>
			        	</div>	   
			        	
			        	<h2 id="message" style="color: red;"></h2>
			        	
			        	<hr/>
			        	
			        	<!-- Thông tin lớp học -->
			        	<div class="table-line">
				        	<fieldset>
				           	 	<p style="font-weight: bold; text-decoration: underline">Thông tin lớp học: </p>
				            	<div class="table-responsive">
				                	<table class="table">
				                  	 	<thead>
				                       	 <tr>
				                           
				                           	<th>Mã Lớp Học</th>
				                          	<th>Tên Lớp Học</th>
				                          	
				                          	
				                      	  </tr>
				                  	  	</thead>
				                 	   <tbody id="table-thong-tin-lop-hoc">
				                 	   </tbody>
				              	  </table>
				          	  </div>
				        	</fieldset>
				        </div>  
				        
				        <!-- Nút thêm tất cả các dịch vụ trong bảng vào csdl -->
				        <br/>
				        <div class="input-group-btn" style="text-align: right">
			                <button id="btn-them-vao-csdl" class="btn btn-default" type="button" style="background-color: #0d875c; color:white; width:150px; ">
				   				 Thêm lớp học <i class="glyphicon glyphicon-plus"></i>
			                </button>
			           	</div>                                   
			        </div>
        		</form>
        	</div>
                </div>                      
            
            </section>
      </div>
       <script src="./JS/ThemClass.js"></script>

</body>

</html>