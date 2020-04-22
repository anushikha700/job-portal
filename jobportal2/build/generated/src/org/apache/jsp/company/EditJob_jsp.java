package org.apache.jsp.company;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.daos.JobDao;
import com.daos.CompanyDao;
import com.beans.Job;

public final class EditJob_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Update Job Details</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("     <script src=\"//geodata.solutions/includes/countrystatecity.js\"></script>\n");
      out.write("  \n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("        \n");
      out.write("            \n");
      out.write("             var url = \"https://raw.githubusercontent.com/anushikha700/jason/master/industries.json\";\n");
      out.write("\n");
      out.write("            $.getJSON(url, function (data) {\n");
      out.write("                $.each(data, function (index, value) {\n");
      out.write("                    // APPEND OR INSERT DATA TO SELECT ELEMENT.\n");
      out.write("                    $('#sel').append('<option value>' + value.name + '</option>');\n");
      out.write("                });\n");
      out.write("            \n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // SHOW SELECTED VALUE.\n");
      out.write("        // var x=$('#msg').text('Selected Item: ' + this.options[this.selectedIndex].text);\n");
      out.write("        $('#sel').change(function () {\n");
      out.write("            var x=this.options[this.selectedIndex].text;\n");
      out.write("            \n");
      out.write("             document.getElementById(\"addjob\").bt.value=x;\n");
      out.write("             \n");
      out.write("             \n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("             \n");
      out.write("        \n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body class=\"fix-header\">\n");
      out.write("    ");

        if(session.getAttribute("company")==null)
        {
            response.sendRedirect("login.jsp");
            return;
        }
        
      out.write("\n");
      out.write("   \n");
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
      out.write("                        <h4 class=\"page-title\">Update Job</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                        <a href=\"https://wrappixel.com/templates/ampleadmin/\" target=\"_blank\"\n");
      out.write("                            class=\"btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light\">Upgrade\n");
      out.write("                            to Pro</a>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                            <li class=\"active\">Edit</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"row\">\n");
      out.write("                    <!--col -->\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <div class=\"box-title\"><h2><center>Update Job Details</center></h2></div> \n");
      out.write("                             ");
      com.beans.Job job = null;
      synchronized (session) {
        job = (com.beans.Job) _jspx_page_context.getAttribute("job", PageContext.SESSION_SCOPE);
        if (job == null){
          job = new com.beans.Job();
          _jspx_page_context.setAttribute("job", job, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("                        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("job"), request);
      out.write("\n");
      out.write("                         ");

         int jid =request.getParameter("jid")!=null?Integer.parseInt(request.getParameter("jid")):-1;
         JobDao jd = new JobDao();
         if(job!=null && job.getJid()!=jid){
         job  = jd.getById(jid);
         session.setAttribute("job", job);
         }
        
      out.write(" \n");
      out.write("                        \n");
      out.write("                            <form action=\"../JobController?op=add\" method=\"post\"class=\"form-horizontal form-material\" id=\"addjob\" >\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-6\">Industry</label>\n");
      out.write("                                    <label class=\"col-md-6\">Title</label> \n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <select id=\"sel\"  class=\"form-control\" >\n");
      out.write("                                            <option value=\"\">Select Industry</option>\n");
      out.write("                                        </select>\n");
      out.write("                                        <input type=\"hidden\" name =\"industry\" id=\"bt\" />\n");
      out.write("                                    </div>    \n");
      out.write("                                    \n");
      out.write("                                     <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\" name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control form-control-line\" > </div>   \n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Employment Type</label>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"col-md-3\">\n");
      out.write("                                      Full Time  <input type=\"checkbox\" name=\"job_type\" value=\"Full Time\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.job_type.contains(\"Full Time\")?\" checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" ></div>\n");
      out.write("                                    <div class=\"col-md-3\">\n");
      out.write("                                     Part Time  <input type=\"checkbox\" name=\"job_type\" value=\"Part Time\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.job_type.contains(\"Part Time\")?\" checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" ></div>\n");
      out.write("                                     <div class=\"col-md-3\">\n");
      out.write("                                      Internship  <input type=\"checkbox\" name=\"job_type\" value=\"Internship\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.job_type.contains(\"Internship\")?\" checked\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(">\n");
      out.write("                                    </div>\n");
      out.write("                                        \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Job Description,Skills Required etc.</label>\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <textarea rows=\"5\" name=\"description\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control form-control-line\"></textarea> </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-6\">Vacancy</label>\n");
      out.write("                                    <label class=\"col-md-6\">Annual CTC</label>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"number\" name=\"vacancies\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.vacancies}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control form-control-line\" > </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"text\" name=\"salary\"value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.salary}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control form-control-line\" > </div> \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                \n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Experience Required(in Years)</label>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"number\" name=\"exper_min\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.exper_min}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control form-control-line\" > </div>\n");
      out.write("                                    \n");
      out.write("                                     <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"number\" name=\"exper_max\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.exper_max}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"form-control form-control-line\" > </div>\n");
      out.write("                                    \n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Location</label>\n");
      out.write("                                   \n");
      out.write("                                    <div class=\"col-md-3\">\n");
      out.write("                                       <select name=\"country\" class=\"countries form-control\" id=\"countryId\"    required=\"required\">\n");
      out.write("                                             <option value=\"\">Country</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-3\">\n");
      out.write("                                        <select class=\" states form-control\"  name=\"state\" id=\"stateId\">\n");
      out.write("                                             <option value=\"\">State</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                     <div class=\"col-md-3\">\n");
      out.write("                                        <select class=\"cities form-control\"  name=\"city\" id=\"cityId\">\n");
      out.write("                                             <option value=\"\">City</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                 <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-md-12\">Last Date To Apply</label>\n");
      out.write("                                    \n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${job.apply_deadline}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"apply_deadline\" class=\"form-control form-control-line\" > </div>\n");
      out.write("                                        \n");
      out.write("                                </div>\n");
      out.write("        \n");
      out.write("                            \n");
      out.write("                                    \n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <center>\n");
      out.write("                                    <div class=\"col-sm-12\">\n");
      out.write("                                        <button class=\"btn btn-success\" id=\"submit\" name=\"submit\">Update</button>\n");
      out.write("                                        <a href=\"ViewJobs.jsp\" class=\"btn btn-danger\" id=\"cancel\" name=\"cancel\">Cancel</a>\n");
      out.write("                                         </center>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                        \n");
      out.write("\n");
      out.write("                                      \n");
      out.write("                            </form>\n");
      out.write("                       \n");
      out.write("</div>\n");
      out.write("                         \n");
      out.write("                        </div>\n");
      out.write("                \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                </div>\n");
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
