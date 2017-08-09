var g=null;
function commonPerm(){
	$.ajax({
		url:'func_findPermissionById',
		type:'POST',
		async: false,
		data:{id:permId},
		dataType: 'json',
		success:function(data){
			var perm=data.datas.perm;
			console.log(perm);
			var deptAdd=perm.dept001;
			var deptUpdate=perm.dept002;
			var deptDelete=perm.dept003;
			var deptSetting=perm.dept004;
			if (!isEmptyObject(deptAdd)) {
				ttb.addItem(itemAdd);
			}
			if (!isEmptyObject(deptUpdate)) {
				ttb.addItem(itemUpdate);
			}
			if (!isEmptyObject(deptDelete)) {
				ttb.addItem(itemDelete);
			}
			if(!isEmptyObject(deptSetting)){
				ttb.addItem(itemSetting);
			}
		}
	})
}


/**
 * 初始化用户表格
 */
function initTable(id,columns,url,toolbar) {
		g = $(id).ligerGrid({
			columns : columns,
			pageSizeOptions : [ 15, 30, 45, 60, 75 ],
			pageSize : 15,
			rownumbers : true,
			sortName: 'createDate',
			sortOrder: 'desc',
			width : '100%',
			height : '100%',
			url : url,
			toolbar :toolbar 
		});
		$("#pageloading").hide();
	}		
/**
 * 初始化用户表格
 */
function initTable2(id,columns,url,toolbar) {
	g = $(id).ligerGrid({
		columns : columns,
		pageSizeOptions : [ 15, 30, 45, 60, 75 ],
		pageSize : 15,
		rownumbers : true,
		sortName: 'createDate',
		sortOrder: 'desc',
		width : '100%',
		height : '100%',
		url : url,
	    parms :function search(){
	    	 var pageWhere1=$("#pageWhere1").val();
		    	var pageWhere2=$("#pageWhere2").val();
		    	var pageWhere3=$("#pageWhere3").val();
		    	var pageWhere4=$("#pageWhere4").val();
		    	if (pageWhere2==-1) {
		    		pageWhere2=null;
				}
		    	if (pageWhere4==-1) {
		    		pageWhere4=null;
		    	}
		    	var data={pageWhere1:pageWhere1,pageWhere2:pageWhere2,pageWhere3:pageWhere3,pageWhere4:pageWhere4};
		    	console.log(data);
		    	return data;
		    },
		toolbar :toolbar 
	});
	$("#pageloading").hide();
}		
function initCheckBoxTable(id,columns,url,toolbar,checkedFunc) {
	g = $(id).ligerGrid({
		columns : columns,
		pageSizeOptions : [ 15, 30, 45, 60, 75 ],
		pageSize : 15,
		sortName: 'createDate',
		sortOrder: 'desc',
		rownumbers : true,
		width : function(){
			var w=document.body.clientWidth;
			return w-200;
		},
		height : '100%',
		checkbox:true,
		isChecked:checkedFunc,
		url : url,
		toolbar :toolbar 
	});
	$("#pageloading").hide();
}
function initCheckBoxTable2(id,columns,url,toolbar,checkedFunc) {
	g = $(id).ligerGrid({
		columns : columns,
		pageSizeOptions : [ 15, 30, 45, 60, 75 ],
		pageSize : 15,
		rownumbers : true,
		isSingleCheck:true,
		width :'100%',
		height : '85%',
		checkbox:true,
		isChecked:checkedFunc,
		url : url,
		toolbar :toolbar 
	});
	$("#pageloading").hide();
}
var checkData=null;
function checkedData(data,url){
	$.ajax({
        type:"POST",
        dataType:'json',
        async : false,
        url:url,
        data:data,
        success:function(data){
        	console.log(data.datas.list);
                if(data.success=='true') {
                	checkData=data.datas.list;	
            }else{

            } 
         }
      });
}
function f_isChecked(rowdata)
{
	//console.log('row:'+rowdata.id);
	if (checkData!=null) {
	var flag;
	$.each(checkData,function(index,object){
		if (rowdata.id==object.func_id) {
			flag=true;
			return true;
		}
	});
	if (flag==true) {
		console.log('row:'+rowdata.id);
		return true;
	}else{
		return false;
	}
  }else{
	  return false;
  }
}
/**
 * 去除数组里面的空格
 * @param arr
 * @returns
 */
function clearNullArr(arr){ 
	for(var i=0,len=arr.length;i<len;i++){ 
	if(!arr[i]||arr[i]==''||arr[i] === undefined){ 
	arr.splice(i,1); 
	len--; 
	i--; 
	} 
	} 
	return arr; 
	}
var isEmptyValue = function(value) {
    var type;
    if(value == null) { // 等同于 value === undefined || value === null
        return true;
    }
    type = Object.prototype.toString.call(value).slice(8, -1);
    switch(type) {
    case 'String':
        return !$.trim(value);
    case 'Array':
        return !value.length;
    case 'Object':
        return $.isEmptyObject(value); // 普通对象使用 for...in 判断，有 key 即为 false
    default:
        return false; // 其他对象均视作非空
    }
};
function isEmptyObject(e) {  
    var t;  
    for (t in e)  
        return !1;  
    return !0  
} 
function initTree(data){
	var content='<ul style="margin:auto;" class="l-tree">';
	for(var menuName in data){
		var tempIdsArr=new Array();
		content+='<li><span>'+menuName+'</span>';
		 content+='<ul>';
		 $.each(data[menuName],function(index,object){
			 //console.log(object);
			 content+='<li ischecked="true" id="'+object.id+'"><span>'+object.f_name+'</span></li>';	 
		 })
		 content+='</ul>';
		 content+='</li>';
	}
	content+='</ul>';
	document.getElementById("menuFuncTree").innerHTML=content;
}
function tableValidate(url,id){
			$.metadata.setType("attr", "validate");
			$("form").validate(
					{
						// 调试状态，不会提交数据的
						debug : true,
						errorPlacement : function(lable, element) {

							if (element.hasClass("l-textarea")) {
								element.addClass("l-textarea-invalid");
							} else if (element.hasClass("l-text-field")) {
								element.parent().addClass("l-text-invalid");
							}

							var nextCell = element.parents("td:first").next(
									"td");
							nextCell.find("div.l-exclamation").remove();
							$(
									'<div class="l-exclamation" title="'
											+ lable.html() + '"></div>')
									.appendTo(nextCell).ligerTip();
						},
						success : function(lable) {
							var element = $("#" + lable.attr("for"));
							var nextCell = element.parents("td:first").next(
									"td");
							if (element.hasClass("l-textarea")) {
								element.removeClass("l-textarea-invalid");
							} else if (element.hasClass("l-text-field")) {
								element.parent().removeClass("l-text-invalid");
							}
							nextCell.find("div.l-exclamation").remove();
						},
						submitHandler : function(form) {
							console.log($(form).serialize());
							$.ajax({
						        type:"POST",
						        dataType:'json',
						        url:url,
						        data: $.param({id:id})+'&'+$(form).serialize(),
						        success:function(data){
						        	console.log(data);
				                        if(data.success=='true') {  
				                        var dialog = frameElement.dialog;
				                        dialog.close();
				                        	 
				                    }else{

				                    } 
				                 }
						      });
						}
					});
			$("form").ligerForm();
			
		}