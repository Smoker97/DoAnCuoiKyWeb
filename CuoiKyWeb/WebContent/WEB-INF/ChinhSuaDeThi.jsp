<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Quan Ly De Thi</title>
<link rel="stylesheet" href="./css/Xemdiem1.css">
<link rel="stylesheet" href="./css/Xemdiem.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="./JS/jquery-3.2.1.js"></script>
  <script src="./JS/bootstrap.min.js"></script>
  <script src="./JS/SuaMaDe.js"></script>

</head> 

<style>
.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    padding: 12px 16px;
    z-index: 1;
}

.dropdown:hover .dropdown-content {
    display: block;
}
</style>

<body style="background-color:white;">
<div>
	<div class="row">
        <div class="col-lg-2"></div>
        <div class="col-lg-8">
            <img src="hinh/2.jpg" alt="X" style="width:100%;">
        </div>
        <div class="col-lg-2"></div>
	</div>
</div>
<div class="topnav">
	<a href="ChuyenTrangXemDeThi">QUẢN LÝ ĐỀ THI</a>
	<a href="TrangChuGuest_CT">ĐĂNG XUẤT</a>
    <input type="text" name="firstname" value="Tìm kiếm" style="margin-right:80px; margin-top:12px; width: 200px; float:right" >
    <a href="javascript:void(0);" class="icon" onclick="myFunction()">&#9776;</a>
<div class="clear"></div>
</div>

<br>
<div class="row " style="margin-left: 0px;margin-right: 5px;" class="container">
	<div class="col-md-3 ">
        <div style="margin-left:10px;">
                <ul style="list-style-type:none">
                <div class="dropdown">
                <span><button  style="width:200px;height:50px;color:white">Câu Hỏi Theo Môn Học</button></span>
				  <div class="dropdown-content">
				    <li><a href="LoadCauHoi?EId=1"><button  style="width:200px;height:50px;color:white"> Lập trình Web</button></a></li>
				    <li><a href="LoadCauHoi?EId=2"><button  style="width:200px;height:50px;color:white"> CNPM </button></a></li>
			        <li><a href="LoadCauHoi?EId=3"><button  style="width:200px;height:50px;color:white"> DBMS </button></a></li>
				  </div>
				  <br></br>
				</div>
				<div class="dropdown">
                <span><button  style="width:200px;height:50px;color:white"> Đề Thi</button></span>
				  <div class="dropdown-content">
				    <li><a href="ChuyenTrangXemDeThi"><button  style="width:200px;height:50px;color:white"> Danh Sách Đề Thi</button></a></li>
				    <li><a href="ChuyenTrangThemDeThi"><button  style="width:200px;height:50px;color:white"> Thêm Đề Thi </button></a></li>
				  </div>
				</div>
				<br></br>
				<div class="dropdown">
                <span><button  style="width:200px;height:50px;color:white"> Lịch Thi</button></span>
				  <div class="dropdown-content">
				    <li><a href="ChuyenTrangXemLichThi"><button  style="width:200px;height:50px;color:white"> Danh Sách Lịch Thi</button></a></li>
				    <li><a href="ChuyenTrangThemLichThi"><button  style="width:200px;height:50px;color:white"> Thêm Lịch Thi </button></a></li>
				  </div>
				</div>
                </ul>
            </div>
    </div>

	<div class="col-md-8">
		<div class="col-md-12" style="margin-bottom: 50px">
			<div class="page-content">
				<div class="row margin-top-20">
					<div class="col-md-12">

						<div class="profile-content">
							<div class="row">
								<div class="col-md-12">
									<div class="portlet light">
										<div class="portlet-title tabbable-line">
											<div class="caption caption-md">
												<i class="icon-globe theme-font hide"></i> <span
													class="caption-subject font-blue-madison bold uppercase">Chỉnh sửa đề thi
													</span>
											</div>

										</div>
										<div class="portlet-body">
											<div class="tab-content">
												<div class="tab-pane active" id="tab_1_1">
													<form role="form" action="#">
														<div class="form-group">
															<label class="control-label">Tên mã đề</label> <input
																type="text" id="TenDeThi" name="TenDeThi" placeholder=""
																class="form-control">
														</div>
														<div id="LoaiCauHoi"></div>
														<div class="form-group">
															<label class="control-label">Thời gian làm bài</label> <input
																type="text" id="ThoiGian" name="ThoiGian" placeholder=""
																class="form-control">
														</div>
														<div class="margiv-top-10">
															<a href="" id="btnXacNhan" name="btnXacNhan"
																class="btn btn-primary a-btn-slide-text" style="background-color:rgb(83, 129, 204)"> Xác Nhận </a> <a href=""
																id="btnHuy" name="btnHuy" class="btn btn-primary a-btn-slide-text" style="background-color:rgb(83, 129, 204)"> Hủy </a>
														</div>
													</form>
												</div>

											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
    </div>
</div>
    


<footer style="background-color: #111111;color: White; margin-top: 150px; width: 100%;">
<div class="row">
<div style=" margin-top: 15px;">
<div class="col-lg-8" style="boder-right: 1px solid white;">Mọi cố gắn và nỗi lực sẽ 
    giúp chúng ta phát triển những kĩ năng cần thiết cho thành quả trong tương lại,
    học tập mỗi ngày trên LEARN FOR YOURSELF</div>
<div class="col-lg-4">
  <p>ĐỊA CHỈ MAIL:</p>
  <p>FACEBOOK:</p>
  <p>SĐT:</p>
 </div>
 </div>
 </div>
</footer>

</body>
</html>