<%-- 
    Document   : poiuy2
    Created on : 18 Feb, 2020, 11:25:21 PM
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
        <h1>Table</h1>
        <table width="400"border="2" cellspacing="0">
            <% for(int i=1; i<=10;i++)
                out.println("<tr><td>Ramesh</td></tr>");
            %>
     </table>
     
     <%-- we can start stop the  scriptlet any time --%>
     <h2> Another Example </h2>
     <table border="2" width="400" cellspacing="0">
         <tr>
             <td>Number </td> <td>Square </td>
         </tr>
         <%for(int i=1;i<=10;i++){%>
         <tr>
             <td><%=i%></td>
             <td><%=i*i%></td>
         </tr>
         <%}%>
         
     </table>
     
    </body>
</html>
