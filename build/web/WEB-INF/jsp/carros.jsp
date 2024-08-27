<%-- 
    Document   : carros
    Created on : 27/08/2024, 15:17:13
    Author     : Senai
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Carros</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
              crossorigin="anonymous">
    </head>
    <body>
        <div class="container mt-5">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">ID</th>
                        <th scope="col">Marca</th>
                        <th scope="col">Modelo</th>
                        <th scope="col">Ano</th>
                        <th scope="col">Placa</th>
                        <th scope="col">Preço Diária</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="carro" items="${carros}"> 
                        <tr>
                            <td scope="row">${carro.id_carro}</td>
                            <td>${carro.marca}</td>
                            <td>${carro.modelo}</td>
                            <td>${carro.ano}</td>
                            <td>${carro.placa}</td>
                            <td>${carro.preco_diaria}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
