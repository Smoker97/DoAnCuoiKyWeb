$(document).ready(function() {
	 var cId = null;
	 var cName= null;   
	 var cid;
	    $("#btn-tra-cuu-lop-hoc").click(function(e) {
	    	cid = $("#CId-Search").val();
	        $.ajax({
	            type: 'POST',
	            data: { CId: cid },
	            url: 'TimClassTheoMa',
	            success: function(ketqua) {
	                $("#table-thong-tin-lop-hoc").html(ketqua);

	                $("#table-thong-tin-lop-hoc tr").on('click', function() {
	                    $("#table-thong-tin-lop-hoc tr").css("background-color", "white");
	                    $(this).closest("tr").css("background-color", "#F2F2F2");
	                    cId = $(this).closest("tr").find("td:eq(0)").text();
	                    cName= $(this).closest("tr").find("td:eq(1)").text();
	                    $("#CId").val(cId);
	                    $("#CName").val(cName);
	                    
	                });
	            }
	        });
	    });

	
	    $("#btn-chinh-sua").mousedown(function() {
	        
	        var cid = $("#CId").val();
	        var cname = $("#CName").val();
	        
	        $.ajax({
	            type: 'POST',
	            data: {
	               CId:cid,
	               CName:cname     
	            },
	            url: 'CapNhapThongTinClass',
	            success: function(ketqua) {
	                if (ketqua == 1)
	                    $("#message").html("Bạn phải nhập đầy đủ thông tin lớp học...");
	                
	                if (ketqua != 1) {
	            			alert('CẬP NHẬT THÔNG TIN LỚP HỌC THÀNH CÔNG !!!');
	            			
	            		
	                }
	            }
	        });
	    });
});
