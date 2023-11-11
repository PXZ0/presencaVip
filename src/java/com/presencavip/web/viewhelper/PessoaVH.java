/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.presencavip.web.viewhelper;

import com.presencavip.core.aplicacao.Resultado;
import com.presencavip.domain.EntidadeDominio;
import com.presencavip.domain.Pessoa;
import com.presencavip.web.interfaces.IViewHelper;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Caio Gustavo
 */
public class PessoaVH implements IViewHelper {

    @Override
    public EntidadeDominio getEntidade(HttpServletRequest request) {
        //Obtêm a operação executada
        String operacao = request.getParameter("operacao");
        Pessoa pessoa = new Pessoa();
        
        if (operacao.equals("VISUALIZAR")) {
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            
            pessoa.setEmail(email);
            pessoa.setSenha(senha);
        }
        
        if (operacao.equals("SALVAR")) {
            String nome = request.getParameter("nome");
            String cpf = request.getParameter("cpf");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String tipo = request.getParameter("tipo");                        

            pessoa.setNome(nome);            
            pessoa.setCpf(cpf);
            pessoa.setEmail(email);
            pessoa.setSenha(senha);
            pessoa.setTipo(tipo);
        }

        return pessoa;

    }

    @Override
    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        String operacao = request.getParameter("operacao");
//        Pessoa pessoa = new Pessoa();
        Pessoa pessoa = (Pessoa) resultado.getEntidades().get(0);
        
//        CONSULTAR
        if (operacao.equals("CONSULTAR")) {
            request.setAttribute("listaPessoas", resultado.getEntidades());

            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
        
        
//        VIZUALIZAR
        if (operacao.equals("VISUALIZAR")) {  
                      
            if (pessoa.getId().equals( 0)) {
                request.setAttribute("msg", "Usuario não encontrado!");
                request.getRequestDispatcher("index.jsp").forward(request, response);

            } else {                       
                request.setAttribute("nome", pessoa.getNome());  
                request.setAttribute("email", pessoa.getEmail());  
                request.setAttribute("cpf", pessoa.getCpf());  
                request.setAttribute("senha", pessoa.getSenha());  
                request.setAttribute("tipo", pessoa.getTipo());  
                
                request.getRequestDispatcher("home.jsp").forward(request, response);
            }
        }
        
//        SALVAR
        if (operacao.equals("SALVAR")) {
            request.setAttribute("listaPessoas", resultado.getEntidades());

            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
        
//        EXCLUIR
        if (operacao.equals("EXCLUIR")) {
            request.setAttribute("listaPessoas", resultado.getEntidades());

            request.getRequestDispatcher("home.jsp").forward(request, response);
        }
        
//        ATUALIZAR
        if (operacao.equals("ATUALIZAR")) {
            request.setAttribute("listaPessoas", resultado.getEntidades());

            request.getRequestDispatcher("cadastropessoas.jsp").forward(request, response);
        }

    }

}
