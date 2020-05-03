package DB;

import java.sql.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Alex, Sjie
 */
public class DB{
    String className = "jdbc:derby://localhost:1527/VirusData";
    String url = "jdbc:derby://localhost:1527/VirusData";
    String user = "APP";
    String password = "APP";
    String date;
    String country;
    String output = "";
    
    public String extractData(int choice, String date, String country){
        switch(choice){
            case 1://determine total death by date
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT * FROM CORONAVIRUSWORLD WHERE DATE = '" + date + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    if(rs.next())output = String.valueOf(rs.getString("DEATHS"));
                    else output = "Not found";
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return output;
                
            case 2://determine current total confirmed cases per day
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT * FROM CORONAVIRUSWORLD WHERE DATE = '" + date + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    if(rs.next())output = String.valueOf(rs.getString("CONFIRMED"));
                    else output = "Not found";
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return output;
                

                
            case 3://determine growth rate per day
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT * FROM CORONAVIRUSWORLD WHERE DATE = '" + date + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    if(rs.next())output = String.valueOf(rs.getString("GROWTHRATE"));
                    else output = "Not found";
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return output;
                
            case 4://determine conrfirmed cases in each country on 1/22/2020
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT CONFIRMED FROM CORONAVIRUSCOUNTRIES WHERE COUNTRY = '" + country + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    if(rs.next())output = String.valueOf(rs.getString("CONFIRMED"));
                    else output = "Not found";
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return output;
               
            case 5://determine recovered cases in each country ON 1/22/2020
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT * FROM CORONAVIRUSCOUNTRIES WHERE COUNTRY = '" + country + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    if(rs.next())output = String.valueOf(rs.getString("RECOVERED"));
                    else output = "Not found";
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return output;
                
            case 6://determine death cases in each country on 1/22/2020
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT * FROM CORONAVIRUSWORLD WHERE DATE = '" + date + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    if(rs.next())output = String.valueOf(rs.getString("DEATHS"));
                    else output = "Not found";
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return output;                
                
            default:
                return null;
        }
    }
    
    public void setDate(String date){
        this.date = date;
    }
    
    public String getDate(){
        return this.date;
    }

    public void setCountry(String country){
        this.country = country;
    }
    
    public String getCountry(){
        return this.country;
    }
}
