package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.beans.JobApply;
import com.daos.JobApplyDao;
import com.beans.Job;
import com.daos.JobDao;

public final class ApplicationStatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            /* Progress Tracker v2 */\n");
      out.write("ol.progress[data-steps=\"2\"] li { width: 49%; }\n");
      out.write("ol.progress[data-steps=\"3\"] li { width: 33%; }\n");
      out.write("ol.progress[data-steps=\"4\"] li { width: 24%; }\n");
      out.write("ol.progress[data-steps=\"5\"] li { width: 19%; }\n");
      out.write("ol.progress[data-steps=\"6\"] li { width: 16%; }\n");
      out.write("ol.progress[data-steps=\"7\"] li { width: 14%; }\n");
      out.write("ol.progress[data-steps=\"8\"] li { width: 12%; }\n");
      out.write("ol.progress[data-steps=\"9\"] li { width: 11%; }\n");
      out.write("\n");
      out.write(".progress {\n");
      out.write("    width: 100%;\n");
      out.write("    list-style: none;\n");
      out.write("    list-style-image: none;\n");
      out.write("    margin: 20px 0 20px 0;\n");
      out.write("    padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress li {\n");
      out.write("    float: left;\n");
      out.write("    text-align: center;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress .name {\n");
      out.write("    display: block;\n");
      out.write("    vertical-align: bottom;\n");
      out.write("    text-align: center;\n");
      out.write("    margin-bottom: 1em;\n");
      out.write("    color: black;\n");
      out.write("    opacity: 0.3;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress .step {\n");
      out.write("    color: black;\n");
      out.write("    border: 3px solid silver;\n");
      out.write("    background-color: silver;\n");
      out.write("    border-radius: 50%;\n");
      out.write("    line-height: 1.2;\n");
      out.write("    width: 1.2em;\n");
      out.write("    height: 1.2em;\n");
      out.write("    display: inline-block;\n");
      out.write("    z-index: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress .step span {\n");
      out.write("    opacity: 0.3;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress .active .name,\n");
      out.write(".progress .active .step span {\n");
      out.write("    opacity: 1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress .step:before {\n");
      out.write("    content: \"\";\n");
      out.write("    display: block;\n");
      out.write("    background-color: silver;\n");
      out.write("    height: 0.4em;\n");
      out.write("    width: 50%;\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0.6em;\n");
      out.write("    left: 0;\n");
      out.write("    z-index: -1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress .step:after {\n");
      out.write("    content: \"\";\n");
      out.write("    display: block;\n");
      out.write("    background-color: silver;\n");
      out.write("    height: 0.4em;\n");
      out.write("    width: 50%;\n");
      out.write("    position: absolute;\n");
      out.write("    bottom: 0.6em;\n");
      out.write("    right: 0;\n");
      out.write("    z-index: -1;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress li:first-of-type .step:before {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress li:last-of-type .step:after {\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress .done .step,\n");
      out.write(".progress .done .step:before,\n");
      out.write(".progress .done .step:after,\n");
      out.write(".progress .active .step,\n");
      out.write(".progress .active .step:before {\n");
      out.write("    background-color: yellowgreen;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".progress .done .step,\n");
      out.write(".progress .active .step {\n");
      out.write("    border: 3px solid yellowgreen;\n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"white-box\" >\n");
      out.write("        <h3>Application Status</h3>\n");
      out.write("        ");

             int jaid=request.getParameter("jaid")!=null?Integer.parseInt(request.getParameter("jaid")):-1;
           JobApplyDao ja=new JobApplyDao();
           JobApply jobapply=ja.getById(jaid);
           int jid=jobapply.getJid();
            JobDao jd = new JobDao();
            Job job=jd.getById(jid);
            
        
      out.write("\n");
      out.write("        <h4><p class=\"text-muted\"> <code>For Job Title: ");
      out.print(job.getTitle());
      out.write("</code></p></h4>\n");
      out.write("        jaid=");
      out.print(jaid);
      out.write("\n");
      out.write("        jsid=");
      out.print(jobapply.getJsid());
      out.write("\n");
      out.write("        Your application is ");
      out.print(jobapply.getShortlist());
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!-- Progress Tracker v2 -->\n");
      out.write("<ol class=\"progress\" data-steps=\"4\">\n");
      out.write("    <li class=\"done\">\n");
      out.write("        <span class=\"name\">Foo</span>\n");
      out.write("        <span class=\"step\"><span>1</span></span>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"done\">\n");
      out.write("        <span class=\"name\">Bar</span>\n");
      out.write("        <span class=\"step\"><span>2</span></span>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"active\">\n");
      out.write("        <span class=\"name\">Baz</span>\n");
      out.write("        <span class=\"step\"><span>3</span></span>\n");
      out.write("    </li>\n");
      out.write("    <li>\n");
      out.write("        <span class=\"name\">Quux</span>\n");
      out.write("        <span class=\"step\"><span>4</span></span>\n");
      out.write("    </li>\n");
      out.write("</ol>\n");
      out.write("        \n");
      out.write("      </div> \n");
      out.write("       \n");
      out.write("    </body>\n");
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
