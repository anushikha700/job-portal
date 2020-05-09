/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.daos.JobApplyDao;
import com.utilities.FileUploader;
import java.io.IOException;
import java.io.PrintWriter;
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
public class JobApplyController extends HttpServlet {

  

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String op = request.getParameter("op");
        
        //Verify if already applied for job
        if (op != null && op.equals("verifyjob")) {
            
                System.out.println(" In verify job");
            
            int jid =Integer.parseInt(request.getParameter("jid"));
            int jsid=Integer.parseInt(request.getParameter("jsid"));
            System.out.println("jid"+jid+"jsid"+jsid);
            JobApplyDao ja = new JobApplyDao();
             if (ja.ifApplied(jid,jsid)) { 
                 System.out.println("true");
                   response.sendRedirect("jobseeker/ApplyJob.jsp?jid="+jid+"&msg=Already applied for this job&apply=applied"); 
             }
             else
             {
                 response.sendRedirect("jobseeker/ApplyJob2.jsp?jid="+jid);
             }
        }
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String op = request.getParameter("op");
       
        if (op != null && op.equals("upload_resume")) {
           
             boolean isMultipart = ServletFileUpload.isMultipartContent(request);
             int jid = Integer.parseInt(request.getParameter("jid"));
             int jsid = Integer.parseInt(request.getParameter("jsid"));
            
           com.beans.JobApply jobapply= new com.beans.JobApply();
            String resumePath = "";
             if (isMultipart)  
               resumePath = FileUploader.getUploadedPath(getServletContext(), "jobseeker/resume", request);
             jobapply.setJid(jid);
             jobapply.setJsid(jsid);
             jobapply.setResume(resumePath);

            com.daos.JobApplyDao ja = new com.daos.JobApplyDao();
            if (ja.upload_resume(jobapply)) {
           
                response.sendRedirect("jobseeker/ApplyJob2.jsp?msg=Successfully Applied For Job&apply=applied");
               }   
       }
    }

    

}
