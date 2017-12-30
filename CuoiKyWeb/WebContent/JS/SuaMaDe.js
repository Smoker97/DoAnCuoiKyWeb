$(document).ready(function(){
	$.ajax({
		type: 'POST',
		dataType: 'json',
		url: 'ChinhSuaDeThi',
		success: function(result){
			$("#TenDeThi").val(result[0].TestName.trim());
			$("#ThoiGian").val(result[0].TimeTest.trim());
		}
	});
	
	
    $("#btnHuy").click(function(e){
    	windows.location = windows.location;
        window.location.reload(true);
    });
	
	$("#btnXacNhan").click(function(e){
		e.preventDefault();
		$.ajax({
			type: 'POST',
			dataType: 'json',
			data: {
				TestName: $("#TenDeThi").val(),
				TimeTest: $("#ThoiGian").val()
				},
			url: 'ChinhSuaMaDe',
			success: function(result){
				alert('CHỈNH SỬA THÀNH CÔNG!!!');
			}
		});
    });
});