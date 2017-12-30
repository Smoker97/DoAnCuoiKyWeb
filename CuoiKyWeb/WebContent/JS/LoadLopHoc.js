$(document).ready(function(){
	$.ajax({
		type : 'POST',				
		url:'LoadLopHoc',
		success:function(result){	
			$("#table").html(result);		
		}   
	});	
});