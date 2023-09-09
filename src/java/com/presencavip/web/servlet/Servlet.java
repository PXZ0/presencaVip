/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.presencavip.web.servlet;

import com.presencavip.core.aplicacao.Resultado;
import com.presencavip.domain.EntidadeDominio;
import com.presencavip.web.command.AlterarCommand;
import com.presencavip.web.command.ConsultarCommand;
import com.presencavip.web.command.ExcluirCommand;
import com.presencavip.web.command.SalvarCommand;
import com.presencavip.web.command.VisualizarCommand;
import com.presencavip.web.interfaces.ICommand;
import com.presencavip.web.interfaces.IViewHelper;
import com.presencavip.web.viewhelper.PessoaVH;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Caio Gustavo
 */
public class Servlet extends HttpServlet {

    private static Map<String, ICommand> commands;
    private static Map<String, IViewHelper> vhs;

    /**
     * Default constructor.
     */
    public Servlet() {

        /* Utilizando o command para chamar a fachada e indexando cada command 
    	 * pela operação garantimos que esta servelt atenderá qualquer operação */
        commands = new HashMap<>();

        commands.put("SALVAR", new SalvarCommand());
        commands.put("EXCLUIR", new ExcluirCommand());
        commands.put("CONSULTAR", new ConsultarCommand());
        commands.put("VISUALIZAR", new VisualizarCommand());
        commands.put("ALTERAR", new AlterarCommand());

        /* Utilizando o ViewHelper para tratar especificações de qualquer tela e indexando 
    	 * cada viewhelper pela url em que esta servlet é chamada no form
    	 * garantimos que esta servelt atenderá qualquer entidade */
        vhs = new HashMap<>();
        /*A chave do mapa é o mapeamento da servlet para cada form que 
    	 * está configurado no web.xml e sendo utilizada no action do html
         */
        vhs.put("/AplicacaoModelo/ConsultarPessoa", new PessoaVH());

    }

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Obtêm a uri que invocou esta servlet (O que foi definido no methdo do form html)
        String uri = request.getRequestURI();

        //Obtêm a operação executada
        String operacao = request.getParameter("operacao");

        //Obtêm um viewhelper indexado pela uri que invocou esta servlet
        IViewHelper vh = vhs.get(uri);

        //O viewhelper retorna a entidade especifica para a tela que chamou esta servlet
        EntidadeDominio entidade = vh.getEntidade(request);

        //Obtêm o command para executar a respectiva operação
        ICommand command = commands.get(operacao);

        /*Executa o command que chamará a fachada para executar a operação requisitada
		 * o retorno é uma instância da classe resultado que pode conter mensagens derro 
		 * ou entidades de retorno
         */
        Resultado resultado = command.execute(entidade);

        /*
		 * Executa o método setView do view helper específico para definir como deverá ser apresentado 
		 * o resultado para o usuário
         */
        vh.setView(resultado, request, response);

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
