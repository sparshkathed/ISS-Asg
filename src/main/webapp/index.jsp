<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
        crossorigin="anonymous">
    <style>
        body {
            background-color: #f5f5f5;
        }

        #login-container {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            margin: 50px auto;
            max-width: 400px;
        }
    </style>
    <script type="text/javascript" src="js/validation.js"></script>
</head>
<body>
    <div align="center" id="login-container">

        <form id="login-form" action="LoginServlet" method="post" onsubmit="return validateLogin()">
            <div class="form-group row">
                <label for="username" class="col-sm-3 col-form-label">Username:</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" id="username" name="username" placeholder="Enter your username">
                </div>
            </div>
            <div class="form-group row">
                <label for="password" class="col-sm-3 col-form-label">Password:</label>
                <div class="col-sm-9">
                    <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-6">
                    <button type="submit" class="btn btn-success btn-block">Login</button>
                </div>
                <div class="col-sm-6">
                    <button type="reset" class="btn btn-danger btn-block">Reset</button>
                </div>
            </div>
        </form>
        <br>

        <form action="RegisterServlet" method="get">
            <input type="submit" class="btn btn-dark btn-block" value="Register">
        </form>
    </div>
</body>
</html>
