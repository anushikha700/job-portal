<%-- 
    Document   : SendMail
    Created on : Jul 13, 2020, 2:45:41 PM
    Author     : anushikha
--%>
<%@page import="com.utilities.EmailSender"%>
<%@page import="com.daos.JsDao"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="../plugins/images/favicon.png">
    <title>Company|Send Mail</title>
    <!-- Bootstrap Core CSS -->
    <jsp:include page="base.jsp"></jsp:include>
</head>

<body class="fix-header">
    <!-- ============================================================== -->
    <!-- Preloader -->
    <!-- ============================================================== -->
    <div class="preloader">
        <svg class="circular" viewBox="25 25 50 50">
            <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="2" stroke-miterlimit="10" />
        </svg>
    </div>
    <!-- ============================================================== -->
    <!-- Wrapper -->
    <!-- ============================================================== -->
    <div id="wrapper">
        <!-- ============================================================== -->
        <!-- Topbar header - style you can find in pages.scss -->
        <!-- ============================================================== -->
        <jsp:include page="topbar.jsp"></jsp:include>        <!-- End Top Navigation -->
        <!-- ============================================================== -->
        <!-- Left Sidebar - style you can find in sidebar.scss  -->
        <!-- ============================================================== -->
        <jsp:include page="sidebar.jsp"></jsp:include>        <!-- ============================================================== -->
        <!-- End Left Sidebar -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- Page Content -->
        <!-- ============================================================== -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row bg-title">
                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                        <h4 class="page-title">Send Mail</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                       
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Send Mail</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="white-box">
                            <h3 class="box-title">Send Mail</h3>
                            
                             <form method="post" class="form-horizontal form-material" action="#">
                                  <% int jsid=request.getParameter("jsid")!=null?Integer.parseInt(request.getParameter("jsid")):-1; 
                                   JsDao js=new JsDao();
                                   String to=js.getEmail(jsid);
                                   System.out.println("to:"+to);
                                  %>
                                    <center>
                                    <div class="form-group">
                                        <label class="col-md-4">To: </label>
                                        <div class="col-md-4">
                                            <input type="text" name="to" value="<%=to%>" class="form-control form-control-line" readonly="readonly"> </div> 
                                     </div><br>
                                     <div class="form-group">
                                        <label class="col-md-4">Subject:  </label>
                                        <div class="col-md-4">
                                        <textarea row="1" name="subject" class="form-control form-control-line" ></textarea> </div> 
                                     </div><br>
                                      <div class="form-group">
                                        <label class="col-md-4">Message:  </label>
                                        <div class="col-md-4">
                                        <textarea row="5" name="message" class="form-control form-control-line" ></textarea> </div> 
                                     </div><br>
                                   
                                     <center>
                                    <div class="form-group">
                                        <button class="btn btn-success" name="submit">Send Mail</button>
                                     </div>
                                         </center>
                                    </center>  
                                </form>    
                        </div>
                    </div>
                </div>
            </div>
            <!-- /.container-fluid -->
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
        <!-- ============================================================== -->
        <!-- End Page Content -->
        <!-- ============================================================== -->
    </div>
        
        
         <% if (request.getParameter("submit") != null) {
            String host;
            String port;
            String user;
            String pass;
            //reads SMTP server setting from web.xml file 
            ServletContext context = config.getServletContext();
            host = context.getInitParameter("host");
            port = context.getInitParameter("port");
            user = context.getInitParameter("user");
            pass = context.getInitParameter("pass");
            
            
            
           
            String email=to;

           
            String recipients[] = request.getParameter("to").split(",");
            String subject =request.getParameter("subject");
            String message = request.getParameter("message");


            if(EmailSender.sendEmail(host, port, user, pass, recipients, subject, message))
            {
                out.println("<font color='Black'>Mail Sent Successfully</font>");
                System.out.println("Mail Sent");
            }
                
            else
            {
                    out.println("<font color='red'>Mail could not be sent !!</font>"); 
                    System.out.println("Mail could not be Sent");
            }
                    
           
        }%>

        
        
        
        
    <!-- /#wrapper -->
    <!-- jQuery -->
    <script src="../Main_template/plugins/bower_components/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="../Main_template/html/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- Menu Plugin JavaScript -->
    <script src="../Main_template/plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
    <!--slimscroll JavaScript -->
    <script src="../Main_template/html/js/jquery.slimscroll.js"></script>
    <!--Wave Effects -->
    <script src="../Main_template/html/js/waves.js"></script>
    <!-- Custom Theme JavaScript -->
    <script src="../Main_template/html/js/custom.min.js"></script>

</body>

</html>
