<%-- 
    Document   : poiuy
    Created on : 18 Feb, 2020, 10:58:33 PM
    Author     : Mav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <hr/>
        <h2> This is my first jsp page </h2>
        
        <%
           int a=30,b=20;
           int c= a+b;
           System.out.println("sum ="+ c);
           out.println("<h3>SUM = <i>" + c +"</i> </h3>");
          %>
<%--
COMMENTS
<h2> this will not show </h2>
--%>

<b> First no is <%=a%> 
<br/> Second no is <%=b%> 
<br/> Sum = <%=c%> 


    </body>
</html>
