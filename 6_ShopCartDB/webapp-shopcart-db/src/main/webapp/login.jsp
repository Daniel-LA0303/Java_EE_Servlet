<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Formulario Login</title>
</head>
<body>
    <h1>Iniciar sesion Carrito</h1>
    <form action="/webapp-shopcart-db/login" method="post">
        <label for="username">Usuario</label>
        <input type="text" name="username" id="username">
        <br>
        <label for="password">Contraseña</label>
        <input type="password" name="password" id="password">
        <br>
        <input type="submit" value="Ingresar">
    </form>
</body>
</html>