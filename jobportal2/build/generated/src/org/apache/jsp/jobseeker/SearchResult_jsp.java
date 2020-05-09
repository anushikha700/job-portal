package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.daos.JobDao;
import com.beans.Job;
import com.beans.Company;
import java.sql.*;;

public final class SearchResult_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "base.jsp", out, false);
      out.write("\n");
      out.write("<style>\n");
      out.write("  .card {\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);\n");
      out.write("  border-radius: 10px;\n");
      out.write("  width: 800px;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("    .cut-text { \n");
      out.write("  text-overflow: ellipsis;\n");
      out.write("  overflow: hidden; \n");
      out.write("  width: 500px; \n");
      out.write("  height: 1.2em; \n");
      out.write("  white-space: nowrap;\n");
      out.write(" \n");
      out.write("}\n");
      out.write("\n");
      out.write("  .h {\n");
      out.write("    display: inline-block; /* show on the same line */\n");
      out.write("    padding-right: 5px; /* small gap on the right of each header */\n");
      out.write("  }\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    <br><br>\n");
      out.write("    <h3>Search Results:</h3> \n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");


        JobDao jd = new JobDao();

        
        String keyword = request.getParameter("keyword");

        System.out.println("keyword" + keyword);
        String cname=jd.getCompanyName(keyword);
        ArrayList<Job> joblist = jd.getJobsByKeyword(keyword);
        for (Job job : joblist) {
            System.out.println(job.getJid());
    
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <div class=\"card\">\n");
      out.write("        <div class=\"card-body\">\n");
      out.write("            <h5 class=\"h\"><b>");
      out.print(job.getTitle());
      out.write("</b></h5> &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <i class=\"fa fa-building-o fa-fw\"></i> <h4 class=\"h\">");
      out.print(cname);
      out.write("</h4>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <i class=\"fa fa-calendar fa-fw\"></i>");
      out.print(job.getPosted_on());
      out.write("<br>\n");
      out.write("            <i class=\"fas fa-briefcase fa-fw\"></i>");
      out.print(job.getExper_min());
      out.write(" - ");
      out.print(job.getExper_max());
      out.write(" Years &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <i class=\"fa fa-map-marker fa-fw\"></i>");
      out.print(job.getCountry());
      out.write(',');
      out.print(job.getState());
      out.write(',');
      out.print(job.getCity());
      out.write("<br>  \n");
      out.write("            <i class=\"fa fa-user-o fa-fw\"></i>Vacancy for : ");
      out.print(job.getVacancies());
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <i class=\"fa fa-money fa-fw\"></i>");
      out.print(job.getSalary());
      out.write("&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("           \n");
      out.write("             \n");
      out.write("             <div class=\"cut-text\"><i class=\"fa  fa-file-text-o fa-fw\"></i>");
      out.print(job.getDescription());
      out.write("</div>&nbsp;&nbsp;\n");
      out.write("\n");
      out.write("             <a href=\"ApplyJob.jsp?jid=");
      out.print(job.getJid());
      out.write("\" >Read More</a>\n");
      out.write("             \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <br>\n");
      out.write("    ");
}
      out.write("\n");
      out.write("  \n");
      out.write("\n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                        \n");
      out.write("                                        \n");
      out.write("                                    \n");
      out.write("\n");
      out.write("    ");
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
