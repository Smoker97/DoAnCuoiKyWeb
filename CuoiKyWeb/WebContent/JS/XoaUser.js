$(document).ready(function(){
	var uIdXoa = null;
	var uId;
	$("#btn-tra-cuu-nguoi-dung").click(function(e){
		uId = $("#UId-Search").val();
		$.ajax({
			type: 'POST',
			data: { UId: uId},
			url: 'TimUserTheoMa',
			success : function(ketqua){
				$("#table-thong-tin-nguoi-dung").html(ketqua);
				
				$("#table-thong-tin-nguoi-dung tr").on('click', function(){
					$("#table-thong-tin-nguoi-dung tr").css("background-color","white");
					$(this).closest("tr").css("background-color","#F2F2F2");
					uIdXoa = $(this).closest("tr").find("td:eq(0)").text();
				});
			}
		});
	});
	
	$("#btn-xoa").mousedown(function(){
		$.ajax({
			type: 'POST',
			data: { UId: uIdXoa},
			url: 'XoaNguoiDung'
		});
	});
	
	$("#btn-xoa").mouseup(function(){
		$.ajax({
			type: 'POST',
			data: { UId: uId},
			url: 'TimUserTheoMa',
			success : function(ketqua){
				$("#table-thong-tin-nguoi-dung").html(ketqua);
				
				$("#table-thong-tin-nguoi-dung tr").on('click', function(){
					$("#table-thong-tin-nguoi-dung tr").css("background-color","white");
					$(this).closest("tr").css("background-color","#F2F2F2");
					uIdXoa = $(this).closest("tr").find("td:eq(0)").text();
				});
			}
		});
	});
});