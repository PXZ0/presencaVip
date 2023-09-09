<%-- 
    Document   : index
    Created on : 22 de ago de 2023, 21:21:05
    Author     : Pedro Henrique e Thiago Aparecido
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Pagina Inicial</title>
        
        <!-- Styles -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/main.css">
    </head>
    <body>
        <main class="limiter">
            <section class="container-login100" >
                <div class="wrap-login100 p-t-30 p-b-50">
                    <form action="/AplicacaoModelo/ConsultarPessoa" method="post">
                        <div class="input-container">
                            <label for="email">Email</label>
                            <input type="email" id="nome" name="email" class="input-field" required>
                            <label for="senha">Senha</label>
                            <input type="password" id="senha" name="senha" class="input-field" required>
                            <button type="submit" id="operacao" name="operacao" value="VISUALIZAR" class="button">Entrar</button>
                            <output id="msg" for="nome" >${msg}</output>
                        </div>
                    </form>
                </div>
            </section>
        </main>
    </body>
</html>
