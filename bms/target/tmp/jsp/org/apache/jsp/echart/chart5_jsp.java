package org.apache.jsp.echart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chart5_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <div id=\"main\" style=\"margin-left:10%;width: 80%;height:500px;\"></div>\r\n");
      out.write("     <script type=\"text/javascript\">\r\n");
      out.write("        // 基于准备好的dom，初始化echarts实例\r\n");
      out.write("        var myChart = echarts.init(document.getElementById('main'));\r\n");
      out.write("        // 指定图表的配置项和数据\r\n");
      out.write("        var option = {\r\n");
      out.write("        \t    tooltip : {\r\n");
      out.write("        \t        trigger: 'axis'\r\n");
      out.write("        \t    },\r\n");
      out.write("        \t    legend: {\r\n");
      out.write("        \t        data:['Capgemini','ChinaSoft','CLPS']\r\n");
      out.write("        \t    },\r\n");
      out.write("        \t    toolbox: {\r\n");
      out.write("        \t        show : true,\r\n");
      out.write("        \t        feature : {\r\n");
      out.write("        \t            mark : {show: true},\r\n");
      out.write("        \t            dataView : {show: true, readOnly: false},\r\n");
      out.write("        \t            magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},\r\n");
      out.write("        \t            restore : {show: true},\r\n");
      out.write("        \t            saveAsImage : {show: true}\r\n");
      out.write("        \t        }\r\n");
      out.write("        \t    },\r\n");
      out.write("        \t    calculable : true,\r\n");
      out.write("        \t    xAxis : [\r\n");
      out.write("        \t        {\r\n");
      out.write("        \t            type : 'category',\r\n");
      out.write("        \t            boundaryGap : false,\r\n");
      out.write("        \t            data : ['0-30(F)','30-40(E)','40-60(D)','60-80(C)','80-100(B)','100-120(A)']\r\n");
      out.write("        \t        }\r\n");
      out.write("        \t    ],\r\n");
      out.write("        \t    yAxis : [\r\n");
      out.write("        \t        {\r\n");
      out.write("        \t            type : 'value'\r\n");
      out.write("        \t        }\r\n");
      out.write("        \t    ],\r\n");
      out.write("        \t    series : [\r\n");
      out.write("        \t        {\r\n");
      out.write("        \t            name:'Capgemini',\r\n");
      out.write("        \t            type:'line',\r\n");
      out.write("        \t            smooth:true,\r\n");
      out.write("        \t            stack: '总量',\r\n");
      out.write("        \t            data:[3, 4, 8, 2, 6, 1]\r\n");
      out.write("        \t        },\r\n");
      out.write("        \t        {\r\n");
      out.write("        \t            name:'ChinaSoft',\r\n");
      out.write("        \t            type:'line',\r\n");
      out.write("        \t            smooth:true,\r\n");
      out.write("        \t            stack: '总量',\r\n");
      out.write("        \t            data:[2, 6, 9, 2, 7, 1]\r\n");
      out.write("        \t        },\r\n");
      out.write("        \t        {\r\n");
      out.write("        \t            name:'CLPS',\r\n");
      out.write("        \t            type:'line',\r\n");
      out.write("        \t            smooth:true,\r\n");
      out.write("        \t            stack: '总量',\r\n");
      out.write("        \t            data:[1, 2, 16, 9, 5, 6]\r\n");
      out.write("        \t        }\r\n");
      out.write("        \t    ]\r\n");
      out.write("        \t};\r\n");
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
