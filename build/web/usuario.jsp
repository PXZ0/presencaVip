<%-- 
    Document   : usuario
    Created on : 22 de ago de 2023, 21:21:05
    Author     : Pedro Xavier e Thiago Aparecido
--%>

<!DOCTYPE html>
<html lang="pt-BR">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <title>Página de Inicio</title>
    
    
    <!-- Styles -->
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/cadastro.css">  
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
</head>

<body>
    <section class="listagem-eventos-user">
        <div class="tabela-listagem-user">
            <h3>Eventos Relacionados</h3>
            <table>
                <thead>
                    <tr>
                        <th>Eventos</th>
                        <th>Acompanhar</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Evento 1</td>
                        <td><img src="icon-visualizar.png" alt="inspecionar" class="tamanho-icon"></td>
                    </tr>
                    <tr>
                        <td>Evento 2</td>
                        <td><img src="icon-visualizar.png" alt="inspecionar" class="tamanho-icon"></td>
                    </tr>
                    <tr>
                        <td>Evento 3</td>
                        <td><img src="icon-visualizar.png" alt="inspecionar" class="tamanho-icon"></td>
                    </tr>
                    <tr>
                        <td>Evento 4</td>
                        <td><img src="icon-visualizar.png" alt="inspecionar" class="tamanho-icon"></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </section>

    <section class="info-user">
        <div class="form-info-user">
            <form class="row g-3" action="#" method="post">
                <div class="col-md-12">
                    <label for="nome" class="form-label">Nome</label>
                    <input type="text" name="nome" class="form-control" id="nome" placeholder="Digite seu Nome">
                </div>
                <div class="col-md-12">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" name="email" class="form-control" id="email" placeholder="Digite seu Email">
                </div>
                <div class="col-md-12">
                    <label for="cpf" class="form-label">CPF</label>
                    <input type="text" name="cpf" class="form-control" id="cpf" placeholder="000.000.000-00">
                </div>
                <div class="col-md-12">
                    <label for="senha" class="form-label">Senha</label>
                    <input type="password" name="senha" class="form-control" id="senha" placeholder="Crie uma senha"
                        value="">
                </div>
                <div class="col-12">
                    <label for="senha" class="form-label">Tipo de Conta</label>
                    <select class="form-select" aria-label="Default select example">
                        <option selected>Comum</option>
                        <option value="1">Organizador</option>
                    </select>
                </div>
                <div class="col-6 text-center">
                    <button type="submit" name="alterar_usuario" class="btn btn-primary tamanho-btn">Alterar</button>
                </div>
                <div class="col-6 text-center">
                    <button type="submit" name="sair" class="btn btn-primary tamanho-btn">Deletar</button>
                </div>
            </form>
        </div>
    </section>
</body>

</html>