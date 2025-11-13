package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Contrato;


@WebServlet("/CadastrarContratos")
public class CadastrarContratosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CadastrarContratosServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("opcao");
		String data = request.getParameter("data");
		double valor = Double.parseDouble(request.getParameter("valor"));
		double parcela = Double.parseDouble(request.getParameter("parcela"));
		
		if(op.equals("cadastrar")) {
			Contrato c = new Contrato(data, valor, parcela);
			System.out.println("Resultado: " + c.save());
		}
	}

}
