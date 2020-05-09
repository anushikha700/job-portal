<%-- 
    Document   : newjspp
    Created on : Apr 24, 2020, 12:53:51 PM
    Author     : anushikha
--%>

       
<%@page import="java.util.ArrayList"%>
<%@page import="com.daos.JobDao"%>
<%@page import="com.beans.Job"%>
<%@page import="com.beans.Company"%>
<%@page import="java.sql.*;"%>

<jsp:include page="base.jsp"></jsp:include>
<style>
  .card {
  box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2);
  border-radius: 10px;
  width: 800px;
 
}
    .cut-text { 
  text-overflow: ellipsis;
  overflow: hidden; 
  width: 500px; 
  height: 1.2em; 
  white-space: nowrap;
 
}

  .h {
    display: inline-block; /* show on the same line */
    padding-right: 5px; /* small gap on the right of each header */
  }
</style>

    <br><br>
    <h3>Search Results:</h3> 

    
    <%

        JobDao jd = new JobDao();

        
        String keyword = request.getParameter("keyword");

        System.out.println("keyword" + keyword);
        
        ArrayList<Job> joblist = jd.getJobsByKeyword(keyword);
        String cname;
        int cid;
        for (Job job : joblist) {
            cid=job.getCid();
            cname=jd.getCompanyName(cid);
    %>

    
    
    <div class="card">
        <div class="card-body">
            <h5 class="h"><b><%=job.getTitle()%></b></h5> &nbsp;&nbsp;&nbsp;&nbsp;
            <i class="fa fa-building-o fa-fw"></i> <h4 class="h"><%=cname%></h4>&nbsp;&nbsp;&nbsp;&nbsp;
            <i class="fa fa-calendar fa-fw"></i><%=job.getPosted_on()%><br>
            <i class="fas fa-briefcase fa-fw"></i><%=job.getExper_min()%> - <%=job.getExper_max()%> Years &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <i class="fa fa-map-marker fa-fw"></i><%=job.getCountry()%>,<%=job.getState()%>,<%=job.getCity()%><br>  
            <i class="fa fa-user-o fa-fw"></i>Vacancy for : <%=job.getVacancies()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <i class="fa fa-money fa-fw"></i><%=job.getSalary()%>&nbsp;&nbsp;&nbsp;&nbsp;
           
             
             <div class="cut-text"><i class="fa  fa-file-text-o fa-fw"></i><%=job.getDescription()%></div>&nbsp;&nbsp;

             <a href="ApplyJob.jsp?jid=<%=job.getJid()%>" >Read More</a>
             


        </div>
    </div>
    <br>
    <%}%>
  

                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                                    
                        
                                        
                                    

    