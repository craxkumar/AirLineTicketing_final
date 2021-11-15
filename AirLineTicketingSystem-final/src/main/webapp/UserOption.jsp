<!DOCTYPE html>
<html lang="en">
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Navigation Bar</title>
    
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
                    padding: 50px;
                    width:500px;
                    height: 450px;  
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
              <a class="nav-link" aria-current="page" href="index.jsp">Home</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="abt.jsp">AboutUs</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="signin.jsp">SignUp</a>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="login.jsp">Login</a>
            </li>
          </ul>
        </nav>
    <center>
    <form action ="userOption" style="padding:50px;" method = "post">
            <h2 style="text-align: center;">USER OPTIONS</h2><br>
                <table align="center">
                    <tr>
                        <td>Enter 1. To Book a new flight
                         </td>
                    </tr>
                    <tr>
                        <td>Enter 2. Booking Details </td>
                    </tr>
                    <tr>
                     <td>Enter 3. Passenger Details</td>
                    </tr>
                    <tr>
                        <td>
                         Enter 4. To Delete the Passenger 
                        </td>
                    </tr>
                    <tr>
                        <td>Enter valid number: <input id="validoption" type="number" name ="option" min=1 max=4 required/></td>
                    </tr>
                    <tr >
                        <td colspan="2" style="text-align: center;">
                            <input type="submit" style="border-style: none;background-color: black;color: white; font-size:20px;" value="SUBMIT"/>
                        </td>
        
                    </tr>
                </table>
        </form>
    </center>

    
    
</body>
</html>