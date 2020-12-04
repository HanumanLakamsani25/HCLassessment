<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>

    <head>
        <title>:: Secure Auditing ::</title>
        <meta name="description" content="website description" />
        <meta name="keywords" content="website keywords, website keywords" />
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <script>
            function Submit()
            {
                var emailRegex = /^[A-Za-z0-9._]*\@[A-Za-z]*\.[A-Za-z]{2,5}$/;
                var user = document.login.uname.value,
                pwd = document.login.pwd.value,         
                email = document.login.email.value,
                mobile=document.login.mobile.value,
                img=document.login.image.value;
                if( user == "")
                {
                    document.login.uname.focus() ;
                    document.getElementById("errorBox").innerHTML = "Enter User Name";
                    return false;
                }
                if( pwd == "" )
                {
                    document.login.pwd.focus() ;
                    document.getElementById("errorBox").innerHTML = "Enter password";
                    return false;
                }if(document.login.gnd[0].checked == false && document.login.gnd[1].checked == false){
                    document.getElementById("errorBox").innerHTML = "Select your Gender";
                    return false;
                } if (email == "" )
                {
                    document.login.email.focus();
                    document.getElementById("errorBox").innerHTML = "Enter Email Id";
                    return false;
                }else if(!emailRegex.test(email)){
                    document.login.email.focus();
                    document.getElementById("errorBox").innerHTML = "Enter Valid Email Id";
                    return false;
                }
                if( mobile == "")
                {
                    document.login.mobile.focus() ;
                    document.getElementById("errorBox").innerHTML = "Enter Mobile Number";
                    return false;
                }
                if(mobile.length!=10)
                {
                    document.login.mobile.focus() ;
                    document.getElementById("errorBox").innerHTML = "Mobile Number shoud be 10 digits";
                    return false;
                } 
            }
                       
            function checkPassword(inputtxt)   
            {   
                var passw=  /^[A-Za-z]\w{7,14}$/;  
                if(inputtxt.value.match(passw))   
                {   
                    alert('Correct, try another...');  
                    return true;  
                }  
                else  
                {   
                    alert('Wrong...!') ; 
                    alert('Input Password and Submit [7 to 16 characters which contain only characters, numeric digits, underscore and first character must be a letter]');
                    return false;  
                }  
            }  
        </script>
    </head>

    <body>
            <div id="site_content">
                <div>
                    <div style="margin-left: 150px">
                        <h3>User Registration Form</h3>
                        <form:form action="insertdata" method="post" name="login" enctype="multipart/form-data" onSubmit="return Submit()">
                            <table style="font-size: 15px">
                                <tr style="height: 25px"><td id="errorBox" colspan="2" align="center"></td></tr>
                                <tr><td>Enter Username:</td><td><input type="text" name="uname" id="uname"  style="height: 28px"/></td></tr>
                                <tr><td>Enter Password:</td><td> <input type="password" name="pwd" id="pwd"  style="height: 28px" /></td></tr>
                                <tr><td>Check Gender:</td><td> <input type="radio" name="gnd" value="Male" style="height: 28px" />Male<input type="radio" name="gnd" value="Female" style="height: 28px" />Female</td></tr>
                                <tr><td>Enter Email:</td><td> <input type="text" name="email" id="email"  style="height: 28px" /></td></tr>
                                <tr><td>Enter Mobile:</td><td><input type="text" name="mobile" id="mobile" style="height: 28px" /></td></tr>
                                <tr><td><input type="submit" value="Register"  style="width: 120px;height: 35px"/></td><td><input type="reset" value="Clear" style="width: 120px;height: 35px"/></td></tr>
                            </table>
                        </form:form>
                    </div>
                    </div>
                    </div>
    </body>
</html>
