/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.93
 * Generated at: 2024-09-02 02:18:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Register </title>\r\n");
      out.write("<style>\r\n");
      out.write("        body{\r\n");
      out.write("           <!-- background-image: url(\"https://image.shutterstock.com/image-vector/flowing-dot-particles-light-wave-260nw-2449606511.jpg\");-->\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("        }\r\n");
      out.write("        section{\r\n");
      out.write("            /* border: 10px solid; */\r\n");
      out.write("            width: 500px;\r\n");
      out.write("            height: 550px;\r\n");
      out.write("            margin-left: 320px;\r\n");
      out.write("            border-radius: 20px;\r\n");
      out.write("            background-color: rgb(255, 114, 63);\r\n");
      out.write("            box-shadow: 5px 5px 5px  5px rgb(71, 71, 71);\r\n");
      out.write("        }\r\n");
      out.write("        form{\r\n");
      out.write("            padding-left: 80px;\r\n");
      out.write("            \r\n");
      out.write("        }\r\n");
      out.write("        h1{\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 30px;\r\n");
      out.write("        }\r\n");
      out.write("        #name,#email,#phone{\r\n");
      out.write("            margin-left: 40px;\r\n");
      out.write("        }\r\n");
      out.write("        #course{\r\n");
      out.write("            margin-left: 35px;\r\n");
      out.write("        }\r\n");
      out.write("        #edu{\r\n");
      out.write("            margin-left: 14px;\r\n");
      out.write("        }\r\n");
      out.write("        #str{\r\n");
      out.write("            margin-left: 35px;\r\n");
      out.write("        }\r\n");
      out.write("        #yop{\r\n");
      out.write("            margin-left: 50px;\r\n");
      out.write("        }\r\n");
      out.write("        #gender{\r\n");
      out.write("            margin-left: 33px;\r\n");
      out.write("        }\r\n");
      out.write("        #fees{\r\n");
      out.write("            margin-left: 22px;\r\n");
      out.write("        }\r\n");
      out.write("        input{\r\n");
      out.write("            height: 25px;\r\n");
      out.write("            width: 250px;\r\n");
      out.write("            border-radius: 6px;\r\n");
      out.write("            border: none;\r\n");
      out.write("        }\r\n");
      out.write("        #btn{\r\n");
      out.write("            margin-left: 100px;\r\n");
      out.write("            height: 30px;\r\n");
      out.write("            width: 150px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            font-weight: 700;\r\n");
      out.write("            background-color: rgb(13, 160, 219);\r\n");
      out.write("        }\r\n");
      out.write("        #btn:hover{\r\n");
      out.write("            transform: scale(1.1);\r\n");
      out.write("            color: whitesmoke;\r\n");
      out.write("        }\r\n");
      out.write("        input:hover{\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 6px;\r\n");
      out.write("            box-shadow: 0px 2px 0px 1px whitesmoke;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <section>\r\n");
      out.write("        <h1><i>Register</i></h1>\r\n");
      out.write("        <form action=\"reg\">\r\n");
      out.write("           <b> Email:</b> <input id=\"email\" type=\"email\" name=\"m\" /><br /><br>\r\n");
      out.write("            <b>Name:</b> <input id=\"name\" type=\"text\" name=\"n\" /><br /><br>\r\n");
      out.write("            <b>Phone:</b> <input id=\"phone\" type=\"telephone\" name=\"p\" /><br /><br>\r\n");
      out.write("            <b>Course:</b> <input id=\"course\" type=\"text\" name=\"c\" /><br /><br>\r\n");
      out.write("            <b>Education:</b> <input id=\"edu\" type=\"text\" name=\"e\" /><br /><br>\r\n");
      out.write("            <b>Stream:</b> <input id=\"str\" type=\"text\" name=\"s\" /><br /><br>\r\n");
      out.write("            <b>YOP:</b> <input id=\"yop\" type=\"number\" name=\"y\" /><br /><br>\r\n");
      out.write("            <b>Gender:</b> <input id=\"gender\" type=\"text\" name=\"g\" /><br /><br>\r\n");
      out.write("            <b>FeesPaid: </b><input id=\"fees\" type=\"text\" name=\"fp\" /><br /><br>\r\n");
      out.write("            <input id=\"btn\" type=\"submit\" value=\"REGISTER\" /><br>\r\n");
      out.write("        </form>\r\n");
      out.write("    </section>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
