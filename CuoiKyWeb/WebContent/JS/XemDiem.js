$(document).ready(function(){
	$.ajax({
		type: 'POST',
		data: { maKH: 1},
		contentType:"application/json; charset=utf-8",
		dataType: 'json',
		url: 'ThongTinCaNhan',
		success: function(result){
			$("#Ten").text(result[0].Name.trim());
			if(result[0].AvatarPath.trim() != "")
				$('#img').attr({
		    		'src': result[0].AvatarPath.trim()
		    		});
			
			$.ajax({
				type: 'POST',
				data: { maKH: 1},
				url: 'XemDiem',
				success: function(result){
					$("#table-xem-diem").html(result);
				}
			});
		}
	});
});