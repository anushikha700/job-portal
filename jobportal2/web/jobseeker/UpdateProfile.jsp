<%-- 
    Document   : UpdateProfile
    Created on : May 25, 2020, 6:32:17 PM
    Author     : anushikha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="com.beans.Jobseeker"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard|Update Profile</title>
        <jsp:include page="base.jsp"></jsp:include>
    
    <script src="//geodata.solutions/includes/countrystatecity.js"></script>

    <script type="text/javascript">
        $(document).ready(function(){
            $("#q").change(function() {
                if ($(this).val() == "1" ||$(this).val()=="2" ||$(this).val()=="3") {
                    $("#q1").show();
                    $("#q2").show();
                    
    
                } else {
                    $("#q1").hide();
                     $("#q2").hide();
                    
                    
                }
                if($(this).val()=="4"){
                    $("#q4").show();
                    
                    
   
                }
                else
                {
                     $("#q4").hide();
                     
     
                }    
                 if($(this).val()=="5"){
                    $("#q5").show();
                }
                else
                {
                     $("#q5").hide();
      
                }    
            });

            $("#q").trigger("change");
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
         <jsp:include page="topbar.jsp"></jsp:include> 

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
                        <h4 class="page-title">Update Your Profile</h4>
                    </div>
                    <div class="col-lg-9 col-sm-8 col-md-8 col-xs-12">
                        
                        <ol class="breadcrumb">
                            <li><a href="#">Dashboard</a></li>
                            <li class="active">Update Profile</li>
                        </ol>
                    </div>
                    <!-- /.col-lg-12 -->
                </div>
                <div class="row">
                    <div class="col-md-12">
                        <div class="white-box">
                            <h3 class="box-title"></h3>
                            
                            <h3>Fill Basic Details</h3>
                            
                            
                        <jsp:useBean class="com.beans.Jobseeker" id="jobseeker" scope="session"></jsp:useBean>
                        <jsp:setProperty name="jobseeker" property="*"></jsp:setProperty>  
                        
                        <% int jsid=jobseeker.getJsid();
                            System.out.println(jsid);%>

                            
                        <form  method="post"class="form-horizontal form-material" action="../JsController?op=updateProfile&jsid=<%=jobseeker.getJsid()%>">
                            
                            
                            
                            <div class="form-group">
                                    <label class="col-md-6">First Name</label>
                                    <label class="col-md-6">Last Name</label> 
                                    <div class="col-md-6">
                                        <input type="text" name="first_name" value="${jobseeker.first_name}" class="form-control form-control-line" required="required"> </div> 
                                <div class="col-md-6">
                                    <input type="text" name="last_name" value="${jobseeker.last_name}"class="form-control form-control-line" > </div>   
                            </div>

                            <div class="form-group">
                                <label class="col-md-6">Date of Birth</label>
                                <label class="col-md-6">Select Gender</label>


                                <div class="col-md-6">
                                    <input type="date" name="dob" value="${jobseeker.dob}"class="form-control form-control-line" > </div>
                                <div class="col-md-6">
                                    <select name="gender" value="${jobseeker.gender}"class="form-control form-control-line" >
                                        <option>Male</option>
                                        <option>Female</option>
                                        <option>Other</option>
                                    </select>   
                                </div>    
                            </div>

                            <div class="form-group">
                                <label class="col-md-12">Location</label>

                                <div class="col-md-3">
                                    <select name="country" class="countries form-control" id="countryId" value="${jobseeker.country}">
                                        <option value="">Country</option>
                                    </select>
                                </div>
                                <div class="col-md-3">
                                    <select class=" states form-control"  name="state" id="stateId" value="${jobseeker.state}">
                                        <option value="">State</option>
                                    </select>
                                </div>
                                <div class="col-md-3">
                                    <select class="cities form-control"  name="city" id="cityId" value="${jobseeker.city}">
                                        <option value="">City</option>
                                    </select>
                                </div>

                            </div>
                            <div class="form-group">
                                <label class="col-md-6">Email</label>
                                <label class="col-md-6">Contact number</label> 
                                <div class="col-md-6">
                                    <input type="email" name="email" class="form-control form-control-line" value="${jobseeker.email}"readonly="readonly"> </div> 
                                <div class="col-md-6">
                                    <input type="tel" name="contact" class="form-control form-control-line" value="${jobseeker.contact}"required="required" > </div>   
                            </div>
                                <br>
                               
                            <br>
                            <h3>Fill Education Details</h3>
                            
                            <br>
                            
                            <div class="form-group">
                               <label  for="q" class="col-md-4">Qualification level</label> 
                               
                                 
                                 
                                 
                               <div class="col-md-6">
                                   <select name="qualification" class="form-control form-control-line" id="q" >${jobseeker.qualification}
                                        <option value="0">Select</option>
                                        
                                        <option value="1" <%if(jobseeker.getQualification().equals("1"))%> selected="selected" >Doctrate/Phd</option>
                                        <option value="2" <%if(jobseeker.getQualification().equals("2"))%> selected="selected">Master/Post-Graduation</option>
                                        <option value="3" <%if(jobseeker.getQualification().equals("3"))%> selected="selected">Graduation/Diploma</option>
                                        <option value="4"<%if(jobseeker.getQualification().equals("4"))%> selected="selected" >12th</option>
                                        <option value="5"<%if(jobseeker.getQualification().equals("5"))%> selected="selected" >10th</option>
                                        <option value="6" <%if(jobseeker.getQualification().equals("6"))%> selected="selected">Below 10th</option>
                                    </select>   
                                </div> 
                               
 
                                
                            </div>    
                            <br>
                            
                            <div class="form-group" id="q1">
                                <label for="q1" id="q1" class="col-md-6">Course</label>
                                <label for="q1"class="col-md-6">Specialization</label>
                                <div class="col-md-6" id="q1">
                                    <input type="text" name="course" value="${jobseeker.course}" class="form-control form-control-line" > </div>
                                <div class="col-md-6" id="q1">
                                    <input type="text" name="specialization" value="${jobseeker.specialization}"class="form-control form-control-line" > </div>  
                                
                            </div>
                            
                             <div class="form-group" id="q2">
                                
                               
                                <label for="q2"class="col-md-6">University/College</label>
                                <label for="q2"class="col-md-6">Passing Year</label>
                                
                                <div class="col-md-6" id="q2">
                                    <input type="text" name="college" value="${jobseeker.college}"class="form-control form-control-line" > </div> 
                                <div class="col-md-6" id="q2">
                                    <input type="text" name="passing_year" value="${jobseeker.passing_year}" class="form-control form-control-line" > </div>    
                            </div>
                            
                         

                            
                            
                            
                            
                            <div class="form-group" id="q4">
                                <label for="q4"class="col-md-6">12th School </label>
                                <label for="q4" class="col-md-6">Passing Year</label> 
                                <div class="col-md-6" id="q4">
                                    <input type="text" name="school" value="${jobseeker.school}" class="form-control form-control-line"  > </div> 
                                <div class="col-md-6" id="q4">
                                    <input type="text" name="passing_year" value="${jobseeker.passing_year}"class="form-control form-control-line" > </div>   
                            </div>
                            
                            <div class="form-group" id="q5">
                                <label for="q5" class="col-md-6">10th School </label>
                                <label for="q5" class="col-md-6">Passing Year</label> 
                                <div class="col-md-6" id="q5">
                                    <input type="text" name="school" value="${jobseeker.school}" class="form-control form-control-line" > </div> 
                                <div class="col-md-6" id="q5">
                                    <input type="text" name="passing_year" value="${jobseeker.passing_year}"class="form-control form-control-line" > </div>   
                            </div>

                            <br>
                              
                            <br>
                            <h3>Fill Professional Details</h3>
                           
                            <br>    
                            
                            

                            <div class="form-group">
                                <label class="col-md-12">Work Experience</label>
                                <div class="col-md-6">
                                    <textarea row="5"  name="experience" class="form-control form-control-line" >${jobseeker.experience}</textarea> </div>

                            </div>
                            <div class="form-group">
                                <label class="col-md-12">Skills</label>

                                <div class="col-md-6">
                                    <textarea row="5" name="skills" class="form-control form-control-line" >${jobseeker.skills}</textarea> </div> 

                            </div>
                            <div class="form-group">
                                <label class="col-md-12">Achievements</label>

                                <div class="col-md-6">
                                    <textarea row="5" name="achievements"  class="form-control form-control-line" >${jobseeker.achievements}</textarea> </div> 

                            </div>



                            <div class="form-group">
                                <div class="col-sm-12">
                                    
                                    <center> <button class="btn btn-success" id="submit" name="submit" >Update</button>
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
