$(document).ready(function(){
	$.ajax({
		type : 'POST',				
		url:'ShowLichThi',
		success:function(result){	
			$("#table").html(result);		
		}   
	});	
});