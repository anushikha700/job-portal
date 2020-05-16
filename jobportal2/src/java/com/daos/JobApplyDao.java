/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;

import com.beans.JobApply;

import com.pool.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author anushikha
 */
public class JobApplyDao {
     public boolean upload_resume(JobApply jobapply)
    {
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null) 
       {
           try{
               
               String sql= "Insert into job_apply(jid,jsid,resume,applicationDate)values(?,?,?,?)";
               PreparedStatement smt = con.prepareStatement(sql);
               smt.setInt(1, jobapply.getJid());
               smt.setInt(2, jobapply.getJsid());
              
               smt.setString(3, jobapply.getResume());
               smt.setString(4,jobapply.getApplicationDate());
              
               System.out.println("jid dao"+jobapply.getJid());
               System.out.println("jsid dao"+jobapply.getJsid());
              System.out.println("resume dao"+jobapply.getResume());
               
               
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
     public boolean  ifApplied(int jid,int jsid){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from job_apply where jid=? and jsid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, jid);
            smt.setInt(2, jsid);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                status=true;
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
       return status;
 
     }
     //To get jobseekers id (jsid) applied for Particular Job
      public ArrayList<JobApply>  getJobseekersApplied(int jid){
    
       ArrayList<JobApply> jobapplies =new ArrayList<JobApply>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from job_apply where jid=? and shortlist is Null";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, jid);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                JobApply  jobapply =new JobApply();
                jobapply.setJaid(rs.getInt("jaid"));
                jobapply.setJid(rs.getInt("jid"));
                jobapply.setJsid(rs.getInt("jsid"));
                jobapply.setResume(rs.getString("resume"));
                jobapply.setApplicationDate(rs.getString("applicationDate"));
                jobapplies.add(jobapply);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return jobapplies;
   }

     //To shortlist candidate for job
     public boolean ShortlistCandidate(String shortlist,int jaid)
    {
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null) 
       {
           try{
               
               String sql= "update job_apply set shortlist=? where jaid=? and shortlist is NULL";
               PreparedStatement smt = con.prepareStatement(sql);
               smt.setString (1,shortlist);
               smt.setInt(2,jaid);
              
                if(smt.executeUpdate()>0)
                    status=true;
                
               smt.close();
               cp.putConnection(con);
               
           }
           catch(Exception e){
            System.out.println("Database Error :"+ e.getMessage());
        }

       }
       return status;
    }
  
    
     
     //To get candidates approved for a particular job
      public ArrayList<JobApply>  getApprovedCandidates(int jid){
    
       ArrayList<JobApply> jobapplies =new ArrayList<JobApply>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from job_apply where jid=? and shortlist= ?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, jid);
            smt.setString(2,"approved");
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                JobApply  jobapply =new JobApply();
                jobapply.setJaid(rs.getInt("jaid"));
                jobapply.setJid(rs.getInt("jid"));
                jobapply.setJsid(rs.getInt("jsid"));
                jobapply.setResume(rs.getString("resume"));
                jobapply.setApplicationDate(rs.getString("applicationDate"));
                jobapplies.add(jobapply);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return jobapplies;
   }

     
     
}
