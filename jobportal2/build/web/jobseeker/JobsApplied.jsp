<%-- 
    Document   : JobsApplied
    Created on : May 10, 2020, 11:40:50 AM
    Author     : anushikha
--%>

<%@page import="com.beans.JobApply"%>
<%@page import="com.daos.JobApplyDao"%>
<%@page import="com.daos.JobDao"%>
<%@page import="com.beans.Job"%>
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
    <title>Dashboard|Jobs Applied</title>
    <!-- Bootstrap Core CSS -->
    <jsp:include page="base.jsp"></jsp:include>
    <style>
        .cut-text { 
  text-overflow: ellipsis;
  overflow: hidden; 
  width: 500px; 
  height: 1.2em; 
  white-space: nowrap;
 
}
    </style>
    
    
     <script>
          $(document).ready(function(){
    $("button").click(function(){
        var jaid= $(this).val();
      
        $("#s1").load("ApplicationStatus.jsp?jaid="+jaid);
    });
});
   </script>  
   
   <script>
       $().ready(function () {
        var $scrollingDiv = $("#scroll");

        $(window).scroll(function () {
            $scrollingDiv
            .stop()
            .animate({ "marginTop": ($(window).scrollTop() + 5) + "px" }, "1000");
        });
    });
   </script>    
    
    
</head>

<body class="fix-header">
    <%
        if(session.getAttribute("jobseeker")==null)
        {
            
            response.sendRedirect("login.jsp");
            return;
        }
              
        %>
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
                        <h4 class="page-title">Jobs Applied</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Jobs Applied</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                 <jsp:useBean class="com.beans.Jobseeker" id="jobseeker" scope="session"></jsp:useBean>
                 <%
                               JobApplyDao ja=new JobApplyDao();
                               int jsid=jobseeker.getJsid();
                               
                                ArrayList<JobApply> jobapplylist=ja.getJobsApplied(jsid);
                               
                                
                              
                       
                  %>

                <div class="row">
                    <div class="col-md-7">
                        <div class="white-box">
                            <h3 class="box-title">Jobs Applied</h3>
                           <div class="comment-center p-t-10">
                               <%      for (JobApply jobapply : jobapplylist) {
                                       int jid = jobapply.getJid();
                                       int jaid = jobapply.getJaid();
                                       JobDao jd = new JobDao();

                                       ArrayList<Job> joblist = jd.getJobDetails(jid);
                                       for (Job job : joblist) {
                               %>
                                <div class="comment-body">
                                    
                                    <div class="mail-contnet">
                                        <h5><%=job.getTitle()%></h5><span class="time">Posted on: <%=job.getPosted_on()%></span>
                                        <br/>
                                        <span class="mail-desc cut-text"><%=job.getDescription()%></span>
                                        <button class="btn btn btn-rounded btn-default btn-outline m-r-5" value="<%=jaid%>" ><i class="ti-check text-success m-r-5"></i>View Application Status</button>
                                    </div>
                                </div>
                                
                               <%}}%>
                            </div>
                           
                        
                        </div>
                    </div>
                            <div class="col-md-5" id="scroll">
                                <span id="s1">

                                </span>
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
