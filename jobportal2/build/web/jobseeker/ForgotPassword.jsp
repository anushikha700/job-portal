<%-- 
    Document   : ForgotPassword
    Created on : Apr 9, 2020, 6:19:10 PM
    Author     : anushikha
--%>
<%@page import="org.apache.commons.lang.RandomStringUtils"%>
<%@page import="com.utilities.EmailSender"%>
<%@page import="com.utilities.SmsSender"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<title>Forgot Password</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1"/>
	<meta charset="UTF-8" />
	<meta name="keywords"
		content="Invent Signup Form Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!-- //Meta tag Keywords -->
	<!--/Style-CSS -->
	<link rel="stylesheet" href="../login_template/css/style.css" type="text/css" media="all" />
	<!--//Style-CSS -->
        <script type="text/javascript">
 
  function varifyEmailid(x, y) {
                ajax = new XMLHttpRequest();

                ajax.open("GET", "../JsController?op=varify3&email=" + x, true);
 
               ajax.send();

                ajax.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
 
                       y.innerHTML = this.responseText;
                    }
                };

            }
   
   </script>
</head>

<body>
	<!-- /login-section -->
			
	<section class="w3l-login-6">
		<div class="login-hny">
			<div class="form-content">
				<div class="form-right">
					<div class="overlay">
						<div class="grid-info-form">
							<h5>Say hello</h5>
							<h3>CREATE ACCOUNT </h3>
							<p>Lorem ipsum, dolor sit amet consectetur adipisicing elit. Est natus facere aperiam!
								Tenetur maiores dolore a quod pariatur ut voluptates quae saepe ea quasi laudantium,
								iste molestias inventore fuga assumenda.</p>
							<a href="signup.jsp" class="read-more-1 btn">Get Started</a>
						</div>
					
					</div>
				</div>
				<div class="form-left">
					<div class="middle">
						<h4></h4>
						<p>Forgot Password?</p>
                                                 <span id="s1">
                                      
                                                 </span>

					<form  method="post" class="signin-form">
							
							<div class="form-input">
								<label>Enter a valid Email</label>
                                                                <input type="text" name="recipents" placeholder="Email " class="form-control" pattern="^(\s?[^\s,]+@[^\s,]+\.[^\s,]+\s?,)*(\s?[^\s,]+@[^\s,]+\.[^\s,]+)$" onblur="varifyEmailid(this.value, s1);"/>
								
							</div>
							
							
							
							<button class="btn" value="Submit" name="submit">Submit</button>
					</form>
					<div class="copy-right text-center">
						<p> To Login
								<a href="login.jsp">Click Here</a></p>
					 </div>
				</div>
				
			</div>
			
		</div>
	</section>	<!-- //login-section -->
        
   <% if (request.getParameter("submit") != null) {
            String host;
            String port;
            String user;
            String pass;
            //reads SMTP server setting from web.xml file 
            ServletContext context = config.getServletContext();
            host = context.getInitParameter("host");
            port = context.getInitParameter("port");
            user = context.getInitParameter("user");
            pass = context.getInitParameter("pass");
            System.out.println("user "+user);
            
            String newpassword=RandomStringUtils.randomAlphanumeric(10);
            System.out.println("newPass "+newpassword);
            String email=request.getParameter("recipents");
            com.daos.JsDao js = new com.daos.JsDao();
            js.PasswordForgot(email,newpassword);
            String recipients[] = request.getParameter("recipents").split(",");
            String subject ="Your Job Portal account password has been reset" ;
            String message = "Hi, This is your new password: "+newpassword+"\nNote: for security reason, "
                + "you must change your password after logging in.";


            if(EmailSender.sendEmail(host, port, user, pass, recipients, subject, message))
                    out.println("<font color='Black'>Mail Sent Successfully</font>");
            else
                    out.println("<font color='red'>Mail could not be sent !!</font>");
           
        }%>


 
</body>
 </html>
   
 


