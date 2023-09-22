/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aplicacaomodelo.web.viewhelper;

import com.aplicacaomodelo.core.aplicacao.Resultado;
import com.aplicacaomodelo.domain.EntidadeDominio;
import com.aplicacaomodelo.domain.Pessoa;
import com.aplicacaomodelo.web.interfaces.IViewHelper;
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
        if (operacao.equals("SALVAR")) {
            String nome = request.getParameter("nome");
            String data = request.getParameter("dataNascimento");
            String cidade = request.getParameter("cidade");

            pessoa.setNome(nome);
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            try {
                pessoa.setDtNascimeto(formato.parse(data));
            } catch (ParseException ex) {
                Logger.getLogger(PessoaVH.class.getName()).log(Level.SEVERE, null, ex);
            }
            pessoa.setCidade(cidade);
        }

        return pessoa;

    }

    @Override
    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.setAttribute("listaPessoas", resultado.getEntidades());

        request.getRequestDispatcher("cadastropessoas.jsp").forward(request, response);

    }

}
