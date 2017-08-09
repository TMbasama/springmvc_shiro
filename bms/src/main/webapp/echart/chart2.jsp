<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考试年龄分布</title>
<script type="text/javascript" src="dist/echarts.min.js"></script>
</head>
<body>
    <div id="main" style="width: 800px;height:500px;"></div>
     <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        var option = {
        		 title: {
        		        text: '考试年龄分布',
        		        //subtext:'在此测试',
        		        x:'center',
        		        y:'top',
        		        textStyle:{
        		        	fontSize:30,
        		        	fontWeight:'bold', 
        		        } 
        		        //textAlign:'left'
        		    },
        		    tooltip: {
        		    	formatter: '{a}<br/> {b0}: {c0}%<br />'
        		    },
        		   /*  legend: {
        		        data:['销量'],
        		        top:'5%'
        		    }, */
        		    grid:{
        		    	y2:140
        		    },
        		    xAxis: [
        		        {
        		    	 type : 'category',
        		    	 position: 'bottom',
         	            boundaryGap: true,
         	           axisLabel : {
       	                show:true,
       	                interval: '0',    // {number}
       	                //rotate: 45,
       	                margin: 8,
       	                //formatter: '{value}月',
       	                /* textStyle: {
       	                    color: 'blue',
       	                    fontFamily: 'sans-serif',
       	                    fontSize: 15,
       	                    fontStyle: 'italic',
       	                    fontWeight: 'bold'
       	                } */
       	            },
        		        data: ["19","20","21","22","23","24",
        		               "25","26","27","28","29","30",
        		               "31","32","33","34"]
        		        }
        		        ],
        		    yAxis:[
        		             {
        		            	 show:false
        		             }
        		         ],
        		  series: [{
        		        name: '成绩所占比例',
        		        type: 'bar',
        		        data: [10, 20, 36, 10, 10, 20,20,20,20,20,20,10,1.1,1.1,3.2,2.2],
        		        itemStyle: {
                            normal: {
                                color: function(params) {
                                    // build a color map as your need.
                                    var colorList = [
                                      '#C1232B','#B5C334','#FCCE10','#E87C25','#27727B',
                                       '#FE8463','#9BCA63','#FAD860','#F3A43B','#60C0DD',
                                       '#D7504B','#C6E579','#F4E001','#F0805A','#26C0C0'
                                    ];
                                    return colorList[params.dataIndex]
                                },
                                label: {
                                    show: true,
                                    position: 'top',
                                    //formatter: '{c}'
                                    formatter: '{c}%'
                                }
                            }
                        },
                        barWidth:30,
        		    }]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>