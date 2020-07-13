<%-- 
    Document   : ApplicationStatus
    Created on : May 17, 2020, 4:33:38 PM
    Author     : anushikha
--%>

<%@page import="com.beans.JobApply"%>
<%@page import="com.daos.JobApplyDao"%>
<%@page import="com.beans.Job"%>
<%@page import="com.daos.JobDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        <style>
            
            .status{
                color: #808080;
                font-weight: bold;  
                font-size: 15px;
            }

            .approve{
                color: #8BC58B;
                font-weight: bold; 
                font-size: 15px;

            } 
            .reject{ 
                color:#FF9999;
                font-weight: bold; 
                font-size: 15px;

            } 

            .await{
                color: #a7adba;
                font-weight: bold; 
                font-size: 15px;

            }
            .p1{  

                color: #33475b;
                font-family: Verdana, Geneva, sans-serif;
            }
            .p2{  

                color: #9eb4cc;
                font-family: Verdana, Geneva, sans-serif;
            }
            
        </style>    
    </head>
    <body>
    <div class="white-box" >
        <h3>Application Status</h3>
        <%
             int jaid=request.getParameter("jaid")!=null?Integer.parseInt(request.getParameter("jaid")):-1;
           JobApplyDao ja=new JobApplyDao();
           JobApply jobapply=ja.getById(jaid);
           int jid=jobapply.getJid();
            JobDao jd = new JobDao();
            Job job=jd.getById(jid);
            
        %>
        <h4><p class="text-muted"> <code>For Job Title: <%=job.getTitle()%></code></p></h4>
       
       <p class="p2"> Applied on&nbsp; <%=jobapply.getApplicationDate()%></p><br><br>
        <table>
            <tr>
                 <td class="status">Status:&nbsp;&nbsp; </td>
        
            
        <%
        if(jobapply.getShortlist()!=null)
        {%>
         <%if(jobapply.getShortlist().equals("approved")){%>
         <td class="approve">Approved</td></tr></table>
            <br><p class ="p1">Wait for email from recruiter for further process.</p>
            <%}else
                
            {%>
            <td class="reject">Rejected</td></tr></table>
            <br><p class ="p1"> Try for other jobs with matching skills.</p>
            <%}%>
        <%}else{%>
        <td class="await">Awaited</td></tr></table>
        <br><p class ="p1"> Wait for recruiter to review your application.</p>
        <%}%>

        
                
        
        
        
        
       
               
      </div> 
       
    </body>
</html>
