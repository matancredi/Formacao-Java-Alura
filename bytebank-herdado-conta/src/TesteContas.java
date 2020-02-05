
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		// O m�todo depoista n�o existe nas classes conta corrente e poupan�a, s� na classe Conta
		// � poss�vel us�-lo porque herdamos os m�todos. J� para os construtores, devemos usar o "super"
		
		// Mesma coisa com o m�todo transfere, que funciona por causa do polimorfismo, j� que cp e cc s�o contas.
		cc.transfere(10.0, cp);
		
		System.out.println("CC: " + cc.getSaldo());
		System.out.println("CP: " + cp.getSaldo());
		
		// N�o � poss�vel pois a classe conta � abstrata:
		//Conta a = new Conta();
	}
	
}
