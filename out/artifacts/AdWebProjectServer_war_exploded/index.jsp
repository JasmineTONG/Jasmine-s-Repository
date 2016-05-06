<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>Spring MVC Demo</title>
    <style type="text/css">
        .large {
            display: inline-block;
            width: 49%;
            float: left;
        }
    </style>

<script type="text/javascript">
    //userRegister: addUser
    function addUser() {
        var form = document.forms[0];
        form.action = "/default/userRegister";
        form.method = "get";
        form.submit();
    }
  //userLogin
    function userLogin() {
        var form = document.forms[0];
        form.action = "/default/userLogin";
        form.method = "get";
        form.submit();
    }
</script>

</head>
<body>
<div class="large">
    <form >
        ID: <label id="id"></label><br>
        <label>
    User name:        
            <input type="text" name="userName" placeholder="username"/>
        </label><br>
        <label>
    Password: 
            <input type="password" name="password placeholder="password"/>
        </label><br>
        <input type="button" id="login_btn" value="Login" onclick="userLogin()"/>
        <input type="button" id="register_btn" value="Register" onclick="addUser()"/>
  
    </form>
</div>
<div class="large" id="message">

</div>
</body>
</html>