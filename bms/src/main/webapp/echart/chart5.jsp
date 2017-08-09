<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>各成绩段人数分析</title>
<script type="text/javascript" src="dist/echarts.min.js"></script>
</head>
<body>
    <div id="main" style="margin-left:10%;width: 80%;height:500px;"></div>
     <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        // 指定图表的配置项和数据
        var option = {
        	    tooltip : {
        	        trigger: 'axis'
        	    },
        	    legend: {
        	        data:['Capgemini','ChinaSoft','CLPS']
        	    },
        	    toolbox: {
        	        show : true,
        	        feature : {
        	            mark : {show: true},
        	            dataView : {show: true, readOnly: false},
        	            magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
        	            restore : {show: true},
        	            saveAsImage : {show: true}
        	        }
        	    },
        	    calculable : true,
        	    xAxis : [
        	        {
        	            type : 'category',
        	            boundaryGap : false,
        	            data : ['0-30(F)','30-40(E)','40-60(D)','60-80(C)','80-100(B)','100-120(A)']
        	        }
        	    ],
        	    yAxis : [
        	        {
        	            type : 'value'
        	        }
        	    ],
        	    series : [
        	        {
        	            name:'Capgemini',
        	            type:'line',
        	            smooth:true,
        	            stack: '总量',
        	            data:[3, 4, 8, 2, 6, 1]
        	        },
        	        {
        	            name:'ChinaSoft',
        	            type:'line',
        	            smooth:true,
        	            stack: '总量',
        	            data:[2, 6, 9, 2, 7, 1]
        	        },
        	        {
        	            name:'CLPS',
        	            type:'line',
        	            smooth:true,
        	            stack: '总量',
        	            data:[1, 2, 16, 9, 5, 6]
        	        }
        	    ]
        	};

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>