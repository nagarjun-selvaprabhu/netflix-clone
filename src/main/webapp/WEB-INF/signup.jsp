<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sign up</title>
<style>
body {font-family: Arial, Helvetica, sans-serif;
 background-image: url(https://bit.ly/2E3scwW);
 position: relative;
  display: flex;
  align-items: center;
  justify-content: center;
    width: 100vw;
  height: 100vh;
    background-repeat: no-repeat;
  background-position: center center;
  background-size: cover;
  }
* {box-sizing: border-box;}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  padding-right: 30px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

/* Add a background color when the inputs get focus */
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Set a style for all buttons */
button {
  background-color: red;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  opacity: 0.9;
}

b {
padding-right: 30px;
color: white;
}

button:hover {
  opacity:1;
}


/* Float cancel and signup buttons and add an equal width */
.signupbtn {
  align-content: center;
  width: 150px;
}

/* Add padding to container elements */
.container {
  padding: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: #474e5d;
  padding-top: 50px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* Style the horizontal ruler */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
 
h1{
	color: white;
	text-align: center;
      font-size: 2.2rem;
     font-weight: 600;
}

p{
	color: white;
	text-align: center;
}

.container{
background: rgba(000, 000, 000, 0.75);
}

/* Clear floats */
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}

/* Change styles for cancel button and signup button on extra small screens */
@media screen and (max-width: 300px) {
   .signupbtn {
     width: 100%;
  }
}
</style>
</head>
<body>
<form action="addUser" method="post">
  <div class="container">
    <h1>Sign Up</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>
	<div class="con">
    <label for="fname" ><b>First Name</b></label>
    <input type="text" placeholder="Enter First Name" name="user_fname" required><br>
    
    <label for="lname"><b>Last Name</b></label>
    <input type="text" placeholder="Enter Last Name" name="user_lname" required><br>
    
    <label for="email"><b>Email &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
    <input type="text" placeholder="Enter Email" name="user_email" required><br>

    <label for="pass"><b>Password&nbsp;</b></label>
    <input type="password" placeholder="Enter Password" name="user_pass" required><br>

    <label for="mobile"><b>Mobile&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</b></label>
    <input type="text" placeholder="Enter Mobile" name="user_mobile" required><br>
    
    <div class="clearfix">
      <button type="submit" class="signupbtn">Sign Up</button>
    </div>
    </div>
  </div>
</form>
</body>
</html>