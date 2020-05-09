<%-- 
    Document   : ApplyJob
    Created on : May 1, 2020, 10:58:16 AM
    Author     : anushikha
--%>
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
    <link rel="icon" type="image/png" sizes="16x16" href="../Main_template/plugins/images/favicon.png">
    <title>Dashboard|Search Jobs</title>
    <!-- Bootstrap Core CSS -->
    <jsp:include page="base.jsp"></jsp:include>
     
   
    <style>
.bt {
  border: 2px solid black;
  background-color: white;
  color: black;
  padding: 9px 25px;
  font-size: 16px;
  cursor: pointer;
}



/* Blue */
.info {
  border-color: #41b3f9 ;
  color: dodgerblue;
}

.info:hover {
  background: #41b3f9 ;
  color: white;
}

.h {
    display: inline-block; /* show on the same line */
    padding-right: 5px; /* small gap on the right of each header */
  }

 .alertcol{
     color: #a94442;
     background-color: #f2dede;
     border-color: #ebccd1;
       }
  
</style>
     

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
                        <h4 class="page-title"></h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Apply For Job</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
              <jsp:useBean class="com.beans.Jobseeker" id="jobseeker" scope="session"></jsp:useBean>   
            <%
                int jid=request.getParameter("jid")!=null?Integer.parseInt(request.getParameter("jid")):-1;
               
                JobDao jd = new JobDao();
                Job job = jd.getById(jid);
                int  cid=job.getCid();
                String cname=jd.getCompanyName(cid);
                String logo=jd.getCompanyLogo(cid);
                int jsid=jobseeker.getJsid();
                
                   
            %>
                
             
                <div class="row">
                    <div class="col-md-8">
                 
                        <div class="white-box">
                            <h3 class="box-title h"><%=job.getTitle()%></h3> &emsp;
                            <h4 class="h"><%=cname%></h4>
                            <br>
                            <div class="col-md-12">
                            <table style="width:80%">
                                <tr>
                                    <td><i class="fas fa-briefcase fa-fw"></i></td>
                                    <td><%=job.getExper_min()%> - <%=job.getExper_max()%> Years</td>
                                    <td style="text-align:right" rowspan="0">&emsp;<img src="../<%=logo%>" alt="Company Logo" width="80"></td>
                                </tr>    
                                <tr>
                                    <td><i class="fa fa-map-marker fa-fw"></i></td>
                                    <td><%=job.getCountry()%>,<%=job.getState()%>,<%=job.getCity()%></td>
                                </tr> 
                                <tr>
                                    <td><i class="fa fa-money fa-fw"></i></td>
                                    <td><%=job.getSalary()%></td>
                                </tr> 
                                <tr>
                                    <td><i class="fa fa-calendar fa-fw"></i></td>
                                    <td><%=job.getApply_deadline()%> </td>
                                </tr>    
                            </table>
                           
                            </div>
                             <br>
                             <br>
                             <br>
                             <br>
                            <hr>
                            <b>Posted on:</b>&emsp;<%=job.getPosted_on()%>&emsp;|&emsp;<b>Job Applicants:</b>&emsp;23&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
                            <a href="../JobApplyController?op=verifyjob&jid=<%=jid%>&jsid=<%=jsid%>" class="bt info" <% if (request.getParameter("apply") != null) {%> disabled="disabled"<%}%> >Apply</a><p>
                            
                            
                            
                        </div>
                        <div class="white-box">
                            
                            <h3>Job Description</h3><br>
                            <%=job.getDescription()%><br><br>
                            
                            <table style="width:60%">

                                <tr>
                                    <td>Role</td>
                                    <td><%=job.getTitle()%></td>

                                </tr>
                                <tr>
                                    <td>Industry Type</td>
                                    <td><%=job.getIndustry()%></td>

                                </tr>
                                 <tr>
                                    <td>Employment Type</td>
                                    <td><%=job.getIndustry()%></td>

                                </tr>
                                 <tr>
                                    <td>Vacancies</td>
                                    <td><%=job.getVacancies()%></td>

                                </tr>

                            </table>
                            
                            <br>
                           <h3>Education and Skills required</h3>
                           <%=job.getEducation_reqd()%>
                           
                           <h3>Company info</h3><br>
                           <table style="width:60%">

                               <tr>
                                   <td>Contact Person</td>
                                   <td><%=job.getContact_person()%></td>

                               </tr>
                               <tr>
                                   <td>Contact Number</td>
                                   <td><%=job.getContact_no()%></td>

                               </tr>

                           </table>
                           
                           
                           
                           
                                
                        </div>    
                         
                            
                    </div>

                    <div class="col-md-4">
                        <span id="s1">
                            <% if (request.getParameter("msg") != null) {%>
                                    <div class="alert  alert-dismissible alertcol">
                                     <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                                             <%
                                                out.println(request.getParameter("msg"));
                                             }%>
                                    </div>
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