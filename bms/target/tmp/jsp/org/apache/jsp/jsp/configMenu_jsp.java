package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class configMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/zTree_v3/css/demo.css\" type=\"text/css\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"../static/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/zTree_v3/css/metroStyle/metroStyle.css\" type=\"text/css\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/zTree_v3/js/jquery-1.4.4.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/zTree_v3/js/jquery.ztree.core.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/zTree_v3/js/jquery.ztree.excheck.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/plugins/zTree_v3/js/jquery.ztree.exedit.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/common/jquery.json-2.4.js\"></script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("     .test1 ul{\r\n");
      out.write("       margin: 0 auto;\r\n");
      out.write("        }\r\n");
      out.write("     #submit{\r\n");
      out.write("     width:100px;margin:15px auto;display:block;\r\n");
      out.write("     }   \r\n");
      out.write("     </style>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    var id=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("    console.log(\"id:\"+id);\r\n");
      out.write("        var setting = {\r\n");
      out.write("            /* view: {\r\n");
      out.write("                addHoverDom: addHoverDom,\r\n");
      out.write("                removeHoverDom: removeHoverDom,\r\n");
      out.write("                selectedMulti: false\r\n");
      out.write("            }, */\r\n");
      out.write("            check: {\r\n");
      out.write("                enable: true\r\n");
      out.write("            },\r\n");
      out.write("            data: {\r\n");
      out.write("                simpleData: {\r\n");
      out.write("                    enable: true\r\n");
      out.write("                }\r\n");
      out.write("            },\r\n");
      out.write("            /* edit: {\r\n");
      out.write("                enable: true\r\n");
      out.write("            } */\r\n");
      out.write("        };\r\n");
      out.write("\r\n");
      out.write("        var tree;\r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("        \tvar menuData;\r\n");
      out.write("        \t$.ajax({\r\n");
      out.write("        \t\turl:'../role/findMenuByRoleId',\r\n");
      out.write("        \t\tasync : false,\r\n");
      out.write("        \t\tdata:{roleId:id},\r\n");
      out.write("        \t\ttype : 'get',\r\n");
      out.write("        \t\tdataType : 'json',\r\n");
      out.write("        \t\tsuccess : function(data) {\r\n");
      out.write("        \t\t\t//后台数据\r\n");
      out.write("        \t\t\tmenuData=data.data;\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t});\r\n");
      out.write("        \t//ztree初始化\r\n");
      out.write("           tree= $.fn.zTree.init($(\"#treeDemo\"), setting, menuData[0].children);\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        /**\r\n");
      out.write("         * 去除数组里面的空格\r\n");
      out.write("         * @param arr\r\n");
      out.write("         * @returns\r\n");
      out.write("         */\r\n");
      out.write("        function clearNullArr(arr){ \r\n");
      out.write("        \tfor(var i=0,len=arr.length;i<len;i++){ \r\n");
      out.write("        \tif(!arr[i]||arr[i]==''||arr[i] === undefined){ \r\n");
      out.write("        \tarr.splice(i,1); \r\n");
      out.write("        \tlen--; \r\n");
      out.write("        \ti--; \r\n");
      out.write("        \t} \r\n");
      out.write("        \t} \r\n");
      out.write("        \treturn arr; \r\n");
      out.write("        \t}\r\n");
      out.write("        \r\n");
      out.write("       function getNodes(){\r\n");
      out.write("    \t   var nodes = tree.getCheckedNodes();\r\n");
      out.write("    \t   console.log(nodes);\r\n");
      out.write("    \t   var menuIds=new Array();\r\n");
      out.write("    \t   $.each(nodes,function(i,o){\r\n");
      out.write("    \t\t   menuIds.unshift(o.id);\r\n");
      out.write("    \t   })\r\n");
      out.write("    \t   var params='menuIds='+$.toJSON(clearNullArr(menuIds));\r\n");
      out.write("    \t   $.ajax({\r\n");
      out.write("       \t\turl:'../role/configMenu',\r\n");
      out.write("       \t\tasync : false,\r\n");
      out.write("       \t\tdata:$.param({roleId:id})+'&'+params,\r\n");
      out.write("       \t\ttype : 'get',\r\n");
      out.write("       \t\tdataType : 'json',\r\n");
      out.write("       \t\tsuccess : function(data) {\r\n");
      out.write("       \t\t\tif(data.code==\"0000\"){\r\n");
      out.write("    \t\t\t\tparent.layer.msg('设置菜单成功',{icon:1});\r\n");
      out.write("    \t\t\t\tvar index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引\r\n");
      out.write("    \t\t\t\tparent.layer.close(index);\r\n");
      out.write("    \t\t\t}else{\r\n");
      out.write("    \t\t\tlayer.msg('设置菜单失败',{icon:2});\r\n");
      out.write("    \t\t\t}\r\n");
      out.write("       \t\t}\r\n");
      out.write("       \t});\r\n");
      out.write("       }\r\n");
      out.write("   </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"test1\" >\r\n");
      out.write("        <ul id=\"treeDemo\" class=\"ztree\" width=\"100%\"></ul>\r\n");
      out.write("    </div>\r\n");
      out.write("     <div class=\"layui-form-item\">\r\n");
      out.write("    <divclass=\"layui-input-block\">\r\n");
      out.write("      <button class=\"layui-btn layui-btn-primary layui-btn-small\" id=\"submit\" onclick=\"getNodes()\">立即提交</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
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
