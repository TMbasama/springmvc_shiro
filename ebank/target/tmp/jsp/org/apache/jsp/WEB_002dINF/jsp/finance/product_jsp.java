package org.apache.jsp.WEB_002dINF.jsp.finance;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class product_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("<link rel=\"shortcut icon\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/img/ebank_icons_57x57.png\"\r\n");
      out.write("\ttype=\"image/x-icon\">\r\n");
      out.write("<title>EBank</title>\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Roboto:400,300,300italic,100,400italic,700,500,900\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/fonts/font_1.css\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/css/bootstrap.min.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/css/theme.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/css/revslider.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/css/custom.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- DataTables -->\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/datatables/dataTables.bootstrap.css\">\t\r\n");
      out.write(" <link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/font-awesome/css/font-awesome.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write(" <link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/ebank/ebank.css\"\r\n");
      out.write("\ttype=\"text/css\" media=\"all\" />\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write("\r\n");
      out.write(" <div class=\"breadcrumbs\">\r\n");
      out.write("    \t<div class=\"container\">\r\n");
      out.write("        \t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">首页</a><span>/</span><a href=\"javascript:void(0);\">投资理财</a><span>/</span>理财产品\r\n");
      out.write("            <!-- <h1 class=\"title-page\">基金列表</h1> -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("              <table id=\"example1\" class=\"table table-bordered table-striped\">\r\n");
      out.write("              </table>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/guide/jquery-1.11.0.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/datatables/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/datatables/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("<!-- page script -->\r\n");
      out.write("<script>\r\n");
      out.write("  $(function () {\r\n");
      out.write("    /* $(\"#example1\").DataTable({\r\n");
      out.write("    \t\r\n");
      out.write("    }); */\r\n");
      out.write("    var dataTable=$('#example1').DataTable({\r\n");
      out.write("\t\t\"bLengthChange\" : false,\r\n");
      out.write("\t\t\"bPaginate\" : true, //翻页功能\r\n");
      out.write("\t\t\"bFilter\" : true,\r\n");
      out.write("\t\t//保存状态到cookie *************** 很重要 ， 当搜索的时候页面一刷新会导致搜索的消失。使用这个属性就可避免了\r\n");
      out.write("\t\t//\"bStateSave\" : true,\r\n");
      out.write("\t\t//改变每页显示数据数量\r\n");
      out.write("\t\t\"bLengthChange\" : false,\r\n");
      out.write("\t\t\"bSort\" : true,\r\n");
      out.write("\t\t\"iDisplayLength\" : 10,\r\n");
      out.write("\t\t\"sPaginationType\" : \"full_numbers\",\r\n");
      out.write("\t\t\"bProcessing\" : true,\r\n");
      out.write("\t\t\"bServerSide\" : true,\r\n");
      out.write("\t\t\"searching\" : false,\r\n");
      out.write("\t\t\"sAjaxSource\" : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/finance/prodList\",\r\n");
      out.write("\t\t/* \"fnServerParams\" : function(aoData) {\r\n");
      out.write("\t\t\tfor (var i = 0; i < searchData.length; i++) {\r\n");
      out.write("\t\t\t\taoData.push(searchData[i]);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}, */\r\n");
      out.write("\t\t\"sServerMethod\" : \"POST\",\r\n");
      out.write("\t\t\"data\" : null,\r\n");
      out.write("\t\t\"aaSorting\": [[4, \"desc\"]],\r\n");
      out.write("\t\t//列的定义\r\n");
      out.write("\t\t\"aoColumns\" : [ {\r\n");
      out.write("\t\t\t\"data\" : \"name\",\r\n");
      out.write("\t\t\t\"sTitle\" : \"基本信息\"\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\t\"data\" : \"currency\",\r\n");
      out.write("\t\t\t\"sTitle\" : \"币种\"\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\t\"data\" : \"start_amount\",\r\n");
      out.write("\t\t\t\"sTitle\" : \"起购金额\"\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\t\"data\" : \"deadline\",\r\n");
      out.write("\t\t\t\"sTitle\" : \"投资期限\"\r\n");
      out.write("\t\t} ,{\r\n");
      out.write("\t\t\t\"data\" : \"issue_date\",\r\n");
      out.write("\t\t\t\"sTitle\" : \"发行日期\"\r\n");
      out.write("\t\t}   ,{\r\n");
      out.write("\t\t\t\"data\" : \"profit\",\r\n");
      out.write("\t\t\t\"sTitle\" : \"预计年化收益率\"\r\n");
      out.write("\t\t}  ,{\r\n");
      out.write("\t\t\t\"bSortable\": false,\r\n");
      out.write("\t\t\t\"sTitle\" : \"操作\",\r\n");
      out.write("\t\t\t// 定义操作列\r\n");
      out.write("\t\t\t\"targets\" : 6,//操作按钮目标列\r\n");
      out.write("\t\t\t\"render\" : function(data,type,row) {\r\n");
      out.write("\t\t\t//var params =JSON.stringify(row).name;\r\n");
      out.write("\t\t\t//console.log(row);\r\n");
      out.write("\t\t\tvar param=row.id;\r\n");
      out.write("\t\t\tvar html= '<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/finance/product/purchase?id='+param+'\" class=\"btn btn-primary btn-sm\"  > 购买</a>';\r\n");
      out.write("\t\t\treturn html;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t}],\r\n");
      out.write("\t//visible-设置列不可见\t\t\r\n");
      out.write("\t \"columnDefs\": [\r\n");
      out.write("\t\t\t         {\r\n");
      out.write("\t\t\t           \"render\": function ( data, type, row ) {\r\n");
      out.write("\t\t\t                        return '<b class=\"header\">'+data+'</b>';\r\n");
      out.write("\t\t\t             },\r\n");
      out.write("\t\t\t                    \"targets\": 0\r\n");
      out.write("\t\t\t                },\r\n");
      out.write("\t\t\t         {\r\n");
      out.write("\t\t\t           \"render\": function ( data, type, row ) {\r\n");
      out.write("\t\t\t                        return data+'万';\r\n");
      out.write("\t\t\t             },\r\n");
      out.write("\t\t\t                    \"targets\": 2\r\n");
      out.write("\t\t\t                },\r\n");
      out.write("\t\t\t         {\r\n");
      out.write("\t\t\t           \"render\": function ( data, type, row ) {\r\n");
      out.write("\t\t\t                        return data+'天';\r\n");
      out.write("\t\t\t             },\r\n");
      out.write("\t\t\t                    \"targets\": 3\r\n");
      out.write("\t\t\t                },\r\n");
      out.write("\t\t\t         {\r\n");
      out.write("\t\t\t           \"render\": function ( data, type, row ) {\r\n");
      out.write("\t\t\t                        return ''+data+'%';\r\n");
      out.write("\t\t\t             },\r\n");
      out.write("\t\t\t                    \"targets\": 5\r\n");
      out.write("\t\t\t                },\r\n");
      out.write("\t\t\t         \r\n");
      out.write("\t\t\t         /* {\"bSortable\": false,\"targets\": [6]} */\r\n");
      out.write("\t\t\t            ],\t\r\n");
      out.write("\t\t\"language\" : {\r\n");
      out.write("\t\t\t\"processing\" : \"处理中...\",\r\n");
      out.write("\t\t\t\"lengthMenu\" : \"显示 _MENU_ 项结果\",\r\n");
      out.write("\t\t\t\"zeroRecords\" : \"没有匹配结果\",\r\n");
      out.write("\t\t\t\"info\" : \"显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项\",\r\n");
      out.write("\t\t\t\"infoEmpty\" : \"显示第 0 至 0 项结果，共 0 项\",\r\n");
      out.write("\t\t\t\"infoFiltered\" : \"(由 _MAX_ 项结果过滤)\",\r\n");
      out.write("\t\t\t\"infoPostFix\" : \"\",\r\n");
      out.write("\t\t\t\"search\" : \"搜索:\",\r\n");
      out.write("\t\t\t\"searchPlaceholder\" : \"搜索...\",\r\n");
      out.write("\t\t\t\"url\" : \"\",\r\n");
      out.write("\t\t\t\"emptyTable\" : \"表中数据为空\",\r\n");
      out.write("\t\t\t\"loadingRecords\" : \"载入中...\",\r\n");
      out.write("\t\t\t\"infoThousands\" : \",\",\r\n");
      out.write("\t\t\t\"paginate\" : {\r\n");
      out.write("\t\t\t\t\"first\" : \"首页\",\r\n");
      out.write("\t\t\t\t\"previous\" : \"上页\",\r\n");
      out.write("\t\t\t\t\"next\" : \"下页\",\r\n");
      out.write("\t\t\t\t\"last\" : \"末页\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\"aria\" : {\r\n");
      out.write("\t\t\t\tpaginate : {\r\n");
      out.write("\t\t\t\t\tfirst : '首页',\r\n");
      out.write("\t\t\t\t\tprevious : '上页',\r\n");
      out.write("\t\t\t\t\tnext : '下页',\r\n");
      out.write("\t\t\t\t\tlast : '末页'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t\"sortAscending\" : \": 以升序排列此列\",\r\n");
      out.write("\t\t\t\t\"sortDescending\" : \": 以降序排列此列\"\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\t\"decimal\" : \"-\",\r\n");
      out.write("\t\t\t\"thousands\" : \".\"\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("  });\r\n");
      out.write("</script>\r\n");
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
