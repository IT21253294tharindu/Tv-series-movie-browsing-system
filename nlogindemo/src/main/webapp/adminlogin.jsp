<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="nstyle.css">
    <title>Netflix</title>
</head>
<body>
    <header class="showcase">
        <div class="showcase-top">
            <img src="logo3.png" alt="lankaflix Logo">
            <a href="nlogin.jsp" class="btn btn-rounded">user</a><br/><br/><br/><br/><br/><br/><br/>
            <div class="nlogin1">
            <form method="post" action="alog" >
                <h2 style="background-color:black; background-image:linear-gradient(black,red);"><center>Login</center></h2><br/>

                <center>username:<br/>
                 <input type="text" name="uid" required></center><br/>
                 <center> Password:<br/></center><br/>
                <input type="password" name="psw" id="psw" ></center><br><br/><br/>
                <center><input type="submit" id="submitbtn" value="submit" ></center><br/>
          
            </form>          
        </div> 
        </div>  
    </header>
    <footer class="footer">
        <p>Questions? Call 000-800-040-1843</p>
        <div class="footer-cols">
            <ul>
                <li><a href="#">FAQ</a></li>
                <li><a href="#">Investor Relations</a></li>
                <li><a href="#">Privacy</a></li>
                <li><a href="#">Speed Test</a></li>
            </ul>
            <ul>
                <li><a href="#">Help Centre</a></li>
                <li><a href="#">Jobs</a></li>
                <li><a href="#">Cookie Preferences</a></li>
                <li><a href="#">Watch for Free</a></li>
            </ul>
            <ul>
                <li><a href="#">Account</a></li>
                <li><a href="#">Ways to Watch</a></li>
                <li><a href="#">Corporate Information</a></li>
                <li><a href="#">Legal Notices</a></li>
            </ul>
            <ul>
                <li><a href="#">Media Centre</a></li>
                <li><a href="#">Terms of Use</a></li>
                <li><a href="#">Contact Us</a></li>
                <li><a href="#">Netflix Originals</a></li>
            </ul>
        </div>
    </footer>
</body>
</html>