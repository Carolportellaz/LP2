package Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Classes.Banco;


@WebServlet("/Cadastrar")
public class CadastrarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CadastrarServlet() {
        super();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banco banco = new Banco();
		
		System.out.println("Realizando cadastro");
		
		try {
			String novaP = request.getParameter("palavra");
			
			banco.adiciona(novaP);
			
			ArrayList<String> palavras = banco.getPalavras();
			
			RequestDispatcher rd = request.getRequestDispatcher("/palavraCadastrada.jsp");
			request.setAttribute("palavras", palavras);
			rd.forward(request, response);
		}
		
		catch(Exception e) {
			System.out.println("Ocorreu o seguinte erro " + e.getMessage());
		}
		
	}

}
