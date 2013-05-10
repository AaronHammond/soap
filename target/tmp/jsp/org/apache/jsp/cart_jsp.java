package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    var products = new Array();\n");
      out.write("</script>\n");
      out.write("<script src=\"/js/paypal-button-minicart.js\"></script>\n");
      out.write("<div id=\"pp\" hidden=\"hidden\">\n");
      out.write("</div>\n");
      out.write("<script>\n");
      out.write("    PAYPAL.apps.MiniCart.render({paypalURL: \"https://www.sandbox.paypal.com/cgi-bin/webscr\", parent:$('#pp').get(0)});\n");
      out.write("    PAYPAL.apps.MiniCart.reset();\n");
      out.write("</script>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h1>Cart</h1>\n");
      out.write("    <br/>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"span2\" style=\"text-align: center\">\n");
      out.write("            <h5>Image</h5>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"span6\" style=\"text-align: center\">\n");
      out.write("            <h5>Name</h5>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"span1\" style=\"text-align: center\">\n");
      out.write("            <h5>Quantity</h5>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"span2\" style=\"text-align: center\">\n");
      out.write("            <h5>Subtotal</h5>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <br />\n");
      out.write("    <br />\n");
      out.write("    <br />\n");
      out.write("    <div style=\"font-size: 12px\">\n");
      out.write("        Samples are included with every order; if you'd prefer a certain scent, please note it in the Paypal transaction and we'll do our best to accomodate you.\n");
      out.write("        <br />\n");
      out.write("        For sanitation reasons, returns are not accepted.\n");
      out.write("        <br />\n");
      out.write("        At this time, only domestic (USA) orders are accepted. Tracking numbers will be emailed upon shipping.\n");
      out.write("        <br />\n");
      out.write("        Orders over $50 will require a signature at time of delivery.\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div> <!-- /container -->\n");
      out.write("\n");
      out.write("<div id=\"modal\" class=\"modal hide fade\">\n");
      out.write("    <div class=\"modal-header\">\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("        <h3>Large Order</h3>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-body\">\n");
      out.write("        <p>Right now, your cart contains 30 or more bars of soap. This means that you qualify for a bulk-order discount. Please contact us for more information!</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"modal-footer\">\n");
      out.write("        <a href=\"/contact\" class=\"btn btn-primary\">Okay</a>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    jQuery('.icon-remove').tooltip();\n");
      out.write("    jQuery('#header-cart').addClass('active');\n");
      out.write("    $('select').change(function(){\n");
      out.write("        var id = this.id.replace('qty', '');\n");
      out.write("        var qty = this.value;\n");
      out.write("        $.ajax({\n");
      out.write("            url: '/cart/'+id+'?qty='+qty,\n");
      out.write("            type: 'PUT',\n");
      out.write("            contentType: 'application/json',\n");
      out.write("            processData: false,\n");
      out.write("            success: function(data){\n");
      out.write("                console.log(data.data + 'was updated in the cart');\n");
      out.write("                location.reload();\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function remove_from_cart(id){\n");
      out.write("        $.ajax({\n");
      out.write("            url: '/cart/'+id,\n");
      out.write("            type: 'DELETE',\n");
      out.write("            contentType: 'application/json',\n");
      out.write("            processData: false,\n");
      out.write("            success: function(data, status){\n");
      out.write("                console.log('An item was removed from the cart');\n");
      out.write("                location.reload();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        });\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function check_out(){\n");
      out.write("        PAYPAL.apps.MiniCart.reset();\n");
      out.write("        //check that the total number of products ordered is <30\n");
      out.write("        tot = 0;\n");
      out.write("        for(prod in products)\n");
      out.write("            tot += products[prod].quantity;\n");
      out.write("        if(tot >= 30){\n");
      out.write("            $('#modal').modal('show');\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        for(prod in products){\n");
      out.write("            data = {\n");
      out.write("                add: \"true\",\n");
      out.write("                amount: products[prod].amount,\n");
      out.write("                item_name: products[prod].name,\n");
      out.write("                quantity: products[prod].quantity,\n");
      out.write("                business: \"tracyshandmadesoap-facilitator@gmail.com\",\n");
      out.write("                cmd: \"_cart\",\n");
      out.write("                env: \"sandbox\"\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            console.log(PAYPAL.apps.MiniCart.addToCart(data));\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        $('div form').submit();\n");
      out.write("    }\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty fulfillments}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <h4 style=\"text-align: center;\">Your cart is currently empty.</h4>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("fulfillment");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillments}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <div class=\"row\">\n");
          out.write("            <div class=\"span2\" style=\"text-align: center\">\n");
          out.write("                <img src=\"/img/placeholder.jpg\" width=\"70%\" height=\"70%\" style=\"max-height: 240; max-width: 300;\" />\n");
          out.write("            </div>\n");
          out.write("            <div class=\"span6\" style=\"text-align: center\">\n");
          out.write("                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("            </div>\n");
          out.write("            <div class=\"span1\" style=\"text-align: center\">\n");
          out.write("                <select id=\"qty");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" style=\"width: 60px; \">\n");
          out.write("                    <option value=\"1\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.quantity == 1 ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">1</option>\n");
          out.write("                    <option value=\"2\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.quantity == 2 ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">2</option>\n");
          out.write("                    <option value=\"3\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.quantity == 3 ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">3</option>\n");
          out.write("                    <option value=\"4\" ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.quantity == 4 ? 'selected' : ''}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(">4</option>\n");
          out.write("                </select>\n");
          out.write("            </div>\n");
          out.write("            <div class=\"span2\" style=\"text-align: center\">\n");
          out.write("                $");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("            </div>\n");
          out.write("            <div class=\"span\" style=\"text-align: center\">\n");
          out.write("                <i class=\"icon-remove\" data-toggle=\"tooltip\" data-placement=\"top\"\n");
          out.write("                        data-original-title=\"Remove from cart\" style=\"cursor:pointer\" onclick=\"remove_from_cart(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\"></i>\n");
          out.write("            </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("        </div>\n");
          out.write("        <hr />\n");
          out.write("        <script type=\"text/javascript\">\n");
          out.write("            products.push({id: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(", quantity: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\", name: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.product.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\", amount: \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"});\n");
          out.write("        </script>\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fulfillment.quantity * fulfillment.product.price}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty fulfillments}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <button onclick=\"check_out();\" class=\"btn btn-success pull-right\">Checkout</button>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
