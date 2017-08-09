$(document).ready(function() {
});
var roleId ;
function getMenuFunc(){
	var menuId=$.cookie('menuId');
	console.log('menuId:'+menuId);
	$.ajax({
		url : 'roleMenuFunc_queryFuncByRoleId',
		async : false,
		type : 'post',
		data : {
			roleId : roleId,
			menuId:menuId
		},
		dataType : 'json',
		success : function(data) {
			console.log(data);
			console.log(isEmptyObject(data));
			if (!isEmptyObject(data)) {
				var ttb=$("#toptoolbar").ligerToolBar();
				$.each(data,function(index,object){
					console.log(object.funcName=="设置");
					if (object.funcName=="新增") {
						console.log('新增');
						ttb.addItem(itemAdd);
					}
					if (object.funcName=="修改") {
						console.log('修改');
						ttb.addItem(itemUpdate);
					}
					if (object.funcName=="删除") {
						console.log('删除');
						ttb.addItem(itemDelete);
					}
					if (object.funcName=="设置") {
						console.log('设置');
						ttb.addItem(itemSetting);
					}
				})
			}else{
				
			}
		}
	});
}