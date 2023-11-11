/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
var anterior = 0;

function salvarNovo() {

    var nome = document.getElementById("nome").value;
    var cpf = document.getElementById("cpf").value;
    var email = document.getElementById("email").value;
    var senha = document.getElementById("senha").value;
    var tipo = document.getElementById("tipo").value;

    if (nome !== "" && cpf !== "") {
        location.href = "/PresencaVip/ConsultarPessoa?nome=" + nome + "&cpf=" + cpf + "&email=" + email + "&senha=" + senha + "&tipo=" + tipo + "&operacao=SALVAR";
    } else {
        var vari = document.getElementById("cpf");
        vari.focus();
    }
}

function iniciar() {

    var nome = document.getElementById("nome").value;
    criarBotaoNovo();


}

function criarBotaoNovo() {

    if (document.getElementById("divBotaoNovo").childElementCount === 0) {

        // Div principal onde as divs internas serão criadas
        var div = document.getElementById("divBotaoNovo");

        // Criar a div interna
        var divBtNovo = document.createElement("div");

        // Criar os botao alterar 
        var btNovo = document.createElement("button");
        btNovo.setAttribute("onClick", "salvarNovo()");
        btNovo.appendChild(document.createTextNode("Novo"));
        btNovo.setAttribute("id", "btNovo");
        btNovo.setAttribute("class", "save-button");
        btNovo.setAttribute("name", "operacao");
        btNovo.setAttribute("value", "SALVAR");



        divBtNovo.appendChild(btNovo);

        // Incluir a div interna na principal
        div.appendChild(divBtNovo);
    }

}

function selecionar(id) {
    if (anterior === 0) {
        anterior = id;
    }
    var linhaAnterior = document.getElementById(anterior);
    linhaAnterior.setAttribute("style", "font-weight:normal");

    var linha = document.getElementById(id);
    linha.setAttribute("style", "font-weight:bold");

    anterior = id;
    // Div principal onde as divs internas serão criadas
    var div = document.getElementById("divBotoes");

    if (document.getElementById("divBotoes").childElementCount === 0) {

        // Criar a div interna
        var interna = document.createElement("div");

        // Criar os botao visualizar
        var btVisualizar = document.createElement("button");
        btVisualizar.setAttribute("onClick", "location.href='FormProdutos.jsp?id=" + id + "&operacao=VISUALIZAR'");
        btVisualizar.appendChild(document.createTextNode("Visualizar"));
        btVisualizar.setAttribute("id", "consultar");
        btVisualizar.setAttribute("class", "save-button");


        // Criar os botao alterar 
        var btAlterar = document.createElement("button");
        btAlterar.setAttribute("onClick", "location.href='FormProdutos.jsp?id=" + id + "&operacao=ALTERAR'");
        btAlterar.appendChild(document.createTextNode("Alterar"));
        btAlterar.setAttribute("id", "alterar");
        btAlterar.setAttribute("class", "save-button");

        // Criar os botao excluir
        var btExcluir = document.createElement("button");
        btExcluir.setAttribute("onClick", "location.href='Produtos?id=" + id + "&operacao=EXCLUIR'");
        btExcluir.appendChild(document.createTextNode("Excluir"));
        btExcluir.setAttribute("id", "excluir");
        btExcluir.setAttribute("class", "save-button");

        // Incluir os botões na div interna
        interna.appendChild(btAlterar);
        interna.appendChild(btVisualizar);
        interna.appendChild(btExcluir);

        // Incluir a div interna na principal
        div.appendChild(interna);
    } else {

        var btAt = document.getElementById("alterar");
        btAt.setAttribute("onClick", "location.href='FormProdutos.jsp?id=" + id + "&operacao=ALTERAR'");

        var btVs = document.getElementById("consultar");
        btVs.setAttribute("onClick", "location.href='FormProdutos.jsp?id=" + id + "&operacao=VISUALIZAR'");

        var btEx = document.getElementById("excluir");
        btEx.setAttribute("onClick", "location.href='Servlet?id=" + id + "&operacao=EXCLUIR'");
    }
}



