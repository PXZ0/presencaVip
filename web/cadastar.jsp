<%-- 
    Document   : cadastar
    Created on : 17 de set. de 2023, 17:41:23
    Author     : Pedro Henrique e Thiago Aparecido
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastar</title>
        
        <!-- Styles -->
        <style rel="stylesheet" href="css/cadastro.css"></style>
    </head>
    <body>
        <main class="container-fluid">
            <div class="container div-cadastro-usuario">
                <h2 class="text-center">Cadastro</h2>
                <form class="row g-5 cadastro-user" action="#" method="POST">
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
                        <input type="password" name="senha" class="form-control" id="senha" placeholder="Crie uma senha"
                               value="">
                    </div>

                    <div class="col-3"></div>
                    <div class="col-6">
                        <label for="senha" class="form-label">Tipo de Conta</label>
                        <select class="form-select" aria-label="Default select example">
                            <option selected>Comum</option>
                            <option value="1">Organizador</option>
                        </select>
                    </div>
                    <div class="col-3"></div>
                    <div class="col-6 text-center">
                        <button type="submit" name="alterar_usuario" class="btn btn-primary tamanho-btn">Voltar</button>
                    </div>
                    <div class="col-6 text-center">
                        <button type="submit" name="sair" class="btn btn-primary tamanho-btn">Cadastrar</button>
                    </div>
                </form>
            </div>
        </main>
    </body>
</html>
