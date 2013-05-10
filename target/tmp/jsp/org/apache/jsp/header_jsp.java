package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<div class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("    <div class=\"navbar-inner\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-navbar\" data-toggle=\"collapse\" data-target=\".nav-collapse\">\r\n");
      out.write("                <span class=\"icon-bar\" />\r\n");
      out.write("                <span class=\"icon-bar\" />\r\n");
      out.write("                <span class=\"icon-bar\" />\r\n");
      out.write("            </button>\r\n");
      out.write("            <a class=\"brand\" href=\"/\">Tracy's Handmade Soap</a>\r\n");
      out.write("            <div class=\"nav-collapse collapse\">\r\n");
      out.write("                <ul class=\"nav\">\r\n");
      out.write("                    <li id=\"header-home\"><a href=\"/\">Home</a></li>\r\n");
      out.write("\r\n");
      out.write("                    <li id=\"header-soap\" class=\"dropdown\">\r\n");
      out.write("                        <!-- we don't want to drop the soap, haha -->\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">The Soap</a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li><a href=\"/lines/simple\">Simple Pleasures &raquo;</a></li>\r\n");
      out.write("                            <li><a href=\"/lines/eco\">Eco &raquo;</a></li>\r\n");
      out.write("                            <li><a href=\"/lines/finer\">The Finer Things &raquo;</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li id=\"header-about\"><a href=\"/about\">About</a></li>\r\n");
      out.write("                    <li id=\"header-contact\"><a href=\"/contact\">Contact</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <ul class=\"nav pull-right\">\r\n");
      out.write("\r\n");
      out.write("                    <li id=\"header-cart\"><a href=\"/cart\" style=\"text-decoration: underline !important;\">Your Cart &raquo;</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div><!--/.nav-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
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
