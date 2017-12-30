$(document).ready(function(){
	$.ajax({
		type: 'POST',
		data: { maKH: 1},
		contentType:"application/json; charset=utf-8",
		dataType: 'json',
		url: 'ThongTinCaNhan',
		success: function(result){
			$("#tenHocVien").val(result[0].Name.trim());
			$("#soDienThoai").val(result[0].Tel.trim());
			$("#soCMND").val(result[0].CMND.trim());
			$("#ngaySinh").val(result[0].Birth.trim());
			$("#Ten").text(result[0].Name.trim());
			if(result[0].AvatarPath.trim() != "")
				$('#img').attr({
		    		'src': result[0].AvatarPath.trim()
		    		});
		}
	});
	
    $("#btn-Luu").click(function(e){
        e.preventDefault();
        checkInput();

        if($("#tenHocVien").val() != "" && $("#soDienThoai").val() != "" 
        && $("#soCMND").val() != "" && $("#ngaySinh").val() != "" )
        {
        	$.ajax({
        		type: 'POST',
        		data: { Name: $("#tenHocVien").val(),
        				Tel: $("#soDienThoai").val(),
        				CMND: $("#soCMND").val(),
        				Birth: $("#ngaySinh").val(),
        				FileHinh : $("#ChooseFile").val()
        				},
        		url: 'CapNhatThongTinCaNhan',
        		success: function(result){
        			alert('CẬP NHẬT THÔNG TIN CÁ NHÂN THÀNH CÔNG !!!');
        			$("#Ten").text($("#tenHocVien").val());
        		}
        	});
        }
    });

    $("#btn-DoiMatKhau").click(function(e){
        e.preventDefault();
        checkInputDoiMatKhau();

        if($("#matKhauHienTai").val() != "" && $("#matKhauMoi").val() != "" 
        && $("#matKhauMoi1").val() != "" && ($("#matKhauMoi").val() == $("#matKhauMoi1").val()))
        {
        	$.ajax({
        		type: 'POST',
        		data: { OldPass: $("#matKhauHienTai").val(),
        				NewPass: $("#matKhauMoi").val(),
        				},
        		url: 'DoiMatKhau',
        		success: function(result){
        			if(result != 0){
        				$("#matKhauHienTai").val("");
        		        $("#matKhauMoi").val("");
        		        $("#matKhauMoi1").val("");
        				alert('ĐỔI MẬT KHẨU THÀNH CÔNG !!!');
        			}
        			else
        				alert('SAI MẬT KHẨU !!!');
        		}
        	});
        }
    });

    $("#btn-HuyLuu").click(function(e){
        window.location.reload();
    });

    $("#btn-HuyDoiMatKhau").click(function(e){
        e.preventDefault();
        $("#matKhauHienTai").val("");
        $("#matKhauMoi").val("");
        $("#matKhauMoi1").val("");
    });
    
    $("#ChooseFile").change(function(){
    	$('#img').attr({
    		'src': $("#ChooseFile").val()
    		});
    })

    $("input").focusin(function(){
        $(this).css("border-color","#E5E5E5");
    });

    function checkInput(){
        var tenHocVien = $("#tenHocVien").val();
        var soDienThoai = $("#soDienThoai").val();
        var soCMND = $("#soCMND").val();
        var ngaySinh = $("#ngaySinh").val();

        if(tenHocVien == ""){
            $("#tenHocVien").css("border-color","red");
        }

        if(soDienThoai == ""){
            $("#soDienThoai").css("border-color","red");
        }

        if(soCMND == ""){
            $("#soCMND").css("border-color","red");
        }

        if(ngaySinh == ""){
            $("#ngaySinh").css("border-color","red");
        }
    }

    function checkInputDoiMatKhau(){
        var matKhauHienTai = $("#matKhauHienTai").val();
        var matKhauMoi = $("#matKhauMoi").val();
        var matKhauMoi1 = $("#matKhauMoi1").val();

        if(matKhauHienTai == ""){
            $("#matKhauHienTai").css("border","1px solid red");
        }

        if(matKhauMoi == ""){
            $("#matKhauMoi").css("border","1px solid red");
        }

        if(matKhauMoi1 == ""){
            $("#matKhauMoi1").css("border","1px solid red");
        }

        if(matKhauMoi != matKhauMoi1){
            $("#matKhauMoi").css("border","1px solid red");
            $("#matKhauMoi1").css("border","1px solid red");
        }
    }
});