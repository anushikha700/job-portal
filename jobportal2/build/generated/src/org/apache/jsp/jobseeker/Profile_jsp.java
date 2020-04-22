package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Dashboard|Profile</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"../Main_template/html/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Menu CSS -->\n");
      out.write("    <link href=\"../Main_template/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- animation CSS -->\n");
      out.write("    <link href=\"../Main_template/html/css/animate.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"../Main_template/html/css/style.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- color CSS -->\n");
      out.write("    <link href=\"../Main_template/html/css/colors/default.css\" id=\"theme\" rel=\"stylesheet\">\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("    <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("<![endif]-->\n");
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
      out.write("\n");
      out.write("        <!-- End Top Navigation -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Left Sidebar - style you can find in sidebar.scss  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
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
      out.write("                        <h4 class=\"page-title\">Profile page</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                        <a href=\"https://wrappixel.com/templates/ampleadmin/\" target=\"_blank\"\n");
      out.write("                            class=\"btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light\">Upgrade\n");
      out.write("                            to Pro</a>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("                            <li class=\"active\">Profile Page</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("                <!-- .row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-4 col-xs-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <div class=\"user-bg\"> <img width=\"100%\" alt=\"user\" src=\"../Main_template/plugins/images/large/img1.jpg\">\n");
      out.write("                                <div class=\"overlay-box\">\n");
      out.write("                                    <div class=\"user-content\">\n");
      out.write("                                        <a href=\"javascript:void(0)\"><img src=\"../Main_template/plugins/images/users/genu.jpg\"\n");
      out.write("                                                class=\"thumb-lg img-circle\" alt=\"img\"></a>\n");
      out.write("                                        <h4 class=\"text-white\">User Name</h4>\n");
      out.write("                                        <h5 class=\"text-white\">info@myadmin.com</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"user-btm-box\">\n");
      out.write("                                <div class=\"col-md-4 col-sm-4 text-center\">\n");
      out.write("                                    <p class=\"text-purple\"><i class=\"ti-facebook\"></i></p>\n");
      out.write("                                    <h1>258</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-4 col-sm-4 text-center\">\n");
      out.write("                                    <p class=\"text-blue\"><i class=\"ti-twitter\"></i></p>\n");
      out.write("                                    <h1>125</h1>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-md-4 col-sm-4 text-center\">\n");
      out.write("                                    <p class=\"text-danger\"><i class=\"ti-dribbble\"></i></p>\n");
      out.write("                                    <h1>556</h1>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-8 col-xs-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <form class=\"form-horizontal form-material\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Full Name</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"Johnathan Doe\"\n");
      out.write("                                            class=\"form-control form-control-line\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label for=\"example-email\" class=\"col-md-12\">Email</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"email\" placeholder=\"johnathan@admin.com\"\n");
      out.write("                                            class=\"form-control form-control-line\" name=\"example-email\"\n");
      out.write("                                            id=\"example-email\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Password</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"password\" value=\"password\" class=\"form-control form-control-line\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Phone No</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"text\" placeholder=\"123 456 7890\"\n");
      out.write("                                            class=\"form-control form-control-line\"> </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Message</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <textarea rows=\"5\" class=\"form-control form-control-line\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-sm-12\">Select Country</label>\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <select class=\"form-control form-control-line\">\n");
      out.write("                                            <option>London</option>\n");
      out.write("                                            <option>India</option>\n");
      out.write("                                            <option>Usa</option>\n");
      out.write("                                            <option>Canada</option>\n");
      out.write("                                            <option>Thailand</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <button class=\"btn btn-success\">Update Profile</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.row -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container-fluid -->\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#page-wrapper -->\n");
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
