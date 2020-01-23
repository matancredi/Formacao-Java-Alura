
public class TesteSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		
		// N�o deixa sacar dinheiro que n�o tem
		//conta.saca(200);
		//System.out.println(conta.saldo);
		
		// Mas se a opera��o for feita dessa forma, o saldo fica negativo:
		//conta.saldo -= 101;
		//System.out.println(conta.saldo);
		
		// Para corrigir, ser� mudado o encapsulamento dos atributos
		// Assim, trabalharemos com as classes atrav�s de seus m�todos, o que � mais seguro
		// Porque a interface j� garante (ou deveria) que as valida��es necess�rias sejam feitas
		
		System.out.println(conta.getSaldo());
		
	}
}
