/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;
import com.beans.Company;
import com.beans.Job;
import com.pool.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author anushikha
 */
public class JobDao {
    public boolean add(Job job)
        {
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null) 
       {
           try{
               String sql= "Insert into job(title,description,vacancies,salary,country,state,city,apply_deadline,exper_min,exper_max,cid,industry,posted_on,education_reqd,contact_person,contact_no)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
               PreparedStatement smt = con.prepareStatement(sql);
            
               smt.setString(1, job.getTitle());
              
               smt.setString(2, job.getDescription());
               smt.setInt(3, job.getVacancies());
              
               smt.setString(4, job.getSalary());
               smt.setString(5, job.getCountry());
               smt.setString(6, job.getState());
               smt.setString(7, job.getCity());
               smt.setString(8, job.getApply_deadline());
               smt.setInt(9, job.getExper_min());
               smt.setInt(10, job.getExper_max());
               smt.setInt(11, job.getCid());
               smt.setString(12, job.getIndustry());
               smt.setString(13, job.getPosted_on());
              smt.setString(14, job.getEducation_reqd()); 
              smt.setString(15,job.getContact_person());
              smt.setString(16, job.getContact_no());
               
              System.out.println("Title"+job.getTitle());

              System.out.println("Industry"+job.getIndustry());
               
               
               if(smt.executeUpdate()>0)
               {
                   status=true;
                   
               }
               
               
               smt.close();
               cp.putConnection(con);
               
           }
           catch(Exception e){
            System.out.println("Database Error :"+ e.getMessage());
        }

       }
       return status;
    }
    
    
    public boolean  remove(int jid){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "Delete from job where jid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, jid);
            
            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return status;
   }
   
   public Job  getById(int jid){
      Job job =null;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from job where jid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, jid);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                job =new Job();
  
                job.setJid(rs.getInt("jid"));
                job.setCid(rs.getInt("cid"));
                job.setIndustry(rs.getString("industry"));
                job.setTitle(rs.getString("title"));
                job.setDescription(rs.getString("description"));
                job.setVacancies(rs.getInt("vacancies"));
                job.setSalary(rs.getString("salary"));
                job.setCountry(rs.getString("country"));
                job.setState(rs.getString("state"));
                job.setCity(rs.getString("city"));
                job.setApply_deadline(rs.getString("apply_deadline"));
                job.setExper_min(rs.getInt("exper_min"));
                job.setExper_max(rs.getInt("exper_max"));
                job.setPosted_on(rs.getString("posted_on"));
                job.setEducation_reqd(rs.getString("education_reqd"));
                job.setContact_person(rs.getString("contact_person"));
                job.setContact_no(rs.getString("contact_no"));
                
                
                
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return job;
   }
   
   public ArrayList<Job>  getAllRecords(){
    
       ArrayList<Job> jobs =new ArrayList<Job>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from job";
            PreparedStatement smt = con.prepareStatement(sql);
          //  smt.setInt(1, cid);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Job  job =new Job();
                job.setJid(rs.getInt("jid"));
                job.setIndustry(rs.getString("industry"));
                job.setTitle(rs.getString("title"));
                job.setDescription(rs.getString("description"));
                job.setVacancies(rs.getInt("vacancies"));
                job.setSalary(rs.getString("salary"));
                job.setCountry(rs.getString("country"));
                job.setState(rs.getString("state"));
                job.setCity(rs.getString("city"));
                job.setApply_deadline(rs.getString("apply_deadline"));
                job.setExper_min(rs.getInt("exper_min"));
                job.setExper_max(rs.getInt("exper_max"));
                
                jobs.add(job);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return jobs;
   }
    public int  getRecordsCount(){
    
       int total=0;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            Job job=new Job();
            String sql = "select count(*) from job ";
            PreparedStatement smt = con.prepareStatement(sql);
         //  smt.setInt(1, job.getCid());
           // System.out.println("getcid: "+job.getCid());
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                total = rs.getInt(1);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return total;
   }
   
     public ArrayList<Job>  getRecordByLimit(int start, int end){
    
       ArrayList<Job> jobs =new ArrayList<Job>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{

            String sql = "select * from job limit?,?";
            PreparedStatement smt = con.prepareStatement(sql);
           
            smt.setInt(1, start);
           smt.setInt(2,end);
            
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Job job=new Job();
                job.setJid(rs.getInt("jid"));
                job.setIndustry(rs.getString("industry"));
                job.setTitle(rs.getString("title"));
                job.setDescription(rs.getString("description"));
                job.setVacancies(rs.getInt("vacancies"));
                job.setSalary(rs.getString("salary"));
                job.setCountry(rs.getString("country"));
                job.setState(rs.getString("state"));
                job.setCity(rs.getString("city"));
                job.setApply_deadline(rs.getString("apply_deadline"));
                job.setExper_min(rs.getInt("exper_min"));
                job.setExper_max(rs.getInt("exper_max"));
                
                jobs.add(job);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return jobs;
   }
   
    public boolean  update(Job job){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "update Job set industry=?,title=?,description=?,vacancies=?,salary=?,country=?,state=?,city=?,apply_deadline=?,exper_min=?,exper_max=?,education_reqd=?,contact_person=?,contact_no=?  where jid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, job.getIndustry());
            smt.setString(2, job.getTitle());
            smt.setString(3, job.getDescription());
            smt.setInt(4, job.getVacancies());
            smt.setString(5, job.getSalary());
            smt.setString(6, job.getCountry());
            smt.setString(7,job.getState());
            smt.setString(8, job.getCity());
            smt.setString(9, job.getApply_deadline());
            smt.setInt(10, job.getExper_min());
            smt.setInt(11, job.getExper_max());
            smt.setString(12, job.getEducation_reqd()); 
            smt.setString(13,job.getContact_person());
            smt.setString(14, job.getContact_no());
            smt.setInt(15, job.getJid());
             
            if(smt.executeUpdate()>0)
                status=true;
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return status;
   }
   //TO get company details while login
    public ArrayList<Job>  getByCompany(int cid){
    
       ArrayList<Job> jobs =new ArrayList<Job>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from job where cid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, cid);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Job  job =new Job();
                job.setJid(rs.getInt("jid"));
                job.setIndustry(rs.getString("industry"));
                job.setTitle(rs.getString("title"));
                job.setDescription(rs.getString("description"));
                job.setVacancies(rs.getInt("vacancies"));
                job.setSalary(rs.getString("salary"));
                job.setCountry(rs.getString("country"));
                job.setState(rs.getString("state"));
                job.setCity(rs.getString("city"));
                job.setApply_deadline(rs.getString("apply_deadline"));
                job.setExper_min(rs.getInt("exper_min"));
                job.setExper_max(rs.getInt("exper_max"));
                job.setPosted_on(rs.getString("posted_on"));
                job.setEducation_reqd(rs.getString("education_reqd"));
                job.setContact_person(rs.getString("contact_person"));
                job.setContact_no(rs.getString("contact_no"));
                
                jobs.add(job);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return jobs;
   }

    public int  getRecordsCountByCid(int cid){
    
       int total=0;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            Job job=new Job();
            String sql = "select count(*) from job where cid=? ";
            PreparedStatement smt = con.prepareStatement(sql);
             smt.setInt(1, job.getCid());
           // System.out.println("getcid: "+job.getCid());
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                total = rs.getInt(1);
                System.out.println("total2 : "+ total);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return total;
   }

    //TO get job details in Search Jobs
     public ArrayList<Job>  getJobsByKeyword(String keyword){
        
       ArrayList<Job> jobs =new ArrayList<Job>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select jid,cname,title,industry,exper_min,exper_max,description,vacancies,salary,job.country,job.state,job.city,apply_deadline,job.cid,posted_on,education_reqd,contact_person,contact_no from job,company where job.cid=company.cid and(company.cname like ? or industry like ? or title like ?)";
            PreparedStatement smt = con.prepareStatement(sql);
            
             smt.setString(1,"%"+keyword+"%");
            smt.setString(2,"%"+keyword+"%");
            smt.setString(3,"%"+keyword+"%");
           ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Job  job =new Job();
                job.setJid(rs.getInt("jid"));
                job.setIndustry(rs.getString("industry"));
                job.setTitle(rs.getString("title"));
                job.setDescription(rs.getString("description"));
                job.setVacancies(rs.getInt("vacancies"));
                job.setSalary(rs.getString("salary"));
                job.setCountry(rs.getString("country"));
                job.setState(rs.getString("state"));
                job.setCity(rs.getString("city"));
                job.setApply_deadline(rs.getString("apply_deadline"));
                job.setCid(rs.getInt("cid"));
                job.setExper_min(rs.getInt("exper_min"));
                job.setExper_max(rs.getInt("exper_max"));
                job.setPosted_on(rs.getString("posted_on"));
                job.setEducation_reqd(rs.getString("education_reqd"));
                job.setContact_person(rs.getString("contact_person"));
                job.setContact_no(rs.getString("contact_no"));
                jobs.add(job);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return jobs;
   }
     
     //To get company name in Search Jobs
     public String getCompanyName(int cid )
     {
         String cname = null;
        
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            Company company=new Company();
            String sql = "select cname from company,job where job.cid=company.cid and job.cid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1,cid);
           
           // System.out.println("getcid: "+job.getCid());
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                cname = rs.getString(1);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
         
       return cname;  
     }
   
     //To get Company Logo in Search Job
      public String getCompanyLogo(int cid )
     {
         String logo=null;
        
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            Company company=new Company();
            String sql = "select logo from company,job where job.cid=company.cid and job.cid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1,cid);
           
           // System.out.println("getcid: "+job.getCid());
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                logo = rs.getString(1);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
         
       return logo;  
     }
   
     
      //TO get job details using jid 
    public ArrayList<Job>  getJobDetails(int jid){
    
       ArrayList<Job> jobs =new ArrayList<Job>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from job where jid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, jid);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Job  job =new Job();
                job.setJid(rs.getInt("jid"));
                job.setIndustry(rs.getString("industry"));
                job.setTitle(rs.getString("title"));
                job.setDescription(rs.getString("description"));
                job.setVacancies(rs.getInt("vacancies"));
                job.setSalary(rs.getString("salary"));
                job.setCountry(rs.getString("country"));
                job.setState(rs.getString("state"));
                job.setCity(rs.getString("city"));
                job.setApply_deadline(rs.getString("apply_deadline"));
                job.setExper_min(rs.getInt("exper_min"));
                job.setExper_max(rs.getInt("exper_max"));
                job.setPosted_on(rs.getString("posted_on"));
                job.setEducation_reqd(rs.getString("education_reqd"));
                job.setContact_person(rs.getString("contact_person"));
                job.setContact_no(rs.getString("contact_no"));
                
                jobs.add(job);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return jobs;
   }

      
   
     
}
