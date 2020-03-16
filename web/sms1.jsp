<%-- 
    Document   : sms1
    Created on : 4 Mar, 2020, 7:38:32 AM
    Author     : Mav
--%>

<%@page import="com.utilities.SmsSender"%>
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
                    <form method="post">
                        <input type="number" name="mobile"  placeholder="Enter Mobile No."></input>
                    <br/>
                    Message:<br/>
                    <textarea name="message" row="10" cols="20" class="form-control"></textarea>  
                    <input type="submit" value="send" name="submit" class="btn btn-primary">
                    </form>
                </div>
            </div>
        </div>
        <% if(request.getParameter("submit")!=null){
            String message=request.getParameter("message");
            String mobile= request.getParameter("mobile");
            String output=SmsSender.sendCampaign("T26U8ERT908UNETN0IMB7L4MYUNTUH28", "CU5SANLT6OW10RGJ", "stage", mobile, message, "maveri");
            if(output.contains("200"))
            out.println("<script>alert('Message Sent');</script>");
            else
                out.println("<script>alert('Message could not be sent!');</script>");
        }
        %>

    </body>
</html>
