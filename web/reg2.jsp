<%-- 
    Document   : reg2
    Created on : 2 Mar, 2020, 12:07:55 PM
    Author     : Mav
--%>
<%@page import="com.controllers.UserController"%>
<%@page import="com.utilities.SmsSender"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="com.beans.User"%>
<%@page import="java.util.concurrent.ThreadLocalRandom"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload Profile Image</title>
        <jsp:include page="base.jsp"></jsp:include>
            <script>

                function readURL(input) {
                    if (input.files && input.files[0]) {
                        var reader = new FileReader();

                        reader.onload = function (e) {
                            pic.src = e.target.result;
                        };

                        reader.readAsDataURL(input.files[0]);
                    }
                }

                function validateOtp(x,y,z){
                    if(x.trim().length==6){
                        if(x==y){
                            z.innerHTML ="<font color='blue'><b>mobile number varified</b></font>";
                            submit.disabled=false;
                            otp.disabled=true;
                        }
                        else {
                             z.innerHTML ="<font color='red'><b>Invalid OTP</b></font>";
                             submit.disabled=true;
                        }
                    }
                }
                function resendOtp()
                {
                    var date=new Date();
                var time= date.getUTCSeconds();
                var timer=Date(time+120).getTime();
                var now = new Date().getTime(); 
                var t = timer - now; 
                var seconds = Math.floor((t % (1000 * 60)) / 1000);
                }
            </script>
        </head>
        <body>
        <% if (request.getParameter("submit") == null) {%>
        <h4>Please Complete Registration Form (Part-1) <br/><br/>
            <a href="reg1.jsp">Go to Registration page-1 </a></h4>
            <%return;
        }%>
        <div class="container">
            <div class="row">
                <div class="col col-md-6">
                    <jsp:useBean class="com.beans.User" id="user" scope="session"></jsp:useBean>
                    <jsp:setProperty name="user" property="*"></jsp:setProperty>
                    <%
                        String hobbies[] = request.getParameterValues("hobbies");
                        String hbs = "";
                        for (String s : hobbies) {
                            hbs += s + ",";
                        }
                        user.setHobbies(hbs);

                        //Generate Random OTP and Send to MObile Number- 
                        int otp = ThreadLocalRandom.current().nextInt(100000, 999999);
                        String output = SmsSender.sendCampaign("T26U8ERT908UNETN0IMB7L4MYUNTUH28","CU5SANLT6OW10RGJ", "stage", user.getContact(), String.valueOf(otp), "maveri");
                        session.setAttribute("otp", String.valueOf(otp));
                    
                    %>
                    <form enctype="multipart/form-data" action="UserController?op=add" method="post">
                        <p>Enter OTP Received in Your Mobile</p>
                        <p><input type="text" id="otp" maxlength="6" class="form-control" onkeyup="validateOtp(this.value,${otp},s1)"/>
                            <span id="s1"></span>
                        </p>
                        <p>Select Your Profile Image <p>
                        <p>
                            <img src="assets/images/nophoto.jpg" style="width:200px;height: 200px" class="img" id="pic"/><br/>
                            <input type="file" name="photo" id="photoInput" class="form-control"  onchange="readURL(this);" />
                        <p>
                            <input type="submit" id="submit" value="Register Me" disabled="disabled"/>
                    </form>
                </div>
            </div>
        </div>

    </body>
</html>
