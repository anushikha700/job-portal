package org.apache.jsp.jobseeker;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.daos.JsDao;
import com.beans.Jobseeker;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<title>Get Job|Login</title>\n");
      out.write("\t<!-- Meta tag Keywords -->\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"/>\n");
      out.write("\t<meta charset=\"UTF-8\" />\n");
      out.write("\t<meta name=\"keywords\"\n");
      out.write("\t\tcontent=\"Invent Signup Form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("\t<script>\n");
      out.write("\t\taddEventListener(\"load\", function () {\n");
      out.write("\t\t\tsetTimeout(hideURLbar, 0);\n");
      out.write("\t\t}, false);\n");
      out.write("\n");
      out.write("\t\tfunction hideURLbar() {\n");
      out.write("\t\t\twindow.scrollTo(0, 1);\n");
      out.write("\t\t}\n");
      out.write("\t</script>\n");
      out.write("\t<!-- //Meta tag Keywords -->\n");
      out.write("\t<!--/Style-CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../login_template/css/style.css\" type=\"text/css\" media=\"all\" />\n");
      out.write("\t<!--//Style-CSS -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<!-- /login-section -->\n");
      out.write("\t\t\t\n");
      out.write("\t<section class=\"w3l-login-6\">\n");
      out.write("\t\t<div class=\"login-hny\">\n");
      out.write("\t\t\t<div class=\"form-content\">\n");
      out.write("\t\t\t\t<div class=\"form-right\">\n");
      out.write("\t\t\t\t\t<div class=\"overlay\">\n");
      out.write("\t\t\t\t\t\t<div class=\"grid-info-form\">\n");
      out.write("\t\t\t\t\t\t\t<h5>Say hello</h5>\n");
      out.write("\t\t\t\t\t\t\t<h3>CREATE ACCOUNT </h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Est natus facere aperiam!\n");
      out.write("\t\t\t\t\t\t\t\tTenetur maiores dolore a quod pariatur ut voluptates quae saepe ea quasi laudantium,\n");
      out.write("\t\t\t\t\t\t\t\tiste molestias inventore fuga assumenda.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"../StartPage.jsp\" class=\"read-more-1 btn\">Get Started</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-left\">\n");
      out.write("\t\t\t\t\t<div class=\"middle\">\n");
      out.write("\t\t\t\t\t\t<h4>Join Us</h4>\n");
      out.write("\t\t\t\t\t\t<p>Login In</p>\n");
      out.write("                                                 <span id=\"s1\">\n");
      out.write("                                      \n");
      out.write("                                ");
 if (request.getParameter("msg")!=null)
                                    out.println("<font color='red' size='4'>"+request.getParameter("msg")+"</font>" );
                                
      out.write("\n");
      out.write("                                </span>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("            ");

            String username="";
            String password="";
            Cookie cookies[] = request.getCookies();
            for(Cookie c : cookies){
                if (c.getName().equals("username"))
                    username=c.getValue();
                if(c.getName().equals("password"))
                    password=c.getValue();
            }
            
      out.write("\n");
      out.write("\t\t\t\t\t<form method=\"post\" class=\"signin-form\">\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Username</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"username\" name=\"username\"  required=\"required\"  onfocus=\"s1.innerHTML='';\" autocomplete=\"off\" value=\"");
      out.print(username);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-input\">\n");
      out.write("\t\t\t\t\t\t\t\t<label>Password</label>\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"password\" name=\"password\" required=\"required\" value=\"");
      out.print(password);
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<label class=\"container\">Remember Me\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"checkbox\"> \n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"checkmark\"></span>\n");
      out.write("\t\t\t\t\t\t\t</label>\n");
      out.write("\t\t\t\t\t\t\t<button class=\"btn\" value=\"Submit\" name=\"submit\">Login</button>\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t<div class=\"copy-right text-center\">\n");
      out.write("\t\t\t\t\t\t<p>Forgot Password?\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"ForgotPassword.jsp\">Click Here</a></p>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\t<!-- //login-section -->\n");
      out.write("</body>\n");
      out.write(" ");
 
    if(request.getParameter("submit")!=null) {
        username = request.getParameter("username");
        password = request.getParameter("password");
       
            JsDao js = new JsDao();
            Jobseeker jobseeker = js.getByLoginData(username, password);
            if (jobseeker!=null)
            {
                session.setAttribute("jobseeker", jobseeker);
                response.sendRedirect("dashboard.jsp");
            }
            else 
                response.sendRedirect("login.jsp?msg=Invalid Email or Password");
        
      
    }
    
    
      out.write("\n");
      out.write("</html>\n");
      out.write("   \n");
      out.write(" \n");
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
