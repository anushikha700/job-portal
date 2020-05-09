<%-- 
    Document   : ChangePassword
    Created on : Apr 29, 2020, 2:38:12 PM
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
    <title>Dashboard|Change Password</title>
    <!-- Bootstrap Core CSS -->
    <jsp:include page="base.jsp"></jsp:include>
    
   
    <style>
        .alertFail{
     color: #a94442;
     background-color: #f2dede;
     border-color: #ebccd1;
       }
       
       .alertSucc{
           color: #3c763d;
           background-color: #dff0d8;
           border-color: #d6e9c6;
       }

    </style>
    
    <script>
         function comparePwds(x, y) {

                if (x === y)

                    return true;

                else {

                    alert("Password and Confirm Password doesnot match !!");

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
                        <h4 class="page-title">Change Password</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Change Password</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                 <jsp:useBean class="com.beans.Company" id="company" scope="session"></jsp:useBean>  
                 <% int cid=company.getCid();%>
                 
                <div class="row">
                    <div class="col-md-12">
                        
                        <div class="white-box">
                            <h3 class="box-title">Change Password</h3>
                            
                            <form method="post" class="form-horizontal form-material" action="../CompanyController?op=changePass&cid=<%=cid%>" onsubmit="return comparePwds(newpassword.value,rnewpassword.value);">
                                    <center>
                                    <div class="form-group">
                                        <label class="col-md-4">Current Password</label>
                                        <div class="col-md-4">
                                        <input type="password" name="password" class="form-control form-control-line" > </div> 
                                     </div><br>
                                    <div class="form-group">
                                        <label class="col-md-4">New Password</label>
                                        <div class="col-md-4">
                                        <input type="password" name="newpassword" class="form-control form-control-line"> </div> 
                                     </div><br>
                                    <div class="form-group">
                                        <label class="col-md-4">Confirm New Password</label>
                                        <div class="col-md-4">
                                        <input type="password" name="rnewpassword" class="form-control form-control-line"> </div> 
                                     </div><br>
                                     <center>
                                    <div class="form-group">
                                        <button class="btn btn-success" name="submit">Change Password</button>
                                     </div>
                                         </center>
                                    </center>  
                                </form>    
                              
                            <%if(request.getParameter("change")!=null)
                            {%>
                            <span>
                            <% if (request.getParameter("msg") != null) {%>
                                    <div class="alert  alert-dismissible alertSucc">
                                     <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                                             <%
                                                out.println(request.getParameter("msg"));
                                             }%>
                                    </div>
                            </span>
                                
                             <%}%> 
                             
                            <%if(request.getParameter("change")==null)
                            {%>
                              <span>
                            <% if (request.getParameter("msg") != null) {%>
                                    <div class="alert  alert-dismissible alertFail">
                                     <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                                             <%
                                                out.println(request.getParameter("msg"));
                                             }%>
                                    </div>
                            </span>  
                            <%}%>
                           
                            
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
