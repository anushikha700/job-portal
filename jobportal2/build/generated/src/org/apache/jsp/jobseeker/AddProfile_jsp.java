package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../Main_template/plugins/images/favicon.png\">\n");
      out.write("    <title>Dashboard-Complete Profile</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fix-header\">\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div class=\"preloader\">\n");
      out.write("        <svg class=\"circular\" viewBox=\"25 25 50 50\">\n");
      out.write("            <circle class=\"path\" cx=\"50\" cy=\"50\" r=\"20\" fill=\"none\" stroke-width=\"2\" stroke-miterlimit=\"10\" />\n");
      out.write("        </svg>\n");
      out.write("    </div>\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Wrapper -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Topbar header - style you can find in pages.scss -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topbar.jsp", out, false);
      out.write("        <!-- End Top Navigation -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Left Sidebar - style you can find in sidebar.scss  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- End Left Sidebar -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <div id=\"page-wrapper\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"row bg-title\">\n");
      out.write("                    <div class=\"col-lg-3 col-md-4 col-sm-4 col-xs-12\">\n");
      out.write("                        <h4 class=\"page-title\">Complete Your Profile</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                        <a href=\"https://wrappixel.com/templates/ampleadmin/\" target=\"_blank\"\n");
      out.write("                            class=\"btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light\">Upgrade\n");
      out.write("                            to Pro</a>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("                            <li class=\"active\">Add Details</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <h3 class=\"box-title\">Add Details</h3>\n");
      out.write("                            \n");
      out.write("                                \n");
      out.write("                                <ul class=\"nav nav-tabs\">\n");
      out.write("                                    <li class=\"active\"><a data-toggle=\"tab\" href=\"#basicDetails\"><h5>Basic Details</h5></a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#qualification\"><h5>Qualification Details</h5></a></li>\n");
      out.write("                                    <li><a data-toggle=\"tab\" href=\"#upload\"><h5>Upload Profile Picture</h5></a></li>\n");
      out.write("                                    \n");
      out.write("                                </ul>\n");
      out.write("                            \n");
      out.write("\n");
      out.write("                             <div class=\"tab-content\">\n");
      out.write("                                 <div id=\"basicDetails\" class=\"tab-pane fade in active\" >\n");
      out.write("                                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "BasicDetails.jsp", out, false);
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div id=\"qualification\" class=\"tab-pane fade\">\n");
      out.write("                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "QualificationDetails.jsp", out, false);
      out.write("\n");
      out.write("                                   </div>\n");
      out.write("                                    <div id=\"upload\" class=\"tab-pane fade\">\n");
      out.write("                                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "UploadPhoto.jsp", out, false);
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- End Page Content -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("    </div>\n");
      out.write("    <!-- /#wrapper -->\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"../Main_template/plugins/bower_components/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"../Main_template/html/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Menu Plugin JavaScript -->\n");
      out.write("    <script src=\"../Main_template/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js\"></script>\n");
      out.write("    <!--slimscroll JavaScript -->\n");
      out.write("    <script src=\"../Main_template/html/js/jquery.slimscroll.js\"></script>\n");
      out.write("    <!--Wave Effects -->\n");
      out.write("    <script src=\"../Main_template/html/js/waves.js\"></script>\n");
      out.write("    <!-- Custom Theme JavaScript -->\n");
      out.write("    <script src=\"../Main_template/html/js/custom.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
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
