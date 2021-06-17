<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/17/2021
  Time: 5:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <style type="text/css">
        body{
            background-color: #0099FF;
            font-family: sans-serif;
        }

        .login{
            width: 300px;
            height: 350px;
            text-align: center;
            border:1px solid grey;
            border-radius: 10px;
            margin: 0 auto;
            background-color: white;
        }

        h2{
            display: inline-block;
            color: #0099FF;
        }

        p{
            margin: 0px;
            padding-left: 40px;
            float: left;
        }

        .login input{
            width: 200px;
            height: 40px;
            margin-bottom: 10px;
            border-radius: 5px;
            border: 1px solid grey;
            padding-left: 20px;
            display: inline-block;

        }

        .check input{
            width: 10px;
            height: auto;
        }

        .check{
            float: left;
            padding-left: 40px;
        }

        input#submit {
            padding: 10px;
            width: 50%;
            border-radius: 10px;
            border: none;
            position: center;
            bottom: 10px;
            cursor: pointer;
            background: linear-gradient(to right, #fc00ff, #00dbde);
            margin-top: 15px;
            margin-bottom: 1px;

        }
        input#submit:hover{

            background: linear-gradient(to right, #fc466b, #3f5efb);
        }

        a{
            float: right;
            padding-right: 40px;
            margin-top: 20px;
            text-decoration: none;
        }
    </style>
</head>
<body>
<div class="login">
    <h2>Login</h2><br>
    <p>Account</p>
    <form action="login" method="post">
        <input class="user" type="text" placeholder="Email or numberphone" name="username"><br>
        <p>Password</p>
        <input class="pass" type="password" placeholder="Your password" name="password"><br>
        <div class="check">
            <input class="checkbox" type="checkbox" placeholder="Enter password">Save password
        </div><br>
        <button type="submit">Log in</button>
        <a href="Signin.jsp">Sign in</a>
    </form>
</div>
</body>
</html>
