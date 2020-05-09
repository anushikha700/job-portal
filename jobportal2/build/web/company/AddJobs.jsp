<%-- 
    Document   : AddJobs
    Created on : Apr 4, 2020, 12:15:08 AM
    Author     : anushikha
--%>
<%@page import="com.daos.JobDao"%>
<%@page import="com.daos.CompanyDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"import="com.beans.Job"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="../plugins/images/favicon.png">
    <title>Post Job</title>
    <!-- Bootstrap Core CSS -->
    <jsp:include page="base.jsp"></jsp:include>
     <script src="//geodata.solutions/includes/countrystatecity.js"></script>
  

    <script type="text/javascript">
            $(document).ready(function () {
        
            
             var url = "https://raw.githubusercontent.com/anushikha700/jason/master/industries.json";

            $.getJSON(url, function (data) {
                $.each(data, function (index, value) {
                    // APPEND OR INSERT DATA TO SELECT ELEMENT.
                    $('#sel').append('<option value>' + value.name + '</option>');
                });
            
        });

        // SHOW SELECTED VALUE.
        // var x=$('#msg').text('Selected Item: ' + this.options[this.selectedIndex].text);
        $('#sel').change(function () {
            var x=this.options[this.selectedIndex].text;
            
             document.getElementById("addjob").bt.value=x;
             
             
        });
    });
             
        
    function setDate(){ 
        var date = new Date();
        var day = date.getDate();
        var month = date.getMonth() + 1;
        var year = date.getFullYear();

        if (month < 10) month = "0" + month;
        if (day < 10) day = "0" + day;

        var today = year + "-" + month + "-" + day;

        document.getElementById('addjob').posted_on.value = today;
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
                        <h4 class="page-title">Post New Job</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <a href="https://wrappixel.com/templates/ampleadmin/" target="_blank"
                            class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light">Upgrade
                            to Pro</a>
                        <ol class="breadcrumb">
                            <li><a href="dashboard.jsp">Dashboard</a></li>
                            <li class="active">Post New Job</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                 <div class="row">
                    <!--col -->
                    <div class="col-sm-12">
                        <div class="white-box">
                            <div class="box-title"><h2><center>Add Job Details</center></h2></div> 
                             <jsp:useBean class="com.beans.Job" id="job" scope="session"></jsp:useBean>
                        <jsp:setProperty name="job" property="*"></jsp:setProperty>
                        
                        
                            <form action="../JobController?op=add" method="post"class="form-horizontal form-material" id="addjob" >
                                <div class="form-group">
                                    <label class="col-md-6">Industry</label>
                                    <label class="col-md-6">Title</label> 
                                    <div class="col-md-6">
                                        <select id="sel"  class="form-control"  required="required">
                                            <option value="">Select Industry</option>
                                        </select>
                                        <input type="hidden" name ="industry" id="bt" />
                                    </div>    
                                    
                                     <div class="col-md-6">
                                        <input type="text" name="title" placeholder=" Eg: Software Engineer" class="form-control form-control-line" required="required"> </div>   
                                </div>
                                
                                <div class="form-group">
                                    <label class="col-md-12">Employment Type</label>
                                    
                                    <div class="col-md-3">
                                      Full Time  <input type="checkbox" name="job_type" value="Full Time" ${job.job_type.contains("Full Time")?" checked":""} ></div>
                                    <div class="col-md-3">
                                     Part Time  <input type="checkbox" name="job_type" value="Part Time" ${job.job_type.contains("Part Time")?" checked":""} ></div>
                                     <div class="col-md-3">
                                      Internship  <input type="checkbox" name="job_type" value="Internship" ${job.job_type.contains("Internship")?" checked":""}>
                                    </div>
                                        
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Job Description</label>
                                    <div class="col-md-12">
                                        <textarea rows="5" name="description"class="form-control form-control-line" required="required"></textarea> </div>
                                </div>
                                 <div class="form-group">
                                    <label class="col-md-12">Education and skills required</label>
                                    <div class="col-md-12">
                                        <textarea rows="5" name="education_reqd"class="form-control form-control-line" required="required"></textarea> </div>
                                </div>    
                                
                                <div class="form-group">
                                    <label class="col-md-6">Vacancy</label>
                                    <label class="col-md-6">Annual CTC</label>
                                    <div class="col-md-6">
                                        <input type="number" name="vacancies" placeholder="Eg:5" class="form-control form-control-line"required="required" > </div>
                                    <div class="col-md-6">
                                        <input type="text" name="salary" placeholder="Eg: INR 5,000,000 (Optional)" class="form-control form-control-line" > </div>    
                                </div>

                                
                                <div class="form-group">
                                    <label class="col-md-12">Experience Required(in Years)</label>
                                    <div class="col-md-6">
                                        <input type="number" name="exper_min" placeholder="Minimum" class="form-control form-control-line"required="required" > </div>
                                    
                                     <div class="col-md-6">
                                        <input type="number" name="exper_max" placeholder="Maximum" class="form-control form-control-line" required="required"> </div>
                                    
                                </div>
                                <div class="form-group">
                                    <label class="col-md-12">Location</label>
                                   
                                    <div class="col-md-3">
                                       <select name="country" class="countries form-control" id="countryId"    required="required">
                                             <option value="">Country</option>
                                        </select>
                                    </div>
                                    <div class="col-md-3">
                                        <select class=" states form-control"  name="state" id="stateId" required="required">
                                             <option value="">State</option>
                                        </select>
                                    </div>
                                     <div class="col-md-3">
                                        <select class="cities form-control"  name="city" id="cityId">
                                             <option value="">City</option>
                                        </select>
                                    </div>

                                </div>
                                 <div class="form-group">
                                    <label class="col-md-12">Last Date To Apply</label>
                                    
                                    <div class="col-md-6">
                                        <input type="date" name="apply_deadline" class="form-control form-control-line" required="required"> </div>
                                        
                                </div>
                                 <div class="form-group">
                                    <label class="col-md-6">Contact Person</label>
                                    <label class="col-md-6">Contact Number</label>
                                    
                                    <div class="col-md-6">
                                        <input type="text" name="contact_person" class="form-control form-control-line" required="required"> </div>
                                    <div class="col-md-6">
                                        <input type="text" name="contact_no" class="form-control form-control-line" required="required"> </div>    
                                </div>    
        
                            
                                    
                                    <div class="col-md-6">
                                        <input type="hidden"  name="posted_on" class="form-control form-control-line" > </div>
                                      
                               
                               
        

                                        
                                <div class="form-group">
                                    <div class="col-sm-12">
                                        <button class="btn btn-success" id="submit" name="submit" onclick="setDate()">Submit</button>
                                    </div>
                                </div>
                                        <input type="hidden" name="cid" value="${company.cid}"/>
                                        

                                      
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
