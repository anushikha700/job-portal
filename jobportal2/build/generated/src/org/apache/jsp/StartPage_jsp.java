package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class StartPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .carousel-item {\n");
      out.write("  height: 65vh;\n");
      out.write("  min-height: 350px;\n");
      out.write("  background: no-repeat center center scroll;\n");
      out.write("  -webkit-background-size: cover;\n");
      out.write("  -moz-background-size: cover;\n");
      out.write("  -o-background-size: cover;\n");
      out.write("  background-size: cover;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- Navigation -->\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\">Job Portal</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("      <ul class=\"navbar-nav ml-auto\">\n");
      out.write("        <li class=\"nav-item active\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Home\n");
      out.write("                <span class=\"sr-only\">(current)</span>\n");
      out.write("              </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">About</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Services</a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"#\">Contact</a>\n");
      out.write("        </li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("  <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("    </ol>\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("      <!-- Slide One - Set the background image for this slide in the line below -->\n");
      out.write("      <div class=\"carousel-item active\" style=\"background-image: url('assets/images/slider7.jpg')\">\n");
      out.write("        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("          <h3 class=\"display-4\">Find Job</h3>\n");
      out.write("          <p class=\"lead\">Find job at India's no.1 site.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Slide Two - Set the background image for this slide in the line below -->\n");
      out.write("      <div class=\"carousel-item\" style=\"background-image: url('assets/images/slider5.jpg')\">\n");
      out.write("        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("          <h3 class=\"display-4\">Get Personalized Job</h3>\n");
      out.write("          <p class=\"lead\">Choose from hundreds of jobs.</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <!-- Slide Three - Set the background image for this slide in the line below -->\n");
      out.write("      <div class=\"carousel-item\" style=\"background-image: url('assets/images/slider9.jpg')\">\n");
      out.write("        <div class=\"carousel-caption d-none d-md-block\">\n");
      out.write("          <h3 class=\"display-4\">Get Dream Job</h3>\n");
      out.write("          <p class=\"lead\">Your dream job is just one click away .</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("          <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("          <span class=\"sr-only\">Previous</span>\n");
      out.write("        </a>\n");
      out.write("    <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("          <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("          <span class=\"sr-only\">Next</span>\n");
      out.write("        </a>\n");
      out.write("  </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- Page Content -->\n");
      out.write("<section class=\"py-5\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <h1 class=\"font-weight-light\">Job Portal</h1>\n");
      out.write("    <p class=\"lead\">Transforming the way people seek their dream job and organizations hire employees</p>\n");
      out.write("    <center>\n");
      out.write("     \n");
      out.write("     <a href=\"company/signup.jsp\" class=\"btn btn-info\">Want To Hire</a>\n");
      out.write("     <a href=\"jobseeker/signup.jsp\" class=\"btn btn-info\">Get Job</a>\n");
      out.write("    \n");
      out.write("        </center>\n");
      out.write("\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
