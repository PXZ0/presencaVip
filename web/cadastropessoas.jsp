<%-- 
    Document   : cadastropessoas
    Created on : 27 de ago de 2023, 19:45:33
    Author     : Pedro Xavier e Thiago Aparecido
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        
        <!-- Styles -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/cadastro.css">
        
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
            crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
        
        <script type="text/javascript" src="js/cadastropessoas.js"></script>
        
        <title>Cadastro de Pessoas</title>
    </head>
    <body onload="iniciar()" style="background-color: rgb(44, 43, 43)"> <!-- CASO DE RUIM(Codigo do professor): onload="iniciar()"-->
        
        <div class="container" style="margin-top: 10%;">
            <h1 align="center">Cadastro</h1>
            
            <div class="form-container">
                <form class="row g-5 cadastro-user"  action="/PresencaVip/CadastrarPessoa" method="post">
                    
                    <div class="col-md-5">
                        <label for="nome" class="form-label">Nome</label>
                        <input type="text" name="nome" class="form-control" id="nome" placeholder="Digite seu Nome">
                    </div>
                    
                    <div class="col-md-2"></div>
                    
                    <div class="col-md-5">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" name="email" class="form-control" id="email" placeholder="Digite seu Email">
                    </div>
                    
                    <div class="col-md-5">
                        <label for="cpf" class="form-label">CPF</label>
                        <input type="text" name="cpf" class="form-control" id="cpf" placeholder="000.000.000-00">
                    </div>
                    
                    <div class="col-md-2"></div>
                    
                    <div class="col-md-5">
                        <label for="senha" class="form-label">Senha</label>
                        <input type="text" name="senha" class="form-control" id="senha" placeholder="Crie uma senha"
                            value="">
                    </div>

                    <div class="col-3"></div>
                    
                    <div class="col-6">
                        <label for="tipo" class="form-label">Tipo de Conta</label>
                        <select name="tipo" class="form-select" aria-label="Default select example">
                            <option value="Comum" selected>Comum</option>
                            <option value="Organizador">Organizador</option>
                        </select>
                    </div>
                    
                    <div class="col-3"></div>
                    
                     <div class="col-12 text-center">
                        <button type="submit" name="operacao" value="SALVAR" class="btn btn-primary tamanho-btn">Cadastrar</button>
                    </div>
                    
                    <!--<div class="col-12 text-center button-container">
                        <div id="divBotaoNovo"></div>
                        <div id="divBotoes"></div>
                    </div>-->
                </form>
            </div>

            <!-- <h2>Registros de Pessoas</h2>

           <div class="table-container">
                <table>
                    <tr>
                        <th>Nome</th>
                        <th>Email</th>
                        <th>Cpf</th>
                        <th>Senha</th>
                        <th>Tipo</th>
                    </tr>
                    <c:forEach var="pessoa" items="${listaPessoas}" varStatus="id">
                        <tr id="${pessoa.id}">
                            <td onclick="selecionar(${pessoa.id})">${pessoa.nome}</td>
                            <td onclick="selecionar(${pessoa.id})" >${pessoa.email}</td>
                            <td onclick="selecionar(${pessoa.id})" >${pessoa.cpf}</td>
                            <td onclick="selecionar(${pessoa.id})" >${pessoa.senha}</td>
                            <td onclick="selecionar(${pessoa.id})" >${pessoa.tipo}</td>
                            <td class="action-buttons">
                                <button class="save-button">Editar</button>
                                <button class="delete-button">Excluir</button>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div> -->
        </div>
    </body>
</html>
