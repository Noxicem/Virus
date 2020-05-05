
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import= "module.DB" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Virus Database</title>
    </head>
    <body>
        <h1>Virus Database</h1>
        
        <form name="myForm" action="index.jsp" method="POST">
            <p>Enter your date</p>
            <input type="text" name="date" value="" />
            <p>Enter your country</p>
            <input type="text" name="country" value="" />
            <p></p>
            <select name="choice">
                <option value = 1>total death by date</option>
                <option value = 2>current total confirmed cases per day</option>
                <option value = 3>growth rate per day</option>
                <option value = 4>confirmed cases in each country on 1/22/2020</option>
                <option value = 5>recovered cases in each country ON 1/22/2020</option>
                <option value = 6>death cases in each country on 1/22/2020</option>
            </select>
            <br/>
            <br/>
            <input type="submit" value="Submit Form" />
        </form>
        
        <%
            //create object
            DB myObject = new DB();
            
            //get parameters from user's input
            String date = request.getParameter("date");
            String country = request.getParameter("country");            
            String choice = request.getParameter("choice");
            
            if(date != null || country != null){
                String output = myObject.extractData(choice, date, country);
                out.println(output);
                out.println("!!!!!!!!!!!");
            }
        %>
    </body>
</html>
