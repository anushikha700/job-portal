<%-- 
    Document   : ApplyJob2
    Created on : May 2, 2020, 3:51:30 PM
    Author     : anushikha
--%>
<%@page import="com.utilities.FileUploader"%>
<%@page import="org.apache.commons.fileupload.servlet.ServletFileUpload"%>
<%@page import="com.beans.Jobseeker"%>
<%@page import="com.beans.Job"%>
<%@page import="com.daos.JsDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="../Main_template/plugins/images/favicon.png">
    <title>Dashboard|Apply</title>
    <!-- Bootstrap Core CSS -->
    <jsp:include page="base.jsp"></jsp:include>
   
    
     <script>

                function readURL(input) {
                    if (input.files && input.files[0]) {
                        var reader = new FileReader();

                        reader.onload = function (e) {
                            resume.src = e.target.result;
                        };

                        reader.readAsDataURL(input.files[0]);
                    }
                }

</script>
   <style>
       .alertcol{
           color: #3c763d;
           background-color: #dff0d8;
           border-color: #d6e9c6;
       }
   </style>    

</head>

<body class="fix-header">
    <!-- ============================================================== -->
    <!-- Preloader -->
    <!-- ============================================================== -->
    
    <%
        if(session.getAttribute("jobseeker")==null)
        {
            response.sendRedirect("login.jsp");
            return;
        }
      
        %>
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
                        <h4 class="page-title">Apply For Job</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                       
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Apply</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <jsp:useBean class="com.beans.Jobseeker" id="jobseeker" scope="session"></jsp:useBean> 
                   <%
                       int jid=request.getParameter("jid")!=null?Integer.parseInt(request.getParameter("jid")):-1;
                        int jsid=jobseeker.getJsid();
   
                   %>     
                <div class="row">
                    <div class="col-md-12">
                        <div class="white-box">
                            <h3 class="box-title">Apply for Job</h3>
                            <br>
                            
                            
                            <form enctype="multipart/form-data"  method="post" action="../JobApplyController?op=upload_resume&jid=<%=jid%>&jsid=<%=jsid%>" class="form-horizontal form-material" >
                                <div class="form-group">
                                    <label class="col-md-4">Upload Resume</label>

                                    <div class="col-md-4">
                                        <input type="file" name="resume" size="50"class="form-control form-control-line"  onchange="readURL(this);"required="required" /> </div> 

                                </div>

                              
                                <div class="form-group">
                                    <div class="col-sm-12">

                                        <center> <button class="btn btn-success" value="apply" <% if (request.getParameter("apply") != null) {%> disabled="disabled"<%}%>  name="apply" >Apply</button>
                                        </center>
                                    </div>
                                </div>

                            </form>    
                            <span id="s1">


                                <% if (request.getParameter("msg") != null) {%>
                              

                                    <div class="alert alertcol">
                                        <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                                        <strong>Success!</strong>
                                    
                                    <%
                                         out.println(request.getParameter("msg"));
                                   }%>
                                 </div>
                            </span>

                                 
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
