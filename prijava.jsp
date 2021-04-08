<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Prijava</title>
    </head>
    <body>
        <h1>Prijava</h1>
        <form action="prijavise" method="post">
            <input type="text" name="username" 
                   placeholder="Username"><br>
            <input type="password" name="password" 
                   placeholder="Password"><br>
            <input type="submit" value="Prijavi se">
        </form>
    </body>
</html>
