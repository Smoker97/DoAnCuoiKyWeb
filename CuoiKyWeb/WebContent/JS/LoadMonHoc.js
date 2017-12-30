$(document).ready(function(){
	$.ajax({
		type : 'POST',				
		url:'LoadMonHoc',
		success:function(result){	
			$("#table").html(result);		
		}   
	});	
});