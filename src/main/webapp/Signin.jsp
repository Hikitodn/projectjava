<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/17/2021
  Time: 6:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Đăng kí</title>
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.5.0/css/all.css" integrity="sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Merriweather:300,400,400i|Noto+Sans:400,400i,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600" rel="stylesheet">
    <style type="text/css">
        *{
            margin:0;
            padding:0;
            border:none;
            font-family: 'Open Sans', sans-serif;
        }
        body {
            background-color: #0099FF;
            overflow: hidden;
            background-color: #ededed;
        }
        .to {
            display: grid;
            grid-template-columns: repeat(12,1fr);
            grid-template-rows: minmax(50px,auto);
        }

        .form {
            border: 1px solid #80808000;
            grid-column: 6/9;
            grid-row: 5;
            height: 550px;
            width: 292px;
            display: flex;
            flex-direction: column;
            align-items: center;
            position: relative;
            border-radius: 15px;
            box-shadow: 0px 0px 14px 0px grey;
            background-color: white;
        }
        h2 {
            color: #009900;
            margin-top: 20px;
            margin-bottom: 20px;
        }
        i.fas.fa-tractor {
            display: block;
            margin-bottom: 20px;
            font-size: 40px;
        }

        label {
            margin-left: -126px;
            display: block;
            font-weight: lighter;

        }
        input{
            width: 200px;
            height: 40px;
            display: block;
            border-bottom: 2px solid #00BCD4;
            margin-top: 6px;
            margin-bottom: 10px;
            outline-style: none;
        }
        input[type="text"] {
            padding: 5px;
            width: 70%;
        }

        input#submit {
            padding: 7px;
            width: 50%;
            border-radius: 10px;
            border: none;
            position: absolute;
            bottom: 10px;
            cursor: pointer;
            background: red;
        }
        input#submit:hover{

            background: linear-gradient(to right, #fc466b, #3f5efb);
        }
    </style>
</head>
<body>
<div class="to">
    <div class="form">
        <h2>Sign in</h2>
        <form action="signin" method="post">
        <label style="margin-left: -5px;">Email</label>
        <input type="text" name="username"/>
        <label style="margin-left: -5px;">Password</label>
        <input type="text" name="password">
        <button type="submit">Sign in</button>
        <a href="Login.jsp">Log in</a>
        </form>
    </div>
</div>
</body>
</html>
