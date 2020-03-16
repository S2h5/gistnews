<%-- 
    Document   : cseg
    Created on : 23 Feb, 2020, 12:43:15 AM
    Author     : Mav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" import="java.sql.*">
        <title>JSP Page</title>
         <jsp:include page="base.jsp"></jsp:include>
        <script>
           function loadstate(x,y){
             y.innerHTML="";
              ajax = new XMLHttpRequest();
                ajax.open("GET","citystateserv?op=search&name="+x, true);
                ajax.send();
                
                ajax.onreadystatechange = function(){
                  if(this.readyState ==4 && this.status==200){
                      y.innerHTML = this.responseText;
                  }  
                };

         }
        </script>
    </head>
    <body>
    <center>
        <div class="container">
            <div class="row">
                <div class="container">
            
        </div>
            
        </div>
        </div>
    </center>
    </body>
</html>
