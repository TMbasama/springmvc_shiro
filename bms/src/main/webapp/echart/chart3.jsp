<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考生培训与直考人数分析</title>
<script type="text/javascript" src="dist/echarts.min.js"></script>
<style type="text/css">
p{
margin-top:0px;
margin-left:250px;
font-size:20px;
}
.f{
padding:0px;
float:left;
}
</style>
</head>
<body>
    <div id="main" style="width: 1200px;height:500px;"></div>
    <div class="f">
    <p>Java</p>
    </div>
    <div class="f">
    <p>Mainframe</p>
    </div>
    <div class="f">
    <p>Testing</p>
    </div>
     <script type="text/javascript">
     var i=1;
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        // 指定图表的配置项和数据
        var option = {
        		 title: {
        		        text: '各成绩段人数分析',
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
        		   legend: {
        		        data:['Capgemini','ChinaSoft','CLPS'],
        		        top:'10%'
        		    },
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
       	                interval: 'auto',    // {number}
       	                rotate: 90,
       	                //formatter: '{value}月',
       	                /* textStyle: {
       	                    color: 'blue',
       	                    fontFamily: 'sans-serif',
       	                    fontSize: 15,
       	                    fontStyle: 'italic',
       	                    fontWeight: 'bold'
       	                } */
       	            },
       	         axisTick : {    // 轴标记
 	                show:true,
 	                length: 150,
 	               interval: 4,
 	                lineStyle: {
 	                    type: 'solid',
 	                    //width: 2
 	                    //width:2
 	                }
 	            },  
       	        /*  splitArea : {
       	        	interval:4,
 	                show: true,
 	                areaStyle:{
 	                    color:['rgba(144,238,144,0.3)','rgba(135,200,250,0.3)']
 	                }
 	            }, */
        		        data: ["0-9","10-19","20-29","30-39","40-49",
        		               "0-9","10-19","20-29","30-39","40-49",
        		               "0-9","10-19","20-29","30-39","40-49"]
        		        }
        		        ],
        		    yAxis:[
        		             {
        		            	 show:false,
        		             }
        		         ],
        		  series: [{
        		        name: 'Capgemini',
        		        type: 'bar',
        		        data: [10, 20, 36, 10, 10, 20,20,20,20,20,20,10,1,1,3],
        		        itemStyle: {
                            normal: {
                            	color:'#F3A43B',
                               /*  color: function(params) {
                                    var colorList = [
                                      '#C1232B','#B5C334','#FCCE10','#E87C25','#27727B',
                                       '#FE8463','#9BCA63','#FAD860','#F3A43B','#60C0DD',
                                       '#D7504B','#C6E579','#F4E001','#F0805A','#26C0C0'
                                    ];
                                    return colorList[params.dataIndex]
                                }, */
                                label: {
                                    show: true,
                                    position: 'top',
                                    //formatter: '{c}'
                                    formatter: '{c}',
                                    textStyle: {
                   	                    color: 'black',
                   	                    fontSize: 5
                   	                } 
                                }
                            }
                        },
                        barWidth:15,
        		    },
        		    {
        		        name: 'ChinaSoft',
        		        type: 'bar',
        		        data: [10, 20, 36, 10, 10, 20,20,20,20,20,20,10,1,1,3],
        		        itemStyle: {
                            normal: {
                            	color:'#60C0DD',
                               /*  color: function(params) {
                                    var colorList = [
                                      '#C1232B','#B5C334','#FCCE10','#E87C25','#27727B',
                                       '#FE8463','#9BCA63','#FAD860','#F3A43B','#60C0DD',
                                       '#D7504B','#C6E579','#F4E001','#F0805A','#26C0C0'
                                    ];
                                    return colorList[params.dataIndex]
                                }, */
                                label: {
                                    show: true,
                                    position: 'top',
                                    //formatter: '{c}'
                                    formatter: '{c}',
                                    textStyle: {
                   	                    color: 'black',
                   	                    fontSize: 5
                   	                } 
                                }
                            }
                        },
                        barWidth:15,
        		    },
        		    {
        		        name: 'CLPS',
        		        type: 'bar',
        		        data: [10, 20, 36, 10, 10, 20,20,20,20,20,20,10,1,1,3],
        		        itemStyle: {
                            normal: {
                            	color:'#D7504B',
                               /*  color: function(params) {
                                    var colorList = [
                                      '#C1232B','#B5C334','#FCCE10','#E87C25','#27727B',
                                       '#FE8463','#9BCA63','#FAD860','#F3A43B','#60C0DD',
                                       '#D7504B','#C6E579','#F4E001','#F0805A','#26C0C0'
                                    ];
                                    return colorList[params.dataIndex]
                                }, */
                                label: {
                                    show: true,
                                    position: 'top',
                                    //formatter: '{c}'
                                    formatter: '{c}',
                                    textStyle: {
                   	                    color: 'black',
                   	                    fontSize: 5
                   	                } 
                                }
                            }
                        },
                        barWidth:15,
        		    }
        		    ]
        };

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>