package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"container\">\n");
      out.write("    <h1>Contact us</h1>\n");
      out.write("    <br/>\n");
      out.write("    <p>\n");
      out.write("        We love hearing from customers! Whether you are having an event, are interested in carrying Tracy's Handmade Soaps in your store,\n");
      out.write("        or just want to complain, compliment, or suggest a new scent, feel free to contact us by email\n");
      out.write("        (<a href=\"mailto:tracyshandmadesoap@gmail.com\">tracyshandmadesoap@gmail.com</a>) or by phone (978 761-4637).\n");
      out.write("    </p>\n");
      out.write("    <p>\n");
      out.write("        If you plan to make a large order, please feel free to contact us to arrange a bulk-discount. We're happiest when our customers are happiest!\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("</div> <!-- /container -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    jQuery('#header-contact').addClass('active');\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
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
