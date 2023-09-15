<%-- 
    Document   : consultapessoa
    Created on : 22 de ago de 2023, 22:14:35
    Author     : Pedro Henrique e Thiago Aparecido
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Resultados da Consulta</title>
        
        <!-- Styles -->
    </head>
    <body>
        <main>
            <div class="container">
                <div class="result">
                    <label class="result-label" for="nome">Nome:</label>
                    <input class="result-input" type="text" id="nome" name="nome" value="${nome}" required>
                </div>
                <div class="result">
                    <label class="result-label" for="dtNascimento">Data Nascimento:</label>
                    <input class="result-input" type="text" id="dataNascimento" name="dataNascimento" placeholder="dd/mm/aaaa" data-inputmask="'alias': 'dd/mm/yyyy'" value="${dataNascimento}" required>
                </div>
                <div class="result">
                    <label class="result-label" for="cidade">Cidade:</label>
                    <input class="result-input" type="text" id="cidade" name="cidade" value="${cidade}" required>
                </div>
                <button type="button" class="button" onclick="voltarParaIndex()">Voltar</button>
            </div>  
        </main>
        

        <script>
            function voltarParaIndex() {
                window.location.href = "index.jsp"; // Substitua com o caminho correto para sua página index
            }
            $(document).ready(function () {
                $('#data').inputmask();
            });
        </script>
        
        <!-- Scripts -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.inputmask/5.0.6/jquery.inputmask.min.js"></script>
    </body>
</html>

