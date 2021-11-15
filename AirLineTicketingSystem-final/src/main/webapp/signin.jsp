<!DOCTYPE html>
<html lang="en">
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>
<style>
#b {
	background-image: url("pass.png");
	background-repeat: no-repeat;
	background-position: center center;
	background-attachment: fixed;
	background-size: cover;
	backdrop-filter: blur(3px);
}

#h {
	margin-top: 20px;;
	font-size: 80px;
	text-align: center;
	color: rgba(116, 1, 1, 0.938);
	text-shadow: 5px 5px 5px white;
}

table {
	text-align: center;
	width: 500px;
	height: 300px;
	border: 5px solid black;
	font-size: 20px;
	font-weight: bolder;
	background-color: rgba(255, 255, 255, 0.384);
}

.nav-link {
	color: rgba(116, 1, 1, 0.938);
	font-weight: bolder;
}

.nav-item:hover, .nav-link:hover {
	background-color: rgba(0, 0, 0, 0.185);
	color: white;
	font-weight: bolder;
}
</style>
</head>
<body id=b>
	<h1 id=h>CoMake AIRLINES</h1>
	<nav class="navbar navbar">
		<ul class="nav nav-tabs">
			<li class="nav-item"><a class="nav-link" aria-current="page" href="index.jsp">HOME</a></li>
			<li class="nav-item"><a class="nav-link" href="#">ABOUT US</a></li>
			<li class="nav-item"><a class="nav-link" href="UserOption.jsp">USER
					OPTIONS</a></li>
			<li class="nav-item"><a class="nav-link" href="login.jsp">LOGIN</a>
			</li>
		</ul>
	</nav>
	<center>
		<h2 style="text-align: center;">SIGNUP FORM</h2>
		<br>
		<form action="Sign_Up_Servlet" method="post">
			<p>Fill the details and submit to make use of all the features</p>
			<table align="center">
				<tr>
					<td>Username:</td>
					<td><input type="text" id="newuser" name="newuser" required /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" id="newpass" name="newpass" required
						pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
						title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" /></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" id="conpass" name="conpass" required
						title="Password should match confirm password" /></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: center"><input
						type="submit"
						style="border-style: none; background-color: black; color: white; font-size: 20px;"
						value="CREATE USER" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
