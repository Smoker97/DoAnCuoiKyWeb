<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Quan Ly Cau Hoi</title>
<link rel="stylesheet" href="./css/Xemdiem1.css">
<link rel="stylesheet" href="./css/Xemdiem.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  
  <script src="./JS/jquery-3.2.1.js"></script>
  <script src="./JS/bootstrap.min.js"></script>
  <script src="./JS/cauhoi.js"></script>
  <script src="./JS/phantrang.js"></script>
  <script src="./JS/QuanLyCH.js"></script>

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
				</div>
				<br></br>
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
    
    <div class="col-lg-8">
            <div class="col-md-12">
                            <table class="table table-bordered  table-hover"  id="tablepaging">
                                    <thead>
                                            <th>Mã CH</th>
                                            <th>Nội dung Câu hỏi</th>
                                            <th>Mã Môn</th>
                                            <th>Chi Tiết</th>
                                            <th>Xóa</th>
                                        </thead>
                                        <c:forEach items="${listQuestion}" var="listQuestion"> 
                                        <tbody>
                                    		<tr >
	                                            <td>${listQuestion.QId}</td>
	                                            <td> ${listQuestion.QContent}</td>
	                    						<td>${listQuestion.EId}</td>
	                                            <td><a href="ChiTietCauHoi?QId=${listQuestion.QId}"  class="btn btn-primary a-btn-slide-text" id="btn-edit" style="background-color:rgb(83, 129, 204)">
                                                        <span class="glyphicon glyphicon-pencil" id="edit" aria-hidden="true"></span>
                                                                   
                                                </a></td>
	                                           
	                                            <td><a href="XoaCauHoi?QId=${listQuestion.QId}&EId=${listQuestion.EId}" class="btn btn-primary a-btn-slide-text" id="btn-delete" style="background-color:rgb(83, 129, 204)">
                                                   <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>        
                                                </a> </td>
                                        	</tr>  	
                                        </tbody>
                                        </c:forEach>
                                       
                            </table>
                            <div id="pageNavPosition" style="padding-top: 20px;margin-top: 50px;" align="center">
                        </div>
                    </div>
					<div class="col-md-3 cta-button">
	                          <button data-toggle="modal" data-target="#ThemCauHoi" href="" style="margin-top: 10px; margin-left: 0px;text-align: center;float:right" class="btn btn-primary a-btn-slide-text" >
                                     <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
                                     <span><strong>Thêm Câu Hỏi</strong></span>            
                              </button>  
	                    </div>
    </div>
    
    <form action="ThemCauHoi" method="post">
                <div class="modal fade" id="ThemCauHoi" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                  <div class="modal-dialog">
                    <div class="modal-content">
                      <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                        <h3 class="modal-title" id="myModalLabel"> Thêm câu hỏi</h3>
                      </div>
                       <h4 style="color: red;text-align: center;" class="cta-title">${messages }</h4>
                      <div class="modal-body">
                        <div class="form-group has-feedback">
                        	<input type="hidden" name="EId" value="${EId}" />
                          <h2 class="control-label">Nội dung:</h2>
                          <textarea type="text" name="QContent" class="form-control" id="ipusername" 
                          aria-describedby="inputSuccess2Status" placeholder="Câu hỏi ..." required autofocus></textarea>
                        </div> 
                        <button type="submit" id="btnXacNhan" class="btn btn-primary">Xác nhận</button><br/>       
                      </div>       
                    </div>
                  </div>
                </div>
              </form>
    
       

    <!-- Left and right controls -->
   
  </div>
  </div>
</div>


<script type="text/javascript">
        var pager = new Pager('tablepaging', 10);
        pager.init();
        pager.showPageNav('pager', 'pageNavPosition');
        pager.showPage(1);
        </script>

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
 </div>>
 </div>
</footer>

</body>
</html>