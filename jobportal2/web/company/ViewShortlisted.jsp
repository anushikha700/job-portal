<%-- 
    Document   : ViewShortlisted
    Created on : May 16, 2020, 4:20:32 PM
    Author     : anushikha
--%>

<%@page import="com.beans.Jobseeker"%>
<%@page import="com.daos.JobApplyDao"%>
<%@page import="com.beans.JobApply"%>
<%@page import="java.util.ArrayList"%>
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
    <link rel="icon" type="image/png" sizes="16x16" href="../plugins/images/favicon.png">
    <title>Dashboard|Jobs Applied</title>
    <!-- Bootstrap Core CSS -->
    <jsp:include page="base.jsp"></jsp:include>
</head>

<body class="fix-header">
     <%
        if(session.getAttribute("company")==null)
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
                        <h4 class="page-title">Shortlisted Candidates</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                       
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Shortlisted Candidates</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="white-box">
                            
                            <%
                                int jid=request.getParameter("jid")!=null?Integer.parseInt(request.getParameter("jid")):-1;
                                String title=request.getParameter("title");
                                JobApplyDao ja=new JobApplyDao();
                               JsDao js=new JsDao();
                                  
                                int i=1;
                                ArrayList<JobApply> jobapplylist=ja.getApprovedCandidates(jid);
                               boolean listempty=jobapplylist.isEmpty();
                            %>
                            
                              
                            
                            <h4 class="box-title">Shortlisted Candidates </h4>
                          
                           <h4><p class="text-muted"> <code>For Job Title: <%=title%></code></p></h4>
                            <div class="table-responsive">
                                 
                                <table class="table">

                               <%if(listempty==true){%>
                                    <h4> No candidate shortlisted for this job.</h4>
                                     <%}
                                     else{%>
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>Applied On</th>
                                            <th>Candidate Name</th>
                                            <th>Resume</th>
                                            <th>Action</th>
                                            
                                        </tr>
                                    </thead>
                                    <%}%>
                                    <%
                               
                                for(JobApply jobapply:jobapplylist)
                                {
                                    int jsid=jobapply.getJsid();
                                    int jaid=jobapply.getJaid();
                                    
                                    
                                    ArrayList<Jobseeker> jobseekerlist=js.getJobseekersInfo(jsid);
                                    
                                    for(Jobseeker jobseeker:jobseekerlist)
                                    {
                                    
                             %>

                                    <tbody>
                                        <tr>
                                     
                                            <td><%=i%> <%=jaid%></td>
                                            <td><%=jobapply.getApplicationDate()%>
                                             <td><%=jobseeker.getFirst_name()%> <%=jobseeker.getLast_name()%></td>
                                             <td><a href="../<%=jobapply.getResume()%>" class="btn btn btn-rounded btn-default btn-outline m-r-5"><i class="ti-check text-success m-r-5"></i>View Resume</a> </td>
                                            
                                           
                                             <td>

                                                 
                                                 <a href="../JobApplyController?op=#&jaid=<%=jaid%>&shortlist=approved&jid=<%=jid%>&title=<%=title%>"
                                                   
                                                    class="btn btn btn-rounded btn-default btn-outline m-r-5">
                                                     <i class="ti-check text-success m-r-5"></i>Send Mail
                                                 </a>
                                                    
                                                                                                
                                             </td>
                                            
                                        </tr>
                                       
                                     <%}
                                        i++;
                                    }%>
                                        
                                     
                                     
                                    </tbody>
                                </table>
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

