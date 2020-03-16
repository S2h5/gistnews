<%-- 
    Document   : costomize
    Created on : 1 Mar, 2020, 11:23:33 PM
    Author     : Mav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>
        <style>
            .style1 {
                font-size: 20px;
                font-family: corbel;
                color:blue;
                background-color: #d1ecf1;
            }

            .style2 {
                font-size: 20px;
                font-family: corbel;
                color: wheat;
                background-color: darkmagenta;
            }


        </style>
        <script> 
         $(document).ready(function(){
             $("input").click(function(){
                $("#f1").submit();
             });
         });   
        </script>
    </head>
    <body>
        <%
        String theam_class="style1"; 
        Cookie cookis[] = request.getCookies();
        for (Cookie c : cookis)
            if (c.getName().equals("style"))
                theam_class = c.getValue();
        
        
        if(request.getParameter("style")!=null) {
              theam_class = request.getParameter("style");
              Cookie c = new Cookie("style", theam_class); 
              c.setMaxAge(60*60*24*30);
              response.addCookie(c);
        }
          
        %>
        
        
        <div class="container">
            <div class="row">
                <form method="post" id="f1"> 
                    <input type="radio" value="style1" name="style" <%if(theam_class.equals("style1")) out.println("checked");%>/>Light Theam 
                <input type="radio" value="style2" name="style" <%if(theam_class.equals("style2")) out.println("checked");%>/>Dark Theam
                </form>
            </div>
        
            <div  class="row <%=theam_class%>" style="height: 200px">
            this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.
            this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.
            this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.

            this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.
            this is gist technosolutions.  this is gist technosolutions.  this is gist technosolutions.
            this is gist technosolutions.  this is gist technosolutions.

 </div>
        </div>
       
    </body>
</html>