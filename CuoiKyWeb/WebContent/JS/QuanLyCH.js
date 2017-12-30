$(document).ready(function () {
    $("btn-pref .btn").click(function () {
      $("btn-pref .btn").removeClass("btn-primary").addClass("btn-default");
      // $(".tab").addClass("active"); // instead of this do the below 
      $(this).removeClass("btn-default").addClass("btn-primary");
    });
  });
  $(document).ready(function(){
    //cau1
    $("#btn-edit1").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau1").disabled = false;
     document.getElementById("txt-dapan1").disabled = false;
     document.getElementById("btn-edit1").disabled = true;
     document.getElementById("btn-save1").disabled = false;
    });
    $("#btn-save1").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau1").disabled = true;
     document.getElementById("txt-dapan1").disabled = true;
     document.getElementById("btn-edit1").disabled = false;
     document.getElementById("btn-save1").disabled = true;
    });
    $("#btn-delete1").click(function(e){
      e.preventDefault();
      $("input[type=text1]").val("");
      $("input[type=textda1]").val("");
      document.getElementById("txt-cau1").disabled = true;
      document.getElementById("txt-dapan1").disabled = true;
    });
    //cau2
    $("#btn-edit2").click(function(e){
      e.preventDefault();
      document.getElementById("txt-cau2").disabled = false;
      document.getElementById("txt-dapan2").disabled = false;
      document.getElementById("btn-edit2").disabled = true;
      document.getElementById("btn-save2").disabled = false;
    });
    $("#btn-save2").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau2").disabled = true;
     document.getElementById("txt-dapan2").disabled = true;
     document.getElementById("btn-edit2").disabled = false;
     document.getElementById("btn-save2").disabled = true;
    });
    $("#btn-delete2").click(function(e){
      e.preventDefault();
      $("input[type=text2]").val("");
      $("input[type=textda2]").val("");
      document.getElementById("txt-cau2").disabled = true;
      document.getElementById("txt-dapan2").disabled = true;
    });
    //cau3
    $("#btn-edit3").click(function(){
      document.getElementById("txt-cau3").disabled = false;
      document.getElementById("txt-dapan3").disabled = false;
      document.getElementById("btn-edit3").disabled = true;
      document.getElementById("btn-save3").disabled = false;
    });
    $("#btn-save3").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau3").disabled = true;
     document.getElementById("txt-dapan3").disabled = true;
     document.getElementById("btn-edit3").disabled = false;
     document.getElementById("btn-save3").disabled = true;
    });
    $("#btn-delete3").click(function(){
      $("input[type=text3]").val("");
      $("input[type=textda3]").val("");
      document.getElementById("txt-cau3").disabled = true;
      document.getElementById("txt-dapan3").disabled = true;
    });
    //cau4
    $("#btn-edit4").click(function(){
      document.getElementById("txt-cau4").disabled = false;
      document.getElementById("txt-dapan4").disabled = false;
      document.getElementById("btn-edit4").disabled = true;
      document.getElementById("btn-save4").disabled = false;
    });
    $("#btn-save4").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau4").disabled = true;
     document.getElementById("txt-dapan4").disabled = true;
     document.getElementById("btn-edit4").disabled = false;
     document.getElementById("btn-save4").disabled = true;
    });
    $("#btn-delete4").click(function(){
      $("input[type=text4]").val("");
      $("input[type=textda4]").val("");
      document.getElementById("txt-cau4").disabled = true;
      document.getElementById("txt-dapan4").disabled = true;
    });
    //cau5
    $("#btn-edit5").click(function(){
      document.getElementById("txt-cau5").disabled = false;
      document.getElementById("txt-dapan5").disabled = false;
      document.getElementById("btn-edit5").disabled = true;
      document.getElementById("btn-save5").disabled = false;
    });
    $("#btn-save5").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau5").disabled = true;
     document.getElementById("txt-dapan5").disabled = true;
     document.getElementById("btn-edit5").disabled = false;
     document.getElementById("btn-save5").disabled = true;
    });
    $("#btn-delete5").click(function(){
      $("input[type=text5]").val("");
      $("input[type=textda5]").val("");
      document.getElementById("txt-cau5").disabled = true;
      document.getElementById("txt-dapan5").disabled = true;
    });
    //cau6
    $("#btn-edit6").click(function(){
      document.getElementById("txt-cau6").disabled = false;
      document.getElementById("txt-dapan6").disabled = false;
      document.getElementById("btn-edit6").disabled = true;
      document.getElementById("btn-save6").disabled = false;
    });
    $("#btn-save6").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau6").disabled = true;
     document.getElementById("txt-dapan6").disabled = true;
     document.getElementById("btn-edit6").disabled = false;
     document.getElementById("btn-save6").disabled = true;
    });
    $("#btn-delete6").click(function(){
      $("input[type=text6]").val("");
      $("input[type=textda6]").val("");
      document.getElementById("txt-cau6").disabled = true;
      document.getElementById("txt-dapan6").disabled = true;
    });
    //cau7
    $("#btn-edit7").click(function(){
      document.getElementById("txt-cau7").disabled = false;
      document.getElementById("txt-dapan7").disabled = false;
      document.getElementById("btn-edit7").disabled = true;
      document.getElementById("btn-save7").disabled = false;
    });
    $("#btn-save7").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau7").disabled = true;
     document.getElementById("txt-dapan7").disabled = true;
     document.getElementById("btn-edit7").disabled = false;
     document.getElementById("btn-save7").disabled = true;
    });
    $("#btn-delete7").click(function(){
      $("input[type=text7]").val("");
      $("input[type=textda7]").val("");
      document.getElementById("txt-cau7").disabled = true;
      document.getElementById("txt-dapan7").disabled = true;
    });
    //cau8
    $("#btn-edit8").click(function(){
      document.getElementById("txt-cau8").disabled = false;
      document.getElementById("txt-dapan8").disabled = false;
      document.getElementById("btn-edit8").disabled = true;
      document.getElementById("btn-save8").disabled = false;
    });
    $("#btn-save8").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau8").disabled = true;
     document.getElementById("txt-dapan8").disabled = true;
     document.getElementById("btn-edit8").disabled = false;
     document.getElementById("btn-save8").disabled = true;
    });
    $("#btn-delete8").click(function(){
      $("input[type=text8]").val("");
      $("input[type=textda8]").val("");
      document.getElementById("txt-cau8").disabled = true;
      document.getElementById("txt-dapan8").disabled = true;
    });
    //cau9
    $("#btn-edit9").click(function(){
      document.getElementById("txt-cau9").disabled = false;
      document.getElementById("txt-dapan9").disabled = false;
      document.getElementById("btn-edit9").disabled = true;
      document.getElementById("btn-save9").disabled = false;
    });
    $("#btn-save9").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau9").disabled = true;
     document.getElementById("txt-dapan9").disabled = true;
     document.getElementById("btn-edit9").disabled = false;
     document.getElementById("btn-save9").disabled = true;
    });
    $("#btn-delete9").click(function(){
      $("input[type=text9]").val("");
      $("input[type=textda9]").val("");
      document.getElementById("txt-cau9").disabled = true;
      document.getElementById("txt-dapan9").disabled = true;
    });
    //cau10
    $("#btn-edit10").click(function(){
      document.getElementById("txt-cau10").disabled = false;
      document.getElementById("txt-dapan10").disabled = false;
      document.getElementById("btn-edit10").disabled = true;
      document.getElementById("btn-save10").disabled = false;
      
    });
    $("#btn-save10").click(function(e){
      e.preventDefault();
     document.getElementById("txt-cau10").disabled = true;
     document.getElementById("txt-dapan10").disabled = true;
     document.getElementById("btn-edit10").disabled = false;
     document.getElementById("btn-save10").disabled = true;
    });
    $("#btn-delete10").click(function(){
      $("input[type=text10]").val("");
      $("input[type=textda10]").val("");
      document.getElementById("txt-cau10").disabled = true;
      document.getElementById("txt-dapan10").disabled = true;
    });
  });