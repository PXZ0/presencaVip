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
import java.text.SimpleDateFormat;
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
        String nome = request.getParameter("nome");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);

        return pessoa;

    }

    @Override
    public void setView(Resultado resultado, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Pessoa pessoa = (Pessoa) resultado.getEntidades().get(0);

        if (pessoa.getId().equals(0)) {
            request.setAttribute("msg", "Pessoa não encontrada!");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        } else {
            request.setAttribute("nome", pessoa.getNome());
            // Defina o padrão de formato desejado
            String pattern = "dd/MM/yyyy";

            // Crie um objeto SimpleDateFormat com o padrão
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);

            // Formate o objeto Date para uma string com o formato especificado
            String dataFormatada = sdf.format(pessoa.getDtNascimeto());

            request.setAttribute("dataNascimento", dataFormatada);
            request.setAttribute("cidade", pessoa.getCidade());

            request.getRequestDispatcher("consultapessoa.jsp").forward(request, response);
        }

    }

}
