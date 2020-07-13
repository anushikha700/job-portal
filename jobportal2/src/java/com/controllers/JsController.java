/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.beans.Jobseeker;
import com.daos.JsDao;
import com.utilities.FileUploader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author anushikha
 */
public class JsController extends HttpServlet {

        
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String op = request.getParameter("op");
        
        //Verify email at signup
        if (op != null && op.equals("varify1")) {
            String email = request.getParameter("email");
            if (email == null || email.equals("")) {
                out.print("<b> Plese fillout the email</b>");
                return;
            } 
            JsDao js = new JsDao();
             if (js.isEmailExist(email))  
                    out.println("<font color='red' size='4' face='corbel'>Already registered</font>");
               
             else 
                    out.println("<font color='blue' size='4' face='corbel'> Congrats! this email is available!</font>");
                
                
        }
        //verify username at Login
         if (op != null && op.equals("varify2")) {
            String username = request.getParameter("username");
            if (username == null || username.equals("")) {
                out.print("<b> Plese fill username</b>");
                return;
            } 
            JsDao js = new JsDao();
             if (js.isUsernameExist(username))  
                    out.println("<font color='red' size='4' face='corbel'> Username not available</font>");
               
             else 
                    out.println("<font color='blue' size='4' face='corbel'>Username available </font>");
                
                
        }
         //Verify Email when forgot password
          if (op != null && op.equals("varify3")) {
            String email = request.getParameter("email");
            if (email == null || email.equals("")) {
                out.print("<b> Plese fillout the email</b>");
                return;
            } 
            JsDao js = new JsDao();
             if (js.isEmailExist(email))  
                    out.println("<font color='Blue' size='4' face='corbel'> Click Submit</font>");
               
             else 
                    out.println("<font color='red' size='4' face='corbel'> Email not registered! Create new Account</font>");
                
                
        }
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String op = request.getParameter("op");

        
        //To register 
        
        if (op != null && op.equals("add")) {
            String email=request.getParameter("email");
            String username=request.getParameter("username");
            String password=request.getParameter("password");
            

          
            HttpSession session = request.getSession();
            com.beans.Jobseeker jobseeker = (com.beans.Jobseeker) session.getAttribute("jobseeker");

            String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes("UTF-8"));
            jobseeker.setEmail(email);
            jobseeker.setUsername(username);
            jobseeker.setPassword(encodedPassword);
            com.daos.JsDao js = new com.daos.JsDao();
            if (js.add(jobseeker)) {
                
                session.removeAttribute("jobseeker");
                 
               // response.sendRedirect("jobseeker/BasicDetails.jsp");
                
               } 
            jobseeker = js.getBySignupData(email, password);
            if (jobseeker!=null)
            {
                session.setAttribute("jobseeker", jobseeker);
                response.sendRedirect("jobseeker/AddProfile.jsp");
            }

                 
        }
        
        if (op != null && op.equals("add2")) {
          
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            int jsid = Integer.parseInt(request.getParameter("jsid"));
            HttpSession session = request.getSession();
            com.beans.Jobseeker jobseeker = (com.beans.Jobseeker) session.getAttribute("jobseeker");
            String imagePath = "";
             if (isMultipart)  
               imagePath = FileUploader.getUploadedPath(getServletContext(), "jobseeker/images", request);
             jobseeker.setPhoto(imagePath);
             System.out.println("jsid"+jsid);
             System.out.println("img"+imagePath);
           
            com.daos.JsDao js = new com.daos.JsDao();
            if (js.add2(jobseeker,jsid)) {
                session.setAttribute("jobseeker",jobseeker);
             
                response.sendRedirect("jobseeker/dashboard.jsp");
               } 
                 
        }
        
        
        
        
        
         if (op != null && op.equals("updateProfile")) {
          System.out.println("i am here");

            int jsid = Integer.parseInt(request.getParameter("jsid"));
            String first_name= request.getParameter("first_name");
            String last_name= request.getParameter("last_name");
            String dob=request.getParameter("dob");
            String gender=request.getParameter("gender");
            String country=request.getParameter("coutnry");
            String state=request.getParameter("state");
            String city=request.getParameter("city");
            String contact=request.getParameter("contact");
            String qualification=request.getParameter("qualification");
            String course=request.getParameter("course");
            String specialization=request.getParameter("specialization");
            String college=request.getParameter("college");
            String school=request.getParameter("school");
            String passing_year=request.getParameter("passing_year");
            String experience=request.getParameter("experience");
            String skills=request.getParameter("skills");
            String achievements=request.getParameter("achievements");
            
           
            HttpSession session = request.getSession();
            com.beans.Jobseeker jobseeker = (com.beans.Jobseeker) session.getAttribute("jobseeker");
            
            jobseeker.setFirst_name(first_name);
            jobseeker.setLast_name(last_name);
            jobseeker.setDob(dob);
            jobseeker.setGender(gender);
            jobseeker.setCountry(country);
            jobseeker.setState(state);
            jobseeker.setCity(city);
            jobseeker.setContact(contact);
            jobseeker.setQualification(qualification);
            jobseeker.setCourse(course);
            jobseeker.setSpecialization(specialization);
            jobseeker.setCollege(college);
            jobseeker.setSchool(school);
            jobseeker.setPassing_year(passing_year);
            jobseeker.setExperience(experience);
            jobseeker.setSkills(skills);
            jobseeker.setAchievements(achievements);
                    
            
            com.daos.JsDao js = new com.daos.JsDao();
            if (js.updateProfile(jobseeker,jsid)) {
                session.setAttribute("jobseeker",jobseeker);
             
                response.sendRedirect("jobseeker/Profile.jsp");
               } 
                 
        }
        
        
        
         if(op!=null&op.equals("changePass"))
         {
            
             int jsid = Integer.parseInt(request.getParameter("jsid"));
             String curpass=request.getParameter("password");
             String newpass=request.getParameter("newpassword");
             com.daos.JsDao js = new com.daos.JsDao();
             
             if(js.PasswordChange(jsid,curpass,newpass)){
                 
                 response.sendRedirect("jobseeker/ChangePassword.jsp?change=yes&msg=Password Changed Successffully!");
             }
             else
             {
                response.sendRedirect("jobseeker/ChangePassword.jsp?msg=Current Password is wrong!");
             }
         }
        
               
   
}
}
