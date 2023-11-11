<%-- 
    Document   : home
    Created on : 22 de ago de 2023, 22:14:35
    Author     : Pedro Henrique e Thiago Aparecido
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">

        <!-- Styles -->
        <link rel="stylesheet" href="./css/header.css">
        <link rel="stylesheet" href="./css/bootstrap.min.css">
        
        <title>Home</title>
    </head>
    
    <body>
        <header>
            
        </header>
        
        <main>
            <button type="button" style="border:none; background-color: #fff; color: #00f; text-decoration: underline" onclick="eventos()">Eventos</button>
            <button type="button" style="border:none; background-color: #fff; color: #00f; text-decoration: underline" onclick="usuario()">Usuario</button>
        </main>
        
        <footer>

        </footer>

        <script>
            
            function eventos() {
                window.location.href = "eventos.jsp"; // Substitua com o caminho correto para sua página index
            }
            $(document).ready(function () {
                $('#data').inputmask();
            });
            
            function usuario() {
                window.location.href = "usuario.jsp"; // Substitua com o caminho correto para sua página index
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

