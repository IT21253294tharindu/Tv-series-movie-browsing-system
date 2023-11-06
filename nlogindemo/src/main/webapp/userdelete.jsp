<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
	<script src="https://kit.fontawesome.com/b60a2ded9f.js"></script>
	  
  <title>update my profile</title>

  <!-- 
    - favicon
  -->
  <link rel="shortcut icon" href="favicon.svg" type="image/svg+xml">

  <!-- 
    - custom css link
  -->
  <link rel="stylesheet" href="nstyle1.css">
  <link rel="stylesheet" href="styles3.css">
  <!-- 
    - google font link
  -->
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600;700&display=swap" rel="stylesheet">
</head>

<body id="#top">
    
        <%
        String id=request.getParameter("id");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String address=request.getParameter("address");
        String phone=request.getParameter("phone");
        
        %>  
 

  <form method="post" action="delete" style="margin-top:120px;">
  
    <h2 style="background-color:black; background-image:linear-gradient(black,purple);"><center>profie</center></h2><br/>
    
    user id:<br><br/>
    <input type="text" name="uid" value="<%= id %>" readonly><br><br/>
      username:<br><br/>
    <input type="text" name="uname" value="<%=username%>" readonly><br><br/>
      password:<br><br/>
    <input type="password" name="pass" value="<%=password%>"readonly><br><br/>
      name:<br><br/>
    <input type="text" name="name" value="<%=name%>"readonly><br><br/>
      phone:<br><br/>
    <input type="text" name="phone" value="<%=phone%>" readonly><br><br/>
     address:<br><br/>
    <input type="text" name="address" value="<%=address%>" readonly><br><br/>
     email:<br><br/>
     <input type="text" name="email" value="<%= email %>" readonly><br><br/>
  <center>  <input type="submit" name="submitbtn" id="submitbtn" value="delete"><br><br/></center>
    
  </form>
        
              
     
     
     
      <!-- 
    - #HEADER
  -->

  <header class="header" data-header>
    <div class="container">

      <div class="overlay" data-overlay></div>

      <a href="index.html" class="logo">
        <img src="logo3.png" height = "50px" alt="Filmlane logo">
      </a>

      <div class="header-actions">

        <button class="search-btn">
          <ion-icon name="search-outline"></ion-icon>
        </button>

        <div class="lang-wrapper">
          <label for="language">
            <ion-icon name="globe-outline"></ion-icon>
          </label>

          <select name="language" id="language">
            <option value="en">EN</option>
            <option value="au">AU</option>
            <option value="ar">AR</option>
            <option value="tu">TU</option>
          </select>
        </div>
		
		<div class="dropdown">
		<div class="fas fa-user" id="myuser"><br><h6>My Profile</h6></div>
          
          <div class="dropdown-content">
          <a href="#">Edit Profile</a>
          <a href="">Setting & Privacy</a>
          <a href="">Help & Support</a>
		  <a href="">Logout</a>
        </div>
        </div>

        <!--<button class="btn btn-primary">Sign in</button>-->

      </div>

      <button class="menu-open-btn" data-menu-open-btn>
        <ion-icon name="reorder-two"></ion-icon>
      </button>

      <nav class="navbar" data-navbar>

        <div class="navbar-top">

          <a href="./index.html" class="logo">
            <img src="logo.svg" alt="Filmlane logo">
          </a>

          <button class="menu-close-btn" data-menu-close-btn>
            <ion-icon name="close-outline"></ion-icon>
          </button>

        </div>

        <ul class="navbar-list">

          <li>
            <a href="homepage.jsp" class="navbar-link">Home</a>
          </li>

          <li>
            <a href="" class="navbar-link">Movie</a>
          </li>

          <li>
            <a href="" class="navbar-link">Tv Show</a>
          </li>

          <!--<li>
            <a href="" class="navbar-link">Web Series</a>
          </li>

          <li>
            <a href="" class="navbar-link">Pricing</a>
          </li>-->

        </ul>

        <ul class="navbar-social-list">

          <li>
            <a href="" class="navbar-social-link">
              <ion-icon name="logo-twitter"></ion-icon>
            </a>
          </li>

          <li>
            <a href="" class="navbar-social-link">
              <ion-icon name="logo-facebook"></ion-icon>
            </a>
          </li>

          <li>
            <a href="" class="navbar-social-link">
              <ion-icon name="logo-pinterest"></ion-icon>
            </a>
          </li>

          <li>
            <a href="" class="navbar-social-link">
              <ion-icon name="logo-instagram"></ion-icon>
            </a>
          </li>

          <li>
            <a href="" class="navbar-social-link">
              <ion-icon name="logo-youtube"></ion-icon>
            </a>
          </li>

        </ul>

      </nav>

    </div>
  </header>
       
       




 





  <!-- 
    - #FOOTER
  -->
       
             
                              
            
               
            
      
   <footer class="footer">
         <!--<p>Questions? Call 000-800-040-1843</p>-->
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





  <!-- 
    - #GO TO TOP
  -->

  <a href="#top" class="go-top" data-go-top>
    <ion-icon name="chevron-up"></ion-icon>
  </a>





  <!-- 
    - custom js link
  -->
  <script src="script.js"></script>

  <!-- 
    - ionicon link
  -->
  <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
  <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>

</body>

</html>