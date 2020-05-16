package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.utilities.FileUploader;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import com.beans.Jobseeker;
import com.beans.Job;
import com.daos.JsDao;

public final class ApplyJob2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Dashboard|Apply</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("   \n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("\n");
      out.write("               function readURL(input) {\n");
      out.write("                   if (input.files && input.files[0]) {\n");
      out.write("                       var reader = new FileReader();\n");
      out.write("\n");
      out.write("                       reader.onload = function (e) {\n");
      out.write("                           resume.src = e.target.result;\n");
      out.write("                       };\n");
      out.write("\n");
      out.write("                       reader.readAsDataURL(input.files[0]);\n");
      out.write("                   }\n");
      out.write("               }\n");
      out.write("\n");
      out.write("            function setDate(){ \n");
      out.write("               var date = new Date();\n");
      out.write("               var day = date.getDate();\n");
      out.write("               var month = date.getMonth() + 1;\n");
      out.write("               var year = date.getFullYear();\n");
      out.write("\n");
      out.write("               if (month < 10) month = \"0\" + month;\n");
      out.write("               if (day < 10) day = \"0\" + day;\n");
      out.write("\n");
      out.write("               var today = year + \"-\" + month + \"-\" + day;\n");
      out.write("\n");
      out.write("               document.getElementById('addjob').posted_on.value = today;\n");
      out.write("   }\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("    <style>\n");
      out.write("       .alertcol{\n");
      out.write("           color: #3c763d;\n");
      out.write("           background-color: #dff0d8;\n");
      out.write("           border-color: #d6e9c6;\n");
      out.write("       }\n");
      out.write("   </style>    \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fix-header\">\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    <!-- Preloader -->\n");
      out.write("    <!-- ============================================================== -->\n");
      out.write("    \n");
      out.write("    ");

        if(session.getAttribute("jobseeker")==null)
        {
            response.sendRedirect("login.jsp");
            return;
        }
      
        
      out.write("\n");
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
      out.write("                        <h4 class=\"page-title\">Apply For Job</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                       \n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("                            <li class=\"active\">Apply</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                ");
      com.beans.Jobseeker jobseeker = null;
      synchronized (session) {
        jobseeker = (com.beans.Jobseeker) _jspx_page_context.getAttribute("jobseeker", PageContext.SESSION_SCOPE);
        if (jobseeker == null){
          jobseeker = new com.beans.Jobseeker();
          _jspx_page_context.setAttribute("jobseeker", jobseeker, PageContext.SESSION_SCOPE);
        }
      }
      out.write(" \n");
      out.write("                   ");

                       int jid=request.getParameter("jid")!=null?Integer.parseInt(request.getParameter("jid")):-1;
                        int jsid=jobseeker.getJsid();
                      	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                        Date date = new Date();
   
                   
      out.write("     \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <h3 class=\"box-title\">Apply for Job</h3>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            <form enctype=\"multipart/form-data\"  method=\"post\" action=\"../JobApplyController?op=upload_resume&jid=");
      out.print(jid);
      out.write("&jsid=");
      out.print(jsid);
      out.write("&applicationDate=");
      out.print(formatter.format(date));
      out.write("\" class=\"form-horizontal form-material\" >\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-4\">Upload Resume</label>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-4\">\n");
      out.write("                                        <input type=\"file\" name=\"resume\" size=\"50\"class=\"form-control form-control-line\"  onchange=\"readURL(this);\"required=\"required\" /> </div> \n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                              \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("\n");
      out.write("                                        <center> <button class=\"btn btn-success\" value=\"apply\" ");
 if (request.getParameter("apply") != null) {
      out.write(" disabled=\"disabled\"");
}
      out.write("  name=\"apply\" >Apply</button>\n");
      out.write("                                        </center>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </form>    \n");
      out.write("                            <span id=\"s1\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                ");
 if (request.getParameter("msg") != null) {
      out.write("\n");
      out.write("                              \n");
      out.write("\n");
      out.write("                                    <div class=\"alert alertcol\">\n");
      out.write("                                        <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                                        <strong>Success!</strong>\n");
      out.write("                                    \n");
      out.write("                                    ");

                                         out.println(request.getParameter("msg"));
                                   }
      out.write("\n");
      out.write("                                 </div>\n");
      out.write("                            </span>\n");
      out.write("\n");
      out.write("                                 \n");
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
      out.write("\n");
      out.write("</body>\n");
      out.write("                      \n");
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
