<%-- 
    Document   : email
    Created on : 5 Mar, 2020, 7:57:01 AM
    Author     : Mav
--%>

<%@page import="com.utilities.EmailSender"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col col-md-6" style="text-align:left">
                    <form method="post" class="form">Mail:
                        <input type="text" class="form-control" name="recipents" pattern="^(\s?[^\s,]+@[^\s,]+\.[^\s,]+\s?,)*(\s?[^\s,]+@[^\s,]+\.[^\s,]+)$" />
                    <br/>
                    Enter Subject:<input type="text" name="subject" class="form-control"><br/>
                    Enter Message:<br/>
                    <textarea name="message" row="10" cols="20" class="form-control"></textarea>  
                    <input type="submit" value="send" name="submit" class="btn btn-primary">
                    </form>
                </div>
            </div>
        </div>
        <% if (request.getParameter("submit") !=null){
                String host;
                String port;
                String user;
                String pass;
                //read SMTP server setting from web.xml file
                ServletContext context=config.getServletContext();
                host=context.getInitParameter("host");
                port=context.getInitParameter("port");
                user=context.getInitParameter("user");
                pass=context.getInitParameter("pass");
                
                String recipients[]= request.getParameter("recipents").split(",");
                String subject= request.getParameter("subject");
                String message=request.getParameter("message");
                
                 System.out.println(host +","+ port+","+ user +","+ pass+","+recipients[0] +","+subject +","+ message);
               
                
                if(EmailSender.sendEmail(host, port, user, pass,recipients , subject, message))
                out.println("Mail sent successfully");
                else
                out.println("<font color='red'>Mail could not be sent!!</font>");
                
        
        }%>
    </body>
</html>
