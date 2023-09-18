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
        <title>Home</title>

        <!-- Styles -->
        <link rel="stylesheet" href="./css/header.css">
        <link rel="stylesheet" href="./css/bootstrap.min.css">
    </head>
    
    <body>
        <header class="navbar navbar-expand navbar-dark flex-column fixed-top flex-md-row bd-navbar">            
            <section class="itens_1">
                <input type="checkbox" id="hamburguer" style="display: none;">
                <label for="hamburguer">
                    <div class="hamburguer">
                    </div>
                </label>
                <nav class="menu scrollbar-warning">                    
                    <ul class="menu_list">          
                        <li class="menu_item_perfil border-bottom border-white">					

                              
                        </li>
                        <li class="menu_item">							
                                <a class="menu_link" href="home.php">
                                        <i class="menu_icon fas fa-home"></i>
                                        Home
                                </a>
                        </li>
                        <li class="menu_item">
                            <a class="menu_link" href="meus_times.php">
                                <i class="menu_icon fas fa-users"></i>
                                Meus times
                            </a>
                        </li>                        
                    </ul>
                </nav> 

                <form class="search_box" name="pesquisar" method="POST" action="buscar.php">
                    <input class="search_txt" type="text" name="busca" required="required"/  >
                    <button class="search_btn" type="submit" name="enviar">
                        <i class="fas fa-search"></i>
                    </button>
                </form>
            </section>
            
        </header>	  	

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

        <<footer>

        </footer>

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

