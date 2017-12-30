$(document).ready(function() {
	
	 var uId = null;
	    var uName= null;
	    var fullName = null;
	    var pass = null;
	    var birth = null;
	    var CMND = null;
	    var tel= null;
	   var uid;
	    $("#btn-tra-cuu-nguoi-dung").click(function(e) {
	    	uid = $("#UId-Search").val();
	        $.ajax({
	            type: 'POST',
	            data: { UId: uid },
	            url: 'TimUserTheoMa',
	            success: function(ketqua) {
	                $("#table-thong-tin-nguoi-dung").html(ketqua);

	                $("#table-thong-tin-nguoi-dung tr").on('click', function() {
	                    $("#table-thong-tin-nguoi-dung tr").css("background-color", "white");
	                    $(this).closest("tr").css("background-color", "#F2F2F2");
	                    uId = $(this).closest("tr").find("td:eq(0)").text();
	                    uName= $(this).closest("tr").find("td:eq(1)").text();
	                    fullName = $(this).closest("tr").find("td:eq(2)").text();
	                    pass = $(this).closest("tr").find("td:eq(3)").text();
	                    birth = $(this).closest("tr").find("td:eq(4)").text();
	                    CMND= $(this).closest("tr").find("td:eq(5)").text();
	                    tel= $(this).closest("tr").find("td:eq(6)").text();

	                    $("#UId").val(uId);
	                    $("#UName").val(uName);
	                    $("#FullName").val(fullName);
	                    $("#Pass").val(pass);
	                    $("#Birth").val(birth);
	                    $("#CMND").val(CMND);
	                    $("#Tel").val(tel);
	                });
	            }
	        });
	    });

	
	    $("#btn-chinh-sua").mousedown(function() {
	        
	        var fullName = $("#FullName").val();
	        var pass = $("#Pass").val();
	        var birth = $("#Birth").val();
	        var CMND = $("#CMND").val();
	        var tel = $("#Tel").val();
	        $.ajax({
	            type: 'POST',
	            data: {
	               
	                FullName: fullName,
	                Pass: pass,
	                Birth: birth,
	                CMND: CMND,
	                Tel:tel
	            },
	            url: 'CapNhapThongTinUser',
	            success: function(ketqua) {
	                if (ketqua == 1)
	                    $("#message").html("Bạn phải nhập đầy đủ thông tin người dùng ...");
	                
	                if (ketqua != 1) {
	            			alert('CẬP NHẬT THÔNG TIN CÁ NHÂN THÀNH CÔNG !!!');
	            			$("#Ten").text($("#tenHocVien").val());
	            		
	                }
	            }
	        });
	    });
});
