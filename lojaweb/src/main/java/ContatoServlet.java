import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.stella.tinytype.CPF;

@WebServlet(urlPatterns={"/contato"})
public class ContatoServlet extends HttpServlet {
	
	@Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { 
		new CPF("2222222222").isValido();
		PrintWriter writer = resp.getWriter();
        writer.println("<html><h2>Fale conoscooooooo</h2></html>");
        writer.close();
    }

}
