$(document).ready(
		function() {
			$.metadata.setType("attr", "validate");
			
			jQuery.validator.addMethod("ajaxCheck", function(value, element) {
				var ok;
				//得到m_name的值
				var nameId = {
					m_name : $("#m_name").val()
				};
				
				$.ajax({
					url : 'menu_findByName',
					async : false, // ///////关键，设置为同步
					type : 'POST',
					data : nameId,
					dataType : 'json',
					success : function(data) {
						console.log(data);
						if (data.success == 'true') {
							console.log(data.success);
							ok = false;
						} else {
							// console.log(data.success);
							ok = true;
						}
					}
				});
				return ok;
			}, "菜单名已存在!");

			var combo1 = $("#m_parentid").ligerComboBox({
				width : 180,
				selectBoxWidth : 200,
				selectBoxHeight : 200,
				textField : 'id',
				valueFieldId : 'm_parentid',
				treeLeafOnly : false,
				tree : {
					url : 'tree_getTreeJson',
					checkbox : false,
					ajaxType : 'POST',
				}
			});

			var v = $("#menuform").validate(
					{
						// 调试状态，不会提交数据的
						// debug : true,
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
							alert("添加菜单");
							// alert("Submitted!");
							$.ajax({
								type : "POST",
								dataType : 'json',
								url : 'menu_addMenuInfo',
								data : $(form).serialize(),
								success : function(data) {
									if (data.success == 'true') {
										console.log(data);
										var dialog = frameElement.dialog;
										dialog.close();
									} else {
									}
								}
							});
						}
					});
			/*
			 * var dialog = frameElement.dialog; var dialogData =
			 * dialog.get('data');//获取data参数 if(close==true){ dialog.close(); }
			 */
			$("form").ligerForm();
		});
