$(document).ready(function(){
	var stt = 0;
	$.ajax({
		type: 'POST',
		dataType: 'json',
		url: 'LoadSubjectQuestion',
		success: function(result){
			var option = '';
			result.forEach(function(result) {
				var div = '<option value="'+ result["kindId"] +'">'+ result["kindName"] +'</option>';
				option = option + div;
			});
			
			var full = '<div class="form-group"><label class="control-label">Loại câu hỏi</label> <select class="form-control" name="Sl'+ stt +'" id="Sl'+ stt +'">' 
						+ option + '</select></div><div class="form-group"><label class="control-label">Số câu hỏi</label><input name="Ip'+ stt +'" id="Ip'+ stt +'" type="text" placeholder="" class="form-control"></div>';
			$("#LoaiCauHoi").append(full);
			stt ++;
		}
	});
	
	$("#btn-ThemLoai").click(function(e){
		e.preventDefault();
		$.ajax({
			type: 'POST',
			dataType: 'json',
			url: 'LoadSubjectQuestion',
			success: function(result){
				var option = '';
				result.forEach(function(result) {
					var div = '<option value="'+ result["kindId"] +'">'+ result["kindName"] +'</option>';
					option = option + div;
				});
				
				var full = '<div class="form-group"><label class="control-label">Loại câu hỏi</label> <select class="form-control" name"=Sl'+ stt +'" id="Sl'+ stt +'">' 
							+ option + '</select></div><div class="form-group"><label class="control-label">Số câu hỏi</label><input name="Ip'+ stt +'" id="Ip'+ stt +'" type="text" placeholder="" class="form-control"></div>';
				$("#LoaiCauHoi").append(full);	
				stt ++;
			}
		});
    });
	
    $("#btnHuy").click(function(e){
    	windows.location = windows.location;
        window.location.reload(true);
    });
	
	$("#btnTaoDe").click(function(e){
		e.preventDefault();
		$.ajax({
			type: 'POST',
			dataType: 'json',
			data: {
				TestName: $("#TenDeThi").val(),
				TimeTest: $("#ThoiGian").val(),
				sl0: $("#Sl0").val(),
				ip0: $("#Ip0").val(),
				sl1: $("#Sl1").val(),
				ip1: $("#Ip1").val(),
				sl2: $("#Sl2").val(),
				ip2: $("#Ip2").val(),
				sl3: $("#Sl3").val(),
				ip3: $("#Ip3").val(),
				sl4: $("#Sl4").val(),
				ip4: $("#Ip4").val(),
				},
			url: 'ThemDeThi',
			success: function(result){
				alert("TẠO MÃ ĐỀ THÀNH CÔNG!!!");
					$("#Sl0").val("");
					$("#Ip0").val("");
					$("#Ip1").val("");
					$("#Sl1").val("");
					$("#Ip2").val("");
					$("#Sl2").val("");
					$("#Ip3").val("");
					$("#Sl3").val("");
					$("#Ip4").val("");
					$("#Sl4").val("");
					$("#TenDeThi").val("");
					$("#ThoiGian").val("");
			}
		});
    });
});