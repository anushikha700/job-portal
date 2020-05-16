<%-- 
    Document   : ViewJobs
    Created on : Apr 9, 2020, 12:25:43 PM
    Author     : anushikha
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.daos.JobDao"%>
<%@page import="com.daos.CompanyDao"%>
<%@page import="com.beans.Job"%>
<%@page import="com.beans.Company"%>
<%@page contentType="text/html" pageEncoding="UTF-8"import="java.sql.*;"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="../Main_template/plugins/images/favicon.png">
    <title>View All Jobs</title>
    <jsp:include page="base.jsp"></jsp:include>
    
    <script type="text/javascript"> 
            function confirmation(){
               if(confirm("Do you Really want to Remove this record ??"))
               {
                   return true;
               }
               else{
                   return false;
               }
            }
        </script>
   
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
        
        <%!
          
           
            JobDao jd=new JobDao();
            
           
            int start=0;
            int end = 5;
            int total=jd.getRecordsCount();
            
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
       <jsp:include page="topbar.jsp"></jsp:include>
        <!-- End Top Navigation -->
        <!-- ============================================================== -->
        <!-- Left Sidebar - style you can find in sidebar.scss  -->
        <!-- ============================================================== -->
        <jsp:include page="sidebar.jsp"></jsp:include>
        
        <!-- ============================================================== -->
        <!-- End Left Sidebar -->
        <!-- ============================================================== -->
        <!-- ============================================================== -->
        <!-- Page Content -->
        <!-- ============================================================== -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row bg-title">
                    <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
                        <h4 class="page-title">Jobs Added</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                       
                        <ol class="breadcrumb">
                            <li><a href="dashboard.jsp">Dashboard</a></li>
                            <li class="active">Jobs Added</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <!-- /row -->
                <div class="row">
                  <div class="row">
                    <div class="col-sm-12">
                        <div class="white-box">
                            <h3 class="box-title">Jobs added</h3>
                            
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>Job Posted On</th>
                                            <th>Industry</th>
                                            
                                            <th>Job Title</th>
                                            <th>Job Description</th>
                                            <th>No. of vacancies</th>
                                            <th>Annual CTC</th>
                                            <th>Country </th>
                                            <th>State</th>
                                            <th>City</th>
                                            <th>Experience Required(Min-Max)years</th>
                                            <th>Last date of application</th>
                                            <th>Edit/delete</th>
                                            
                                        </tr>
                                    </thead>
                                   
                                    
                                    
                                    <%
                                if (request.getParameter("start")!=null)
                                    start = Integer.parseInt(request.getParameter("start"));
                                 int cid=company.getCid();
                                System.out.println("cid2"+cid);
                                ArrayList<Job> joblist=jd.getByCompany(cid);
                              //  ArrayList<Job> records = jd.getRecordByLimit(start,end);
                                
                                     
                      
                                
                   for (Job job : joblist) {
                                    %>
                                    
                                    <tbody>
                                      
                                        <tr>
                                          

                                           <td><%=job.getPosted_on()%></td>
                                            <td><%=job.getIndustry()%></td>
                                            <td><%=job.getTitle()%></td>
                                            <td><%=job.getDescription()%></td>
                                            <td><%=job.getVacancies()%></td>
                                            <td><%=job.getSalary()%></td>
                                            <td><%=job.getCountry()%></td>
                                            <td><%=job.getState()%></td>
                                            <td><%=job.getCity()%></td>
                                            
                                            <td><%=job.getExper_min()%> - <%=job.getExper_max()%> </td>
                                            
                                            <td><%=job.getApply_deadline()%></td>
                                            <td><a href="EditJob.jsp?jid=<%=job.getJid()%>" class="btn btn-success"> <i class="fa fa-pencil" aria-hidden="true"></i></a> 
                                                <a href="../JobController?op=delete&jid=<%=job.getJid()%>" class="btn btn-danger" onclick="return confirmation();"><i class="fa fa-trash"></i></a>
                                            </td>
                                            
                                        </tr>
                                         <%}%>
                                        
                                    </tbody>
                                </table>
                                          <span>
                                <center>
                                <a href="ViewJobs.jsp?start=<%=start-end%>" class="btn btn-primary <%if(start==0)out.println(" disabled"); %>" style="float:left"><< Previous</a>
                                <a href="ViewJobs.jsp?start=<%=start+end%>" class="btn btn-primary <%if(total-start <= end) out.println(" disabled");%>" style="float: right">Next >></a>
                                
                                
                                </center>
                            </span> 
                                
                            </div>
                        </div>
                    </div>
                </div>

                  </div>  
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
        <!-- /#page-wrapper -->
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


