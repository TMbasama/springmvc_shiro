$(function(){
  $("#veryCode").blur(function(){
    $.post(
    "ResultImage.action",
      {veryCode:$("#veryCode").val()},
      		validate
        );
    });
});

function  validate(data){
	alert(data.flag);
	if(data.flag){
		$("#msg").html("");
		n1=1;
	}else{
		$("#msg").html("ÑéÖ¤Âë´íÎó");
	}
}