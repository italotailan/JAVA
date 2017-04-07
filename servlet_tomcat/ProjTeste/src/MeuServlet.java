import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MeuServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nomePessoa = request.getParameter("nome");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Pagina Teste </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Olá " + nomePessoa + "! <br>0 Bem vindo ao meu Servlet </h1>");
		out.println("</body>");		
		out.println("</html>");
			out.close();
		
	}

}
