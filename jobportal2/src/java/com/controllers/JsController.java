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

        
               
   
}
}
