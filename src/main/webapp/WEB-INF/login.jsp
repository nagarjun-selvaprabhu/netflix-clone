<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
@import url("https://fonts.googleapis.com/css?family=Montserrat:400,400i,700");

body {
	background: #111;
	font-family: "Montserrat";
	text-align: center;
}

.logo > img {
	width: 300px;
	height: auto;
	position: absolute;
	top: 50%;
	right: 0;
	left: 0;
	margin: -80px auto;
 -webkit-animation: animate 10s ease;
 animation: animate 10s ease;
}

@-webkit-keyframes animate {
  0%{
	opacity: 0;
	-webkit-transform: scale3d(0.3, 0.3, 0.3);
	transform: scale3d(0.3, 0.3, 0.3);
  }
  60%{
	opacity: 1;
	-webkit-transform: scale3d(1,1,1);
	transform: scale3d(1,1,1);
  }
}

.card {
	perspective: 1000;
	width: 350px;
	height: 300px;
	position: absolute;
	top: 50%;
	left: 50%;
	margin: auto;
	transform: translate(-50%, -50%);
}

.card .flip {
	transition: 0.9s;
	transform-style: preserve-3d;
	position: relative;
	width: 100%;
	height: 100%;
	margin: -25px auto;
}

.card .flip .front {
	z-index: 2;
}

.card .flip .front,
.card .flip .back {
	backface-visibility: hidden;
	position: absolute;
	width: 100%;
	height: 100%;
}


.card .flip .front:before,
.card .flip .back:before {
	transition: all 0.3s ease;		
	border-color: transparent;
	content: "";
	display: inline-block;
	position: absolute;
	bottom: -24px;
}

#vertical-flip:hover .flip,
#vertical-flip.hover .flip {
	transform: rotateX(180deg);
	transition: all 1s ease;
}

#vertical-flip .front {
	background: transparent;
	filter: saturate(2);
	z-index: 1;
}

#vertical-flip .back {
	transform: rotateX(180deg);
	background: transparent;
	color: #eee;
}


.box-input {
	position: relative;
	top: 90px;
}

input {
	outline: 0 !important;
  border-width: 0 0 1px 0 !important;
  border-color: #eee !important;
  margin: 0 auto;
}

input,
button {

	padding: 10px 3%;
	background: transparent;
	font-size: 15px;
	width: 300px;
	height: 25px;
	font-family: "Montserrat";
	border: 1px solid #eee;
	position: relative;
	color: #eee;
	margin-bottom: 15px;
}

::-webkit-input-placeholder {
  color: #ddd !important;
  font-family: FontAwesome;
  font-size: 16px;
}


button {
	width: 325px;
	height: 40px;
	margin-top: 10px;
	background: transparent;
	text-align: center;
	cursor: pointer;
	color: #eee;
	font-weight: bold;
	text-transform: uppercase;
	transition: all 1s ease;
}

button:hover {
	background: #D50000;
	border: none;
	transition: all 1.5s ease;
}

</style>
</head>
<body>
<div id="vertical-flip" class="card">
 <div class="flip">
  <div class="front">
   <div class="logo">
    <img src="https://truecostmovie.com/img/TTC/wp-content/uploads/2015/10/netflix_logo_digitalvideo-1.png" alt="Netlflix">
   </div>
  </div>

  <div class="back">
   ${error}
   <form method="post" action="${pageContext.request.contextPath }/login">
    <div class="box-input">
     <input type="email" name="username" placeholder="&#xf007;email-id" required/>
     <input type="password" name="password" placeholder="&#xf023;password" required/>
     <button type="submit" value="Login">Enter</button>
   </form>
   </div>
</body>
</html>
