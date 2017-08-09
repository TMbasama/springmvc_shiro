var json = '[{"id":"1","name":"apple","type":"1","menu":[{"id":"11","name":"apple1"},{"id":"12","name":"apple2"}]},{"id":"2","name":"orange","type":"1","menu":[{"id":"21","name":"orange1"},{"id":"22","name":"orange2"}]}]';

function getMenu(){

}
$(document).ready(function() {
var context='<li class="header"></li>';
$.each($.parseJSON(json), function(index, obj1) {
	context+='<li class="treeview">';
	var name1=obj1.name;
	var type1=obj1.type;
	    if(type1=="0"){
		var url='#';
		context+='<a href="'+url+'">'+
		'<i class="fa fa-files-o"></i>'+
		'<span>'+name1+'</span>'+
		'<span class="pull-right-container"><span class="label label-primary pull-right">4</span>'+
		' </span></a>';
	    }else{
	    	var url='#';
	    	context+='<a href="'+url+'">'+
			'<i class="fa fa-files-o"></i>'+
			'<span>'+name1+'</span>'+
			'<span class="pull-right-container"><span class="label label-primary pull-right">4</span>'+
			' </span></a>';
	    	context+='<ul class="treeview-menu">';
	    	$.each(obj1.menu,function(i2,obj2){
	    		context+="<li>";
	    		var name2=obj2.name;
	    		var url2="#";
	    		context+='<a href="'+url2+'"><i class="fa fa-circle-o"></i>'+name2+'</a>';
	    		context+='</li>';
	    	})
	    	context+="</ul>";
	    }
		context+="</li>";
});
document.getElementById("navul").innerHTML=context;
});