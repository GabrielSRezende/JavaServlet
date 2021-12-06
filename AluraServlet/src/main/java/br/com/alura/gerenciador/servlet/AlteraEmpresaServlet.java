package br.com.alura.gerenciador.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/AlteraEmpresaServlet")
public class AlteraEmpresaServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nomeEmpresa = request.getParameter("nome");
        String dataEmpresa = request.getParameter("data");
        String idEmpresa = request.getParameter("id");
        Integer id = Integer.valueOf(idEmpresa);

        Date dataAberturaExibe = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            dataAberturaExibe = format.parse(dataEmpresa);
        } catch (ParseException e) {
            throw new ServletException(e);
        }
        Banco banco = new Banco();
        Empresa empresa = banco.busca(id);
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAberturaExibe);

        response.sendRedirect("listaEmpresasServlet");
    }
}
