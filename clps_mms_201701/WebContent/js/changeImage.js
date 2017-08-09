	function changeImg()
	{ 
		var imgSrc = $("#imgObj"); 
		var src = imgSrc.attr("src"); 
		imgSrc.attr("src",chgUrl(src)); 
	} 
	
	function chgUrl(url)
	{ 
		var timestamp = (new Date()).valueOf(); 
		url = url.substring(0,17); 
		if((url.indexOf("&")>=0)){ 
			url = url + "×tamp=" + timestamp; 
	}
	else
	{ 
		url = url + "?timestamp=" + timestamp; 
	} 
		return url; 
	} 
	
	
	
	
/*	function isRightCode()
	{ 
		var code = $("#veryCode").attr("value"); 
		code = "c=" + code; 
		$.ajax({ 
			type:"POST", 
			url:"resultServlet", 
			data:code, 
			success:callback 
		}); 
	} 
	function callback(data){ 
		$("#info").html(data); 
	} */
