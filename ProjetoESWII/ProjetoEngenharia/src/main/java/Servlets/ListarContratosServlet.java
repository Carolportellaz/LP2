package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Contrato;

@WebServlet("/ListarContratos")
public class ListarContratosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListarContratosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Contrato c = new Contrato();
		
		ArrayList<Contrato> contratos =  c.getAll();
		RequestDispatcher rd = request.getRequestDispatcher("/ListarContratos.jsp");
		request.setAttribute("contratos", contratos);
		rd.forward(request, response);
	}

}
