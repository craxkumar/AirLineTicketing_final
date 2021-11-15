<!DOCTYPE html>
<html lang="en">
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
    #b{
                background-image: url("pass.png");
                background-repeat: no-repeat;
                background-position: center center;
                background-attachment: fixed;
                background-size: cover;
                backdrop-filter: blur(3px);
            }
            #h{
                margin-top: 20px;;
                font-size: 80px;
                text-align: center;
                color:rgba(116, 1, 1, 0.938);
                text-shadow:5px 5px 5px white;
            }  
                     
            table{
                text-align:center;
                width:500px;
                height: 500px;  
                border: 5px solid black;
                font-size: 20px;
                font-weight: bolder;
                background-color: rgba(255, 255, 255, 0.384);             
            }
            .nav-link{
                color:rgba(116, 1, 1, 0.938);
                font-weight: bolder;
            }
            .nav-item:hover,.nav-link:hover{            
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
            <li class="nav-item">
              <a class="nav-link" aria-current="page" href="index.jsp">HOME</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="abt.jsp">AboutUs</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="UserOption.jsp">UserOptions</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="index.jsp">logout</a>
            </li>
          </ul>
        </nav>
<form action="BookFlight" method="post">
        <h1 style="text-align:center;">Book Flight</h1>
    <table align="center">
    <tr>
        <td><label >SOURCE:</label>
            <select name="source" required>
            <option value=""></option>
                <option value="HYDERABAD">HYDERABAD</option>
                <option value="CHENNAI">CHENNAI</option>
                <option value="DELHI">DELHI</option>
                <option value="MUMBAI">MUMBAI</option>
            </select>
        </td>
        <tr>
           <td><label >DESTINATION:</label>
            <select name="destination" required>
            <option value=""></option>
                <option value="HYDERABAD">HYDERABAD</option>
                <option value="CHENNAI">CHENNAI</option>
                <option value="DELHI">DELHI</option>
                <option value="MUMBAI">MUMBAI</option>
            </select>
        </td>
        </tr>
        <br>
        <tr>
            <td>NO OF PASSENGERS:<input type="number" name="noofpassengers" required></td><br>
        </tr>
        <tr>
            <td>DATE OF JOURNEY:<input type="date" name="date" required></td><br>
        </tr>
        <tr>
        	<td><button style="border-style: none;background-color: black;color: white;">BOOK</button></td>
        </tr>
        <tr>
        	  <span style="font-size: 50px;width:300px;height:300px;"></span>
        </table>
   <br/>
   <br/>
</form>
       <form action="BookFlight" style="text-align:center;">
       <input type="submit" style="border-style: none;background-color: black;color: white; font-size:20px;" value="BookFlight"/>
       </form>
</body>
</html>