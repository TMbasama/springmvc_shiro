package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link rel=\"stylesheet\" href=\"../static/layui/css/layui.css\" media=\"all\" />\r\n");
      out.write("<script src=\"../plugins/jQuery/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form class=\"layui-form\" action=\"\">\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">产品名称</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"name\" lay-verify=\"required\"  placeholder=\"请输入用户名\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  \r\n");
      out.write("  <div class=\"layui-form-item\" id=\"file\">\r\n");
      out.write("  <label class=\"layui-form-label\">请选择图片</label>\r\n");
      out.write("  <div class=\"layui-input-inline\">\r\n");
      out.write("       <input type=\"file\"  name=\"file\" class=\"layui-upload-file\" onchange=\"setName(this)\" />\r\n");
      out.write("  </div>     \r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">产品价格</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"price\" lay-verify=\"required\" placeholder=\"￥\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("   <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">产品编号</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" name=\"uniqueNum\" lay-verify=\"required\" placeholder=\"请输入产品编号\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- <div class=\"layui-form-item\">\r\n");
      out.write("    <div class=\"layui-inline\">\r\n");
      out.write("      <label class=\"layui-form-label\">范围</label>\r\n");
      out.write("      <div class=\"layui-input-inline\" style=\"width: 100px;\">\r\n");
      out.write("        <input type=\"text\" name=\"price_min\" placeholder=\"￥\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"layui-form-mid\">-</div>\r\n");
      out.write("      <div class=\"layui-input-inline\" style=\"width: 100px;\">\r\n");
      out.write("        <input type=\"text\" name=\"price_max\" placeholder=\"￥\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> -->\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"layui-form-item\">\r\n");
      out.write("    <div class=\"layui-input-block\">\r\n");
      out.write("      <button class=\"layui-btn\" lay-submit lay-filter=\"demo1\">立即提交</button>\r\n");
      out.write("      <button type=\"reset\" class=\"layui-btn layui-btn-primary\">重置</button>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </form>\r\n");
      out.write(" <script src=\"../static/layui/layui.js\" charset=\"utf-8\">\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("function setName(file){\r\n");
      out.write("\tconsole.log(file.value);\r\n");
      out.write("\t}\r\n");
      out.write("layui.use('upload', function(){\r\n");
      out.write("  layui.upload({\r\n");
      out.write("    url: '../product/upload' //上传接口\r\n");
      out.write("    ,success: function(data){ //上传成功后的回调\r\n");
      out.write("      console.log(data);\r\n");
      out.write("    if(data.code==\"0000\"){\r\n");
      out.write("    \t$(\"#file\").append(\"<i class='layui-icon' style='font-size: 25px; color: #F7B824;''>&#xe60c;</i><a style=' color:#F7B824;'>上传\"+data.data+\"成功!</a>\");\r\n");
      out.write("    }\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  /* layui.upload({\r\n");
      out.write("    url: '/test/upload.json'\r\n");
      out.write("    ,elem: '#test' //指定原始元素，默认直接查找class=\"layui-upload-file\"\r\n");
      out.write("    ,method: 'get' //上传接口的http类型\r\n");
      out.write("    ,success: function(res){\r\n");
      out.write("      LAY_demo_upload.src = res.url;\r\n");
      out.write("    }\r\n");
      out.write("  }); */\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("layui.use(['form', 'layedit', 'laydate'], function(){\r\n");
      out.write("  var form = layui.form()\r\n");
      out.write("  ,layer = layui.layer\r\n");
      out.write("  ,layedit = layui.layedit\r\n");
      out.write("  ,laydate = layui.laydate;\r\n");
      out.write("  \r\n");
      out.write("  //创建一个编辑器\r\n");
      out.write("  var editIndex = layedit.build('LAY_demo_editor');\r\n");
      out.write(" \r\n");
      out.write("  //自定义验证规则\r\n");
      out.write("  form.verify({\r\n");
      out.write("    title: function(value){\r\n");
      out.write("      if(value.length < 5){\r\n");
      out.write("        return '标题至少得5个字符啊';\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("    ,pass: [/(.+){6,12}$/, '密码必须6到12位']\r\n");
      out.write("    ,content: function(value){\r\n");
      out.write("      layedit.sync(editIndex);\r\n");
      out.write("    }\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  //监听指定开关\r\n");
      out.write("  form.on('switch(switchTest)', function(data){\r\n");
      out.write("    layer.msg('开关checked：'+ (this.checked ? 'true' : 'false'), {\r\n");
      out.write("      offset: '6px'\r\n");
      out.write("    });\r\n");
      out.write("    layer.tips('温馨提示：请注意开关状态的文字可以随意定义，而不仅仅是ON|OFF', data.othis)\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  //监听提交\r\n");
      out.write("  form.on('submit(demo1)', function(data){\r\n");
      out.write("   console.log(data.field);\r\n");
      out.write("    $.ajax({\r\n");
      out.write("\t\turl:'../product/add',\r\n");
      out.write("\t\tasync : false,\r\n");
      out.write("\t\ttype : 'post',\r\n");
      out.write("\t\tdata:data.field,\r\n");
      out.write("\t\tdataType : 'json',\r\n");
      out.write("\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\tif(data.code==\"0000\"){\r\n");
      out.write("\t\t\tlayer.msg('新增成功',{icon:1});\r\n");
      out.write("\t\t\twindow.parent.location.reload();\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\tlayer.msg('新增失败',{icon:1});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("    return true;\r\n");
      out.write("  });\r\n");
      out.write("  \r\n");
      out.write("  \r\n");
      out.write("});\r\n");
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
