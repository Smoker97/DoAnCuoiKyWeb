$(document).ready(function(){
	$.ajax({
		type : 'POST',				
		url:'ShowDeThi',
		success:function(result){	
			$("#table").html(result);		
		}   
	});	
});