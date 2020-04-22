/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;


import com.beans.Jobseeker;
import com.controllers.JsController;
import com.pool.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;

/**
 *
 * @author anushikha
 */
public class JsDao {
    public boolean add(Jobseeker jobseeker)
    {
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null) 
       {
           try{
               String sql= "Insert into jobseeker(username,email,password)values(?,?,?)";
               PreparedStatement smt = con.prepareStatement(sql);
               smt.setString(1, jobseeker.getUsername());
               smt.setString(2, jobseeker.getEmail());
              
               smt.setString(3, jobseeker.getPassword());
              
        
              System.out.println("username"+jobseeker.getUsername());
               
               
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
    
     public boolean add2(Jobseeker jobseeker,int jsid)
    {
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null) 
       {
           try{
               String sql= "Update jobseeker set first_name=?,last_name=?,contact=?,dob=?,gender=?,country=?,state=?,city=?,high_school=?,intermediate=?,degree=?,institute=?,experience=?,skills=?,achievements=?,photo=? where jsid=?";
               PreparedStatement smt = con.prepareStatement(sql);
               smt.setString(1,jobseeker.getFirst_name());
               smt.setString(2,jobseeker.getLast_name());
               smt.setString(3,jobseeker.getContact());
               smt.setString(4,jobseeker.getDob());
               smt.setString(5,jobseeker.getGender());
               smt.setString(6,jobseeker.getCountry());
               smt.setString(7,jobseeker.getState());
               smt.setString(8,jobseeker.getCity());
               smt.setString(9,jobseeker.getHigh_school());
               smt.setString(10,jobseeker.getIntermediate());
               smt.setString(11,jobseeker.getDegree());
               smt.setString(12,jobseeker.getInstitute());
               smt.setString(13,jobseeker.getExperience());
               smt.setString(14,jobseeker.getSkills());
               smt.setString(15,jobseeker.getAchievements());
               smt.setString(16,jobseeker.getPhoto());
               smt.setInt(17,jobseeker.getJsid());
              
              
        
              System.out.println("fistname"+jobseeker.getFirst_name());
              System.out.println("high_school"+jobseeker.getHigh_school());
               
               
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


    public boolean  isEmailExist(String email){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from jobseeker where email=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, email);
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
    public boolean  isUsernameExist(String username){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from jobseeker where username=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, username);
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
     public Jobseeker  getByLoginData(String username,String password){
      Jobseeker jobseeker=null;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from jobseeker where username=? and password=?";
            PreparedStatement smt = con.prepareStatement(sql);
            String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes("UTF-8"));
            smt.setString(1, username);
            smt.setString(2, encodedPassword);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                jobseeker=new Jobseeker();
                jobseeker.setJsid(rs.getInt("jsid"));
                jobseeker.setUsername(rs.getString("username"));
                jobseeker.setEmail(rs.getString("email"));
                
                jobseeker.setPassword(rs.getString("password"));
                jobseeker.setFirst_name(rs.getString("first_name"));
                jobseeker.setLast_name(rs.getString("last_name"));
                jobseeker.setContact(rs.getString("contact"));
                jobseeker.setDob(rs.getString("dob"));
                jobseeker.setGender(rs.getString("gender"));
                jobseeker.setCountry(rs.getString("country"));
                jobseeker.setState(rs.getString("state"));
                jobseeker.setCity(rs.getString("city"));
                jobseeker.setHigh_school(rs.getString("high_school"));
                jobseeker.setIntermediate(rs.getString("intermediate"));
                jobseeker.setInstitute(rs.getString("institute"));
                jobseeker.setDegree(rs.getString("degree"));
                jobseeker.setExperience(rs.getString("experience"));
                jobseeker.setSkills(rs.getString("skills"));
                jobseeker.setAchievements(rs.getString("achievements"));
                jobseeker.setPhoto(rs.getString("photo"));
                System.out.println("dao cname: "+rs.getString("username"));
            
                           }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
       return jobseeker;
   }  

     public Jobseeker  getBySignupData(String email,String password){
      Jobseeker jobseeker=null;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from jobseeker where email=? and password=?";
            PreparedStatement smt = con.prepareStatement(sql);
            String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes("UTF-8"));
            smt.setString(1, email);
            smt.setString(2, encodedPassword);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                jobseeker=new Jobseeker();
                jobseeker.setJsid(rs.getInt("jsid"));
                jobseeker.setUsername(rs.getString("username"));
                jobseeker.setEmail(rs.getString("email"));
                
                jobseeker.setPassword(rs.getString("password"));
                jobseeker.setFirst_name(rs.getString("first_name"));
                jobseeker.setLast_name(rs.getString("last_name"));
                jobseeker.setContact(rs.getString("contact"));
                jobseeker.setDob(rs.getString("dob"));
                jobseeker.setGender(rs.getString("gender"));
                jobseeker.setCountry(rs.getString("country"));
                jobseeker.setState(rs.getString("state"));
                jobseeker.setCity(rs.getString("city"));
                jobseeker.setHigh_school(rs.getString("high_school"));
                jobseeker.setIntermediate(rs.getString("intermediate"));
                jobseeker.setInstitute(rs.getString("institute"));
                jobseeker.setDegree(rs.getString("degree"));
                jobseeker.setExperience(rs.getString("experience"));
                jobseeker.setSkills(rs.getString("skills"));
                jobseeker.setAchievements(rs.getString("achievements"));
                jobseeker.setPhoto(rs.getString("photo"));

                
                
                
                
                
                System.out.println("dao cname: "+rs.getString("username"));
                                        }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
       return jobseeker;
   }  
}
