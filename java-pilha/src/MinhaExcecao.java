
// Quem estende de Throwable � a m�quina virtual java

// Exce��o Unchecked:
//public class MinhaExcecao extends RuntimeException {
// Exce��o checked, precisa colocar na assinatura do m�todo que a lan�a:
public class MinhaExcecao extends Exception {
	
	public MinhaExcecao(String msg) {
		super(msg);
	}

}
