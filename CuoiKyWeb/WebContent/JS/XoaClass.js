$(document).ready(function(){
	var cIdXoa = null;
	var cId;
	$("#btn-tra-cuu-lop-hoc").click(function(e){
		cId = $("#CId-Search").val();
		$.ajax({
			type: 'POST',
			data: { CId: cId},
			url: 'TimClassTheoMa',
			success : function(ketqua){
				$("#table-thong-tin-lop-hoc").html(ketqua);
				
				$("#table-thong-tin-lop-hoc tr").on('click', function(){
					$("#table-thong-tin-lop-hoc tr").css("background-color","white");
					$(this).closest("tr").css("background-color","#F2F2F2");
					cIdXoa = $(this).closest("tr").find("td:eq(0)").text();
				});
			}
		});
	});
	
	$("#btn-xoa").mousedown(function(){
		$.ajax({
			type: 'POST',
			data: { CId: cIdXoa},
			url: 'XoaLopHoc'
		});
	});
	
	$("#btn-xoa").mouseup(function(){
		$.ajax({
			type: 'POST',
			data: { CId: cId},
			url: 'TimClassTheoMa',
			success : function(ketqua){
				$("#table-thong-tin-lop-hoc").html(ketqua);
				
				$("#table-thong-tin-lop-hoc tr").on('click', function(){
					$("#table-thong-tin-lop-hoc tr").css("background-color","white");
					$(this).closest("tr").css("background-color","#F2F2F2");
					cIdXoa = $(this).closest("tr").find("td:eq(0)").text();
				});
			}
		});
	});
});