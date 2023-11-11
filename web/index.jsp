<%-- 
    Document   : index
    Created on : 22 de ago de 2023, 21:21:05
    Author     : Pedro Xavier e Thiago Aparecido
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>

        <!-- Styles -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/cadastro.css">  

    </head>
    <body>
        <main class="container-fluid">
            <div class="tamanho-login">
                <h2>Login</h2>
                    <form action="/PresencaVip/Home" method="POST">
                        <div class="mb-3 mt-3">
                            <label for="email">CPF / Email:</label>
                            <input type="email" class="form-control" id="email" placeholder="Entre com CPF ou Email" name="email">
                        </div>
                        <div class="mb-3">
                            <label for="senha">Senha:</label>
                            <input type="password" class="form-control" id="senha" placeholder="Entre com sua Senha" name="senha">
                        </div>
                        <div class="text-center">
                            <button type="submit" class="btn btn-primary tamanho-btn" id="operacao" name="operacao" value="VISUALIZAR" class="button">Entrar</button>
                            <output id="msg" for="nome" >${msg}</output>
                        </div>
                    </form>

                    <span>
                        Não está cadastrado?
                    <button type="button" style="border:none; background-color: #fff; color: #00f; text-decoration: underline" onclick="cadastar()">Clique aqui</button>
                    </span>

                </div>
            </div>
        </main>
        <script>
            function cadastar() {
                window.location.href = "cadastropessoas.jsp";
            }
        </script>
    </body> 
</html>


