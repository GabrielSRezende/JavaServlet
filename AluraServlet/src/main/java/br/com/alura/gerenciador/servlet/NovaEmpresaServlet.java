package br.com.alura.gerenciador.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = "/NovaEmpresaServlet")
public class NovaEmpresaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        System.out.println("Cadastrando nova empresa");

        String nomeEmpresa = req.getParameter("nome");
        String dataEmpresa = req.getParameter("data");
        Date dataAberturaExibe = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            dataAberturaExibe = format.parse(dataEmpresa);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        Empresa empresa = new Empresa();
        empresa.setNome(nomeEmpresa);
        empresa.setDataAbertura(dataAberturaExibe);

        Banco banco = new Banco();
        banco.adiciona(empresa);

        resp.sendRedirect("listaEmpresasServlet");
//        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresasServlet");
//        req.setAttribute("empresa1", empresa.getNome());
//        rd.forward(req, resp);
    }
}
