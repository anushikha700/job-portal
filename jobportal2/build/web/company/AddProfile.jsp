<%-- 
    Document   : AddProfile
    Created on : Apr 27, 2020, 5:34:07 PM
    Author     : anushikha
--%>

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
    <title>Dashboard|Complete Profile</title>
    <!-- Bootstrap Core CSS -->
    <jsp:include page="base.jsp"></jsp:include>
    <!-- <script src="//geodata.solutions/includes/countrystatecity.js"></script>-->
    <script src="../assets/location.js"></script>
     
    

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
        <nav class="navbar navbar-default navbar-static-top m-b-0">
            <div class="navbar-header">
                <div class="top-left-part">
                    <!-- Logo -->
                    <a class="logo" href="dashboard.html">
                        <!-- Logo icon image, you can use font-icon also -->
                        <b>
                            <!--This is dark logo icon-->
                            <img src="../Main_template/plugins/images/admin-logo.png" alt="home" class="dark-logo" />
                            <!--This is light logo icon-->
                            <img src="../Main_template/plugins/images/admin-logo-dark.png" alt="home" class="light-logo" />
                        </b>
                        <!-- Logo text image you can use text also -->
                        <span class="hidden-xs">
                            <!--This is dark logo text-->
                            <img src="../Main_template/plugins/images/admin-text.png" alt="home" class="dark-logo" />
                            <!--This is light logo text-->
                            <img src="../Main_template/plugins/images/admin-text-dark.png" alt="home" class="light-logo" />
                        </span> 
                    </a>
                </div>
                <!-- /Logo -->
                <ul class="nav navbar-top-links navbar-right pull-right">
                    <li>
                        <a class="nav-toggler open-close waves-effect waves-light hidden-md hidden-lg" href="javascript:void(0)"><i class="fa fa-bars"></i></a>
                    </li>
                    <li>
                        <form role="search" class="app-search hidden-sm hidden-xs m-r-10">
                            <input type="text" placeholder="Search..." class="form-control"> 
                            <a href="">
                                <i class="fa fa-search"></i>
                            </a> 
                        </form>
                    </li>
                    <li>
                        <a class="profile-pic" href="#"> <img src="../assets/images/notavailable.png" alt="user-img" width="36" class="img-circle"><b class="hidden-xs">${jobseeker.username}</b></a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-header -->
            <!-- /.navbar-top-links -->
            <!-- /.navbar-static-side -->
        </nav>

                <!-- End Top Navigation -->
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
                        <h4 class="page-title">Complete Your Profile</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <a href="https://wrappixel.com/templates/ampleadmin/" target="_blank"
                            class="btn btn-danger pull-right m-l-20 hidden-xs hidden-sm waves-effect waves-light">Upgrade
                            to Pro</a>
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Add Details</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="white-box">
                            <h3 class="box-title">Add Details</h3>
                            <h3>Fill Basic Details</h3>
                        <jsp:useBean class="com.beans.Company" id="company" scope="session"></jsp:useBean>


                        <form action="UploadPhoto.jsp" method="post"class="form-horizontal form-material" >
                            
                            
                            
                            <div class="form-group">
                                    <label class="col-md-6">Company Name</label>
                                    <label class="col-md-6">Email</label> 
                                    <div class="col-md-6">
                                        <input type="text" name="cname" value="${company.cname}"class="form-control form-control-line" readonly="readonly"> </div> 
                                <div class="col-md-6">
                                    <input type="text" name="email" value="${company.email}" class="form-control form-control-line" readonly="readonly"> </div>   
                            </div>


                            <div class="form-group">
                                <label class="col-md-12">Location</label>

                                <div class="col-md-3">
                                    <select name="country" class="countries form-control" id="countryId" required="required">
                                        <option value="">Country</option>
                                    </select>
                                </div>
                                <div class="col-md-3">
                                    <select class=" states form-control"  name="state" id="stateId" >
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
                                <label class="col-md-6">Building no.</label>
                                <label class="col-md-6">Pincode</label> 
                                <div class="col-md-6">
                                    <input type="text" name="address" class="form-control form-control-line" > </div> 
                                <div class="col-md-6">
                                    <input type="text" name="pincode" class="form-control form-control-line"  > </div>   
                            </div>
   

                            <div class="form-group">
                                <label class="col-md-12">Describe about your company</label>
                                <div class="col-md-6">
                                    <textarea row="5" name="about_us" class="form-control form-control-line" ></textarea> </div>

                            </div>
                            



                            <div class="form-group">
                                <div class="col-sm-12">
                                    
                                    <center> <button class="btn btn-success" id="submit" name="submit" >Save and Continue</button>
                                    </center>
                                </div>
                            </div>




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
