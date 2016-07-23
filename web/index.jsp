<%--
  Created by IntelliJ IDEA.
  User: chenmingjiang
  Date: 2016/7/23
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="JS/jquery.min.js"></script>
    <script>
        function ajaxUser() {
            var username = $("#username").val();
            $.post("/ajaxUser.form", {username: username}, function (date) {
                alert(date.username + '                  ' + date.password), "json"
            });
        }
    </script>
</head>
<body>
<input type="text" id="username" name="username">
<input type="button" onclick="ajaxUser()" value="验证">

</body>
</html>
