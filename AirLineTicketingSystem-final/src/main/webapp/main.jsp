<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Navigation Bar</title>
    <style>
    input{
        padding-top: 7%;
        padding-bottom: 7%;
        padding-left: 7%;
       padding-right: 7%;
        width:30%;
        height:25%;
        text-align: center;
        font-size: 50px;
        font-family: Georgia, 'Times New Roman', Times, serif;
    }
    div{
        margin-top: 10%;
        word-spacing: 50px;
    }
    span{
        color: rgba(216, 112, 147, 0.521);
        margin-top: 150%;
        font-size: 100px;
        text-shadow: 3px 3px black;   }
  body{
      background-image: url("https://d2poqm5pskresc.cloudfront.net/wp-content/uploads/2019/10/airlines.jpg");
      background-repeat: no-repeat;
      background-size: cover;
      text-align: center;
      
  }
  #abt:hover{
      color:white;
      text-shadow: 5px 5px 5px black;
      cursor: pointer;

  }
  #sign:hover{
    color:white;
      text-shadow: 5px 5px 5px black;
      cursor: pointer;
  }
  #log:hover{
    color:white;
      text-shadow: 5px 5px 5px black;
      cursor: pointer;
  }

    </style>
</head>
<body>
    <center><span>coMake Airlines</span></center>
    <div>
        <input type="button" onclick="location.href='#';" value="AboutUs" id="abt" style="background-color: rgba(0, 174, 255, 0.322);" />
        <input type="button" onclick="location.href='signin.jsp ';" value="SignIn"  id="sign" style="background-color: rgba(216, 112, 147, 0.521);"/>
        <input type="button" onclick="location.href='login.jsp';" value="Login" id="log" style="background-color:rgba(137, 43, 226, 0.377) ;" />
    </div>
           
</body>
</html>