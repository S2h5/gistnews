<%-- 
    Document   : sum2
    Created on : 1 Mar, 2020, 6:51:57 AM
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
        <form method="post">
            Enter first no  :<input type="text" name="n1" value="${param.n1}"/><br/>
            Enter second no :<input type="text" name="n2" value="${param.n2}"/><br/>
            
            <input type="submit" name="submit" value="Add"/>
        </form>

        <%if(request.getParameter("submit")!=null){%>
        <b>First no = ${param.n1}<br/>
            Second no = ${param.n2}</b>
            <br/>
            <h2>sum = ${param.n1+param.n2}</h2>
            <%}%>
     </body>
</html>



