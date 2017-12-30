$(document).ready(function(){
	$.ajax({
		type: 'POST',
		dataType: 'json',
		url: 'LoadSubject',
		success: function(result){
			var option = '';
			result.forEach(function(result) {
				var div = '<option value="'+ result["SubId"] +'">'+ result["SubName"] +'</option>';
				option = option + div;
			});
			
			var full = '<div class="form-group"><label class="control-label">Môn thi</label> <select class="form-control" name="Sl0" id="Sl0">' 
						+ option + '</select></div>';
			$("#MonThi").append(full);
		}
	});
	$.ajax({
		type: 'POST',
		dataType: 'json',
		url: 'LoadDeThi',
		success: function(result){
			var option = '';
			result.forEach(function(result) {
				var div = '<option value="'+ result["TestId"] +'">'+ result["TestName"] +'</option>';
				option = option + div;
			});
			
			var full = '<div class="form-group"><label class="control-label">Tên Đề thi</label> <select class="form-control" name="Sl1" id="Sl1">' 
						+ option + '</select></div>';
			$("#DeThi").append(full);
		}
	});
	
	$("#btn-Huy").click(function(e){
    	windows.location = windows.location;
        window.location.reload(true);
    });
	
	$("#btnTaoLich").click(function(e){
		e.preventDefault();
		$.ajax({
			type: 'POST',
			dataType: 'json',
			data: {
				testId: $("#Sl1").val(),
				SubjectId: $("#Sl0").val(),
				TimeStart: $("#TimeStart").val(),
				TimeClose: $("#TimeStop").val()
				},
			url: 'TaoLichThi',
			success: function(result){
				alert('TẠO LỊCH THI THÀNH CÔNG!!!');
				$("#TimeStart").val("");
				$("#TimeStop").val("");
			}
		});
    });
});