package org.apache.jsp.company;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.daos.JobDao;
import com.daos.CompanyDao;
import com.beans.Job;
import com.beans.Company;
import java.sql.*;;

public final class ViewJobs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


          
           
            JobDao jd=new JobDao();
            
           
            int start=0;
            int end = 5;
            int total=jd.getRecordsCount();
            
            
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
      out.write("    <title>View All Jobs</title>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("    <script type=\"text/javascript\"> \n");
      out.write("            function confirmation(){\n");
      out.write("               if(confirm(\"Do you Really want to Remove this record ??\"))\n");
      out.write("               {\n");
      out.write("                   return true;\n");
      out.write("               }\n");
      out.write("               else{\n");
      out.write("                   return false;\n");
      out.write("               }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("<body class=\"fix-header\">\n");
      out.write("     ");

        if(session.getAttribute("company")==null)
        {
            
            response.sendRedirect("login.jsp");
            return;
        }
              
        
      out.write("\n");
      out.write("       ");
      com.beans.Company company = null;
      synchronized (session) {
        company = (com.beans.Company) _jspx_page_context.getAttribute("company", PageContext.SESSION_SCOPE);
        if (company == null){
          company = new com.beans.Company();
          _jspx_page_context.setAttribute("company", company, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
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
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "topbar.jsp", out, false);
      out.write("\n");
      out.write("        <!-- End Top Navigation -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        <!-- Left Sidebar - style you can find in sidebar.scss  -->\n");
      out.write("        <!-- ============================================================== -->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\n");
      out.write("        \n");
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
      out.write("                        <h4 class=\"page-title\">Jobs Added</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-lg-9 col-sm-8 col-md-8 col-xs-12\">\n");
      out.write("                        <a href=\"https://wrappixel.com/templates/ampleadmin/\" target=\"_blank\"\n");
      out.write("                            class=\"btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light\">Upgrade\n");
      out.write("                            to Pro\n");
      out.write("\n");
      out.write("                        </a>\n");
      out.write("                        <ol class=\"breadcrumb\">\n");
      out.write("                            <li><a href=\"dashboard.jsp\">Dashboard</a></li>\n");
      out.write("                            <li class=\"active\">Jobs Added</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.col-lg-12 -->\n");
      out.write("                </div>\n");
      out.write("                <!-- /row -->\n");
      out.write("                <div class=\"row\">\n");
      out.write("                  <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <div class=\"white-box\">\n");
      out.write("                            <h3 class=\"box-title\">Jobs added</h3>\n");
      out.write("                            \n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th>Job Posted On</th>\n");
      out.write("                                            <th>Industry</th>\n");
      out.write("                                            \n");
      out.write("                                            <th>Job Title</th>\n");
      out.write("                                            <th>Job Description</th>\n");
      out.write("                                            <th>No. of vacancies</th>\n");
      out.write("                                            <th>Annual CTC</th>\n");
      out.write("                                            <th>Country </th>\n");
      out.write("                                            <th>State</th>\n");
      out.write("                                            <th>City</th>\n");
      out.write("                                            <th>Experience Required(Min-Max)years</th>\n");
      out.write("                                            <th>Last date of application</th>\n");
      out.write("                                            <th>Edit/delete</th>\n");
      out.write("                                            \n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                                   \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    ");

                                if (request.getParameter("start")!=null)
                                    start = Integer.parseInt(request.getParameter("start"));
                                 int cid=company.getCid();
                                System.out.println("cid2"+cid);
                                ArrayList<Job> joblist=jd.getByCompany(cid);
                              //  ArrayList<Job> records = jd.getRecordByLimit(start,end);
                                
                                     
                      
                                
                   for (Job job : joblist) {
                                    
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    <tbody>\n");
      out.write("                                      \n");
      out.write("                                        <tr>\n");
      out.write("                                          \n");
      out.write("\n");
      out.write("                                           <td>");
      out.print(job.getPosted_on());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(job.getIndustry());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(job.getTitle());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(job.getDescription());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(job.getVacancies());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(job.getSalary());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(job.getCountry());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(job.getState());
      out.write("</td>\n");
      out.write("                                            <td>");
      out.print(job.getCity());
      out.write("</td>\n");
      out.write("                                            \n");
      out.write("                                            <td>");
      out.print(job.getExper_min());
      out.write(" - ");
      out.print(job.getExper_max());
      out.write(" </td>\n");
      out.write("                                            \n");
      out.write("                                            <td>");
      out.print(job.getApply_deadline());
      out.write("</td>\n");
      out.write("                                            <td><a href=\"EditJob.jsp?jid=");
      out.print(job.getJid());
      out.write("\" class=\"btn btn-success\"> <i class=\"fa fa-pencil\" aria-hidden=\"true\"></i></a> \n");
      out.write("                                                <a href=\"../JobController?op=delete&jid=");
      out.print(job.getJid());
      out.write("\" class=\"btn btn-danger\" onclick=\"return confirmation();\"><i class=\"fa fa-trash\"></i></a>\n");
      out.write("                                            </td>\n");
      out.write("                                            \n");
      out.write("                                        </tr>\n");
      out.write("                                         ");
}
      out.write("\n");
      out.write("                                        \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                                          <span>\n");
      out.write("                                <center>\n");
      out.write("                                <a href=\"ViewJobs.jsp?start=");
      out.print(start-end);
      out.write("\" class=\"btn btn-primary ");
if(start==0)out.println(" disabled"); 
      out.write("\" style=\"float:left\"><< Previous</a>\n");
      out.write("                                <a href=\"ViewJobs.jsp?start=");
      out.print(start+end);
      out.write("\" class=\"btn btn-primary ");
if(total-start <= end) out.println(" disabled");
      out.write("\" style=\"float: right\">Next >></a>\n");
      out.write("                                \n");
      out.write("                                ");
for(int i=0; i<=total/end;i++){
      out.write("\n");
      out.write("                                <a href=\"ViewJobs.jsp?start=");
      out.print(i*end);
      out.write("\" class=\"btn btn-success ");
if(i==Math.floor(start/end))out.println(" btn-dark");
      out.write("\">Page");
      out.print(i+1);
      out.write("</a>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                </center>\n");
      out.write("                            </span> \n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                  </div>  \n");
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
