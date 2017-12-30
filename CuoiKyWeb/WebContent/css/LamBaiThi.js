$(document).ready(function(){
	$.ajax({
		type: 'POST',
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
				contentType:"application/json; charset=utf-8",
				dataType: 'json',
				url: 'LayCauHoiVaCauTraLoi',
				success: function(result){
					var string = "";
					if(4 <= result.length){
					    for(var i = 0; i <  4; i++){
					    	string = string + "<form style='font-size: 20px;'>"
					    				   +"<label>Câu "+ (i+1) + ". " + result[i].QContent +" ?</label>";
					    	for(var j=0;j< result[i].CacCauTraLoi.length;j++){
					    		if(result[i].CacCauTraLoi[j].IsCheck == 0){
						    		string = string + "<div class='radio'>"
						    				   +"<label><input type='radio' name='optradio' value='"+ i + "/" + j +"'>"+ result[i].CacCauTraLoi[j].AContent +"</label>"
						    				   +"</div>";
					    		}
					    		else{
					    			string = string + "<div class='radio'>"
				    				   +"<label><input type='radio' name='optradio' checked value='"+ i + "/" + j +"'>"+ result[i].CacCauTraLoi[j].AContent +"</label>"
				    				   +"</div>";
					    		}
					    	}
					    	string = string + "</form>";
					    }
				    }
				    else{
				    	for(var i = 0; i < result.length; i++){
					    	string = string + "<form style='font-size: 20px;'>"
					    				   +"<label>Câu "+ (i+1) + ". " + result[i].QContent +" ?</label>";
					    	for(var j=0;j< result[i].CacCauTraLoi.length;j++){
					    		if(result[i].CacCauTraLoi[j].IsCheck == 0){
						    		string = string + "<div class='radio'>"
						    				   +"<label><input type='radio' name='optradio' value='"+ i + "/" + j +"'>"+ result[i].CacCauTraLoi[j].AContent +"</label>"
						    				   +"</div>";
					    		}
					    		else{
					    			string = string + "<div class='radio'>"
				    				   +"<label><input type='radio' name='optradio' checked value='"+ i + "/" + j +"'>"+ result[i].CacCauTraLoi[j].AContent +"</label>"
				    				   +"</div>";
					    		}
					    	}
					    	string = string + "</form>";
					    }
				    }
				    $("#content").append(string);
				    $("input").change(function(){
				    	var value = $(this).val();
				    	var answernum = value.slice(value.indexOf("/") + 1, value.length);
				    	var questionnum = value.slice(0, value.indexOf("/"));
				    	for(var i=0; i<result[questionnum].CacCauTraLoi.length;i++){
				    		result[questionnum].CacCauTraLoi[i].IsCheck = 0;
				    	}
				    	result[questionnum].CacCauTraLoi[answernum].IsCheck = 1;
				    });
					
					
					var pagenum = result.length/4 + 0.99;
					$('#page-selection_top,#page-selection_bot').bootpag({
					    total: pagenum,
					    page: 1,
					    maxVisible: 5,
					    leaps: true,
					    firstLastUse: true,
					    first: '←',
					    last: '→',
					    wrapClass: 'pagination',
					    activeClass: 'active',
					    disabledClass: 'disabled',
					    nextClass: 'next',
					    prevClass: 'prev',
					    lastClass: 'last',
					    firstClass: 'first'
					}).on("page", function(event, num){
					    $("#content").html(""); // or some ajax content loading...
					    var questionnum = num*4 - 3;
					    var questionloc = num*4 - 4;
					    var question = "";
					    if(questionloc + 4 <= result.length){
						    for(var i = questionloc; i < questionloc + 4; i++){
						    	question = question + "<form style='font-size: 20px;'>"
						    				   +"<label>Câu "+ questionnum + ". " + result[i].QContent +" ?</label>";
						    	for(var j=0;j< result[i].CacCauTraLoi.length;j++){
						    		if(result[i].CacCauTraLoi[j].IsCheck == 0){
							    		question = question + "<div class='radio'>"
							    				   +"<label><input type='radio' name='optradio' value='"+ i + "/" + j +"'>"+ result[i].CacCauTraLoi[j].AContent +"</label>"
							    				   +"</div>";
						    		}
						    		else{
						    			question = question + "<div class='radio'>"
					    				   +"<label><input type='radio' name='optradio' checked value='"+ i + "/" + j +"'>"+ result[i].CacCauTraLoi[j].AContent +"</label>"
					    				   +"</div>";
						    		}
						    	}
						    	questionnum = questionnum + 1;
						    	question = question + "</form>";
						    }
					    }
					    else{
					    	for(var i = questionloc; i < result.length; i++){
						    	question = question + "<form style='font-size: 20px;'>"
						    				   +"<label>Câu "+ questionnum + ". " + result[i].QContent +" ?</label>";
						    	for(var j=0;j< result[i].CacCauTraLoi.length;j++){
						    		if(result[i].CacCauTraLoi[j].IsCheck == 0){
							    		question = question + "<div class='radio'>"
							    				   +"<label><input type='radio' name='optradio' value='"+ i + "/" + j +"'>"+ result[i].CacCauTraLoi[j].AContent +"</label>"
							    				   +"</div>";
						    		}
						    		else{
						    			question = question + "<div class='radio'>"
					    				   +"<label><input type='radio' name='optradio' checked value='"+ i + "/" + j +"'>"+ result[i].CacCauTraLoi[j].AContent +"</label>"
					    				   +"</div>";
						    		}
						    	}
						    	questionnum = questionnum + 1;
						    	question = question + "</form>";
						    }
					    }
					    $("#content").append(question);
					    $("input").change(function(){
					    	var value = $(this).val();
					    	var answernum = value.slice(value.indexOf("/") + 1, value.length);
					    	var questionnum = value.slice(0, value.indexOf("/"));
					    	for(var i=0; i<result[questionnum].CacCauTraLoi.length;i++){
					    		result[questionnum].CacCauTraLoi[i].IsCheck = 0;
					    	}
					    	result[questionnum].CacCauTraLoi[answernum].IsCheck = 1;
					    });
					}); 
					
					$("#btn-nop-bai").click(function(){
				    	var True_Answer = 0;
				    	for(var i=0;i< result.length;i++){
				    		for(var j = 0;j < result[i].CacCauTraLoi.length ; j++){
				    			if(result[i].CacCauTraLoi[j].IsTrue == result[i].CacCauTraLoi[j].IsCheck && result[i].CacCauTraLoi[j].IsTrue == 1)
				    				True_Answer = True_Answer + 1;
				    		}
				    	}
				    	
				    	$.ajax({
				    		type: 'POST',
				    		data: { True_Answer: True_Answer,
				    				Answer_Size: result.length},
				    		url: 'LuuKetQuaLamBai',
				    		success: function(kq){
				    			$("#Xem").css("display","block");
				    			$("#page-selection_bot,#page-selection_top,#content,#btn-nop-bai,#DongHo").css("display", "none");
				    		}
				    	});
				    });
				}
			});
		}
	});
});