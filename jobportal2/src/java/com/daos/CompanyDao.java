/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;
import com.beans.Company;
import com.pool.ConnectionPool;
import com.sun.org.apache.regexp.internal.REProgram;
import java.sql.*;
import java.util.ArrayList;
import java.util.Base64;

/**
 *
 * @author anushikha
 */
public class CompanyDao {
    public boolean add(Company company)
    {
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null) 
       {
           try{
               String sql= "Insert into company(cname,email,password,logo)values(?,?,?,?)";
               PreparedStatement smt = con.prepareStatement(sql);
               smt.setString(1, company.getCname());
               smt.setString(2, company.getEmail());
              
               smt.setString(3, company.getPassword());
               smt.setString(4, company.getLogo());
              
            //   smt.setString(5, company.getCountry());
             //  smt.setString(6, company.getState());
              // smt.setString(7, company.getCity());
            //   smt.setString(8, company.getPincode());
           //    smt.setString(9, company.getAddress());
              System.out.println("cname"+company.getCname());
               
               
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
    
    
     public boolean  remove(int id){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "Delete from company where cid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, id);
            
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
     
     public Company  getById(int id){
      Company company=null;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from company where cid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, id);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                company =new Company();
                company.setCid(rs.getInt("cid"));
                company.setCname(rs.getString("cname"));
                company.setEmail(rs.getString("email"));
                
                company.setPassword(rs.getString("password"));
                company.setLogo(rs.getString("logo"));
                 
                company.setCountry(rs.getString("country"));
                company.setState(rs.getString("state"));
                company.setCity(rs.getString("city"));
                company.setPincode(rs.getString("pincode"));
                company.setAddress(rs.getString("address"));
               
                
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return company;
   }
     
     public ArrayList<Company>  getAllRecords(){
    
       ArrayList<Company> companies =new ArrayList<Company>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from company";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Company company=new Company();
                company.setCid(rs.getInt("cid"));
                company.setCname(rs.getString("cname"));
                company.setEmail(rs.getString("email"));
               
                company.setPassword(rs.getString("password"));
                company.setLogo(rs.getString("logo"));
                 
                company.setCountry(rs.getString("country"));
                company.setState(rs.getString("state"));
                company.setCity(rs.getString("city"));
                company.setPincode(rs.getString("pincode"));
                company.setAddress(rs.getString("address"));
                
                companies.add(company);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return companies;
   }

     
     public ArrayList<Company>   getRecordByLimit(int start, int end){
    
       ArrayList<Company> companies =new ArrayList<Company>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from company limit ?,?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, start);
            smt.setInt(2, end);

            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Company company=new Company();
                company.setCid(rs.getInt("cid"));
                company.setCname(rs.getString("cname"));
               company.setEmail(rs.getString("email"));
                
                company.setPassword(rs.getString("password"));
                company.setLogo(rs.getString("logo"));
                 
                company.setCountry(rs.getString("country"));
                company.setState(rs.getString("state"));
                company.setCity(rs.getString("city"));
                company.setPincode(rs.getString("pincode"));
                company.setAddress(rs.getString("address"));
                companies.add(company);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return companies;
   }

     public int  getRecordsCount(){
    
       int total=0;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select count(*) from company";
            PreparedStatement smt = con.prepareStatement(sql);
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
     
     
     public boolean  update(Company company){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "update Company set cname=?,email=?,password=?,logo=?,country=?,state=?,city=?,pincode=?,address=? where cid=?";
            PreparedStatement smt = con.prepareStatement(sql);
               smt.setString(1, company.getCname());
               smt.setString(2, company.getEmail());
               
               smt.setString(3, company.getPassword());
               smt.setString(4, company.getLogo());
              
               smt.setString(5, company.getCountry());
               smt.setString(6, company.getState());
               smt.setString(7, company.getCity());
               smt.setString(8, company.getPincode());
               smt.setString(9, company.getAddress());
               
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
   /*   public boolean  isUserIdExist(String userid){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from company where userid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, userid);
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

     */
        
   
   
  /* public boolean  isContactExist(String contact){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from company where contact=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, contact);
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
   
   */
   public boolean  isEmailExist(String email){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from company where email=?";
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

   
   public Company  getByLoginData(String email,String password){
      Company company=null;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from company where email=? and password=?";
            PreparedStatement smt = con.prepareStatement(sql);
            String encodedPassword = Base64.getEncoder().encodeToString(password.getBytes("UTF-8"));
            smt.setString(1, email);
            smt.setString(2, encodedPassword);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                company=new Company();
                company.setCid(rs.getInt("cid"));
                company.setCname(rs.getString("cname"));
                 company.setEmail(rs.getString("email"));
                
                company.setPassword(rs.getString("password"));
                System.out.println("dao cname: "+rs.getString("cname"));
             //   company.setLogo(rs.getString("logo"));
                 
             //   company.setCountry(rs.getString("country"));
            //    company.setState(rs.getString("state"));
           //     company.setCity(rs.getString("city"));
           //     company.setPincode(rs.getString("pincode"));
          //      company.setAddress(rs.getString("address"));
                           }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
       return company;
   }  

    public Company  getCompanyByJobId(int cid){
      Company company=null;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from company where cid=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, cid);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                company =new Company();
                company.setCid(rs.getInt("cid"));
                company.setCname(rs.getString("cname"));
                company.setEmail(rs.getString("email"));
                
                company.setPassword(rs.getString("password"));
                company.setLogo(rs.getString("logo"));
                 
                company.setCountry(rs.getString("country"));
                company.setState(rs.getString("state"));
                company.setCity(rs.getString("city"));
                company.setPincode(rs.getString("pincode"));
                company.setAddress(rs.getString("address"));
               
                
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return company;
   }

    
}
