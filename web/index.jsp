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
        <main class="container-fluid">
            <div class="row">
                <div class="col-lg-4 bg">

                    <!-- FORMULARIO - LOGIN -->
                    <section class="box">

                        <h1>PRESENÇA VIP</h1>
                        <form name="login" method="POST" action="presencaVip/home" id="login-form">

                            <div class="form-group">	
                                <label for="login">Email</label>
                                <input id="login" class="form-control" name="email" type="text" placeholder="Informe seu Email" autofocus/>
                                <span class='erro-validacao template msg-emaill'/>
                            </div>

                            <div class="form-group">
                                <label for="senha">Senha</label>
                                <input id="senhal" class="form-control" name="senha" type="password" placeholder="******"/>
                                <span class='erro-validacao template msg-senhal'/>
                            </div>

                            <button type="submit" class="btn btn-outline btn-block" id="operacao" name="operacao" value="VISUALIZAR" class="button">Entrar</button>
                            <output id="msg" for="nome" >${msg}</output>
                        </form>

                        <span>
                            Não está cadastrado?
                            <button type="button" class="link" onclick="cadastar()">Clique aqui</button>
                        </span>
                    </section>

                </div>
            </div>
        </main>
                        
        <script>
            function cadastar() {
                window.location.href = "cadastar.jsp";
            } 
        </script>
    </body>
</html>
