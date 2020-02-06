public class FluxoComTratamento {

	// Aqui a assinatura do m�todo n�o pecisa incluir o throws porque est� usando try-catch
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | MinhaExcecao ex) {
        	//  � poss�vel pegar mais informa��es sobre a exce��o
        	String msg = ex.getMessage();
        	System.out.println("Exce��o: " + msg);
        	// Mostra a pilha
        	ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
//		try {
			metodo2();
//		} catch (ArithmeticException ex) {
//	    	System.out.println("Exce��o aritm�tica");
//		}
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecao("deu muito errado");
//        ArithmeticException exception = new ArithmeticException("Deu errado");
//        throw exception;
        // ou: throw new ArithmeticException();
        
        // System.out.println("Fim do metodo2");
    }
}