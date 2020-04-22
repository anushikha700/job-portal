<%-- Working
    Document   : login
    Created on : Mar 16, 2020, 12:46:20 PM
    Author     : anushikha
--%>
<%@page import="com.daos.CompanyDao"%>
<%@page import="com.beans.Company"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<title>Want To Hire| Login</title>
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
						<h4>Join Us</h4>
						<p>Login In</p>
                                                 <span id="s1">
                                      
                                <% if (request.getParameter("msg")!=null)
                                    out.println("<font color='red' size='4'>"+request.getParameter("msg")+"</font>" );
                                %>
                                </span>

					</div>
                                     <%
            String email="";
            String password= "";
            Cookie cookies[] = request.getCookies();
            for(Cookie c : cookies){
                if (c.getName().equals("email"))
                    email=c.getValue();
                if(c.getName().equals("password"))
                    password=c.getValue();
            }
            %>
					<form method="post" class="signin-form">
							
							<div class="form-input">
								<label>Email</label>
								<input type="email" name="email" placeholder="Email" required="required"  onfocus="s1.innerHTML='';" autocomplete="off" value="<%=email%>">
							</div>
							<div class="form-input">
								<label>Password</label>
								<input type="password" name="password" placeholder="Password" required="required" value="<%=password%>">
							</div>
							
							<label class="container">I agree to <a href="#">Conditions</a> of Use and <a href="#">Privacy</a>
								<input type="checkbox"> Remember Me
								<span class="checkmark"></span>
							</label>
							<button class="btn" value="Submit" name="submit">Login</button>
					</form>
					<div class="copy-right text-center">
						<p>Forgot Password?
								<a href="ForgotPassword.jsp">Click Here</a></p>
					 </div>
				</div>
				
			</div>
			
		</div>
	</section>	<!-- //login-section -->
</body>
 <% 
    if(request.getParameter("submit")!=null) {
        email = request.getParameter("email");
        password = request.getParameter("password");
       
            CompanyDao cd = new CompanyDao();
            Company company = cd.getByLoginData(email, password);
            if (company!=null)
            {
                session.setAttribute("company", company);
                response.sendRedirect("dashboard.jsp");
            }
            else 
                response.sendRedirect("login.jsp?msg=Invalid Email or Password");
        
      
    }
    
    %>
</html>
   
 
