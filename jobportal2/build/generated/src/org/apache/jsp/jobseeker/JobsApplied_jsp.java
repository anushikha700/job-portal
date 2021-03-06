package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.JobApply;
import com.daos.JobApplyDao;
import com.daos.JobDao;
import com.beans.Job;
import java.util.ArrayList;

public final class JobsApplied_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
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
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../plugins/images/favicon.png\">\n");
      out.write("    <title>Dashboard|Jobs Applied</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("    <style>\n");
      out.write("        .cut-text { \n");
      out.write("  text-overflow: ellipsis;\n");
      out.write("  overflow: hidden; \n");
      out.write("  width: 500px; \n");
      out.write("  height: 1.2em; \n");
      out.write("  white-space: nowrap;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("     <script>\n");
      out.write("          $(document).ready(function(){\n");
      out.write("    $(\"button\").click(function(){\n");
      out.write("        var jaid= $(this).val();\n");
      out.write("      \n");
      out.write("        $(\"#s1\").load(\"ApplicationStatus.jsp?jaid=\"+jaid);\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("   </script>  \n");
      out.write("   \n");
      out.write("   <script>\n");
      out.write("       $().ready(function () {\n");
      out.write("        var $scrollingDiv = $(\"#scroll\");\n");
      out.write("\n");
      out.write("        $(window).scroll(function () {\n");
      out.write("            $scrollingDiv\n");
      out.write("            .stop()\n");
      out.write("            .animate({ \"marginTop\": ($(window).scrollTop() + 5) + \"px\" }, \"1000\");\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("   </script>    \n");
      out.write("    \n");
      out.write("    \n");
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
      out.write("                        <h4 class=\"page-title\">Jobs Applied</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                        \n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("                            <li class=\"active\">Jobs Applied</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                 ");
      com.beans.Jobseeker jobseeker = null;
      synchronized (session) {
        jobseeker = (com.beans.Jobseeker) _jspx_page_context.getAttribute("jobseeker", PageContext.SESSION_SCOPE);
        if (jobseeker == null){
          jobseeker = new com.beans.Jobseeker();
          _jspx_page_context.setAttribute("jobseeker", jobseeker, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("                 ");

                               JobApplyDao ja=new JobApplyDao();
                               int jsid=jobseeker.getJsid();
                               
                                ArrayList<JobApply> jobapplylist=ja.getJobsApplied(jsid);
                               
                                
                              
                       
                  
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-7\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <h3 class=\"box-title\">Jobs Applied</h3>\n");
      out.write("                           <div class=\"comment-center p-t-10\">\n");
      out.write("                               ");
      for (JobApply jobapply : jobapplylist) {
                                       int jid = jobapply.getJid();
                                       int jaid = jobapply.getJaid();
                                       JobDao jd = new JobDao();

                                       ArrayList<Job> joblist = jd.getJobDetails(jid);
                                       for (Job job : joblist) {
                               
      out.write("\n");
      out.write("                                <div class=\"comment-body\">\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"mail-contnet\">\n");
      out.write("                                        <h5>");
      out.print(job.getTitle());
      out.write("</h5><span class=\"time\">Posted on: ");
      out.print(job.getPosted_on());
      out.write("</span>\n");
      out.write("                                        <br/>\n");
      out.write("                                        <span class=\"mail-desc cut-text\">");
      out.print(job.getDescription());
      out.write("</span>\n");
      out.write("                                        <button class=\"btn btn btn-rounded btn-default btn-outline m-r-5\" value=\"");
      out.print(jaid);
      out.write("\" ><i class=\"ti-check text-success m-r-5\"></i>View Application Status</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                               ");
}}
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                            <div class=\"col-md-5\" id=\"scroll\">\n");
      out.write("                                <span id=\"s1\">\n");
      out.write("\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
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
      out.write("\n");
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
