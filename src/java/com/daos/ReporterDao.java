/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daos;

import com.beans.Reporter;
import java.sql.*;
import java.util.ArrayList;
import com.pool.ConnectionPool;


public class ReporterDao {
    
       public boolean  add(Reporter reporter){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "Insert into reporter(name,contact,email,userid,password,photo,DOB,gender,address,status)values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, reporter.getName());
            smt.setString(2, reporter.getContact());
            smt.setString(3, reporter.getEmail());
            smt.setString(4, reporter.getUserid());
            smt.setString(5, reporter.getPassword());
            smt.setString(6, reporter.getPhoto());
            smt.setString(7,reporter.getDOB());
            smt.setString(8,reporter.getGender());
            smt.setString(9,reporter.getAddress());
            smt.setString(10,reporter.getStatus());
            
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
   
   
   
   public boolean  remove(int id){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "Delete from reporter where id=?";
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
   
   public Reporter  getById(int id){
      Reporter reporter=null;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, id);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                
                             
                reporter =new Reporter();
                reporter.setId(rs.getInt("id"));
                reporter.setName(rs.getString("name"));
                reporter.setContact(rs.getString("contact"));
                reporter.setEmail(rs.getString("email"));
                reporter.setUserid(rs.getString("userid"));
                reporter.setPassword(rs.getString("password"));
                reporter.setPhoto(rs.getString("photo"));
                reporter.setDOB(rs.getString("DOB"));
                reporter.setGender(rs.getString("gender"));
                reporter.setAddress(rs.getString("address"));
                reporter.setAddress(rs.getString("status"));
                
               
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return reporter;
   }
   
   public ArrayList<Reporter>  getAllRecords(){
    
       ArrayList<Reporter> reporters =new ArrayList<Reporter>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter";
            PreparedStatement smt = con.prepareStatement(sql);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Reporter reporter=new Reporter();
                reporter.setId(rs.getInt("id"));
                reporter.setName(rs.getString("name"));
                reporter.setContact(rs.getString("contact"));
                reporter.setEmail(rs.getString("email"));
                reporter.setUserid(rs.getString("userid"));
                reporter.setPassword(rs.getString("password"));
                reporter.setPhoto(rs.getString("photo"));
                reporter.setDOB(rs.getString("DOB"));
                reporter.setGender(rs.getString("gender"));
                reporter.setAddress(rs.getString("address"));
                reporter.setAddress(rs.getString("status"));
                reporters.add(reporter);
                
              
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return reporters;
   }
   
   
   
   public ArrayList<Reporter>  getRecordByLimit(int start, int end){
    
       ArrayList<Reporter> reporters =new ArrayList<Reporter>();
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter limit ?,?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setInt(1, start);
            smt.setInt(2, end);
            ResultSet rs= smt.executeQuery();
            while(rs.next()){
                Reporter reporter=new Reporter();
                reporter.setId(rs.getInt("id"));
                reporter.setName(rs.getString("name"));
                reporter.setContact(rs.getString("contact"));
                reporter.setEmail(rs.getString("email"));
                reporter.setUserid(rs.getString("userid"));
                reporter.setPassword(rs.getString("password"));
                reporter.setPhoto(rs.getString("photo"));
                reporter.setDOB(rs.getString("DOB"));
                reporter.setGender(rs.getString("gender"));
                reporter.setAddress(rs.getString("address"));
                reporter.setAddress(rs.getString("status"));
                reporters.add(reporter);
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("Error :"+e.getMessage());
        }
       }
       
    return reporters;
   }
   
  
   public int  getRecordsCount(){
    
       int total=0;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select count(*) from reporter";
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
   
   public boolean  update(Reporter reporter){
       boolean status=false;
       ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "update Reporter set name=?,contact=?,email=?,photo=?,DOB=?,gender=?,address=? where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, reporter.getName());
            smt.setString(2, reporter.getContact());
            smt.setString(3, reporter.getEmail());
            smt.setString(4, reporter.getPhoto());
            smt.setString(5,reporter.getDOB());
            smt.setString(6,reporter.getGender());
            smt.setString(7,reporter.getAddress());
            smt.setInt(8, reporter.getId());
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
   
   public boolean  isReporteridExist(String id){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where id=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1,id);
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
 
   
  public boolean  isContactExist(String reporterid){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where contact=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, reporterid);
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

   
  
   public boolean  isEmailExist(String email){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where contact=?";
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
   
   
   
   public boolean  isValid(String userid,String password){
       boolean status = false;
        ConnectionPool cp = ConnectionPool.getInstance();
       cp.initialize();
       Connection con = cp.getConnection();
       if(con!=null){
        try{
            String sql = "select * from reporter where userid=? and password=?";
            PreparedStatement smt = con.prepareStatement(sql);
            smt.setString(1, userid);
            smt.setString(2, password);
            ResultSet rs= smt.executeQuery();
            if(rs.next()){
                status=true;
            }
            smt.close();
            cp.putConnection(con);
        }   catch(Exception e){
            System.out.println("DBError :"+e.getMessage());
        }
       }
       
       return status;
   }  
  
  
}

    
    

