<%-- 
    Document   : CandidatesApplied
    Created on : May 10, 2020, 2:37:45 PM
    Author     : anushikha
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.daos.JobDao"%>
<%@page import="com.beans.Job"%>

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
    <title>Dashboard|Candidates Applied</title>
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
</head>

<body class="fix-header">
     <%
        if(session.getAttribute("company")==null)
        {
            
            response.sendRedirect("login.jsp");
            return;
        }
              
        %>
       <jsp:useBean class="com.beans.Company" id="company" scope="session"></jsp:useBean>
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
                        <h4 class="page-title">Candidates Applied</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Jobs Posted</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->

                </div>
                  <%
                               JobDao jd=new JobDao();
                               int cid=company.getCid();
                                System.out.println("cid2"+cid);
                                ArrayList<Job> joblist=jd.getByCompany(cid);
                              
                       
                  %>

                  <div class="row">
                    <div class="col-md-8">
                        <div class="white-box">
                            <h3 class="box-title">Jobs Applied</h3>
                           
                            <div class="comment-center p-t-10">
                                 <%
                           for (Job job : joblist) {
                                    %>
                                <div class="comment-body">
                                    
                                    <div class="mail-contnet">
                                        <h5><%=job.getTitle()%></h5><span class="time">Posted on: <%=job.getPosted_on()%></span>
                                        <br/>
                                        <span class="mail-desc cut-text"><%=job.getDescription()%></span>
                                        <a href="ViewNewApplications.jsp?jid=<%=job.getJid()%>&title=<%=job.getTitle()%>" class="btn btn btn-rounded btn-default btn-outline m-r-5"><i class="ti-check text-success m-r-5"></i>View New Applications</a>
                                        <a href="ViewShortlisted.jsp?jid=<%=job.getJid()%>&title=<%=job.getTitle()%>" class="btn btn btn-rounded btn-default btn-outline m-r-5"><i class="ti-check text-success m-r-5"></i>View Shortlisted Applications</a>
                                    </div>
                                </div>
                                
                               <%}%>
                            </div>
                        
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

