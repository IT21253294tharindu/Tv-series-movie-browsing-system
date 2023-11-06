<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="nstyle.css">
    <link rel="stylesheet" href="styles3.css">
    <script src="myscript3.js"></script>
    <title>Netflix</title>
</head>
<body>
    <header class="showcase">
        <div class="showcase-top">
            <img src="logo3.png" alt="lankaflix Logo">
            <a href="adminlogin.jsp" class="btn btn-rounded">admin</a><br/><br/><br/><br/><br/><br/><br/>
            
           
           <form onsubmit="return checkPassword ()" method="post" action="insert" style="margin-bottom:150px;">
    <h2 style="background-color:black; background-image:linear-gradient(black,purple);"><center>Registration Form</center></h2><br/>
    name:<br/>
    <input type="text" id="fname" name="name" placeholder="name" required><br><br/>
   
    
    mobile number:<br/>
    <input type="phone" name="mobilenumber" placeholder="0713265478" pattern="[0-9]{10}" required><br><br/>

   
    
    email:<br/>
    <input type="text" name="email1" placeholder="user@gmail.com" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}"  required><br><br/>
    address:<br/>
    <textarea name="address" rows="4" cols="80" placeholder="address" required></textarea><br><br/>
   
    username:<br/>
    <input type="text" name="username" required placeholder="username"><br><br/>

    Password:<br/>
    <input type="password" name="password" id="psw" placeholder="password" ><br><br/>
    
    Re-enter Password:<br/>
    <input type="password"  placeholder="re enter password" id="confirmpsw" required><br><br/>
     
    <input type="checkbox" id="checkbox" onclick="enableButton()">accept privacy policy and terms<br/>
<center>
  <input type="submit" id="submitbtn" value="submit"  disabled>
</center>




   
</form>
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