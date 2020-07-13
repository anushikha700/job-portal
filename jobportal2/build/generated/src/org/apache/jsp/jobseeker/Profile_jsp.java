package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.Jobseeker;
import com.daos.JsDao;

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
      out.write("    <title>Dashboard|Profile</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("    <style>\n");
      out.write("        \n");
      out.write("        .l1{\n");
      out.write("            font-family:helvetica;\n");
      out.write("            color:#767676;\n");
      out.write("            margin:15px;\n");
      out.write("            font-size:17px ;\n");
      out.write("            display: inline-block;\n");
      out.write("            font-weight: bold;\n");
      out.write("        } \n");
      out.write("\n");
      out.write("        .p1 {\n");
      out.write("            display: inline-block; /* show on the same line */\n");
      out.write("            margin: 15px; /* small gap on the right of each header */\n");
      out.write("            font-size:15px ;\n");
      out.write("        }\n");
      out.write("        .textarea1{\n");
      out.write("            white-space: pre-wrap;   /* for preserving space and line breaks*/\n");
      out.write("            overflow-wrap: break-word;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fix-header\">\n");
      out.write("    ");

        if(session.getAttribute("jobseeker")==null)
        {
            response.sendRedirect("login.jsp");
            return;
        }
        
      out.write("\n");
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
      out.write("        ");
      com.beans.Jobseeker jobseeker = null;
      synchronized (session) {
        jobseeker = (com.beans.Jobseeker) _jspx_page_context.getAttribute("jobseeker", PageContext.SESSION_SCOPE);
        if (jobseeker == null){
          jobseeker = new com.beans.Jobseeker();
          _jspx_page_context.setAttribute("jobseeker", jobseeker, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
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
      out.write("                        \n");
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
      out.write("                            <div class=\"user-bg\"> <img width=\"100%\" alt=\"user\" src=\"../");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                <div class=\"overlay-box\">\n");
      out.write("                                    <div class=\"user-content\">\n");
      out.write("                                        <a href=\"javascript:void(0)\"><img src=\"../");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.photo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                                class=\"thumb-lg img-circle\" alt=\"img\"></a>\n");
      out.write("                                        <h4 class=\"text-white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("                                        <h5 class=\"text-white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"user-btm-box\">\n");
      out.write("                                 \n");
      out.write("                                <i class=\"fa fa-user fa-fw\" aria-hidden=\"true\"></i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" | ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.gender}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("                                <i class=\"fa fa-map-marker fa-fw\" aria-hidden=\"true\"></i>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.country}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" | ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(',');
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("                                    \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-8 col-xs-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <form class=\"form-horizontal form-material\">\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <p style=\"font-family:helvetica ;font-size:30px; color:#525252 ; margin:20px\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.first_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(' ');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.last_name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                    <hr>\n");
      out.write("                                    ");
if(jobseeker.school!=null ||jobseeker.course!=null||jobseeker.college!=null){
      out.write("\n");
      out.write("                                    <p style=\"font-family:helvetica ;font-size:20px; color:#767676 ; margin:15px\">Education</p><br>\n");
      out.write("                                    \n");
      out.write("                                    ");
if(jobseeker.school!=null ){
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <label class=\"l1\">High School</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <p class=\"p1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.school}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                     ");
}
      out.write("   \n");
      out.write("                                     ");
if(jobseeker.school!=null ){
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <label class=\"l1\">Intermediate</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <p class=\"p1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.school}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                        ");
}
      out.write(" \n");
      out.write("                                     ");
if(jobseeker.course!=null ){
      out.write("    \n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <label class=\"l1\">Field of Study</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <p class=\"p1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.course}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                          \n");
      out.write("                                    </div>\n");
      out.write("                                        ");
}
      out.write(" \n");
      out.write("                                     ");
if(jobseeker.college!=null ){
      out.write("   \n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <label class=\"l1\">Institute</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-4\">\n");
      out.write("                                            <p class=\"p1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.college}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    ");
if(jobseeker.experience!=null ||jobseeker.skills!=null ||jobseeker.achievements!=null ){
      out.write("\n");
      out.write("                                    <hr>\n");
      out.write("                                    <p style=\"font-family:helvetica ;font-size:20px; color:#767676 ; margin:15px\">Other Details</p><br>\n");
      out.write("                                    \n");
      out.write("                                    ");
if(jobseeker.experience!=null ){
      out.write("\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <label class=\"l1\">Experience</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <p class=\"p1 textarea1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.experience}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                     ");
}
      out.write("  \n");
      out.write("                                     ");
if(jobseeker.skills!=null ){
      out.write("\n");
      out.write("                                      <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <label class=\"l1\">Skills</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <p class=\"p1 textarea1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.skills}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                         ");
if(jobseeker.achievements!=null ){
      out.write("\n");
      out.write("                                      <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <label class=\"l1\">Achievements</label>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <p class=\"p1 textarea1\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${jobseeker.achievements}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                        ");
}
      out.write("\n");
      out.write("                                    ");
}
      out.write("\n");
      out.write("                                </div> \n");
      out.write("                                <a href=\"UpdateProfile.jsp\" class=\"btn btn-success\">Update Profile</a>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        \n");
      out.write("                    </div>\n");
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
