package org.apache.jsp.echart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chart1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>各成绩段人数分析</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"dist/echarts.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"main\" style=\"width: 800px;height:500px;\"></div>\r\n");
      out.write("     <script type=\"text/javascript\">\r\n");
      out.write("        // 基于准备好的dom，初始化echarts实例\r\n");
      out.write("        var myChart = echarts.init(document.getElementById('main'));\r\n");
      out.write("\r\n");
      out.write("        // 指定图表的配置项和数据\r\n");
      out.write("        var option = {\r\n");
      out.write("        \t\t title: {\r\n");
      out.write("        \t\t        text: '各成绩段人数分析',\r\n");
      out.write("        \t\t        //subtext:'在此测试',\r\n");
      out.write("        \t\t        x:'center',\r\n");
      out.write("        \t\t        y:'top',\r\n");
      out.write("        \t\t        textStyle:{\r\n");
      out.write("        \t\t        \tfontSize:25,\r\n");
      out.write("        \t\t        \tfontWeight:'bold', \r\n");
      out.write("        \t\t        } \r\n");
      out.write("        \t\t        //textAlign:'left'\r\n");
      out.write("        \t\t    },\r\n");
      out.write("        \t\t    tooltip: {\r\n");
      out.write("        \t\t    \tformatter: '{a}<br/> {b0}: {c0}%<br />'\r\n");
      out.write("        \t\t    },\r\n");
      out.write("        \t\t   /*  legend: {\r\n");
      out.write("        \t\t        data:['销量'],\r\n");
      out.write("        \t\t        top:'5%'\r\n");
      out.write("        \t\t    }, */\r\n");
      out.write("        \t\t    grid:{\r\n");
      out.write("        \t\t    \ty2:140\r\n");
      out.write("        \t\t    },\r\n");
      out.write("        \t\t    xAxis: [\r\n");
      out.write("        \t\t        {\r\n");
      out.write("        \t\t    \t type : 'category',\r\n");
      out.write("        \t\t    \t position: 'bottom',\r\n");
      out.write("         \t            boundaryGap: true,\r\n");
      out.write("         \t           axisLabel : {\r\n");
      out.write("       \t                show:true,\r\n");
      out.write("       \t                interval: '0',    // {number}\r\n");
      out.write("       \t                rotate: 45,\r\n");
      out.write("       \t                margin: 8,\r\n");
      out.write("       \t                //formatter: '{value}月',\r\n");
      out.write("       \t                /* textStyle: {\r\n");
      out.write("       \t                    color: 'blue',\r\n");
      out.write("       \t                    fontFamily: 'sans-serif',\r\n");
      out.write("       \t                    fontSize: 15,\r\n");
      out.write("       \t                    fontStyle: 'italic',\r\n");
      out.write("       \t                    fontWeight: 'bold'\r\n");
      out.write("       \t                } */\r\n");
      out.write("       \t            },\r\n");
      out.write("        \t\t        data: [\"0-9\",\"10-19\",\"20-29\",\"30-39\",\"40-49\",\"50-59\",\r\n");
      out.write("        \t\t               \"60-69\",\"70-79\",\"80-89\",\"90-99\",\"100-109\",\"110-120\"]\r\n");
      out.write("        \t\t        }\r\n");
      out.write("        \t\t        ],\r\n");
      out.write("        \t\t    yAxis:[\r\n");
      out.write("        \t\t             {\r\n");
      out.write("        \t\t            \t min:0,\r\n");
      out.write("        \t\t            \t max:100,\r\n");
      out.write("        \t\t            \t splitNumber:10, \r\n");
      out.write("        \t\t            \t axisLabel : {\r\n");
      out.write("        \t\t       \t                show:true,\r\n");
      out.write("        \t\t       \t                interval: 0,    // {number}\r\n");
      out.write("        \t\t       \t                formatter: '{value}%',\r\n");
      out.write("        \t\t       \t                /* textStyle: {\r\n");
      out.write("        \t\t       \t                    color: 'blue',\r\n");
      out.write("        \t\t       \t                    fontFamily: 'sans-serif',\r\n");
      out.write("        \t\t       \t                    fontSize: 15,\r\n");
      out.write("        \t\t       \t                    fontStyle: 'italic',\r\n");
      out.write("        \t\t       \t                    fontWeight: 'bold'\r\n");
      out.write("        \t\t       \t                } */\r\n");
      out.write("        \t\t       \t            },\r\n");
      out.write("        \t\t             }\r\n");
      out.write("        \t\t         ],\r\n");
      out.write("        \t\t  series: [{\r\n");
      out.write("        \t\t        name: '成绩所占比例',\r\n");
      out.write("        \t\t        type: 'bar',\r\n");
      out.write("        \t\t        data: [10, 20, 36, 10, 10, 20,20,20,20,20,20,10],\r\n");
      out.write("        \t\t        itemStyle: {\r\n");
      out.write("                            normal: {\r\n");
      out.write("                                color: function(params) {\r\n");
      out.write("                                    var colorList = [\r\n");
      out.write("                                      '#C1232B','#B5C334','#FCCE10','#E87C25','#27727B',\r\n");
      out.write("                                       '#FE8463','#9BCA63','#FAD860','#F3A43B','#60C0DD',\r\n");
      out.write("                                       '#D7504B','#C6E579','#F4E001','#F0805A','#26C0C0'\r\n");
      out.write("                                    ];\r\n");
      out.write("                                    return colorList[params.dataIndex]\r\n");
      out.write("                                }, \r\n");
      out.write("                                //color:'#60C0DD',\r\n");
      out.write("                                label: {\r\n");
      out.write("                                    show: true,\r\n");
      out.write("                                    position: 'top',\r\n");
      out.write("                                    //formatter: '{c}'\r\n");
      out.write("                                    formatter: '{c}%'\r\n");
      out.write("                                }\r\n");
      out.write("                            }\r\n");
      out.write("                        },\r\n");
      out.write("                        barWidth:30,\r\n");
      out.write("        \t\t    }]\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        // 使用刚指定的配置项和数据显示图表。\r\n");
      out.write("        myChart.setOption(option);\r\n");
      out.write("    </script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
