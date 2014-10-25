$(document).ready(function(){
    //alert("cargando jquery");
    $("#boton-nomina").click(function(){
    $.ajax({
        method:'get',
        url:'nomina',
        data:{
            nombre:$("#nombre").val(),
            paterno:$("#paterno").val(),
            materno:$("#materno").val(),
            
        },
        
        success:function(resultado){
           $("#resultado").html(resultado);
           if($('#texto-nombre').val()===''){ 
             $("#texto-nombre").val("no vacio");  
           }
           
        }
      });
    });
    
    $("#borrar-nomina").click(function(){
        $.ajax({
            url:'borrar-nomina',
            method:'delete',
            success:function(resultado){
                alert(resultado);
            }
        });
    });
    
  
});

