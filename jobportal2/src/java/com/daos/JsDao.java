/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;


import com.beans.Jobseeker;
import com.pool.ConnectionPool;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
               String sql= "Update jobseeker set first_name=?,last_name=?,contact=?,dob=?,gender=?,country=?,state=?,city=?,school=?,qualification=?,college=?,course=?,specialization=?,passing_year=?,experience=?,skills=?,achievements=?,photo=? where jsid=?";
               PreparedStatement smt = con.prepareStatement(sql);
               smt.setString(1,jobseeker.getFirst_name());
               smt.setString(2,jobseeker.getLast_name());
               smt.setString(3,jobseeker.getContact());
               smt.setString(4,jobseeker.getDob());
               smt.setString(5,jobseeker.getGender());
               smt.setString(6,jobseeker.getCountry());
               smt.setString(7,jobseeker.getState());
               smt.setString(8,jobseeker.getCity());
               smt.setString(9,jobseeker.getSchool());
               
               smt.setString(10,jobseeker.getQualification());
               smt.setString(11,jobseeker.getCollege());
               smt.setString(12,jobseeker.getCourse());
               smt.setString(13,jobseeker.getSpecialization());
               smt.setString(14,jobseeker.getPassing_year());
               smt.setString(15,jobseeker.getExperience());
               smt.setString(16,jobseeker.getSkills());
               smt.setString(17,jobseeker.getAchievements());
               smt.setString(18,jobseeker.getPhoto());
               smt.setInt(19,jobseeker.getJsid());
              
              
        
              System.out.println("fistname"+jobseeker.getFirst_name());
              System.out.println("high_school"+jobseeker.getSchool());
               
               
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


     
      public boolean updateProfile(Jobseeker jobseeker,int jsid)
    {
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null) 
       {
           try{
               String sql= "Update jobseeker set first_name=?,last_name=?,contact=?,dob=?,gender=?,country=?,state=?,city=?,school=?,qualification=?,college=?,course=?,specialization=?,passing_year=?,experience=?,skills=?,achievements=? where jsid=?";
               PreparedStatement smt = con.prepareStatement(sql);
               smt.setString(1,jobseeker.getFirst_name());
               smt.setString(2,jobseeker.getLast_name());
               smt.setString(3,jobseeker.getContact());
               smt.setString(4,jobseeker.getDob());
               smt.setString(5,jobseeker.getGender());
               smt.setString(6,jobseeker.getCountry());
               smt.setString(7,jobseeker.getState());
               smt.setString(8,jobseeker.getCity());
               smt.setString(9,jobseeker.getSchool());
               
               smt.setString(10,jobseeker.getQualification());
               smt.setString(11,jobseeker.getCollege());
               smt.setString(12,jobseeker.getCourse());
               smt.setString(13,jobseeker.getSpecialization());
               smt.setString(14,jobseeker.getPassing_year());
               smt.setString(15,jobseeker.getExperience());
               smt.setString(16,jobseeker.getSkills());
               smt.setString(17,jobseeker.getAchievements());
          
               smt.setInt(18,jobseeker.getJsid());
              
              
               
              System.out.println("coutnry"+jobseeker.getCountry());
              System.out.println("exper"+jobseeker.getExperience());
               
               
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
                jobseeker.setSchool(rs.getString("school"));
                
                jobseeker.setCollege(rs.getString("college"));
                jobseeker.setQualification(rs.getString("qualification"));
                jobseeker.setCourse(rs.getString("course"));
                jobseeker.setSpecialization(rs.getString("specialization"));
                jobseeker.setPassing_year(rs.getString("passing_year"));
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
                jobseeker.setSchool(rs.getString("school"));
                
                jobseeker.setCollege(rs.getString("college"));
                jobseeker.setQualification(rs.getString("qualification"));
                jobseeker.setCourse(rs.getString("course"));
                jobseeker.setSpecialization(rs.getString("specialization"));
                jobseeker.setPassing_year(rs.getString("passing_year"));
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
      public boolean  PasswordForgot(String email,String newpassword){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "update jobseeker set password=? where email=?";
            PreparedStatement smt = con.prepareStatement(sql);
            String encodedPassword = Base64.getEncoder().encodeToString(newpassword.getBytes("UTF-8"));
            smt.setString(1, encodedPassword);
            smt.setString(2,email);
            
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
   
      public boolean  PasswordChange(int jsid,String curpass,String newpassword){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "update jobseeker set password=? where jsid=? and password=?";
            PreparedStatement smt = con.prepareStatement(sql);
            String newencodedPassword = Base64.getEncoder().encodeToString(newpassword.getBytes("UTF-8"));
            String curPassword = Base64.getEncoder().encodeToString(curpass.getBytes("UTF-8"));
            System.out.println("new  "+newencodedPassword);
            System.out.println("cur  "+curPassword);
            smt.setString(1, newencodedPassword);
            smt.setInt(2,jsid);
            smt.setString(3,curPassword);
            
            
            
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
      
      //To get information of jobseeker applied for particular job
      public ArrayList<Jobseeker>  getJobseekersInfo(int jsid){
    
       ArrayList<Jobseeker> jobseekers =new ArrayList<Jobseeker>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from jobseeker where jsid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, jsid);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Jobseeker  jobseeker =new Jobseeker();
               
                jobseeker.setFirst_name(rs.getString("first_name"));
                jobseeker.setLast_name(rs.getString("last_name"));
               
                jobseekers.add(jobseeker);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return jobseekers;
   }

      public String getEmail(int jsid){
       String email=null;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select email from jobseeker where jsid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, jsid);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                email=rs.getString("email");
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
       return email;
   }  

}
