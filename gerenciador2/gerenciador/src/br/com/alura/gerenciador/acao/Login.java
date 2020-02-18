package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Usuario;

public class Login implements Acao {

	public String executa(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String login = req.getParameter("login");
		String senha = req.getParameter("senha");
		
		Banco banco = new Banco();
		Usuario usuario = banco.existeUsuario(login, senha);
		
		if(usuario != null) {
			System.out.println("Usuario existe");
			
//			Dessa forma, enquanto o usu�rio estiver usando a aplica��o, 
//			esse objeto HttpSession continuar� v�lido na mem�ria do servidor, 
//			guardando informa��es desse usu�rio (permiss�es, credenciais, 
//			produtos que ele est� selecionando, etc.).
			
			HttpSession sessao = req.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			return "redirect:entrada?acao=ListaEmpresas";
		} else {
			return "redirect:entrada?acao=LoginForm";
		}
		
	}
}
