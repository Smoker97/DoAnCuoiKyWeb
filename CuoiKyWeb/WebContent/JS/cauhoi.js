$(document).ready(function(){
    $("#btn-edit").click(function(e){
        e.preventDefault();
       document.getElementById("txt-cauhoi").disabled = false;
       document.getElementById("txt-dapan").disabled = false;
       document.getElementById("btn-edit").disabled = false;
       document.getElementById("btn-save").disabled = true;
      });
      $("#btn-save").click(function(e){
        e.preventDefault();
       document.getElementById("txt-cauhoi").disabled = true;
       document.getElementById("txt-dapan").disabled = true;
       document.getElementById("btn-edit").disabled = false;
       document.getElementById("btn-save").disabled = true;
      });
      $("#btn-delete").click(function(e){
        e.preventDefault();
        $("#txt-cauhoi").val("");
        $("#txt-dapan").val("");
        document.getElementById("txt-cauhoi").disabled = true;
        document.getElementById("txt-dapan").disabled = true;
      });
});