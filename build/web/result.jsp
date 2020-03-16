<%-- 
    Document   : result
    Created on : 28 Feb, 2020, 12:24:37 AM
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
        <%
            String n1,n2,n3,n4;
            n1 = request.getParameter("n1");
            n2 = request.getParameter("n2");
            n3 = request.getParameter("n3");
            n4 = request.getParameter("n4");
            %>
        <a href="page2.jsp?n1=<%=n1%>&n2=<%=n2%>&n3=<%=n3%>&n4=<%=n4%>">Back </a> <br/>
        <%=n1%> <br/>
        <%=n2%> <br/>
        <%=n3%> <br/>
        <%=n4%> <br/>

    </body>
</html>