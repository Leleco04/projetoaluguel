<%-- 
    Document   : login
    Created on : 26/08/2024, 13:49:19
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link href="./styles/styles.css" rel="stylesheet"
    </head>
    <body>
        <div class="container d-flex justify-content-center align-items-center vh-100">
            <div class="login-container p-5 rounded-5">
                <div class="d-grid">
                    <div class="row">
                        <img src="./imagens/login.svg" alt="imagem-login" class="col-6">
                        <div class="col-4 m-auto input-g">
                            <input type="email" class="row mb-3 p-3 w-100" id="email" name="email" placeholder="E-mail">
                            <input type="password" class="row mb-3 p-3 w-100" id="senha" name="senha" placeholder="**********">
                            <a href="./home"><button class="btn btn-primary w-50">Login</button></a>
                            <a href="./cadastro" class="ms-5 link-tela">Cadastre-se</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
