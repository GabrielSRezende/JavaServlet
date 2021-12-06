package br.com.alura.gerenciador.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/listaEmpresasServlet")
public class ListaEmpresasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        Banco banco = new Banco();
        List<Empresa> lista = banco.getEmpresas();

        //Chamar o JSP
        RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresaCriada.jsp");
        req.setAttribute("empresa", lista);
        rd.forward(req, resp);
    }
}
