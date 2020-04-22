package org.apache.jsp.company;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"navbar-default sidebar\" role=\"navigation\">\n");
      out.write("            <div class=\"sidebar-nav slimscrollsidebar\">\n");
      out.write("                <div class=\"sidebar-head\">\n");
      out.write("                    <h3><span class=\"fa-fw open-close\"><i class=\"ti-close ti-menu\"></i></span> <span class=\"hide-menu\">Navigation</span></h3>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav\" id=\"side-menu\">\n");
      out.write("                    <li style=\"padding: 70px 0 0;\">\n");
      out.write("                        <a href=\"dashboard.jsp\" class=\"waves-effect\"><i class=\"fa fa-clock-o fa-fw\" aria-hidden=\"true\"></i>Dashboard</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../Main_template/html/profile.html\" class=\"waves-effect\"><i class=\"fa fa-user fa-fw\" aria-hidden=\"true\"></i>Profile</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"AddJobs.jsp\" class=\"waves-effect\"><i class=\"fa  fa-pencil-square-o fa-fw\" aria-hidden=\"true\"></i>Post New Job</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"ViewJobs.jsp\" class=\"waves-effect\"><i class=\"fa fa-bars fa-fw\" aria-hidden=\"true\"></i>View All Jobs</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../Main_template/html/fontawesome.html\" class=\"waves-effect\"><i class=\"fa fa-font fa-fw\" aria-hidden=\"true\"></i>Icons</a>\n");
      out.write("                    </li>\n");
      out.write("                   \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../Main_template/html/blank.html\" class=\"waves-effect\"><i class=\"fa fa-columns fa-fw\" aria-hidden=\"true\"></i>View Candidates Applied</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"signout.jsp\" class=\"waves-effect\"><i class=\"fa fa-sign-out fa-fw\" aria-hidden=\"true\"></i>Sign-Out</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("                <div class=\"center p-20\">\n");
      out.write("                     <a href=\"https://wrappixel.com/templates/ampleadmin/\" target=\"_blank\" class=\"btn btn-danger btn-block waves-effect waves-light\">Upgrade to Pro</a>\n");
      out.write("                 </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
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
