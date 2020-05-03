package virusdb;

import java.sql.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Alex, Sjie
 */
public class VirusDB {
    String className = "jdbc:derby://localhost:1527/VirusData";
    String url = "jdbc:derby://localhost:1527/VirusData";
    String user = "APP";
    String password = "APP";
    String input;
    String data;
    
    public String extractData(int choice, String date, String country){
        switch(choice){
            case 1://determine the total death by date
                String TotalRecovered = "";
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT DEATHS FROM CORONAVIRUSWORLD WHERE DATE = '" + date + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next())TotalRecovered = String.valueOf(rs.getString(1));
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return TotalRecovered;
                
            case 2://determine current total confirmed cases per day
                String TotalCase = "";
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT CONFIRMED FROM CORONAVIRUSWORLD WHERE DATE = '" + date + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next())TotalCase = String.valueOf(rs.getString(2));
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return TotalCase;

            case 3://determine new increased confirmed cases per day
                String IncreasedCase = "";
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT CONFIRMED FROM CORONAVIRUSWORLD WHERE DATE = '" + date + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next())IncreasedCase = String.valueOf(rs.getString(2));//need calculation
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return IncreasedCase;
                
            case 4://determine total reported death per day
                String TotalDeaths = "";
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT DEATHS FROM CORONAVIRUSWORLD WHERE DATE = '" + date + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next())TotalDeaths = String.valueOf(rs.getString(2));
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return TotalDeaths;
                
            case 5://determine total cases in each country
                String CountryCase = "";
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT CONFIRMED FROM CORONAVIRUSCOUNTRIES WHERE COUNTRY = '" + country + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next())CountryCase = String.valueOf(rs.getString(2));
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return CountryCase;
               
            case 6://determine total recovered cases in each country
                String CountryRecovered = "";
                try{
                    Connection myConn = DriverManager.getConnection(url,user,password);  
                    Statement stmt = myConn.createStatement();
                    String sql = "SELECT RECOVERED FROM CORONAVIRUSCOUNTRIES WHERE COUNTRY = '" + country + "'";
                    ResultSet rs = stmt.executeQuery(sql);
                    while(rs.next())CountryRecovered = String.valueOf(rs.getString(2));
                }
                catch (Exception e){
                    System.out.println(e);
                }
                return CountryRecovered;
                
            default:
                return null;
        }
    }
    
    public void setVariable(String input){
        this.input = input;
    }
    
    public String getVariable(){
        return this.input;
    }
}
