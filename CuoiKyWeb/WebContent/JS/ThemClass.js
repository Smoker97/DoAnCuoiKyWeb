$(document).ready(function(){
	$("#btn-xac-nhan-thong-tin-lop-hoc").click(function(e){
		var cid=$("#CId").val();
		var cname=$("#CName").val();	
		
		$.ajax({
			type: 'POST',
			data: {
				CId:cid,
				CName:cname
				},
			url: 'KiemTraThongTinClass',
			success: function(ketqua){
				if(ketqua == 1)
					$("#message").html("<p>Bạn phải nhập đầy đủ thông tin lớp học...</p>");
				if(ketqua != 1 ){
					$("#message").html("");
					$("#table-thong-tin-lop-hoc").html(ketqua);
				}
			}
		});
	});
	
	$("#btn-them-vao-csdl").click(function(){
		$.ajax({
			type: 'POST',
			url: 'ThemLopHoc',
			success: function(ketqua){
				
				alert("Thêm lớp học thành công");
				$("#table-thong-tin-lop-hoc").html("");
			}
		});
	});
});