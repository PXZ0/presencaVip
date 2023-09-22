<!DOCTYPE html>
<html lang="pt-BR">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <!-- Styles -->
        <link rel="stylesheet" href="./css/eventos.css">
                <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
        

        <title>Eventos</title>    
    </head>
    
    <body>
        <main>
            <section class="form-eventos">        
                <form class="row g-2" action="#" method="POST">
                    <div class="input-file justify-center h-screen items-center px-1">
                        <div class="rounded-lg shadow-xl bg-gray-50 ">
                            <div class="m-2">
                                <div class=" items-center justify-center" >
                                    <label class="cursor-pointer h-32 border-3 rounded-md border-dashed" style=" width: 100%;">
                                        <div class=" items-center justify-center pt-7" style="text-align: center; width: 100%;">
                                            <svg xmlns="http://www.w3.org/2000/svg" class="w-12 h-12 text-gray-400 group-hover:text-gray-600" viewBox="0 0 20 20" fill="currentColor" style="width: 70px; color:black;">
                                                <path fill-rule="evenodd" d="M4 3a2 2 0 00-2 2v10a2 2 0 002 2h12a2 2 0 002-2V5a2 2 0 00-2-2H4zm12 12H4l4-8 3 6 2-4 3 6z" clip-rule="evenodd" />
                                            </svg>
                                            <p class="pt-1 text-sm tracking-wider text-gray-400 group-hover:text-gray-600" style="color: black;">Selecione uma foto</p>
                                        </div>
                                        <input type="file" class="opacity-0" accept=".jpg,.gif,.png"/>
                                    </label>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row g-2 form-dentro">
                        <div class="col-md-5">
                            <label for="nome" class="form-label">Nome do Evento</label>
                            <input type="text" name="nome" class="form-control" id="nome" placeholder="Digite seu Nome">
                        </div>

                        <div class="col-md-2"></div>

                        <div class="col-md-5">
                            <label for="ingressos" class="form-label">Quantidade de Ingressos</label>
                            <input type="number" name="ingressos" class="form-control" id="ingressos" placeholder="Digite a quantidade de ingressos">
                        </div>

                        <div class="col-md-5">
                            <label for="data" class="form-label">Data do Evento</label>
                            <input type="date" name="data" class="form-control" id="data">
                        </div>

                        <div class="col-md-2"></div>

                        <div class="col-md-5">
                            <label for="valor" class="form-label">Valor</label>
                            <input type="number" name="valor" class="form-control" id="valor" placeholder="R$">
                        </div>

                        <div class="col-md-10"></div>

                        <div class="col-2" style=" text-align: right;">
                            <button type="submit" name="sair" class="btn btn-primary tamanho-btn" style="position: relative;">Cadastrar</button>
                        </div>
                    </div>
                </form>
            </section>

            <section class="row lista-eventos">
                
                <div class="card">
                    <img class="card-img-top" src="img/icons/icon-evento.png" alt="Card image" style="padding: 10%; max-width: 300px; min-width: 100px;">
                    <div class="card-body">
                        <h4 class="card-title">Nome do Evento</h4>
                        <p class="card-text">Descrição do Evento</p>
                        <div class="container" style="display: flex;">
                            <p class="card-text" style="font-size: 20px;">R$XX,XX</p>                            
                            <a href="#"  class="card-link" style="margin: 0px 0px 0px 50%;">
                                <img src="img/icons/icon-editar.png" class="icons"> 
                            </a>

                            <a href="#" style="margin: 0px 0px 0px 5%;">
                                <img src="img/icons/icon-excluir.png" class="icons">
                            </a>
                        </div>
                    </div>
                </div>    

 
            </section>
        <main>

        <script src="https://code.jquery.com/jquery-3.7.1.js"></script>

    </body>
</html>