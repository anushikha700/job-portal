package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.daos.JobDao;
import com.beans.Job;

public final class ApplyJob_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <link rel=\"icon\" type=\"image/png\" sizes=\"16x16\" href=\"../Main_template/plugins/images/favicon.png\">\n");
      out.write("    <title>Dashboard|Search Jobs</title>\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("     \n");
      out.write("   \n");
      out.write("    <style>\n");
      out.write("        .bt {\n");
      out.write("            border: 2px solid black;\n");
      out.write("            background-color: white;\n");
      out.write("            color: black;\n");
      out.write("            padding: 9px 25px;\n");
      out.write("            font-size: 16px;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        /* Blue */\n");
      out.write("        .info {\n");
      out.write("            border-color: #41b3f9 ;\n");
      out.write("            color: dodgerblue;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .info:hover {\n");
      out.write("            background: #41b3f9 ;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .h {\n");
      out.write("            display: inline-block; /* show on the same line */\n");
      out.write("            padding-right: 5px; /* small gap on the right of each header */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .alertcol{\n");
      out.write("            color: #a94442;\n");
      out.write("            background-color: #f2dede;\n");
      out.write("            border-color: #ebccd1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .textarea1{\n");
      out.write("            white-space: pre-wrap;   /* for preserving space and line breaks*/\n");
      out.write("            overflow-wrap: break-word;\n");
      out.write("        }    \n");
      out.write("</style>\n");
      out.write("     \n");
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
      out.write("                        <h4 class=\"page-title\"></h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                        \n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"#\">Dashboard</a></li>\n");
      out.write("                            <li class=\"active\">Apply For Job</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("              ");
      com.beans.Jobseeker jobseeker = null;
      synchronized (session) {
        jobseeker = (com.beans.Jobseeker) _jspx_page_context.getAttribute("jobseeker", PageContext.SESSION_SCOPE);
        if (jobseeker == null){
          jobseeker = new com.beans.Jobseeker();
          _jspx_page_context.setAttribute("jobseeker", jobseeker, PageContext.SESSION_SCOPE);
        }
      }
      out.write("   \n");
      out.write("            ");

                int jid=request.getParameter("jid")!=null?Integer.parseInt(request.getParameter("jid")):-1;
               
                JobDao jd = new JobDao();
                Job job = jd.getById(jid);
                int  cid=job.getCid();
                String cname=jd.getCompanyName(cid);
                String logo=jd.getCompanyLogo(cid);
                int jsid=jobseeker.getJsid();
                
                   
            
      out.write("\n");
      out.write("                \n");
      out.write("             \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-8\">\n");
      out.write("                 \n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <h3 class=\"box-title h\">");
      out.print(job.getTitle());
      out.write("</h3> &emsp;\n");
      out.write("                            <h4 class=\"h\">");
      out.print(cname);
      out.write("</h4>\n");
      out.write("                            <br>\n");
      out.write("                            <div class=\"col-md-12\">\n");
      out.write("                            <table style=\"width:80%\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><i class=\"fas fa-briefcase fa-fw\"></i></td>\n");
      out.write("                                    <td>");
      out.print(job.getExper_min());
      out.write(" - ");
      out.print(job.getExper_max());
      out.write(" Years</td>\n");
      out.write("                                    <td style=\"text-align:right\" rowspan=\"0\">&emsp;<img src=\"../");
      out.print(logo);
      out.write("\" alt=\"Company Logo\" width=\"80\"></td>\n");
      out.write("                                </tr>    \n");
      out.write("                                <tr>\n");
      out.write("                                    <td><i class=\"fa fa-map-marker fa-fw\"></i></td>\n");
      out.write("                                    <td>");
      out.print(job.getCountry());
      out.write(',');
      out.print(job.getState());
      out.write(',');
      out.print(job.getCity());
      out.write("</td>\n");
      out.write("                                </tr> \n");
      out.write("                                <tr>\n");
      out.write("                                    <td><i class=\"fa fa-money fa-fw\"></i></td>\n");
      out.write("                                    <td>");
      out.print(job.getSalary());
      out.write("</td>\n");
      out.write("                                </tr> \n");
      out.write("                                <tr>\n");
      out.write("                                    <td><i class=\"fa fa-calendar fa-fw\"></i></td>\n");
      out.write("                                    <td>");
      out.print(job.getApply_deadline());
      out.write(" </td>\n");
      out.write("                                </tr>    \n");
      out.write("                            </table>\n");
      out.write("                           \n");
      out.write("                            </div>\n");
      out.write("                             <br>\n");
      out.write("                             <br>\n");
      out.write("                             <br>\n");
      out.write("                             <br>\n");
      out.write("                            <hr>\n");
      out.write("                            <b>Posted on:</b>&emsp;");
      out.print(job.getPosted_on());
      out.write("&emsp;|&emsp;<b>Job Applicants:</b>&emsp;23&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;\n");
      out.write("                            <a href=\"../JobApplyController?op=verifyjob&jid=");
      out.print(jid);
      out.write("&jsid=");
      out.print(jsid);
      out.write("\" class=\"bt info\" ");
 if (request.getParameter("apply") != null) {
      out.write(" disabled=\"disabled\"");
}
      out.write(" >Apply</a><p>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            \n");
      out.write("                            <h3>Job Description</h3><br>\n");
      out.write("                            <p class=\"textarea1\">");
      out.print(job.getDescription());
      out.write("</p><br><br>\n");
      out.write("                            \n");
      out.write("                            <table style=\"width:60%\">\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Role</td>\n");
      out.write("                                    <td>");
      out.print(job.getTitle());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Industry Type</td>\n");
      out.write("                                    <td>");
      out.print(job.getIndustry());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                    <td>Employment Type</td>\n");
      out.write("                                    <td>");
      out.print(job.getIndustry());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                    <td>Vacancies</td>\n");
      out.write("                                    <td>");
      out.print(job.getVacancies());
      out.write("</td>\n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                            \n");
      out.write("                            <br>\n");
      out.write("                           <h3>Education and Skills required</h3>\n");
      out.write("                           <p class=\"textarea1\">");
      out.print(job.getEducation_reqd());
      out.write("</p>\n");
      out.write("                           \n");
      out.write("                           <h3>Company info</h3><br>\n");
      out.write("                           <table style=\"width:60%\">\n");
      out.write("\n");
      out.write("                               <tr>\n");
      out.write("                                   <td>Contact Person</td>\n");
      out.write("                                   <td>");
      out.print(job.getContact_person());
      out.write("</td>\n");
      out.write("\n");
      out.write("                               </tr>\n");
      out.write("                               <tr>\n");
      out.write("                                   <td>Contact Number</td>\n");
      out.write("                                   <td>");
      out.print(job.getContact_no());
      out.write("</td>\n");
      out.write("\n");
      out.write("                               </tr>\n");
      out.write("\n");
      out.write("                           </table>\n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                           \n");
      out.write("                                \n");
      out.write("                        </div>    \n");
      out.write("                         \n");
      out.write("                            \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-4\">\n");
      out.write("                        <span id=\"s1\">\n");
      out.write("                            ");
 if (request.getParameter("msg") != null) {
      out.write("\n");
      out.write("                                    <div class=\"alert  alert-dismissible alertcol\">\n");
      out.write("                                     <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\n");
      out.write("                                             ");

                                                out.println(request.getParameter("msg"));
                                             }
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                        </span>\n");
      out.write("                    </div>\n");
      out.write("                                   \n");
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
      out.write("</html>");
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
