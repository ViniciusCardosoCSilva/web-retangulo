package br.com.fiap.retangulo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calcular")
public class Calcular extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Calcular() {
        super();

    }

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
//		response.getWriter().append("Served at:  ").append(request.getContextPath());
//	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Double base = Double.parseDouble(request.getParameter("base"));
		Double altura = Double.parseDouble(request.getParameter("altura"));
		
		Double area = base * altura;
		Double perimetro = (base + altura) / 2;
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=ISO-8859-1>");
		out.println("<title>Resultado</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Resultado</h1>");
		out.println("<h3>Área: " + area + "</h3>");
		out.println("<h3>Perímetro: " + perimetro + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}

}
