<%-- 
    Document   : reporter
    Created on : 26 Feb, 2020, 11:25:10 PM
    Author     : Mav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:include page="base.jsp"></jsp:include>
        <script type="text/javascript">
            function checkAccept(x,y){
                if(x.checked){
                    y.disabled=false;
               }
               else
               {
                   y.disabled=true;
               }
            }
            
            function comparePwds(x,y){
                if(x===y)
                    return true;
                else {
                    alert("Password and Confirm Password not matched !!");
                    return false;
                }
            }
            
            function varifyUserid(x,y){
               ajax = new XMLHttpRequest();
                ajax.open("GET","UserController?op=varify&userid="+x,true);
                ajax.send();
                
                ajax.onreadystatechange=function(){
                    if (this.readyState==4 && this.status==200){
                        y.innerHTML=this.responseText;
                    }
                };
            }
            
             function readURL(input) {
            if (input.files && input.files[0]) {
                var reader = new FileReader();

                reader.onload = function (e) {
                   pic.src= e.target.result;
                };

                reader.readAsDataURL(input.files[0]);
            }
        }
            </script>
            <style>
                img{
  max-width:180px;
}
input[type=file]{
padding:10px;
background:#2d2d2d;}
            </style>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col col-md-10">
                    <form enctype="multipart/form-data" action="NewsController?op=add" method="post" class="form" onsubmit="return comparePwds(password.value,rpassword.value);">  
    <center>
        <h2 class="bg-light">Reporter </h2>
        <table class="table bg-light"> 
            <tr>
                <td>Enter your Name </td>
                <td><input type="text" name="name" required="required" autocomplete="off" class="form-control"/> </td>
            </tr> <tr>
                <td>Enter your Contact</td>
                <td><input type="text" name="fname" required="required" class="form-control"/> </td>
            </tr>
              <td>Enter Email </td>
                <td><input type="email" required="required" name="userid" class="form-control" onblur="varifyUserid(this.value,s1);"/><br/>
                    <span id="s1"> </span>
                </td>
            <tr>
                <td>Enter UserId </td>
                <td><input type="email" required="required" name="userid" class="form-control" onblur="varifyUserid(this.value,s2);"/><br/>
                    <span id="s2"> </span>
                </td>
            </tr>
            
           <tr>
                <td>Enter Password </td>
                <td><input type="password" name="password" id="password" class="form-control" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"/><br/>
                    <span><b>Password should be minimum 8 char and contains one Upper, one Lowe, one Special and one digit</b></span></td>
            </tr>
            <tr>
                <td>Retype Password </td>
                <td><input type="password" name="rpassword" id="rpassword" class="form-control"/></td>
            </tr>
            
             
                <tr>
                <td>Select Your Profile Image</td>
                <td>  <img src="assets/images/nophoto.jpg" style="width:200px;height: 200px" class="img" id="pic"/><br/>
              <input type="file" name="photo" id="photoInput" class="form-control"  onchange="readURL(this);" /></td>
            </tr>
            <tr>
                
                
                
                <th colspan="2">
                    <input type="checkbox" id="accept" value="accept" onchange="checkAccept(this,submit);">Accept Terms and Conditions
                </th>
            </tr>
            <tr>
                 
                <th>
                    <input type="reset" value="Clear" class="form-control btn btn-dark" />
                </th>
                <th>   <input type="submit" value="submit" class="form-control btn btn-primary" disabled="disabled" id="submit"/> 
                </th>
            </tr>
            
         </table>
    </center>
        </form>
                </div>
            </div>
        </div>
       
    </body>
</html>

