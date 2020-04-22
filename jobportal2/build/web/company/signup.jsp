<%@page import="com.daos.CompanyDao"%>
<%@page import="com.beans.Company"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
	<title>Create Account</title>
	<!-- Meta tag Keywords -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
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
            function checkAccept(x,y){
                if(x.checked){
                    y.disabled=false;
               }
               else
               {
                   y.disabled=true;
               }
            }


            function comparePwds(x, y) {

                if (x === y)

                    return true;

                else {

                    alert("Password and Confirm Password not matched !!");

                    return false;

                }
            }

 
           function varifyEmailid(x, y) {
                ajax = new XMLHttpRequest();

                ajax.open("GET", "../CompanyController?op=varify&email=" + x, true);
 
               ajax.send();

                ajax.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
 
                       y.innerHTML = this.responseText;
                    }
                };

            }

            
        </script>

</head>
<jsp:useBean class="com.beans.Company" id="company" scope="session"></jsp:useBean>
                            <jsp:setProperty name="job" property="*"></jsp:setProperty>
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
						<p>Create Your Account, It's Free.</p>
                                                <span id="s1">
                                                    
                                                </span>
					</div>
                                    <form action="..\CompanyController?op=add" method="post" class="signin-form" onsubmit="return comparePwds(password.value,rpassword.value);">
					
							<div class="form-input">
								<label>Company Name</label>
								<input type="text" name="cname" placeholder="" value="${company.cname}" required="required" autocomplete="off"/>
							</div>
							<div class="form-input">
								<label>Email</label>
								<input type="email" name="email" placeholder="" value="${company.email}" required="required" autocomplete="off" onblur="varifyEmailid(this.value, s2);"/>
							</div>
							<div class="form-input">
								<label>Password</label>
								<input type="password" name="password" placeholder="" value="${company.password}" required="required" autocomplete="off" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"/>
							</div>
                                                        <div class="form-input">
								<label>Confirm Password</label>
								<input type="password" name="rpassword" placeholder="" value="${company.password}" required="required" autocomplete="off" />
							</div>
							
							<label class="container">I agree to <a href="#">Conditions</a> of Use and <a href="#">Privacy</a>
								<input type="checkbox"id="accept" value="accept" onchange="checkAccept(this,submit);">
								<span class="checkmark"></span>
							</label>
							<button class="btn"  name="submit" id="submit" disabled="disabled">Create account</button>
					</form>
					<div class="copy-right text-center">
						<p>© Already have an account?
								<a href="login.jsp" target="_blank">Login</a></p>
					 </div>
				</div>
				
			</div>
			
		</div>
	</section>
	<!-- //login-section -->
</body>

</html>
