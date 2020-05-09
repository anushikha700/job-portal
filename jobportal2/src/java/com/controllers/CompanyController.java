/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.daos.CompanyDao;
import com.beans.Company;

import com.utilities.FileUploader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.*;
import javax.servlet.http.Cookie;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author anushikha
 */
public class CompanyController extends HttpServlet {

    
   

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String op = request.getParameter("op");
        
        if (op != null && op.equals("varify")) {
            String email = request.getParameter("email");
            if (email == null || email.equals("")) {
                out.print("<b> Plese fillout the email</b>");
                return;
            } 
            CompanyDao cd = new CompanyDao();
             if (cd.isEmailExist(email))  
                    out.println("<font color='red' size='4' face='corbel'>Already registered</font>");
               
             else 
                    out.println("<font color='blue' size='4' face='corbel'> Congrats! this email is available!</font>");
                
                
        }
        
         if (op != null && op.equals("varify2")) {
            String email = request.getParameter("email");
            if (email == null || email.equals("")) {
                out.print("<b> Plese fillout the email</b>");
                return;
            } 
            CompanyDao cd = new CompanyDao();
             if (cd.isEmailExist(email))  
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
            String cname=request.getParameter("cname");
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            

          
            HttpSession session = request.getSession();
            com.beans.Company company = (com.beans.Company) session.getAttribute("company");

            String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes("UTF-8"));
            company.setCname(cname);
            company.setEmail(email);
            company.setPassword(encodedPassword);
            com.daos.CompanyDao cd = new com.daos.CompanyDao();
            if (cd.add(company)) {
                 session.removeAttribute("company");
               // out.println("account created");
              //  response.sendRedirect("company/dashboard.jsp");
               
               } 
             company = cd.getBySignupData(email, password);
            if (company!=null)
            {
                session.setAttribute("company", company);
                response.sendRedirect("company/AddProfile.jsp");
            }
                 
        }
        
        
         if (op != null && op.equals("add2")) {
          
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
            int cid = Integer.parseInt(request.getParameter("cid"));
            HttpSession session = request.getSession();
            com.beans.Company company = (com.beans.Company) session.getAttribute("company");
            String imagePath = "";
             if (isMultipart)  
               imagePath = FileUploader.getUploadedPath(getServletContext(), "company/images", request);
             company.setLogo(imagePath);
             System.out.println("cid"+cid);
             System.out.println("img"+imagePath);
           
            com.daos.CompanyDao cd = new com.daos.CompanyDao();
            if (cd.add2(company,cid)) {
                session.setAttribute("company",company);
             
                response.sendRedirect("company/dashboard.jsp");
               } 
                 
        }
         
         if(op!=null&op.equals("changePass"))
         {
             System.out.println("IN CHange Pass");
             int cid = Integer.parseInt(request.getParameter("cid"));
             String curpass=request.getParameter("password");
             String newpass=request.getParameter("newpassword");
             com.daos.CompanyDao cd = new com.daos.CompanyDao();
             
             if(cd.PasswordChange(cid,curpass,newpass)){
                 
                 response.sendRedirect("company/ChangePassword.jsp?change=yes&msg=Password Changed Successffully!");
             }
             else
             {
                response.sendRedirect("company/ChangePassword.jsp?msg=Current Password is wrong!");
             }
         } 
        
   
}
}