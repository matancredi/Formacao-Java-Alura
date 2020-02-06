public class TesteContas {
	
	// Tratamento de exce��es:
	// Resumindo: sabemos que existem exce��es e que elas mudam o fluxo. 
	// Se solu��es n�o forem encontradas dentro da pilha de execu��o, elas ser�o impressas no console.

    public static void main(String[] args) {
    	
        int a = 3;
        // java.lang.ArithmeticException
        // int b = a / 0;

        //instancia para testar exce��o!!!!
        ContaCorrente conta = null;
        // java.lang.NullPointerException
        try {
        	conta.deposita(200.0);
        	// � poss�vel trabalhar com mais um tipo de exce��o usando o pipe
        } catch(ArithmeticException | NullPointerException ex) {
        	String msg = ex.getMessage();
        	System.out.println(msg);
        	ex.printStackTrace();
        }

        //instancia da conta corrente
        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        //instancia da conta poupan�a
        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200.0);
    }
}