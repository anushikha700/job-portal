/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controllers;

import com.daos.JobDao;


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
public class JobController extends HttpServlet {

    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String op = request.getParameter("op");

        if (op != null && op.equalsIgnoreCase("delete")) {
           int jid = Integer.parseInt(request.getParameter("jid"));
           JobDao jd = new JobDao();
           if (jd.remove(jid))
               response.sendRedirect("company/ViewJobs.jsp");
        }

        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String op = request.getParameter("op");

        
        if (op != null && op.equals("add")) {
            String industry= request.getParameter("industry");
            String title= request.getParameter("title");
            String description =request.getParameter("description");
            int vacancies= Integer.parseInt(request.getParameter("vacancies"));
            String salary= request.getParameter("salary");
            String country= request.getParameter("country");
            String state= request.getParameter("state");
            String city= request.getParameter("city");
            String apply_deadline= request.getParameter("apply_deadline");
            int exper_min= Integer.parseInt(request.getParameter("exper_min"));
            int exper_max= Integer.parseInt(request.getParameter("exper_max"));    
            int cid= Integer.parseInt(request.getParameter("cid"));
            String posted_on= request.getParameter("posted_on");
            String education_reqd= request.getParameter("education_reqd");
            String contact_person= request.getParameter("contact_person");
            String contact_no= request.getParameter("contact_no");
            
            
            
                
            HttpSession session = request.getSession();
            com.beans.Job job = (com.beans.Job) session.getAttribute("job");
            
            job.setIndustry(industry);
            job.setTitle(title);
            job.setDescription(description);
            job.setVacancies(vacancies);
            if (salary != null && salary.length() != 0){
              job.setSalary(salary);  
            }
            else
            {
                job.setSalary("Not Disclosed");
            }
            
            job.setCountry(country);
            job.setState(state);
            job.setCity(city);
            job.setApply_deadline(apply_deadline);
            job.setExper_min(exper_min);
            job.setExper_max(exper_max);
            job.setCid(cid);
            job.setPosted_on(posted_on);
            job.setEducation_reqd(education_reqd);
            job.setContact_person(contact_person);
            job.setContact_no(contact_no);
           
            
            
            
            com.daos.JobDao jd = new com.daos.JobDao();
            if (jd.add(job)) {
                session.removeAttribute("job");
                response.sendRedirect("company/ViewJobs.jsp");

            }
        }
       
    

   if (op != null && op.equalsIgnoreCase("update")) {
            String industry= request.getParameter("industry");
            String title= request.getParameter("title");
            String description =request.getParameter("description");
            int vacancies= Integer.parseInt(request.getParameter("vacancies"));
            String salary= request.getParameter("salary");
            String country= request.getParameter("country");
            String state= request.getParameter("state");
            String city= request.getParameter("city");
            String apply_deadline= request.getParameter("apply_deadline");
            int exper_min= Integer.parseInt(request.getParameter("exper_min"));
            int exper_max= Integer.parseInt(request.getParameter("exper_max")); 
            String education_reqd= request.getParameter("education_reqd");
            String contact_person= request.getParameter("contact_person");
            String contact_no= request.getParameter("contact_no");
            
                
            HttpSession session = request.getSession();
            com.beans.Job job = (com.beans.Job) session.getAttribute("job");
            
            job.setIndustry(industry);
            job.setTitle(title);
            job.setDescription(description);
            job.setVacancies(vacancies);
            job.setSalary(salary);
            job.setCountry(country);
            job.setState(state);
            job.setCity(city);
            job.setApply_deadline(apply_deadline);
            job.setExper_min(exper_min);
            job.setExper_max(exper_max);
            job.setEducation_reqd(education_reqd);
            job.setContact_person(contact_person);
            job.setContact_no(contact_no);
            
            
            
            com.daos.JobDao jd = new com.daos.JobDao();
            
            if(jd.update(job))
            {
                session.removeAttribute("job");
                response.sendRedirect("company/ViewJobs.jsp");
            }
                   
                  
        }
        
    }
}