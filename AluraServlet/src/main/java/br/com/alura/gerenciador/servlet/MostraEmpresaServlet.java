package br.com.alura.gerenciador.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/MostraEmpresaServlet")
public class MostraEmpresaServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String paramId = request.getParameter("id");
        Integer id = Integer.valueOf(paramId);

        System.out.println(id);

        Banco banco = new Banco();
        Empresa empresa = banco.busca(id);

        request.setAttribute("empresa", empresa);
        RequestDispatcher rd = request.getRequestDispatcher("formAlteraEmpresa.jsp");
        rd.forward(request, response);
    }
}
