<%-- 
    Document   : listofcourse
    Created on : 24 Feb, 2020, 9:52:37 PM
    Author     : Mav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <jsp:include page="base.jsp"></jsp:include>
        <script>
            function courselist(x,y){
                ajax = new XMLHttpRequest();
                ajax.open("GET","SubjectController?op=courselist&id="+x,true);
                ajax.send();
                
                ajax.onreadystatechange = function(){
                    if (this.readyState==4 && this.status==200){
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
                    <div class="col col-md-6">
                        <select id="state" class="dropdown-header bg-light" onchange="courselist(this.value,course)"> 
                            <option value="-1">Select Course</option>

                        <%
                            Connection con = null;
                            PreparedStatement smt = null;
                            try { 
                                Class.forName("com.mysql.jdbc.Driver");
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gisttraining", "root", "root");
                                String sql = "select * from subject";
                                smt = con.prepareStatement(sql);
                                ResultSet rs = smt.executeQuery();

                                while (rs.next()) {%>
                                <option value="<%=rs.getString("id")%>"> <%=rs.getString("name")%> </option> 
                                <% } 
                                    con.close();
                                smt.close();

                            } catch (Exception e) {
                                System.out.println("Error " + e.getMessage());
                            }

                        %>
                    </select>
                    
                    <br/>
                    <li id="course" class="list-inline-item">
                        
                    </li>
                </div>
            </div>
        </div>
    </center>
    </body>
</html>
