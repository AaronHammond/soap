package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <h1>About us</h1>\n");
      out.write("    <br/>\n");
      out.write("    <p>\n");
      out.write("        The soap you see available online is all made by hand by Tracy Hammond, a late-in-life aficionada of all things all-natural.\n");
      out.write("        After raising her two children, she took to filling her newly-empty nest with a wide-array of arts-and-crafts, and her focus soon shifted to soap.\n");
      out.write("        Trained as a nurse, she was acutely aware of the value in a holistic approach to personal health, and soap proved a direct way to improve the quality of life of her friends and family.\n");
      out.write("        After others began to share her wares, the secret got out; Tracy's Handmade Soaps do far more than clean!\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("    <p>\n");
      out.write("        By purchasing from Tracy's Handmade Soap, you're doing far more than simply supporting a made-in-America label; you're making a commitment to a healthier, more comfortable lifestyle.\n");
      out.write("        Whether you give the soap to friends or family or simply spoil yourself, Tracy's Handmade Soaps are sure to be enjoyed!\n");
      out.write("    </p>\n");
      out.write("</div> <!-- /container -->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    jQuery('#header-about').addClass('active');\n");
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
