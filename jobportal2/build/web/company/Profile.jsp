<%@page import="com.beans.Company"%>
<%@page import="com.daos.CompanyDao"%>
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
    <title>Dashboard|Profile</title>
    <!-- Bootstrap Core CSS -->
    <jsp:include page="base.jsp"></jsp:include>
    <style>
        
        .l1{
            font-family:helvetica;
            color:#767676;
            margin:15px;
            font-size:17px ;
            display: inline-block;
            font-weight: bold;
        } 
         
        .p1 {
    display: inline-block; /* show on the same line */
    margin: 15px; /* small gap on the right of each header */
    font-size:15px ;
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
        <jsp:useBean class="com.beans.Company" id="company" scope="session"></jsp:useBean>
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
                        <h4 class="page-title">Profile page</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Profile Page</li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->
                <!-- .row -->
                <div class="row">
                    <div class="col-md-4 col-xs-12">
                        <div class="white-box">
                            <div class="user-bg"> <img width="100%" alt="user" src="../${company.logo}">
                                <div class="overlay-box">
                                    <div class="user-content">
                                        <a href="javascript:void(0)"><img src="../${company.logo}"
                                                class="thumb-lg img-circle" alt="img"></a>
                                        <h4 class="text-white">${company.cname}</h4>
                                        <h5 class="text-white">${company.email}</h5>
                                    </div>
                                </div>
                            </div>
                            <div class="user-btm-box">
                                 
                                <i class="far fa-building fa-fw" aria-hidden="true"></i>${company.cname}<br>
                                <%if(company.country!=null){%> <i class="fa fa-map-marker fa-fw" aria-hidden="true"></i>${company.country}
                                <%if(company.state!=null){%>| ${company.state} <%}%> 
                                <%if(company.city!=null){%>, ${company.city} <%}%> 
                                
                                <%}%>   
                            </div>
                        </div>
                    </div>
                    <div class="col-md-8 col-xs-12">
                        <div class="white-box">
                            <form class="form-horizontal form-material">
                                <div class="form-group">
                                    <p style="font-family:helvetica ;font-size:30px; color:#525252 ; margin:20px">${company.cname}</p>
                                    <hr>
                                    <%if(company.about_us!=null){%>
                                    <p style="font-family:helvetica ;font-size:20px; color:#767676 ; margin:15px">About Us</p><br>
                                    
                                   <div class="row">
                                       
                                        <div class="col-md-6">
                                            <p class="p1">${company.about_us}</p>
                                        </div>
                                    </div>
                                   <%}else{%>
                                   <p class="p1">Complete your profile</p>
                                   <%}%>
                                   
                   
                                  
                                </div> 
                                <a href="#" class="btn btn-success">Update Profile</a>
                            </form>

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


