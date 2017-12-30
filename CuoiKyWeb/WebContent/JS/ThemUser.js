$(document).ready(function(){
	$("#btn-xac-nhan-thong-tin-nguoi-dung").click(function(e){
		var UName=$("#UName").val();
		var FullName=$("#FullName").val();	
		var Pass = $("#Pass").val();
		var Birth = $("#Birth").val();
		var CMND = $("#CMND").val();
		var Tel = $("#Tel").val();
		$.ajax({
			type: 'POST',
			data: {
				UName:UName,
				FullName:FullName,
				Pass:Pass,
				Birth:Birth,
				CMND:CMND,
				Tel:Tel,
				},
			url: 'KiemTraThongTinUser',
			success: function(ketqua){
				if(ketqua == 1)
					$("#message").html("<p>Bạn phải nhập đầy đủ thông tin người dùng...</p>");
				if(ketqua == 2)
					$("#message").html("<p> Mời nhập kiểu dữ liệu date đúng...</p>");
				
				if(ketqua != 1 && ketqua != 2){
					$("#message").html("");
					$("#table-thong-tin-nguoi-dung").html(ketqua);
				}
			},
			error: function(e){
				alert("aaa");		
			}
		});
	});
	
	$("#btn-them-vao-csdl").click(function(){
		$.ajax({
			type: 'POST',
			url: 'ThemUser',
			success: function(ketqua){
				
				alert("Thêm dịch vụ thành công");
				$("#table-thong-tin-nguoi-dung").html("");
			}
		});
	});
});