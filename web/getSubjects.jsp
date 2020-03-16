<%-- 
    Document   : getSubjects
    Created on : 24 Feb, 2020, 8:04:24 AM
    Author     : Mav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>
       
            
                   <script type="text/javascript"> //jquery code here
            $(document).ready(function(){
               $("#subject").change(function(){
                   $("#courses").load("SubjectController?op=searchsubject&id="+ $(this).val());
               }); 
            });
       
        </script>
        <style>
            ul{
               display:block; 
            }
        </style>
    </head>
    <body>
    <center>
         <select id="subject" class="dropdown-header bg-light" > 
                            <option value="-1">Select Subjects</option>

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
    </center>   
      <br/>
                    
                    <div class="row" id="courses">
                       
               </body>
</html>
