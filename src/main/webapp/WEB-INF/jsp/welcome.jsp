<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css"
        integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
        crossorigin="anonymous">
    <style>
        #welcome-container {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            margin: 50px auto;
            max-width: 400px;
        }

        #logout {
            position: absolute;
            top: 0;
            right: 0;
            margin: 10px;
        }
    </style>
</head>
<body>
    <div id="welcome-container">
    	<p>Hello User</p>
        <form id="logout" action="LogoutServlet" method="get">
            <input type="submit" class="btn btn-danger" value="Logout">
        </form>
    </div>
</body>
</html>
