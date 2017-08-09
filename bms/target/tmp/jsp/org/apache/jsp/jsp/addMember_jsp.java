package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addMember_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t $.ajax({\r\n");
      out.write("\t\t\turl:'../store/queryAll',\r\n");
      out.write("\t\t\ttype : 'post',\r\n");
      out.write("\t\t\tdataType : 'json',\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tvar opt='';\r\n");
      out.write("\t\t\t\t$.each(data.data,function(index,object){\r\n");
      out.write("\t\t\t\t\tconsole.log(object);\r\n");
      out.write("\t\t\t\t\topt+='<option value=\"'+object.id+'\">'+object.name+'</option>';\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t\t    console.log(opt);\r\n");
      out.write("\t\t\t\t   //$(\"#shop\").append('<option value=\"/'+object.id+'/\">'+object.name+'</option>');\r\n");
      out.write("\t\t\t\t\t$(\"#shop\").html(opt);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}); \t\r\n");
      out.write("}\t\r\n");
      out.write(");\t\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form class=\"layui-form\">\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">会员名称</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <input type=\"text\" id=\"name\" name=\"name\" lay-verify=\"required\" placeholder=\"请输入会员名称\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">性别</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <select id=\"gender\" name=\"gender\" lay-filter=\"aihao\">\r\n");
      out.write("        <option value=\"\"></option>\r\n");
      out.write("        <option value=\"男\">男</option>\r\n");
      out.write("        <option value=\"女\">女</option>\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("<div class=\"layui-form-item\">\r\n");
      out.write("      <label class=\"layui-form-label\">出生日期</label>\r\n");
      out.write("      <div class=\"layui-input-inline\">\r\n");
      out.write("        <input type=\"text\" name=\"birthday\" id=\"birthday\" lay-verify=\"date\" placeholder=\"yyyy-mm-dd\" autocomplete=\"off\" class=\"layui-input\" onclick=\"layui.laydate({elem: this})\">\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>  \r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("      <label class=\"layui-form-label\">手机号码</label>\r\n");
      out.write("      <div class=\"layui-input-inline\">\r\n");
      out.write("        <input type=\"tel\" id=\"phone\" name=\"phone\" lay-verify=\"phone\" placeholder=\"请输入手机号码\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("      <label class=\"layui-form-label\">会员卡号</label>\r\n");
      out.write("      <div class=\"layui-input-inline\">\r\n");
      out.write("        <input type=\"text\" id=\"cardNum\" name=\"cardNum\" lay-verify=\"\" placeholder=\"请输入会员卡号\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("      <label class=\"layui-form-label\">会员等级</label>\r\n");
      out.write("       <div class=\"layui-input-inline\">\r\n");
      out.write("      <select id=\"level\" name=\"level\">\r\n");
      out.write("        <option value=\"\"></option>\r\n");
      out.write("        <option value=\"普通会员\">普通会员</option>\r\n");
      out.write("        <option value=\"银卡\">银卡</option>\r\n");
      out.write("        <option value=\"金卡\">金卡</option>\r\n");
      out.write("      </select>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">所属店铺</label>\r\n");
      out.write("    <div class=\"layui-input-inline\">\r\n");
      out.write("      <select id=\"shop\" name=\"shop\">\r\n");
      out.write("        <option value=\"\">请选择店铺</option>\r\n");
      out.write("        <!-- <option value=\"总店\">总店</option>\r\n");
      out.write("        <option value=\"上海分店\">上海分店</option>\r\n");
      out.write("        <option value=\"南昌分店\">南昌分店</option>\r\n");
      out.write("        <option value=\"长沙分店\">长沙分店</option>\r\n");
      out.write("        <option value=\"海口分店\">海口分店</option> -->\r\n");
      out.write("      </select>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <!-- <div class=\"layui-form-item\">\r\n");
      out.write("    <label class=\"layui-form-label\">身份证号码</label>\r\n");
      out.write("    <div class=\"layui-input-block\">\r\n");
      out.write("      <input type=\"text\" name=\"identity\" lay-verify=\"\" placeholder=\"请输入正确的身份证号\" autocomplete=\"off\" class=\"layui-input\">\r\n");
      out.write("    </div>\r\n");
      out.write("  </div> -->\r\n");
      out.write("  \r\n");
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
      out.write("  \r\n");
      out.write("  //监听提交\r\n");
      out.write("  form.on('submit(demo1)', function(data){\r\n");
      out.write("  /*  layer.alert(JSON.stringify(data.field), {\r\n");
      out.write("      title: '最终的提交信息'\r\n");
      out.write("    }) */\r\n");
      out.write("    $.ajax({\r\n");
      out.write("\t\turl:'../member/add',\r\n");
      out.write("\t\tasync : false,\r\n");
      out.write("\t\ttype : 'post',\r\n");
      out.write("\t\tdata:data.field,\r\n");
      out.write("\t\tdataType : 'json',\r\n");
      out.write("\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\tif(data.code==\"0000\"){\r\n");
      out.write("\t\t\t\tparent.layer.msg('新增成功',{icon:1});\r\n");
      out.write("\t\t\t\t var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引\r\n");
      out.write("\t\t\t\t    parent.layer.close(index);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\tlayer.msg('新增失败',{icon:2});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("   \r\n");
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
