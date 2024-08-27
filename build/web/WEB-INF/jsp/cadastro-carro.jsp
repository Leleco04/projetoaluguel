<%-- 
    Document   : cadastro-carro
    Created on : 27/08/2024, 14:41:12
    Author     : Senai
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Carro</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link href="./styles/cadastro-carro.css" rel="stylesheet"
    </head>
    <body>
        <form action="">
            <div class="d-flex justify-content-center align-items-center vh-100">
                <div class="d-grid grupo-input">
                    <div class="form-floating mb-3 mt-5">
                        <input type="text" id="floatingInput" class="form-control" placeholder="Marca">
                        <label for="floatingInput">Marca</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input type="text" id="floatingInput" class="form-control" placeholder="Modelo">
                        <label for="floatingInput">Modelo</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input type="number" id="floatingInput" class="form-control" placeholder="Ano">
                        <label for="floatingInput">Ano</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input type="text" id="floatingInput" class="form-control" placeholder="Placa">
                        <label for="floatingInput">Placa</label>
                    </div>
                    <div class="form-floating mb-3">
                        <input type="text" id="floatingInput" class="form-control" placeholder="Valor Diário">
                        <label for="floatingInput">Valor Diário</label>
                    </div>
                    <div class="d-flex justify-content-center">
                        <button type="submit" class="btn btn-primary mb-5 row">Cadastrar Carro</button>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>
